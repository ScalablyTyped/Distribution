package typings.chartJs.mod

import typings.chartJs.anon.ChartTooltip
import typings.chartJs.anon.PartialFontSpec
import typings.chartJs.typesBasicMod.AnyObject
import typings.chartJs.typesColorMod.Color
import typings.chartJs.typesGeometricMod.ChartArea
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TooltipOptions[TType /* <: ChartType */]
  extends StObject
     with CoreInteractionOptions {
  
  var animation: AnimationSpec[TType]
  
  var animations: AnimationsSpec[TType]
  
  /**
    * Background color of the tooltip.
    * @default 'rgba(0, 0, 0, 0.8)'
    */
  var backgroundColor: Scriptable[Color, ScriptableTooltipContext[TType]]
  
  /**
    * Horizontal alignment of the body text lines.
    * @default 'left'
    */
  var bodyAlign: Scriptable[TextAlign, ScriptableTooltipContext[TType]]
  
  /**
    * Color of body
    * @default '#fff'
    */
  var bodyColor: Scriptable[Color, ScriptableTooltipContext[TType]]
  
  /**
    * See Fonts.
    * @default {}
    */
  var bodyFont: ScriptableAndScriptableOptions[PartialFontSpec, ScriptableTooltipContext[TType]]
  
  /**
    * Spacing to add to top and bottom of each tooltip item.
    * @default 2
    */
  var bodySpacing: Scriptable[Double, ScriptableTooltipContext[TType]]
  
  /**
    * Color of the border.
    * @default 'rgba(0, 0, 0, 0)'
    */
  var borderColor: Scriptable[Color, ScriptableTooltipContext[TType]]
  
  /**
    * Size of the border.
    * @default 0
    */
  var borderWidth: Scriptable[Double, ScriptableTooltipContext[TType]]
  
  /**
    * Height of the color box if displayColors is true.
    * @default bodyFont.size
    */
  var boxHeight: Scriptable[Double, ScriptableTooltipContext[TType]]
  
  /**
    * Padding between the color box and the text.
    * @default 1
    */
  var boxPadding: Double
  
  /**
    * Width of the color box if displayColors is true.
    * @default bodyFont.size
    */
  var boxWidth: Scriptable[Double, ScriptableTooltipContext[TType]]
  
  var callbacks: TooltipCallbacks[TType, TooltipModel[TType], TooltipItem[TType]]
  
  /**
    * Extra distance to move the end of the tooltip arrow away from the tooltip point.
    * @default 2
    */
  var caretPadding: Scriptable[Double, ScriptableTooltipContext[TType]]
  
  /**
    * Size, in px, of the tooltip arrow.
    * @default 5
    */
  var caretSize: Scriptable[Double, ScriptableTooltipContext[TType]]
  
  /**
    * Radius of tooltip corner curves.
    * @default 6
    */
  var cornerRadius: Scriptable[Double | BorderRadius, ScriptableTooltipContext[TType]]
  
  /**
    * If true, color boxes are shown in the tooltip.
    * @default true
    */
  var displayColors: Scriptable[Boolean, ScriptableTooltipContext[TType]]
  
  /**
    * Are on-canvas tooltips enabled?
    * @default true
    */
  var enabled: Scriptable[Boolean, ScriptableTooltipContext[TType]]
  
  /**
    *   See external tooltip section.
    */
  def external(args: ChartTooltip[TType]): Unit
  
  def filter(
    e: TooltipItem[TType],
    index: Double,
    array: js.Array[TooltipItem[TType]],
    data: ChartData[ChartType, DefaultDataPoint[ChartType], Any]
  ): Boolean
  
  /**
    * Horizontal alignment of the footer text lines.
    * @default 'left'
    */
  var footerAlign: Scriptable[TextAlign, ScriptableTooltipContext[TType]]
  
  /**
    * Color of footer
    * @default '#fff'
    */
  var footerColor: Scriptable[Color, ScriptableTooltipContext[TType]]
  
  /**
    * See Fonts
    * @default {weight: 'bold'}
    */
  var footerFont: ScriptableAndScriptableOptions[PartialFontSpec, ScriptableTooltipContext[TType]]
  
  /**
    * Margin to add before drawing the footer.
    * @default 6
    */
  var footerMarginTop: Scriptable[Double, ScriptableTooltipContext[TType]]
  
  /**
    * Spacing to add to top and bottom of each footer line.
    * @default 2
    */
  var footerSpacing: Scriptable[Double, ScriptableTooltipContext[TType]]
  
  /**
    * Sort tooltip items.
    */
  def itemSort(
    a: TooltipItem[TType],
    b: TooltipItem[TType],
    data: ChartData[ChartType, DefaultDataPoint[ChartType], Any]
  ): Double
  
  /**
    * Color to draw behind the colored boxes when multiple items are in the tooltip.
    * @default '#fff'
    */
  var multiKeyBackground: Scriptable[Color, ScriptableTooltipContext[TType]]
  
  /**
    * Padding to add to the tooltip
    * @default 6
    */
  var padding: Scriptable[Double | ChartArea, ScriptableTooltipContext[TType]]
  
  /**
    * The mode for positioning the tooltip
    */
  var position: Scriptable[TooltipPositioner, ScriptableTooltipContext[TType]]
  
  /**
    * true for rendering the legends from right to left.
    */
  var rtl: Scriptable[Boolean, ScriptableTooltipContext[TType]]
  
  /**
    * This will force the text direction 'rtl' or 'ltr on the canvas for rendering the tooltips, regardless of the css specified on the canvas
    * @default canvas's default
    */
  var textDirection: Scriptable[String, ScriptableTooltipContext[TType]]
  
  /**
    * Horizontal alignment of the title text lines.
    * @default 'left'
    */
  var titleAlign: Scriptable[TextAlign, ScriptableTooltipContext[TType]]
  
  /**
    * Color of title
    * @default '#fff'
    */
  var titleColor: Scriptable[Color, ScriptableTooltipContext[TType]]
  
  /**
    * See Fonts
    * @default {weight: 'bold'}
    */
  var titleFont: ScriptableAndScriptableOptions[PartialFontSpec, ScriptableTooltipContext[TType]]
  
  /**
    * Margin to add on bottom of title section.
    * @default 6
    */
  var titleMarginBottom: Scriptable[Double, ScriptableTooltipContext[TType]]
  
  /**
    * Spacing to add to top and bottom of each title line.
    * @default 2
    */
  var titleSpacing: Scriptable[Double, ScriptableTooltipContext[TType]]
  
  /**
    * Use the corresponding point style (from dataset options) instead of color boxes, ex: star, triangle etc. (size is based on the minimum value between boxWidth and boxHeight)
    * @default false
    */
  var usePointStyle: Scriptable[Boolean, ScriptableTooltipContext[TType]]
  
  /**
    * Override the tooltip alignment calculations
    */
  var xAlign: Scriptable[TooltipXAlignment, ScriptableTooltipContext[TType]]
  
  var yAlign: Scriptable[TooltipYAlignment, ScriptableTooltipContext[TType]]
}
object TooltipOptions {
  
