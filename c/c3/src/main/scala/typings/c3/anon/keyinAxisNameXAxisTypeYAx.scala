package typings.c3.anon

import typings.c3.mod.XAxisType
import typings.c3.mod.YAxisType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ key in c3.c3.AxisName ]:? c3.c3.XAxisType | c3.c3.YAxisType} */
trait keyinAxisNameXAxisTypeYAx extends StObject {
  
  var x: js.UndefOr[XAxisType | YAxisType] = js.undefined
  
  var y: js.UndefOr[XAxisType | YAxisType] = js.undefined
  
  var y2: js.UndefOr[XAxisType | YAxisType] = js.undefined
}
object keyinAxisNameXAxisTypeYAx {
  
  inline def apply(): keyinAxisNameXAxisTypeYAx = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[keyinAxisNameXAxisTypeYAx]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: keyinAxisNameXAxisTypeYAx] (val x: Self) extends AnyVal {
    
    inline def setX(value: XAxisType | YAxisType): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: XAxisType | YAxisType): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setY2(value: XAxisType | YAxisType): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
    
    inline def setY2Undefined: Self = StObject.set(x, "y2", js.undefined)
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
