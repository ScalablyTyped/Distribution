package typings.cliTable2.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<cli-table2.cli-table2.CharName, string> */
@js.native
trait RecordCharNamestring extends js.Object {
  
  var bottom: String = js.native
  
  var `bottom-left`: String = js.native
  
  var `bottom-mid`: String = js.native
  
  var `bottom-right`: String = js.native
  
  var left: String = js.native
  
  var `left-mid`: String = js.native
  
  var mid: String = js.native
  
  var `mid-mid`: String = js.native
  
  var middle: String = js.native
  
  var right: String = js.native
  
  var `right-mid`: String = js.native
  
  var top: String = js.native
  
  var `top-left`: String = js.native
  
  var `top-mid`: String = js.native
  
  var `top-right`: String = js.native
}
object RecordCharNamestring {
  
  @scala.inline
  def apply(
    bottom: String,
    `bottom-left`: String,
    `bottom-mid`: String,
    `bottom-right`: String,
    left: String,
    `left-mid`: String,
    mid: String,
    `mid-mid`: String,
    middle: String,
    right: String,
    `right-mid`: String,
    top: String,
    `top-left`: String,
    `top-mid`: String,
    `top-right`: String
  ): RecordCharNamestring = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], mid = mid.asInstanceOf[js.Any], middle = middle.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.updateDynamic("bottom-left")(`bottom-left`.asInstanceOf[js.Any])
    __obj.updateDynamic("bottom-mid")(`bottom-mid`.asInstanceOf[js.Any])
    __obj.updateDynamic("bottom-right")(`bottom-right`.asInstanceOf[js.Any])
    __obj.updateDynamic("left-mid")(`left-mid`.asInstanceOf[js.Any])
    __obj.updateDynamic("mid-mid")(`mid-mid`.asInstanceOf[js.Any])
    __obj.updateDynamic("right-mid")(`right-mid`.asInstanceOf[js.Any])
    __obj.updateDynamic("top-left")(`top-left`.asInstanceOf[js.Any])
    __obj.updateDynamic("top-mid")(`top-mid`.asInstanceOf[js.Any])
    __obj.updateDynamic("top-right")(`top-right`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordCharNamestring]
  }
  
  @scala.inline
  implicit class RecordCharNamestringOps[Self <: RecordCharNamestring] (val x: Self) extends AnyVal {
    
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
    def setBottom(value: String): Self = this.set("bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBottom-left`(value: String): Self = this.set("bottom-left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBottom-mid`(value: String): Self = this.set("bottom-mid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBottom-right`(value: String): Self = this.set("bottom-right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: String): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setLeft-mid`(value: String): Self = this.set("left-mid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMid(value: String): Self = this.set("mid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMid-mid`(value: String): Self = this.set("mid-mid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMiddle(value: String): Self = this.set("middle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: String): Self = this.set("right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setRight-mid`(value: String): Self = this.set("right-mid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: String): Self = this.set("top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setTop-left`(value: String): Self = this.set("top-left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setTop-mid`(value: String): Self = this.set("top-mid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setTop-right`(value: String): Self = this.set("top-right", value.asInstanceOf[js.Any])
  }
}
