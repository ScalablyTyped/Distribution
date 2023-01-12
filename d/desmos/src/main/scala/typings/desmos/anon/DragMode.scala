package typings.desmos.anon

import typings.desmos.desmosStrings.DASHED
import typings.desmos.desmosStrings.DOTTED
import typings.desmos.desmosStrings.NONE
import typings.desmos.desmosStrings.OPEN
import typings.desmos.desmosStrings.POINT
import typings.desmos.desmosStrings.SOLID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragMode extends StObject {
  
  /**
    * Hex color. See Colors. Default will cycle through 6 default colors.
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * See Drag Modes. Defaults to DragModes.NONE.
    */
  var dragMode: js.UndefOr[
    typings.desmos.desmosStrings.X | typings.desmos.desmosStrings.Y | typings.desmos.desmosStrings.XY | NONE | typings.desmos.desmosStrings.AUTO
  ] = js.undefined
  
  /**
    * Determines if graph is drawn.
    * @default false
    */
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Variable or computed expression used in the column header.
    */
  var latex: String
  
  /**
    * Determines opacity of lines. May be a number between 0 and 1, or a LaTeX string that evaluates to a number between 0 and 1.
    * @default 0.9
    */
  var lineOpacity: js.UndefOr[Double | String] = js.undefined
  
  /**
    * Sets the drawing style for line segments. See Styles.
    */
  var lineStyle: js.UndefOr[POINT | OPEN | typings.desmos.desmosStrings.CROSS | SOLID | DASHED | DOTTED] = js.undefined
  
  /**
    * Determines width of lines in pixels. May be any positive number, or a LaTeX string that evaluates to a positive number.
    * @default 2.5
    */
  var lineWidth: js.UndefOr[Double | String] = js.undefined
  
  /**
    * Determines whether line segments are plotted.
    */
  var lines: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Determines opacity of points. May be a number between 0 and 1, or a LaTeX string that evaluates to a number between 0 and 1.
    * @default 0.9
    */
  var pointOpacity: js.UndefOr[Double | String] = js.undefined
  
  /**
    * Determines diameter of points in pixels. May be any positive number, or a LaTeX string that evaluates to a positive number.
    * @default 9
    */
  var pointSize: js.UndefOr[Double | String] = js.undefined
  
  /**
    * Sets the drawing style for points. See Styles.
    */
  var pointStyle: js.UndefOr[POINT | OPEN | typings.desmos.desmosStrings.CROSS | SOLID | DASHED | DOTTED] = js.undefined
  
  /**
    * Determines whether points are plotted.
    */
  var points: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Array of LaTeX strings. Need not be specified in the case of computed table columns.
    */
  var values: js.UndefOr[js.Array[String]] = js.undefined
}
object DragMode {
  
  inline def apply(latex: String): DragMode = {
    val __obj = js.Dynamic.literal(latex = latex.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragMode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DragMode] (val x: Self) extends AnyVal {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDragMode(
      value: typings.desmos.desmosStrings.X | typings.desmos.desmosStrings.Y | typings.desmos.desmosStrings.XY | NONE | typings.desmos.desmosStrings.AUTO
    ): Self = StObject.set(x, "dragMode", value.asInstanceOf[js.Any])
    
    inline def setDragModeUndefined: Self = StObject.set(x, "dragMode", js.undefined)
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setLatex(value: String): Self = StObject.set(x, "latex", value.asInstanceOf[js.Any])
    
    inline def setLineOpacity(value: Double | String): Self = StObject.set(x, "lineOpacity", value.asInstanceOf[js.Any])
    
    inline def setLineOpacityUndefined: Self = StObject.set(x, "lineOpacity", js.undefined)
    
    inline def setLineStyle(value: POINT | OPEN | typings.desmos.desmosStrings.CROSS | SOLID | DASHED | DOTTED): Self = StObject.set(x, "lineStyle", value.asInstanceOf[js.Any])
    
    inline def setLineStyleUndefined: Self = StObject.set(x, "lineStyle", js.undefined)
    
    inline def setLineWidth(value: Double | String): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    inline def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
    
    inline def setLines(value: Boolean): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    inline def setLinesUndefined: Self = StObject.set(x, "lines", js.undefined)
    
    inline def setPointOpacity(value: Double | String): Self = StObject.set(x, "pointOpacity", value.asInstanceOf[js.Any])
    
    inline def setPointOpacityUndefined: Self = StObject.set(x, "pointOpacity", js.undefined)
    
    inline def setPointSize(value: Double | String): Self = StObject.set(x, "pointSize", value.asInstanceOf[js.Any])
    
    inline def setPointSizeUndefined: Self = StObject.set(x, "pointSize", js.undefined)
    
    inline def setPointStyle(value: POINT | OPEN | typings.desmos.desmosStrings.CROSS | SOLID | DASHED | DOTTED): Self = StObject.set(x, "pointStyle", value.asInstanceOf[js.Any])
    
    inline def setPointStyleUndefined: Self = StObject.set(x, "pointStyle", js.undefined)
    
    inline def setPoints(value: Boolean): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
    
    inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
