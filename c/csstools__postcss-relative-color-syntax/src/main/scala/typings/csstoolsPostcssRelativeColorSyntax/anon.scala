package typings.csstoolsPostcssRelativeColorSyntax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DisplayP3 extends StObject {
    
    /** Enable displayP3 fallbacks. default: true */
    var displayP3: js.UndefOr[Boolean] = js.undefined
  }
  object DisplayP3 {
    
    inline def apply(): DisplayP3 = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisplayP3]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DisplayP3] (val x: Self) extends AnyVal {
      
      inline def setDisplayP3(value: Boolean): Self = StObject.set(x, "displayP3", value.asInstanceOf[js.Any])
      
      inline def setDisplayP3Undefined: Self = StObject.set(x, "displayP3", js.undefined)
    }
  }
}
