package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TileStyle extends StObject {
  
  /**
    * The border around a tile.
    */
  var Border: js.UndefOr[BorderStyle] = js.undefined
}
object TileStyle {
  
  inline def apply(): TileStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileStyle]
  }
  
  extension [Self <: TileStyle](x: Self) {
    
    inline def setBorder(value: BorderStyle): Self = StObject.set(x, "Border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "Border", js.undefined)
  }
}