  inline def apply[TType /* <: ChartType */](
    animation: AnimationSpec[TType],
    animations: AnimationsSpec[TType],
    axis: InteractionAxis,
    backgroundColor: Scriptable[Color, ScriptableTooltipContext[TType]],
    bodyAlign: Scriptable[TextAlign, ScriptableTooltipContext[TType]],
    bodyColor: Scriptable[Color, ScriptableTooltipContext[TType]],
    bodyFont: ScriptableAndScriptableOptions[PartialFontSpec, ScriptableTooltipContext[TType]],
    bodySpacing: Scriptable[Double, ScriptableTooltipContext[TType]],
    borderColor: Scriptable[Color, ScriptableTooltipContext[TType]],
    borderWidth: Scriptable[Double, ScriptableTooltipContext[TType]],
    boxHeight: Scriptable[Double, ScriptableTooltipContext[TType]],
    boxPadding: Double,
    boxWidth: Scriptable[Double, ScriptableTooltipContext[TType]],
    callbacks: TooltipCallbacks[TType, TooltipModel[TType], TooltipItem[TType]],
    caretPadding: Scriptable[Double, ScriptableTooltipContext[TType]],
    caretSize: Scriptable[Double, ScriptableTooltipContext[TType]],
    cornerRadius: Scriptable[Double | BorderRadius, ScriptableTooltipContext[TType]],
    displayColors: Scriptable[Boolean, ScriptableTooltipContext[TType]],
    enabled: Scriptable[Boolean, ScriptableTooltipContext[TType]],
    external: ChartTooltip[TType] => Unit,
    filter: (TooltipItem[TType], Double, js.Array[TooltipItem[TType]], ChartData[ChartType, DefaultDataPoint[ChartType], Any]) => Boolean,
    footerAlign: Scriptable[TextAlign, ScriptableTooltipContext[TType]],
    footerColor: Scriptable[Color, ScriptableTooltipContext[TType]],
    footerFont: ScriptableAndScriptableOptions[PartialFontSpec, ScriptableTooltipContext[TType]],
    footerMarginTop: Scriptable[Double, ScriptableTooltipContext[TType]],
    footerSpacing: Scriptable[Double, ScriptableTooltipContext[TType]],
    includeInvisible: Boolean,
    intersect: Boolean,
    itemSort: (TooltipItem[TType], TooltipItem[TType], ChartData[ChartType, DefaultDataPoint[ChartType], Any]) => Double,
    mode: InteractionMode,
    multiKeyBackground: Scriptable[Color, ScriptableTooltipContext[TType]],
    padding: Scriptable[Double | ChartArea, ScriptableTooltipContext[TType]],
    position: Scriptable[TooltipPositioner, ScriptableTooltipContext[TType]],
    rtl: Scriptable[Boolean, ScriptableTooltipContext[TType]],
    textDirection: Scriptable[String, ScriptableTooltipContext[TType]],
    titleAlign: Scriptable[TextAlign, ScriptableTooltipContext[TType]],
    titleColor: Scriptable[Color, ScriptableTooltipContext[TType]],
    titleFont: ScriptableAndScriptableOptions[PartialFontSpec, ScriptableTooltipContext[TType]],
    titleMarginBottom: Scriptable[Double, ScriptableTooltipContext[TType]],
    titleSpacing: Scriptable[Double, ScriptableTooltipContext[TType]],
    usePointStyle: Scriptable[Boolean, ScriptableTooltipContext[TType]],
    xAlign: Scriptable[TooltipXAlignment, ScriptableTooltipContext[TType]],
    yAlign: Scriptable[TooltipYAlignment, ScriptableTooltipContext[TType]]
  ): TooltipOptions[TType] = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], animations = animations.asInstanceOf[js.Any], axis = axis.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], bodyAlign = bodyAlign.asInstanceOf[js.Any], bodyColor = bodyColor.asInstanceOf[js.Any], bodyFont = bodyFont.asInstanceOf[js.Any], bodySpacing = bodySpacing.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], boxHeight = boxHeight.asInstanceOf[js.Any], boxPadding = boxPadding.asInstanceOf[js.Any], boxWidth = boxWidth.asInstanceOf[js.Any], callbacks = callbacks.asInstanceOf[js.Any], caretPadding = caretPadding.asInstanceOf[js.Any], caretSize = caretSize.asInstanceOf[js.Any], cornerRadius = cornerRadius.asInstanceOf[js.Any], displayColors = displayColors.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], external = js.Any.fromFunction1(external), filter = js.Any.fromFunction4(filter), footerAlign = footerAlign.asInstanceOf[js.Any], footerColor = footerColor.asInstanceOf[js.Any], footerFont = footerFont.asInstanceOf[js.Any], footerMarginTop = footerMarginTop.asInstanceOf[js.Any], footerSpacing = footerSpacing.asInstanceOf[js.Any], includeInvisible = includeInvisible.asInstanceOf[js.Any], intersect = intersect.asInstanceOf[js.Any], itemSort = js.Any.fromFunction3(itemSort), mode = mode.asInstanceOf[js.Any], multiKeyBackground = multiKeyBackground.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], rtl = rtl.asInstanceOf[js.Any], textDirection = textDirection.asInstanceOf[js.Any], titleAlign = titleAlign.asInstanceOf[js.Any], titleColor = titleColor.asInstanceOf[js.Any], titleFont = titleFont.asInstanceOf[js.Any], titleMarginBottom = titleMarginBottom.asInstanceOf[js.Any], titleSpacing = titleSpacing.asInstanceOf[js.Any], usePointStyle = usePointStyle.asInstanceOf[js.Any], xAlign = xAlign.asInstanceOf[js.Any], yAlign = yAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipOptions[TType]]
  }
  
  extension [Self <: TooltipOptions[?], TType /* <: ChartType */](x: Self & TooltipOptions[TType]) {
    
    inline def setAnimation(value: AnimationSpec[TType]): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimations(value: AnimationsSpec[TType]): Self = StObject.set(x, "animations", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColor(value: Scriptable[Color, ScriptableTooltipContext[TType]]): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorFunction2(value: (ScriptableTooltipContext[TType], /* options */ AnyObject) => js.UndefOr[Color]): Self = StObject.set(x, "backgroundColor", js.Any.fromFunction2(value))
    
    inline def setBodyAlign(value: Scriptable[TextAlign, ScriptableTooltipContext[TType]]): Self = StObject.set(x, "bodyAlign", value.asInstanceOf[js.Any])
    
    inline def setBodyAlignFunction2(value: (ScriptableTooltipContext[TType], /* options */ AnyObject) => js.UndefOr[TextAlign]): Self = StObject.set(x, "bodyAlign", js.Any.fromFunction2(value))
    
    inline def setBodyColor(value: Scriptable[Color, ScriptableTooltipContext[TType]]): Self = StObject.set(x, "bodyColor", value.asInstanceOf[js.Any])
    
    inline def setBodyColorFunction2(value: (ScriptableTooltipContext[TType], /* options */ AnyObject) => js.UndefOr[Color]): Self = StObject.set(x, "bodyColor", js.Any.fromFunction2(value))
    
    inline def setBodyFont(value: ScriptableAndScriptableOptions[PartialFontSpec, ScriptableTooltipContext[TType]]): Self = StObject.set(x, "bodyFont", value.asInstanceOf[js.Any])
    
    inline def setBodyFontFunction2(value: (ScriptableTooltipContext[TType], /* options */ AnyObject) => js.UndefOr[PartialFontSpec]): Self = StObject.set(x, "bodyFont", js.Any.fromFunction2(value))
    
    inline def setBodySpacing(value: Scriptable[Double, ScriptableTooltipContext[TType]]): Self = StObject.set(x, "bodySpacing", value.asInstanceOf[js.Any])
    
    inline def setBodySpacingFunction2(value: (ScriptableTooltipContext[TType], /* options */ AnyObject) => js.UndefOr[Double]): Self = StObject.set(x, "bodySpacing", js.Any.fromFunction2(value))
    
    inline def setBorderColor(value: Scriptable[Color, ScriptableTooltipContext[TType]]): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorFunction2(value: (ScriptableTooltipContext[TType], /* options */ AnyObject) => js.UndefOr[Color]): Self = StObject.set(x, "borderColor", js.Any.fromFunction2(value))
    
    inline def setBorderWidth(value: Scriptable[Double, ScriptableTooltipContext[TType]]): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderWidthFunction2(value: (ScriptableTooltipContext[TType], /* options */ AnyObject) => js.UndefOr[Double]): Self = StObject.set(x, "borderWidth", js.Any.fromFunction2(value))
    
    inline def setBoxHeight(value: Scriptable[Double, ScriptableTooltipContext[TType]]): Self = StObject.set(x, "boxHeight", value.asInstanceOf[js.Any])
    
    inline def setBoxHeightFunction2(value: (ScriptableTooltipContext[TType], /* options */ AnyObject) => js.UndefOr[Double]): Self = StObject.set(x, "boxHeight", js.Any.fromFunction2(value))
    
    inline def setBoxPadding(value: Double): Self = StObject.set(x, "boxPadding", value.asInstanceOf[js.Any])
    
    inline def setBoxWidth(value: Scriptable[Double, ScriptableTooltipContext[TType]]): Self = StObject.set(x, "boxWidth", value.asInstanceOf[js.Any])
    
    inline def setBoxWidthFunction2(value: (ScriptableTooltipContext[TType], /* options */ AnyObject) => js.UndefOr[Double]): Self = StObject.set(x, "boxWidth", js.Any.fromFunction2(value))
    
    inline def setCallbacks(value: TooltipCallbacks[TType, TooltipModel[TType], TooltipItem[TType]]): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
    
    inline def setCaretPadding(value: Scriptable[Double, ScriptableTooltipContext[TType]]): Self = StObject.set(x, "caretPadding", value.asInstanceOf[js.Any])
    
    inline def setCaretPaddingFunction2(value: (ScriptableTooltipContext[TType], /* options */ AnyObject) => js.UndefOr[Double]): Self = StObject.set(x, "caretPadding", js.Any.fromFunction2(value))
    
    inline def setCaretSize(value: Scriptable[Double, ScriptableTooltipContext[TType]]): Self = StObject.set(x, "caretSize", value.asInstanceOf[js.Any])
    
    inline def setCaretSizeFunction2(value: (ScriptableTooltipContext[TType], /* options */ AnyObject) => js.UndefOr[Double]): Self = StObject.set(x, "caretSize", js.Any.fromFunction2(value))
    
    inline def setCornerRadius(value: Scriptable[Double | BorderRadius, ScriptableTooltipContext[TType]]): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
    
    inline def setCornerRadiusFunction2(
      value: (ScriptableTooltipContext[TType], /* options */ AnyObject) => js.UndefOr[Double | BorderRadius]
    ): Self = StObject.set(x, "cornerRadius", js.Any.fromFunction2(value))
    
    inline def setDisplayColors(value: Scriptable[Boolean, ScriptableTooltipContext[TType]]): Self = StObject.set(x, "displayColors", value.asInstanceOf[js.Any])
    
    inline def setDisplayColorsFunction2(value: (ScriptableTooltipContext[TType], /* options */ AnyObject) => js.UndefOr[Boolean]): Self = StObject.set(x, "displayColors", js.Any.fromFunction2(value))
    
    inline def setEnabled(value: Scriptable[Boolean, ScriptableTooltipContext[TType]]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledFunction2(value: (ScriptableTooltipContext[TType], /* options */ AnyObject) => js.UndefOr[Boolean]): Self = StObject.set(x, "enabled", js.Any.fromFunction2(value))
    
    inline def setExternal(value: ChartTooltip[TType] => Unit): Self = StObject.set(x, "external", js.Any.fromFunction1(value))
    
    inline def setFilter(
      value: (TooltipItem[TType], Double, js.Array[TooltipItem[TType]], ChartData[ChartType, DefaultDataPoint[ChartType], Any]) => Boolean
    ): Self = StObject.set(x, "filter", js.Any.fromFunction4(value))
    
    inline def setFooterAlign(value: Scriptable[TextAlign, ScriptableTooltipContext[TType]]): Self = StObject.set(x, "footerAlign", value.asInstanceOf[js.Any])
    
    inline def setFooterAlignFunction2(value: (ScriptableTooltipContext[TType], /* options */ AnyObject) => js.UndefOr[TextAlign]): Self = StObject.set(x, "footerAlign", js.Any.fromFunction2(value))
    
    inline def setFooterColor(value: Scriptable[Color, ScriptableTooltipContext[TType]]): Self = StObject.set(x, "footerColor", value.asInstanceOf[js.Any])
    
    inline def setFooterColorFunction2(value: (ScriptableTooltipContext[TType], /* options */ AnyObject) => js.UndefOr[Color]): Self = StObject.set(x, "footerColor", js.Any.fromFunction2(value))
    
    inline def setFooterFont(value: ScriptableAndScriptableOptions[PartialFontSpec, ScriptableTooltipContext[TType]]): Self = StObject.set(x, "footerFont", value.asInstanceOf[js.Any])
    
    inline def setFooterFontFunction2(value: (ScriptableTooltipContext[TType], /* options */ AnyObject) => js.UndefOr[PartialFontSpec]): Self = StObject.set(x, "footerFont", js.Any.fromFunction2(value))
    
    inline def setFooterMarginTop(value: Scriptable[Double, ScriptableTooltipContext[TType]]): Self = StObject.set(x, "footerMarginTop", value.asInstanceOf[js.Any])
    
    inline def setFooterMarginTopFunction2(value: (ScriptableTooltipContext[TType], /* options */ AnyObject) => js.UndefOr[Double]): Self = StObject.set(x, "footerMarginTop", js.Any.fromFunction2(value))
    
    inline def setFooterSpacing(value: Scriptable[Double, ScriptableTooltipContext[TType]]): Self = StObject.set(x, "footerSpacing", value.asInstanceOf[js.Any])
    
    inline def setFooterSpacingFunction2(value: (ScriptableTooltipContext[TType], /* options */ AnyObject) => js.UndefOr[Double]): Self = StObject.set(x, "footerSpacing", js.Any.fromFunction2(value))
    
    inline def setItemSort(
      value: (TooltipItem[TType], TooltipItem[TType], ChartData[ChartType, DefaultDataPoint[ChartType], Any]) => Double
    ): Self = StObject.set(x, "itemSort", js.Any.fromFunction3(value))
    
    inline def setMultiKeyBackground(value: Scriptable[Color, ScriptableTooltipContext[TType]]): Self = StObject.set(x, "multiKeyBackground", value.asInstanceOf[js.Any])
    
    inline def setMultiKeyBackgroundFunction2(value: (ScriptableTooltipContext[TType], /* options */ AnyObject) => js.UndefOr[Color]): Self = StObject.set(x, "multiKeyBackground", js.Any.fromFunction2(value))
    
    inline def setPadding(value: Scriptable[Double | ChartArea, ScriptableTooltipContext[TType]]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingFunction2(
      value: (ScriptableTooltipContext[TType], /* options */ AnyObject) => js.UndefOr[Double | ChartArea]
    ): Self = StObject.set(x, "padding", js.Any.fromFunction2(value))
    
    inline def setPosition(value: Scriptable[TooltipPositioner, ScriptableTooltipContext[TType]]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionFunction2(value: (ScriptableTooltipContext[TType], /* options */ AnyObject) => js.UndefOr[TooltipPositioner]): Self = StObject.set(x, "position", js.Any.fromFunction2(value))
    
    inline def setRtl(value: Scriptable[Boolean, ScriptableTooltipContext[TType]]): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
    
    inline def setRtlFunction2(value: (ScriptableTooltipContext[TType], /* options */ AnyObject) => js.UndefOr[Boolean]): Self = StObject.set(x, "rtl", js.Any.fromFunction2(value))
    
    inline def setTextDirection(value: Scriptable[String, ScriptableTooltipContext[TType]]): Self = StObject.set(x, "textDirection", value.asInstanceOf[js.Any])
    
    inline def setTextDirectionFunction2(value: (ScriptableTooltipContext[TType], /* options */ AnyObject) => js.UndefOr[String]): Self = StObject.set(x, "textDirection", js.Any.fromFunction2(value))
    
    inline def setTitleAlign(value: Scriptable[TextAlign, ScriptableTooltipContext[TType]]): Self = StObject.set(x, "titleAlign", value.asInstanceOf[js.Any])
    
    inline def setTitleAlignFunction2(value: (ScriptableTooltipContext[TType], /* options */ AnyObject) => js.UndefOr[TextAlign]): Self = StObject.set(x, "titleAlign", js.Any.fromFunction2(value))
    
    inline def setTitleColor(value: Scriptable[Color, ScriptableTooltipContext[TType]]): Self = StObject.set(x, "titleColor", value.asInstanceOf[js.Any])
    
    inline def setTitleColorFunction2(value: (ScriptableTooltipContext[TType], /* options */ AnyObject) => js.UndefOr[Color]): Self = StObject.set(x, "titleColor", js.Any.fromFunction2(value))
    
    inline def setTitleFont(value: ScriptableAndScriptableOptions[PartialFontSpec, ScriptableTooltipContext[TType]]): Self = StObject.set(x, "titleFont", value.asInstanceOf[js.Any])
    
    inline def setTitleFontFunction2(value: (ScriptableTooltipContext[TType], /* options */ AnyObject) => js.UndefOr[PartialFontSpec]): Self = StObject.set(x, "titleFont", js.Any.fromFunction2(value))
    
    inline def setTitleMarginBottom(value: Scriptable[Double, ScriptableTooltipContext[TType]]): Self = StObject.set(x, "titleMarginBottom", value.asInstanceOf[js.Any])
    
    inline def setTitleMarginBottomFunction2(value: (ScriptableTooltipContext[TType], /* options */ AnyObject) => js.UndefOr[Double]): Self = StObject.set(x, "titleMarginBottom", js.Any.fromFunction2(value))
    
    inline def setTitleSpacing(value: Scriptable[Double, ScriptableTooltipContext[TType]]): Self = StObject.set(x, "titleSpacing", value.asInstanceOf[js.Any])
    
    inline def setTitleSpacingFunction2(value: (ScriptableTooltipContext[TType], /* options */ AnyObject) => js.UndefOr[Double]): Self = StObject.set(x, "titleSpacing", js.Any.fromFunction2(value))
    
    inline def setUsePointStyle(value: Scriptable[Boolean, ScriptableTooltipContext[TType]]): Self = StObject.set(x, "usePointStyle", value.asInstanceOf[js.Any])
    
    inline def setUsePointStyleFunction2(value: (ScriptableTooltipContext[TType], /* options */ AnyObject) => js.UndefOr[Boolean]): Self = StObject.set(x, "usePointStyle", js.Any.fromFunction2(value))
    
    inline def setXAlign(value: Scriptable[TooltipXAlignment, ScriptableTooltipContext[TType]]): Self = StObject.set(x, "xAlign", value.asInstanceOf[js.Any])
    
    inline def setXAlignFunction2(value: (ScriptableTooltipContext[TType], /* options */ AnyObject) => js.UndefOr[TooltipXAlignment]): Self = StObject.set(x, "xAlign", js.Any.fromFunction2(value))
    
    inline def setYAlign(value: Scriptable[TooltipYAlignment, ScriptableTooltipContext[TType]]): Self = StObject.set(x, "yAlign", value.asInstanceOf[js.Any])
    
    inline def setYAlignFunction2(value: (ScriptableTooltipContext[TType], /* options */ AnyObject) => js.UndefOr[TooltipYAlignment]): Self = StObject.set(x, "yAlign", js.Any.fromFunction2(value))
  }
}
