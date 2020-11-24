package typings.cliTable3.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Border extends js.Object {
  
  var border: js.Array[String] = js.native
  
  var compact: Boolean = js.native
  
  var head: js.Array[String] = js.native
  
  var `padding-left`: Double = js.native
  
  var `padding-right`: Double = js.native
}
object Border {
  
  @scala.inline
  def apply(
    border: js.Array[String],
    compact: Boolean,
    head: js.Array[String],
    `padding-left`: Double,
    `padding-right`: Double
  ): Border = {
    val __obj = js.Dynamic.literal(border = border.asInstanceOf[js.Any], compact = compact.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any])
    __obj.updateDynamic("padding-left")(`padding-left`.asInstanceOf[js.Any])
    __obj.updateDynamic("padding-right")(`padding-right`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Border]
  }
  
  @scala.inline
  implicit class BorderOps[Self <: Border] (val x: Self) extends AnyVal {
    
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
    def setBorderVarargs(value: String*): Self = this.set("border", js.Array(value :_*))
    
    @scala.inline
    def setBorder(value: js.Array[String]): Self = this.set("border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompact(value: Boolean): Self = this.set("compact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadVarargs(value: String*): Self = this.set("head", js.Array(value :_*))
    
    @scala.inline
    def setHead(value: js.Array[String]): Self = this.set("head", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPadding-left`(value: Double): Self = this.set("padding-left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPadding-right`(value: Double): Self = this.set("padding-right", value.asInstanceOf[js.Any])
  }
}
