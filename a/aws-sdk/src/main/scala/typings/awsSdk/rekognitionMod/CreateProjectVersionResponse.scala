package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateProjectVersionResponse extends StObject {
  
  /**
    * The ARN of the model version that was created. Use DescribeProjectVersion to get the current status of the training operation.
    */
  var ProjectVersionArn: js.UndefOr[typings.awsSdk.rekognitionMod.ProjectVersionArn] = js.native
}
object CreateProjectVersionResponse {
  
  @scala.inline
  def apply(): CreateProjectVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateProjectVersionResponse]
  }
  
  @scala.inline
  implicit class CreateProjectVersionResponseMutableBuilder[Self <: CreateProjectVersionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProjectVersionArn(value: ProjectVersionArn): Self = StObject.set(x, "ProjectVersionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectVersionArnUndefined: Self = StObject.set(x, "ProjectVersionArn", js.undefined)
  }
}
