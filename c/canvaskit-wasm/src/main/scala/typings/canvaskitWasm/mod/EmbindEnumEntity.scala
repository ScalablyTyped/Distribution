package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmbindEnumEntity extends StObject {
  
  val value: Double = js.native
}
object EmbindEnumEntity {
  
  @scala.inline
  def apply(value: Double): EmbindEnumEntity = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmbindEnumEntity]
  }
  
  @scala.inline
  implicit class EmbindEnumEntityMutableBuilder[Self <: EmbindEnumEntity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
