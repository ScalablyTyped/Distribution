package typings.contentRange.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentRangeParts extends js.Object {
  
  var first: Double | Null = js.native
  
  var last: Double | Null = js.native
  
  var length: Double | Null = js.native
  
  var unit: String = js.native
}
object ContentRangeParts {
  
  @scala.inline
  def apply(unit: String): ContentRangeParts = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentRangeParts]
  }
  
  @scala.inline
  implicit class ContentRangePartsOps[Self <: ContentRangeParts] (val x: Self) extends AnyVal {
    
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
    def setUnit(value: String): Self = this.set("unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirst(value: Double): Self = this.set("first", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstNull: Self = this.set("first", null)
    
    @scala.inline
    def setLast(value: Double): Self = this.set("last", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastNull: Self = this.set("last", null)
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthNull: Self = this.set("length", null)
  }
}
