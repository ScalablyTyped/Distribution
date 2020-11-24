package typings.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Font extends TypeDerived {
  
  var isBold: Boolean = js.native
  
  var isItalic: Boolean = js.native
  
  var isStrikeThrough: Boolean = js.native
  
  var isUnderline: Boolean = js.native
  
  var name: String = js.native
  
  var size: Double = js.native
}
object Font {
  
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    isBold: Boolean,
    isItalic: Boolean,
    isStrikeThrough: Boolean,
    isUnderline: Boolean,
    name: String,
    size: Double
  ): Font = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], isBold = isBold.asInstanceOf[js.Any], isItalic = isItalic.asInstanceOf[js.Any], isStrikeThrough = isStrikeThrough.asInstanceOf[js.Any], isUnderline = isUnderline.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Font]
  }
  
  @scala.inline
  implicit class FontOps[Self <: Font] (val x: Self) extends AnyVal {
    
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
    def setIsBold(value: Boolean): Self = this.set("isBold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsItalic(value: Boolean): Self = this.set("isItalic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsStrikeThrough(value: Boolean): Self = this.set("isStrikeThrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsUnderline(value: Boolean): Self = this.set("isUnderline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
  }
}
