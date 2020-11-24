package typings.c3.anon

import typings.c3.mod.XAxisType
import typings.c3.mod.YAxisType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ key in c3.c3.AxisName ]:? c3.c3.XAxisType | c3.c3.YAxisType} */
@js.native
trait keyinAxisNameXAxisTypeYAx extends js.Object {
  
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
  implicit class keyinAxisNameXAxisTypeYAxOps[Self <: keyinAxisNameXAxisTypeYAx] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setX(value: XAxisType | YAxisType): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setY(value: XAxisType | YAxisType): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
    
    @scala.inline
    def setY2(value: XAxisType | YAxisType): Self = this.set("y2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY2: Self = this.set("y2", js.undefined)
  }
}
