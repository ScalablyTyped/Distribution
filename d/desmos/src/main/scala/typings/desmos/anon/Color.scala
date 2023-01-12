package typings.desmos.anon

import typings.desmos.Desmos.ExpressionState
import typings.desmos.desmosStrings.BELOW
import typings.desmos.desmosStrings.DASHED
import typings.desmos.desmosStrings.DEFAULT
import typings.desmos.desmosStrings.DOTTED
import typings.desmos.desmosStrings.LEFT
import typings.desmos.desmosStrings.MEDIUM
import typings.desmos.desmosStrings.NONE
import typings.desmos.desmosStrings.OPEN
import typings.desmos.desmosStrings.POINT
import typings.desmos.desmosStrings.RIGHT
import typings.desmos.desmosStrings.SMALL
import typings.desmos.desmosStrings.SOLID
import typings.desmos.desmosStrings.expression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Color
  extends StObject
     with ExpressionState {
  
  /**
    * , hex color. See Colors. Default will cycle through 6 default colors.
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the drag mode of a point. See Drag Modes. Defaults to DragModes.AUTO.
    */
  var dragMode: js.UndefOr[
    typings.desmos.desmosStrings.X | typings.desmos.desmosStrings.Y | typings.desmos.desmosStrings.XY | NONE | typings.desmos.desmosStrings.AUTO
  ] = js.undefined
  
  /**
    * Determines whether a polygon or parametric curve has its interior shaded.
    */
  var fill: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Determines opacity of the interior of a polygon or parametric curve. May be a number between 0 and 1, or a LaTeX string that evaluates to a number between 0 and 1. Defaults to 0.4.
    */
  var fillOpacity: js.UndefOr[Double | String] = js.undefined
  
  /**
    * Determines whether the graph is drawn. Defaults to false.
    */
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Should be a valid property name for a javascript object (letters, numbers, and _).
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * . Sets the text label of a point. If a label is set to the empty string then the point's default label (its coordinates) will be applied.
    */
  var label: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the desired position of a point's text label. See LabelOrientations.
    */
  var labelOrientation: js.UndefOr[typings.desmos.desmosStrings.ABOVE | BELOW | LEFT | RIGHT | DEFAULT] = js.undefined
  
  /**
    * Sets the size of a point's text label. See LabelSizes.
    */
  var labelSize: js.UndefOr[SMALL | MEDIUM | typings.desmos.desmosStrings.LARGE] = js.undefined
  
  /**
    * Following Desmos Expressions.
    */
  var latex: js.UndefOr[String] = js.undefined
  
  /**
    * Determines opacity of lines. May be a number between 0 and 1, or a LaTeX string that evaluates to a number between 0 and 1. Defaults to 0.9.
    */
  var lineOpacity: js.UndefOr[Double | String] = js.undefined
  
  /**
    * Sets the line drawing style of curves or point lists. See Styles.
    */
  var lineStyle: js.UndefOr[POINT | OPEN | typings.desmos.desmosStrings.CROSS | SOLID | DASHED | DOTTED] = js.undefined
  
  /**
    * Determines width of lines in pixels. May be any positive number, or a LaTeX string that evaluates to a positive number. Defaults to 2.5.
    */
  var lineWidth: js.UndefOr[Double | String] = js.undefined
  
  /**
    * Determines whether line segments are plotted for point lists.
    */
  var lines: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets bounds of parametric curves. See note below.
    */
  var parametricDomain: js.UndefOr[Min] = js.undefined
  
  /**
    * Determines opacity of points. May be a number between 0 and 1, or a LaTeX string that evaluates to a number between 0 and 1. Defaults to 0.9.
    */
  var pointOpacity: js.UndefOr[Double | String] = js.undefined
  
  /**
    * Determines diameter of points in pixels. May be any positive number, or a LaTeX string that evaluates to a positive number. Defaults to 9.
    */
  var pointSize: js.UndefOr[Double | String] = js.undefined
  
  /**
    * Sets the point drawing style of point lists. See Styles.
    */
  var pointStyle: js.UndefOr[POINT | OPEN | typings.desmos.desmosStrings.CROSS | SOLID | DASHED | DOTTED] = js.undefined
  
  /**
    * Determines whether points are plotted for point lists.
    */
  var points: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets bounds of polar curves. See note below.
    */
  var polarDomain: js.UndefOr[Min] = js.undefined
  
  /**
    * Determines whether the expression should appear in the expressions list. Does not affect graph visibility. Defaults to false.
    */
  var secret: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets the visibility of a point's text label.
    */
  var showLabel: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets bounds of slider expressions. If step is omitted, '', or undefined, the slider will be continuously adjustable. See note below.
    */
  var sliderBounds: js.UndefOr[Max] = js.undefined
  
  var `type`: js.UndefOr[expression] = js.undefined
}
object Color {
  
