package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlphaTypeEnumValues extends EmbindEnum {
  
  var Opaque: AlphaType = js.native
  
  var Premul: AlphaType = js.native
  
  var Unpremul: AlphaType = js.native
}
object AlphaTypeEnumValues {
  
  @scala.inline
  def apply(Opaque: AlphaType, Premul: AlphaType, Unpremul: AlphaType, values: js.Array[Double]): AlphaTypeEnumValues = {
    val __obj = js.Dynamic.literal(Opaque = Opaque.asInstanceOf[js.Any], Premul = Premul.asInstanceOf[js.Any], Unpremul = Unpremul.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlphaTypeEnumValues]
  }
  
  @scala.inline
  implicit class AlphaTypeEnumValuesMutableBuilder[Self <: AlphaTypeEnumValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOpaque(value: AlphaType): Self = StObject.set(x, "Opaque", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPremul(value: AlphaType): Self = StObject.set(x, "Premul", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnpremul(value: AlphaType): Self = StObject.set(x, "Unpremul", value.asInstanceOf[js.Any])
  }
}
