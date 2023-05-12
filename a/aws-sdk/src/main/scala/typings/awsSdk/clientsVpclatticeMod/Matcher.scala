package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Matcher extends StObject {
  
  /**
    * The HTTP code to use when checking for a successful response from a target.
    */
  var httpCode: js.UndefOr[HttpCodeMatcher] = js.undefined
}
object Matcher {
  
  inline def apply(): Matcher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Matcher]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Matcher] (val x: Self) extends AnyVal {
    
    inline def setHttpCode(value: HttpCodeMatcher): Self = StObject.set(x, "httpCode", value.asInstanceOf[js.Any])
    
    inline def setHttpCodeUndefined: Self = StObject.set(x, "httpCode", js.undefined)
  }
}
