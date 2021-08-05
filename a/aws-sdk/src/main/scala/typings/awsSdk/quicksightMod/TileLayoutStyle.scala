package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TileLayoutStyle extends StObject {
  
  /**
    * The gutter settings that apply between tiles. 
    */
  var Gutter: js.UndefOr[GutterStyle] = js.undefined
  
  /**
    * The margin settings that apply around the outside edge of sheets.
    */
  var Margin: js.UndefOr[MarginStyle] = js.undefined
}
object TileLayoutStyle {
  
  inline def apply(): TileLayoutStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileLayoutStyle]
  }
  
  extension [Self <: TileLayoutStyle](x: Self) {
    
    inline def setGutter(value: GutterStyle): Self = StObject.set(x, "Gutter", value.asInstanceOf[js.Any])
    
    inline def setGutterUndefined: Self = StObject.set(x, "Gutter", js.undefined)
    
    inline def setMargin(value: MarginStyle): Self = StObject.set(x, "Margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "Margin", js.undefined)
  }
}
