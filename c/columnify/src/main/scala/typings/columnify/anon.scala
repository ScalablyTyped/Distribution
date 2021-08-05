package typings.columnify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Pick<columnify.columnify.Options, 'minWidth' | 'maxWidth'> */
  trait PickOptionsminWidthmaxWid extends StObject {
    
    var maxWidth: js.UndefOr[Double] = js.undefined
    
    var minWidth: js.UndefOr[Double] = js.undefined
  }
  object PickOptionsminWidthmaxWid {
    
    inline def apply(): PickOptionsminWidthmaxWid = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickOptionsminWidthmaxWid]
    }
    
    extension [Self <: PickOptionsminWidthmaxWid](x: Self) {
      
      inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    }
  }
}
