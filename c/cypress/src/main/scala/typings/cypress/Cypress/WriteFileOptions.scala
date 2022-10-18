package typings.cypress.Cypress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Options to change the default behavior of .writeFile */
trait WriteFileOptions
  extends StObject
     with Loggable {
  
  var encoding: Encodings
  
  var flag: String
}
object WriteFileOptions {
  
  inline def apply(flag: String, log: Boolean): WriteFileOptions = {
    val __obj = js.Dynamic.literal(flag = flag.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], encoding = null)
    __obj.asInstanceOf[WriteFileOptions]
  }
  
  extension [Self <: WriteFileOptions](x: Self) {
    
    inline def setEncoding(value: Encodings): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
    
    inline def setFlag(value: String): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
  }
}
