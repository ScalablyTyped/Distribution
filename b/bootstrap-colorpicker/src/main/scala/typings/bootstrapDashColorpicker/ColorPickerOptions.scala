package typings.bootstrapDashColorpicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * You can set colorpicker options either as a plugin parameter or data-* attributes
  */
trait ColorPickerOptions extends js.Object {
  /**
    * 	By default, the colorpicker is aligned to the right of the input. If you need to switch it to the left, set align to 'left'.
    * 
    * Default: 'right'
    */
  var align: js.UndefOr[ColorPickerAlignOptions] = js.undefined
  /**
    * If not false, sets the color to this value.
    * 
    * Default: false
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    * 	List of pre selected colors (hex format). If you choose one of these colors, the alias is returned instead of the hex code.
    * 
    * Default: null
    */
  var colorSelectors: js.UndefOr[js.Object] = js.undefined
  /**
    * Children selector for the component or element that trigger the colorpicker and which background color will change (needs an inner <i> element).
    * 
    * Default: '.add-on, .input-group-addon'
    */
  var component: js.UndefOr[String | JQuery] = js.undefined
  /**
    * If not false, the picker will be contained inside this element, otherwise it will be appended to the document body.
    * 
    * Default: false
    */
  var container: js.UndefOr[Boolean] = js.undefined
  /**
    * Adds this class to the colorpicker widget.
    * 
    * Default: null
    */
  var customClass: js.UndefOr[String] = js.undefined
  /**
    * Fallback color string that will be applied when the color failed to be parsed. If null, it will keep the current color if any.
    * 
    * Default: null
    */
  var fallbackColor: js.UndefOr[String] = js.undefined
  /**
    * 	Fallback color format (e.g. when not specified or for alias mode, when selecting non aliased colors)
    * 
    * Default: hex
    */
  var fallbackFormat: js.UndefOr[String] = js.undefined
  /**
    * If not false, forces the color format to be hex, rgb or rgba, otherwise the format is automatically detected.
    * 
    * Default: false
    */
  var format: js.UndefOr[ColorFormat] = js.undefined
  /**
    * If true, put a '#' (number sign) before hex strings.
    * 
    * Default: true
    */
  var hexNumberSignPrefix: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, the hue and alpha channel bars will be rendered horizontally, above the saturation selector.
    * 
    * Default: false
    */
  var horizontal: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, forces to show the colorpicker as an inline element.
    * 
    * Default: false
    */
  var `inline`: js.UndefOr[Boolean] = js.undefined
  /**
    * Children selector for the input that will store the picker selected value.
    * 
    * Default: 'input'
    */
  var input: js.UndefOr[String | JQuery] = js.undefined
  /**
    * Vertical sliders configuration (read source code if you really need to tweak this).
    */
  var sliders: js.UndefOr[js.Object] = js.undefined
  /**
    * Horizontal sliders configuration (read source code if you really need to tweak this).
    */
  var slidersHorz: js.UndefOr[js.Object] = js.undefined
  /**
    * Customizes the default colorpicker HTML template.
    */
  var template: js.UndefOr[String] = js.undefined
}

object ColorPickerOptions {
  @scala.inline
  def apply(
    align: ColorPickerAlignOptions = null,
    color: String = null,
    colorSelectors: js.Object = null,
    component: String | JQuery = null,
    container: js.UndefOr[Boolean] = js.undefined,
    customClass: String = null,
    fallbackColor: String = null,
    fallbackFormat: String = null,
    format: ColorFormat = null,
    hexNumberSignPrefix: js.UndefOr[Boolean] = js.undefined,
    horizontal: js.UndefOr[Boolean] = js.undefined,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    input: String | JQuery = null,
    sliders: js.Object = null,
    slidersHorz: js.Object = null,
    template: String = null
  ): ColorPickerOptions = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (color != null) __obj.updateDynamic("color")(color)
    if (colorSelectors != null) __obj.updateDynamic("colorSelectors")(colorSelectors)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(container)) __obj.updateDynamic("container")(container)
    if (customClass != null) __obj.updateDynamic("customClass")(customClass)
    if (fallbackColor != null) __obj.updateDynamic("fallbackColor")(fallbackColor)
    if (fallbackFormat != null) __obj.updateDynamic("fallbackFormat")(fallbackFormat)
    if (format != null) __obj.updateDynamic("format")(format)
    if (!js.isUndefined(hexNumberSignPrefix)) __obj.updateDynamic("hexNumberSignPrefix")(hexNumberSignPrefix)
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal)
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`)
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (sliders != null) __obj.updateDynamic("sliders")(sliders)
    if (slidersHorz != null) __obj.updateDynamic("slidersHorz")(slidersHorz)
    if (template != null) __obj.updateDynamic("template")(template)
    __obj.asInstanceOf[ColorPickerOptions]
  }
}

