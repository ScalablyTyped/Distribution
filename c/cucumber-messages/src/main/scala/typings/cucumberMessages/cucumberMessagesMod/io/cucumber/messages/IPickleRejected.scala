package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a PickleRejected. */
@js.native
trait IPickleRejected extends StObject {
  
  /** PickleRejected pickleId */
  var pickleId: js.UndefOr[String | Null] = js.native
}
object IPickleRejected {
  
  @scala.inline
  def apply(): IPickleRejected = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPickleRejected]
  }
  
  @scala.inline
  implicit class IPickleRejectedMutableBuilder[Self <: IPickleRejected] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPickleId(value: String): Self = StObject.set(x, "pickleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPickleIdNull: Self = StObject.set(x, "pickleId", null)
    
    @scala.inline
    def setPickleIdUndefined: Self = StObject.set(x, "pickleId", js.undefined)
  }
}
