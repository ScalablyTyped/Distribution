package typings.azdata.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentProperties extends js.Object {
  /**
    * Matches the CSS style key and its available values.
    */
  var CSSStyles: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Corresponds to the aria-label accessibility attribute for this component
    */
  var ariaLabel: js.UndefOr[String] = js.native
  /**
    * Corresponds to the role accessibility attribute for this component
    */
  var ariaRole: js.UndefOr[String] = js.native
  /**
    * Corresponds to the aria-selected accessibility attribute for this component
    */
  var ariaSelected: js.UndefOr[Boolean] = js.native
  /**
    * Corresponds to the display CSS property for the element
    */
  var display: js.UndefOr[DisplayType] = js.native
  /**
    * Whether the component is enabled in the DOM
    */
  var enabled: js.UndefOr[Boolean] = js.native
  var height: js.UndefOr[Double | String] = js.native
  /**
    * The position CSS property. Empty by default.
    * This is particularly useful if laying out components inside a FlexContainer and
    * the size of the component is meant to be a fixed size. In this case the position must be
    * set to 'absolute', with the parent FlexContainer having 'relative' position.
    * Without this the component will fail to correctly size itself
    */
  var position: js.UndefOr[PositionType] = js.native
  var width: js.UndefOr[Double | String] = js.native
}

object ComponentProperties {
  @scala.inline
  def apply(): ComponentProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentProperties]
  }
  @scala.inline
  implicit class ComponentPropertiesOps[Self <: ComponentProperties] (val x: Self) extends AnyVal {
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
    def setAriaLabel(value: String): Self = this.set("ariaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaLabel: Self = this.set("ariaLabel", js.undefined)
    @scala.inline
    def setAriaRole(value: String): Self = this.set("ariaRole", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaRole: Self = this.set("ariaRole", js.undefined)
    @scala.inline
    def setAriaSelected(value: Boolean): Self = this.set("ariaSelected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaSelected: Self = this.set("ariaSelected", js.undefined)
    @scala.inline
    def setDisplay(value: DisplayType): Self = this.set("display", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setPosition(value: PositionType): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

