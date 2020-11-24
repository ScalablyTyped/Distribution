package typings.c3.anon

import typings.c3.c3Strings.pow10
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Colors extends js.Object {
  
  /**
    * Set the color interpolator for stanford color scale. This option is a
    * `d3.interpolate*` object or any function you definethat receives a
    * value between `0` and `1`, and returns a color as string.
    */
  var colors: js.UndefOr[js.Function1[/* value */ Double, String]] = js.native
  
  /** Show lines anywhere in the chart. */
  var lines: js.UndefOr[js.Array[Class]] = js.native
  
  /**
    * Set the padding for the Stanford color scale.
    */
  var padding: js.UndefOr[typings.c3.mod.Padding] = js.native
  
  /** Add regions to the chart. */
  var regions: js.UndefOr[js.Array[Opacity]] = js.native
  
  /**
    * Set formatter for stanford color scale axis tick text.
    * This option accepts the string 'pow10', a d3.format object and any function you define.
    * Defauls to `d3.format("d")`.
    */
  var scaleFormat: js.UndefOr[pow10 | (js.Function1[/* arg0 */ Double, String])] = js.native
  
  /** Change the maximum value of the stanford color scale. */
  var scaleMax: js.UndefOr[Double] = js.native
  
  /** Change the minimum value of the stanford color scale. */
  var scaleMin: js.UndefOr[Double] = js.native
  
  /**
    * Set the values for stanford color scale axis tick text. This option accepts a function that returns an array of numbers.
    */
  var scaleValues: js.UndefOr[js.Function2[/* minValue */ Double, /* maxValue */ Double, js.Array[Double]]] = js.native
  
  /**
    * Change the width of the stanford color scale.
    * Defaults to `20`.
    */
  var scaleWidth: js.UndefOr[Double] = js.native
  
  /** Show text anywhere inside the chart. */
  var texts: js.UndefOr[js.Array[Content]] = js.native
}
object Colors {
  
  @scala.inline
  def apply(): Colors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Colors]
  }
  
  @scala.inline
  implicit class ColorsOps[Self <: Colors] (val x: Self) extends AnyVal {
    
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
    def setColors(value: /* value */ Double => String): Self = this.set("colors", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    
    @scala.inline
    def setLinesVarargs(value: Class*): Self = this.set("lines", js.Array(value :_*))
    
    @scala.inline
    def setLines(value: js.Array[Class]): Self = this.set("lines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLines: Self = this.set("lines", js.undefined)
    
    @scala.inline
    def setPadding(value: typings.c3.mod.Padding): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setRegionsVarargs(value: Opacity*): Self = this.set("regions", js.Array(value :_*))
    
    @scala.inline
    def setRegions(value: js.Array[Opacity]): Self = this.set("regions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegions: Self = this.set("regions", js.undefined)
    
    @scala.inline
    def setScaleFormatFunction1(value: /* arg0 */ Double => String): Self = this.set("scaleFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setScaleFormat(value: pow10 | (js.Function1[/* arg0 */ Double, String])): Self = this.set("scaleFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleFormat: Self = this.set("scaleFormat", js.undefined)
    
    @scala.inline
    def setScaleMax(value: Double): Self = this.set("scaleMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleMax: Self = this.set("scaleMax", js.undefined)
    
    @scala.inline
    def setScaleMin(value: Double): Self = this.set("scaleMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleMin: Self = this.set("scaleMin", js.undefined)
    
    @scala.inline
    def setScaleValues(value: (/* minValue */ Double, /* maxValue */ Double) => js.Array[Double]): Self = this.set("scaleValues", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteScaleValues: Self = this.set("scaleValues", js.undefined)
    
    @scala.inline
    def setScaleWidth(value: Double): Self = this.set("scaleWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleWidth: Self = this.set("scaleWidth", js.undefined)
    
    @scala.inline
    def setTextsVarargs(value: Content*): Self = this.set("texts", js.Array(value :_*))
    
    @scala.inline
    def setTexts(value: js.Array[Content]): Self = this.set("texts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTexts: Self = this.set("texts", js.undefined)
  }
}
