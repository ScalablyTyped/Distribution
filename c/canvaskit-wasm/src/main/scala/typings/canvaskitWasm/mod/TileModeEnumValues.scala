package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TileModeEnumValues extends EmbindEnum {
  
  var Clamp: TileMode = js.native
  
  var Decal: TileMode = js.native
  
  var Mirror: TileMode = js.native
  
  var Repeat: TileMode = js.native
}
object TileModeEnumValues {
  
  @scala.inline
  def apply(Clamp: TileMode, Decal: TileMode, Mirror: TileMode, Repeat: TileMode, values: js.Array[Double]): TileModeEnumValues = {
    val __obj = js.Dynamic.literal(Clamp = Clamp.asInstanceOf[js.Any], Decal = Decal.asInstanceOf[js.Any], Mirror = Mirror.asInstanceOf[js.Any], Repeat = Repeat.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileModeEnumValues]
  }
  
  @scala.inline
  implicit class TileModeEnumValuesMutableBuilder[Self <: TileModeEnumValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClamp(value: TileMode): Self = StObject.set(x, "Clamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecal(value: TileMode): Self = StObject.set(x, "Decal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMirror(value: TileMode): Self = StObject.set(x, "Mirror", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeat(value: TileMode): Self = StObject.set(x, "Repeat", value.asInstanceOf[js.Any])
  }
}
