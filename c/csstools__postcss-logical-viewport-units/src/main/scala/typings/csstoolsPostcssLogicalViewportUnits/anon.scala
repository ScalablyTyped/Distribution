package typings.csstoolsPostcssLogicalViewportUnits

import typings.csstoolsPostcssLogicalViewportUnits.csstoolsPostcssLogicalViewportUnitsStrings.vh
import typings.csstoolsPostcssLogicalViewportUnits.csstoolsPostcssLogicalViewportUnitsStrings.vw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Vb extends StObject {
    
    var vb: vw | vh
    
    var vi: vw | vh
  }
  object Vb {
    
    inline def apply(vb: vw | vh, vi: vw | vh): Vb = {
      val __obj = js.Dynamic.literal(vb = vb.asInstanceOf[js.Any], vi = vi.asInstanceOf[js.Any])
      __obj.asInstanceOf[Vb]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Vb] (val x: Self) extends AnyVal {
      
      inline def setVb(value: vw | vh): Self = StObject.set(x, "vb", value.asInstanceOf[js.Any])
      
      inline def setVi(value: vw | vh): Self = StObject.set(x, "vi", value.asInstanceOf[js.Any])
    }
  }
}
