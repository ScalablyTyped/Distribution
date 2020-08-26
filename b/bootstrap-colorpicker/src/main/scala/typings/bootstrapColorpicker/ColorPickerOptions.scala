package typings.bootstrapColorpicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * You can set colorpicker options either as a plugin parameter or data-* attributes
  */
@js.native
trait ColorPickerOptions extends js.Object {
  /**
    *     By default, the colorpicker is aligned to the right of the input. If you need to switch it to the left, set align to 'left'.
    * 
    * Default: 'right'
    */
  var align: js.UndefOr[ColorPickerAlignOptions] = js.native
  /**
    * If not false, sets the color to this value.
    * 
    * Default: false
    */
  var color: js.UndefOr[String] = js.native
  /**
    *     List of pre selected colors (hex format). If you choose one of these colors, the alias is returned instead of the hex code.
    * 
    * Default: null
    */
  var colorSelectors: js.UndefOr[js.Object] = js.native
  /**
    * Children selector for the component or element that trigger the colorpicker and which background color will change (needs an inner <i> element).
    * 
    * Default: '.add-on, .input-group-addon'
    */
  var component: js.UndefOr[String | JQuery] = js.native
  /**
    * If not false, the picker will be contained inside this element, otherwise it will be appended to the document body.
    * 
    * Default: false
    */
  var container: js.UndefOr[Boolean] = js.native
  /**
    * Adds this class to the colorpicker widget.
    * 
    * Default: null
    */
  var customClass: js.UndefOr[String] = js.native
  /**
    * Fallback color string that will be applied when the color failed to be parsed. If null, it will keep the current color if any.
    * 
    * Default: null
    */
  var fallbackColor: js.UndefOr[String] = js.native
  /**
    *     Fallback color format (e.g. when not specified or for alias mode, when selecting non aliased colors)
    * 
    * Default: hex
    */
  var fallbackFormat: js.UndefOr[String] = js.native
  /**
    * If not false, forces the color format to be hex, rgb or rgba, otherwise the format is automatically detected.
    * 
    * Default: false
    */
  var format: js.UndefOr[ColorFormat] = js.native
  /**
    * If true, put a '#' (number sign) before hex strings.
    * 
    * Default: true
    */
  var hexNumberSignPrefix: js.UndefOr[Boolean] = js.native
  /**
    * If true, the hue and alpha channel bars will be rendered horizontally, above the saturation selector.
    * 
    * Default: false
    */
  var horizontal: js.UndefOr[Boolean] = js.native
  /**
    * If true, forces to show the colorpicker as an inline element.
    * 
    * Default: false
    */
  var `inline`: js.UndefOr[Boolean] = js.native
  /**
    * Children selector for the input that will store the picker selected value.
    * 
    * Default: 'input'
    */
  var input: js.UndefOr[String | JQuery] = js.native
  /**
    * Vertical sliders configuration (read source code if you really need to tweak this).
    */
  var sliders: js.UndefOr[js.Object] = js.native
  /**
    * Horizontal sliders configuration (read source code if you really need to tweak this).
    */
  var slidersHorz: js.UndefOr[js.Object] = js.native
  /**
    * Customizes the default colorpicker HTML template.
    */
  var template: js.UndefOr[String] = js.native
}

object ColorPickerOptions {
  @scala.inline
  def apply(): ColorPickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorPickerOptions]
  }
  @scala.inline
  implicit class ColorPickerOptionsOps[Self <: ColorPickerOptions] (val x: Self) extends AnyVal {
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
    def setAlign(value: ColorPickerAlignOptions): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setColorSelectors(value: js.Object): Self = this.set("colorSelectors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorSelectors: Self = this.set("colorSelectors", js.undefined)
    @scala.inline
    def setComponent(value: String | JQuery): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    @scala.inline
    def setContainer(value: Boolean): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setCustomClass(value: String): Self = this.set("customClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomClass: Self = this.set("customClass", js.undefined)
    @scala.inline
    def setFallbackColor(value: String): Self = this.set("fallbackColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFallbackColor: Self = this.set("fallbackColor", js.undefined)
    @scala.inline
    def setFallbackFormat(value: String): Self = this.set("fallbackFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFallbackFormat: Self = this.set("fallbackFormat", js.undefined)
    @scala.inline
    def setFormat(value: ColorFormat): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setHexNumberSignPrefix(value: Boolean): Self = this.set("hexNumberSignPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHexNumberSignPrefix: Self = this.set("hexNumberSignPrefix", js.undefined)
    @scala.inline
    def setHorizontal(value: Boolean): Self = this.set("horizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontal: Self = this.set("horizontal", js.undefined)
    @scala.inline
    def setInline(value: Boolean): Self = this.set("inline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInline: Self = this.set("inline", js.undefined)
    @scala.inline
    def setInput(value: String | JQuery): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    @scala.inline
    def setSliders(value: js.Object): Self = this.set("sliders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSliders: Self = this.set("sliders", js.undefined)
    @scala.inline
    def setSlidersHorz(value: js.Object): Self = this.set("slidersHorz", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlidersHorz: Self = this.set("slidersHorz", js.undefined)
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
  }
  
}

