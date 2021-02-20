package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteTriggerResponse extends StObject {
  
  /**
    * The name of the trigger that was deleted.
    */
  var Name: js.UndefOr[NameString] = js.native
}
object DeleteTriggerResponse {
  
  @scala.inline
  def apply(): DeleteTriggerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTriggerResponse]
  }
  
  @scala.inline
  implicit class DeleteTriggerResponseMutableBuilder[Self <: DeleteTriggerResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
