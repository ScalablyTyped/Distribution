package typings.devextremeB5DqTZzf.anon

import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.discrete
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.gradient
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.none
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.range
import typings.devextremeB5DqTZzf.mod.DevExpress.viz.PaletteExtensionModeType
import typings.devextremeB5DqTZzf.mod.DevExpress.viz.PaletteType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorCodeField extends StObject {
  
  /**
    * Specifies the name of the data source field whose values define the color of a tile. Applies only if the type property is &apos;gradient&apos; or &apos;range&apos;.
    */
  var colorCodeField: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether or not all tiles in a group must be colored uniformly. Applies only if the type property is &apos;discrete&apos;.
    */
  var colorizeGroups: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets the palette to be used to colorize tiles.
    */
  var palette: js.UndefOr[js.Array[String] | PaletteType] = js.undefined
  
  /**
    * Specifies what to do with colors in the palette when their number is less than the number of treemap tiles.
    */
  var paletteExtensionMode: js.UndefOr[PaletteExtensionModeType] = js.undefined
  
  /**
    * Allows you to paint tiles with similar values uniformly. Applies only if the type property is &apos;gradient&apos; or &apos;range&apos;.
    */
  var range: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * Specifies the colorizing algorithm.
    */
  var `type`: js.UndefOr[discrete | gradient | none | range] = js.undefined
}
object ColorCodeField {
  
  inline def apply(): ColorCodeField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorCodeField]
  }
  
  extension [Self <: ColorCodeField](x: Self) {
    
    inline def setColorCodeField(value: String): Self = StObject.set(x, "colorCodeField", value.asInstanceOf[js.Any])
    
    inline def setColorCodeFieldUndefined: Self = StObject.set(x, "colorCodeField", js.undefined)
    
    inline def setColorizeGroups(value: Boolean): Self = StObject.set(x, "colorizeGroups", value.asInstanceOf[js.Any])
    
    inline def setColorizeGroupsUndefined: Self = StObject.set(x, "colorizeGroups", js.undefined)
    
    inline def setPalette(value: js.Array[String] | PaletteType): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
    
    inline def setPaletteExtensionMode(value: PaletteExtensionModeType): Self = StObject.set(x, "paletteExtensionMode", value.asInstanceOf[js.Any])
    
    inline def setPaletteExtensionModeUndefined: Self = StObject.set(x, "paletteExtensionMode", js.undefined)
    
    inline def setPaletteUndefined: Self = StObject.set(x, "palette", js.undefined)
    
    inline def setPaletteVarargs(value: String*): Self = StObject.set(x, "palette", js.Array(value*))
    
    inline def setRange(value: js.Array[Double]): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setRangeVarargs(value: Double*): Self = StObject.set(x, "range", js.Array(value*))
    
    inline def setType(value: discrete | gradient | none | range): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
