package typings.chartist.mod

import typings.chartist.chartistStrings.height
import typings.chartist.chartistStrings.horizontal
import typings.chartist.chartistStrings.vertical
import typings.chartist.chartistStrings.width
import typings.chartist.chartistStrings.x
import typings.chartist.chartistStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IChartUnits extends js.Object {
  
  var dir: vertical | horizontal = js.native
  
  var len: height | width = js.native
  
  var pos: x | y = js.native
  
  var rectEnd: String = js.native
  
  var rectOffset: String = js.native
  
  var rectStart: String = js.native
}
object IChartUnits {
  
  @scala.inline
  def apply(
    dir: vertical | horizontal,
    len: height | width,
    pos: x | y,
    rectEnd: String,
    rectOffset: String,
    rectStart: String
  ): IChartUnits = {
    val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any], len = len.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], rectEnd = rectEnd.asInstanceOf[js.Any], rectOffset = rectOffset.asInstanceOf[js.Any], rectStart = rectStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChartUnits]
  }
  
  @scala.inline
  implicit class IChartUnitsOps[Self <: IChartUnits] (val x: Self) extends AnyVal {
    
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
    def setDir(value: vertical | horizontal): Self = this.set("dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLen(value: height | width): Self = this.set("len", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPos(value: typings.chartist.chartistStrings.x | y): Self = this.set("pos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRectEnd(value: String): Self = this.set("rectEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRectOffset(value: String): Self = this.set("rectOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRectStart(value: String): Self = this.set("rectStart", value.asInstanceOf[js.Any])
  }
}
