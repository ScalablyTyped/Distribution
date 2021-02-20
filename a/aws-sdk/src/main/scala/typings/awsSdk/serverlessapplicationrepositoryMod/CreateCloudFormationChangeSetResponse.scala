package typings.awsSdk.serverlessapplicationrepositoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateCloudFormationChangeSetResponse extends StObject {
  
  /**
    * The application Amazon Resource Name (ARN).
    */
  var ApplicationId: js.UndefOr[string] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the change set.Length constraints: Minimum length of 1.Pattern: ARN:[-a-zA-Z0-9:/]*
    */
  var ChangeSetId: js.UndefOr[string] = js.native
  
  /**
    * The semantic version of the application:
    https://semver.org/
    
    */
  var SemanticVersion: js.UndefOr[string] = js.native
  
  /**
    * The unique ID of the stack.
    */
  var StackId: js.UndefOr[string] = js.native
}
object CreateCloudFormationChangeSetResponse {
  
  @scala.inline
  def apply(): CreateCloudFormationChangeSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCloudFormationChangeSetResponse]
  }
  
  @scala.inline
  implicit class CreateCloudFormationChangeSetResponseMutableBuilder[Self <: CreateCloudFormationChangeSetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationIdUndefined: Self = StObject.set(x, "ApplicationId", js.undefined)
    
    @scala.inline
    def setChangeSetId(value: string): Self = StObject.set(x, "ChangeSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeSetIdUndefined: Self = StObject.set(x, "ChangeSetId", js.undefined)
    
    @scala.inline
    def setSemanticVersion(value: string): Self = StObject.set(x, "SemanticVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSemanticVersionUndefined: Self = StObject.set(x, "SemanticVersion", js.undefined)
    
    @scala.inline
    def setStackId(value: string): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackIdUndefined: Self = StObject.set(x, "StackId", js.undefined)
  }
}
