package typings.awsSdk.cloudhsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateHapgRequest extends StObject {
  
  /**
    * The label of the new high-availability partition group.
    */
  var Label: typings.awsSdk.cloudhsmMod.Label
}
object CreateHapgRequest {
  
  @scala.inline
  def apply(Label: Label): CreateHapgRequest = {
    val __obj = js.Dynamic.literal(Label = Label.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateHapgRequest]
  }
  
  @scala.inline
  implicit class CreateHapgRequestMutableBuilder[Self <: CreateHapgRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: Label): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
  }
}