  inline def apply(): Color = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Color]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Color] (val x: Self) extends AnyVal {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDragMode(
      value: typings.desmos.desmosStrings.X | typings.desmos.desmosStrings.Y | typings.desmos.desmosStrings.XY | NONE | typings.desmos.desmosStrings.AUTO
    ): Self = StObject.set(x, "dragMode", value.asInstanceOf[js.Any])
    
    inline def setDragModeUndefined: Self = StObject.set(x, "dragMode", js.undefined)
    
    inline def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillOpacity(value: Double | String): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
    
    inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelOrientation(value: typings.desmos.desmosStrings.ABOVE | BELOW | LEFT | RIGHT | DEFAULT): Self = StObject.set(x, "labelOrientation", value.asInstanceOf[js.Any])
    
    inline def setLabelOrientationUndefined: Self = StObject.set(x, "labelOrientation", js.undefined)
    
    inline def setLabelSize(value: SMALL | MEDIUM | typings.desmos.desmosStrings.LARGE): Self = StObject.set(x, "labelSize", value.asInstanceOf[js.Any])
    
    inline def setLabelSizeUndefined: Self = StObject.set(x, "labelSize", js.undefined)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLatex(value: String): Self = StObject.set(x, "latex", value.asInstanceOf[js.Any])
    
    inline def setLatexUndefined: Self = StObject.set(x, "latex", js.undefined)
    
    inline def setLineOpacity(value: Double | String): Self = StObject.set(x, "lineOpacity", value.asInstanceOf[js.Any])
    
    inline def setLineOpacityUndefined: Self = StObject.set(x, "lineOpacity", js.undefined)
    
    inline def setLineStyle(value: POINT | OPEN | typings.desmos.desmosStrings.CROSS | SOLID | DASHED | DOTTED): Self = StObject.set(x, "lineStyle", value.asInstanceOf[js.Any])
    
    inline def setLineStyleUndefined: Self = StObject.set(x, "lineStyle", js.undefined)
    
    inline def setLineWidth(value: Double | String): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    inline def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
    
    inline def setLines(value: Boolean): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    inline def setLinesUndefined: Self = StObject.set(x, "lines", js.undefined)
    
    inline def setParametricDomain(value: Min): Self = StObject.set(x, "parametricDomain", value.asInstanceOf[js.Any])
    
    inline def setParametricDomainUndefined: Self = StObject.set(x, "parametricDomain", js.undefined)
    
    inline def setPointOpacity(value: Double | String): Self = StObject.set(x, "pointOpacity", value.asInstanceOf[js.Any])
    
    inline def setPointOpacityUndefined: Self = StObject.set(x, "pointOpacity", js.undefined)
    
    inline def setPointSize(value: Double | String): Self = StObject.set(x, "pointSize", value.asInstanceOf[js.Any])
    
    inline def setPointSizeUndefined: Self = StObject.set(x, "pointSize", js.undefined)
    
    inline def setPointStyle(value: POINT | OPEN | typings.desmos.desmosStrings.CROSS | SOLID | DASHED | DOTTED): Self = StObject.set(x, "pointStyle", value.asInstanceOf[js.Any])
    
    inline def setPointStyleUndefined: Self = StObject.set(x, "pointStyle", js.undefined)
    
    inline def setPoints(value: Boolean): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
    
    inline def setPolarDomain(value: Min): Self = StObject.set(x, "polarDomain", value.asInstanceOf[js.Any])
    
    inline def setPolarDomainUndefined: Self = StObject.set(x, "polarDomain", js.undefined)
    
    inline def setSecret(value: Boolean): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    inline def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
    
    inline def setShowLabel(value: Boolean): Self = StObject.set(x, "showLabel", value.asInstanceOf[js.Any])
    
    inline def setShowLabelUndefined: Self = StObject.set(x, "showLabel", js.undefined)
    
    inline def setSliderBounds(value: Max): Self = StObject.set(x, "sliderBounds", value.asInstanceOf[js.Any])
    
    inline def setSliderBoundsUndefined: Self = StObject.set(x, "sliderBounds", js.undefined)
    
    inline def setType(value: expression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
