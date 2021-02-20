package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteComponentRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the component build version to delete. 
    */
  var componentBuildVersionArn: ComponentBuildVersionArn = js.native
}
object DeleteComponentRequest {
  
  @scala.inline
  def apply(componentBuildVersionArn: ComponentBuildVersionArn): DeleteComponentRequest = {
    val __obj = js.Dynamic.literal(componentBuildVersionArn = componentBuildVersionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteComponentRequest]
  }
  
  @scala.inline
  implicit class DeleteComponentRequestMutableBuilder[Self <: DeleteComponentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponentBuildVersionArn(value: ComponentBuildVersionArn): Self = StObject.set(x, "componentBuildVersionArn", value.asInstanceOf[js.Any])
  }
}
