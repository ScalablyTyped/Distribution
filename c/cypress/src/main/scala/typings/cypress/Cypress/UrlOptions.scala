package typings.cypress.Cypress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options to change the default behavior of .url()
  */
trait UrlOptions
  extends StObject
     with Loggable
     with Timeoutable {
  
  /**
    * Whether the url is decoded
    *
    * @default false
    */
  var decode: Boolean
}
object UrlOptions {
  
  inline def apply(decode: Boolean, log: Boolean, timeout: Double): UrlOptions = {
    val __obj = js.Dynamic.literal(decode = decode.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlOptions]
  }
  
  extension [Self <: UrlOptions](x: Self) {
    
    inline def setDecode(value: Boolean): Self = StObject.set(x, "decode", value.asInstanceOf[js.Any])
  }
}
