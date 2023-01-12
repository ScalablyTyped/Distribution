package typings.colord.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.colord.typesMod.ObjectColor because Already inherited */ trait LabaColor
  extends StObject
     with LabColor {
  
  var alpha: Double
}
object LabaColor {
  
  inline def apply(a: Double, alpha: Double, b: Double, l: Double): LabaColor = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], alpha = alpha.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabaColor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LabaColor] (val x: Self) extends AnyVal {
    
    inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
  }
}
