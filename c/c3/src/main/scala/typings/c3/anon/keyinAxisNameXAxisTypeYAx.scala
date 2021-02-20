package typings.c3.anon

import typings.c3.mod.XAxisType
import typings.c3.mod.YAxisType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ key in c3.c3.AxisName ]:? c3.c3.XAxisType | c3.c3.YAxisType} */
@js.native
trait keyinAxisNameXAxisTypeYAx extends StObject {
  
  var x: js.UndefOr[XAxisType | YAxisType] = js.native
  
  var y: js.UndefOr[XAxisType | YAxisType] = js.native
  
  var y2: js.UndefOr[XAxisType | YAxisType] = js.native
}
object keyinAxisNameXAxisTypeYAx {
  
  @scala.inline
  def apply(): keyinAxisNameXAxisTypeYAx = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[keyinAxisNameXAxisTypeYAx]
  }
  
  @scala.inline
  implicit class keyinAxisNameXAxisTypeYAxMutableBuilder[Self <: keyinAxisNameXAxisTypeYAx] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: XAxisType | YAxisType): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: XAxisType | YAxisType): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY2(value: XAxisType | YAxisType): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY2Undefined: Self = StObject.set(x, "y2", js.undefined)
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
