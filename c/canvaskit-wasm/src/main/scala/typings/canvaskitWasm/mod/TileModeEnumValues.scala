package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TileModeEnumValues
  extends StObject
     with EmbindEnum {
  
  var Clamp: TileMode
  
  var Decal: TileMode
  
  var Mirror: TileMode
  
  var Repeat: TileMode
}
object TileModeEnumValues {
  
  inline def apply(Clamp: TileMode, Decal: TileMode, Mirror: TileMode, Repeat: TileMode, values: js.Array[Double]): TileModeEnumValues = {
    val __obj = js.Dynamic.literal(Clamp = Clamp.asInstanceOf[js.Any], Decal = Decal.asInstanceOf[js.Any], Mirror = Mirror.asInstanceOf[js.Any], Repeat = Repeat.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileModeEnumValues]
  }
  
  extension [Self <: TileModeEnumValues](x: Self) {
    
    inline def setClamp(value: TileMode): Self = StObject.set(x, "Clamp", value.asInstanceOf[js.Any])
    
    inline def setDecal(value: TileMode): Self = StObject.set(x, "Decal", value.asInstanceOf[js.Any])
    
    inline def setMirror(value: TileMode): Self = StObject.set(x, "Mirror", value.asInstanceOf[js.Any])
    
    inline def setRepeat(value: TileMode): Self = StObject.set(x, "Repeat", value.asInstanceOf[js.Any])
  }
}
