package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a PickleAccepted. */
trait IPickleAccepted extends StObject {
  
  /** PickleAccepted pickleId */
  var pickleId: js.UndefOr[String | Null] = js.undefined
}
object IPickleAccepted {
  
  @scala.inline
  def apply(): IPickleAccepted = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPickleAccepted]
  }
  
  @scala.inline
  implicit class IPickleAcceptedMutableBuilder[Self <: IPickleAccepted] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPickleId(value: String): Self = StObject.set(x, "pickleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPickleIdNull: Self = StObject.set(x, "pickleId", null)
    
    @scala.inline
    def setPickleIdUndefined: Self = StObject.set(x, "pickleId", js.undefined)
  }
}
