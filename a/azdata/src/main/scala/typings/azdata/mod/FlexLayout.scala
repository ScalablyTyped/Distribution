package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlexLayout extends js.Object {
  
  /**
    * Matches the align-content CSS property.
    */
  var alignContent: js.UndefOr[AlignContentType] = js.native
  
  /**
    * Matches the align-items CSS property.
    */
  var alignItems: js.UndefOr[AlignItemsType] = js.native
  
  /**
    * Matches the flex-flow CSS property and its available values.
    * To layout as a vertical view use "column", and for horizontal
    * use "row".
    */
  var flexFlow: js.UndefOr[String] = js.native
  
  /**
    *  Matches the flex-wrap CSS property.
    */
  var flexWrap: js.UndefOr[FlexWrapType] = js.native
  
  /**
    * Container Height
    */
  var height: js.UndefOr[Double | String] = js.native
  
  /**
    * Matches the justify-content CSS property.
    */
  var justifyContent: js.UndefOr[JustifyContentType] = js.native
  
  /**
    * The position CSS property. Empty by default.
    * This is particularly useful if laying out components inside a FlexContainer and
    * the size of the component is meant to be a fixed size. In this case the position must be
    * set to 'absolute', with the parent FlexContainer having 'relative' position.
    * Without this the component will fail to correctly size itself.
    */
  var position: js.UndefOr[PositionType] = js.native
  
  /**
    * Matches the text-align CSS property.
    */
  var textAlign: js.UndefOr[TextAlignType] = js.native
  
  /**
    * Container Width
    */
  var width: js.UndefOr[Double | String] = js.native
}
object FlexLayout {
  
  @scala.inline
  def apply(): FlexLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexLayout]
  }
  
  @scala.inline
  implicit class FlexLayoutOps[Self <: FlexLayout] (val x: Self) extends AnyVal {
    
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
    def setAlignContent(value: AlignContentType): Self = this.set("alignContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignContent: Self = this.set("alignContent", js.undefined)
    
    @scala.inline
    def setAlignItems(value: AlignItemsType): Self = this.set("alignItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignItems: Self = this.set("alignItems", js.undefined)
    
    @scala.inline
    def setFlexFlow(value: String): Self = this.set("flexFlow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlexFlow: Self = this.set("flexFlow", js.undefined)
    
    @scala.inline
    def setFlexWrap(value: FlexWrapType): Self = this.set("flexWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlexWrap: Self = this.set("flexWrap", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setJustifyContent(value: JustifyContentType): Self = this.set("justifyContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJustifyContent: Self = this.set("justifyContent", js.undefined)
    
    @scala.inline
    def setPosition(value: PositionType): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setTextAlign(value: TextAlignType): Self = this.set("textAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextAlign: Self = this.set("textAlign", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
