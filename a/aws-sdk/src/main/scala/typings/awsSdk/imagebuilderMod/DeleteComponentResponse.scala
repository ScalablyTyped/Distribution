package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteComponentResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the component build version that was deleted. 
    */
  var componentBuildVersionArn: js.UndefOr[ComponentBuildVersionArn] = js.native
  
  /**
    * The request ID that uniquely identifies this request. 
    */
  var requestId: js.UndefOr[NonEmptyString] = js.native
}
object DeleteComponentResponse {
  
  @scala.inline
  def apply(): DeleteComponentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteComponentResponse]
  }
  
  @scala.inline
  implicit class DeleteComponentResponseMutableBuilder[Self <: DeleteComponentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponentBuildVersionArn(value: ComponentBuildVersionArn): Self = StObject.set(x, "componentBuildVersionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentBuildVersionArnUndefined: Self = StObject.set(x, "componentBuildVersionArn", js.undefined)
    
    @scala.inline
    def setRequestId(value: NonEmptyString): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
