package typings.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuiltinIntentSlot extends StObject {
  
  /**
    * A list of the slots defined for the intent.
    */
  var name: js.UndefOr[String] = js.native
}
object BuiltinIntentSlot {
  
  @scala.inline
  def apply(): BuiltinIntentSlot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuiltinIntentSlot]
  }
  
  @scala.inline
  implicit class BuiltinIntentSlotMutableBuilder[Self <: BuiltinIntentSlot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
