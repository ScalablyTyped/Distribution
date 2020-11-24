package typings.bizcharts.anon

import typings.antvG2.mod.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Data extends js.Object {
  
  var data: js.Any = js.native
  
  var geom: js.Any = js.native
  
  var preData: js.Any = js.native
  
  var preShape: Shape = js.native
  
  var shape: Shape = js.native
}
object Data {
  
  @scala.inline
  def apply(data: js.Any, geom: js.Any, preData: js.Any, preShape: Shape, shape: Shape): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], geom = geom.asInstanceOf[js.Any], preData = preData.asInstanceOf[js.Any], preShape = preShape.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  
  @scala.inline
  implicit class DataOps[Self <: Data] (val x: Self) extends AnyVal {
    
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
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeom(value: js.Any): Self = this.set("geom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreData(value: js.Any): Self = this.set("preData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreShape(value: Shape): Self = this.set("preShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShape(value: Shape): Self = this.set("shape", value.asInstanceOf[js.Any])
  }
}
