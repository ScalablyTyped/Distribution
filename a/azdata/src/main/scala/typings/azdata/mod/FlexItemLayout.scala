package typings.azdata.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlexItemLayout extends js.Object {
  
  /**
    * Matches the CSS style key and its available values.
    */
  var CSSStyles: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * Matches the flex CSS property and its available values.
    * Default is "1 1 auto".
    */
  var flex: js.UndefOr[String] = js.native
  
  /**
    * Matches the order CSS property and its available values.
    */
  var order: js.UndefOr[Double] = js.native
}
object FlexItemLayout {
  
  @scala.inline
  def apply(): FlexItemLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexItemLayout]
  }
  
  @scala.inline
  implicit class FlexItemLayoutOps[Self <: FlexItemLayout] (val x: Self) extends AnyVal {
    
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
    def setCSSStyles(value: StringDictionary[String]): Self = this.set("CSSStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCSSStyles: Self = this.set("CSSStyles", js.undefined)
    
    @scala.inline
    def setFlex(value: String): Self = this.set("flex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlex: Self = this.set("flex", js.undefined)
    
    @scala.inline
    def setOrder(value: Double): Self = this.set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
  }
}
