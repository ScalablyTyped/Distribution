package typings.devextremeB5DqTZzf.anon

import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.gradientSet
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.indicatingSet
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.simpleSet
import typings.devextremeB5DqTZzf.mod.DevExpress.viz.PaletteExtensionModeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseColorSet extends StObject {
  
  var baseColorSet: js.UndefOr[simpleSet | indicatingSet | gradientSet] = js.undefined
  
  var paletteExtensionMode: js.UndefOr[PaletteExtensionModeType] = js.undefined
}
object BaseColorSet {
  
  inline def apply(): BaseColorSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseColorSet]
  }
  
  extension [Self <: BaseColorSet](x: Self) {
    
    inline def setBaseColorSet(value: simpleSet | indicatingSet | gradientSet): Self = StObject.set(x, "baseColorSet", value.asInstanceOf[js.Any])
    
    inline def setBaseColorSetUndefined: Self = StObject.set(x, "baseColorSet", js.undefined)
    
    inline def setPaletteExtensionMode(value: PaletteExtensionModeType): Self = StObject.set(x, "paletteExtensionMode", value.asInstanceOf[js.Any])
    
    inline def setPaletteExtensionModeUndefined: Self = StObject.set(x, "paletteExtensionMode", js.undefined)
  }
}
