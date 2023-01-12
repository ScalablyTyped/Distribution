package typings.chromeApps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Contentsecuritypolicy extends StObject {
  
  /**
    * @default 'sandbox allow-scripts allow-forms'
    */
  var content_security_policy: js.UndefOr[String] = js.undefined
  
  var pages: js.Array[String]
}
object Contentsecuritypolicy {
  
  inline def apply(pages: js.Array[String]): Contentsecuritypolicy = {
    val __obj = js.Dynamic.literal(pages = pages.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contentsecuritypolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Contentsecuritypolicy] (val x: Self) extends AnyVal {
    
    inline def setContent_security_policy(value: String): Self = StObject.set(x, "content_security_policy", value.asInstanceOf[js.Any])
    
    inline def setContent_security_policyUndefined: Self = StObject.set(x, "content_security_policy", js.undefined)
    
    inline def setPages(value: js.Array[String]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    inline def setPagesVarargs(value: String*): Self = StObject.set(x, "pages", js.Array(value*))
  }
}
