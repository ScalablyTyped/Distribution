package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateProjectRequest extends StObject {
  
  /**
    * The name of the project to be updated.
    */
  var Name: ProjectName
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role to be assumed for this request.
    */
  var RoleArn: Arn
  
  var Sample: js.UndefOr[typings.awsSdk.databrewMod.Sample] = js.undefined
}
object UpdateProjectRequest {
  
  inline def apply(Name: ProjectName, RoleArn: Arn): UpdateProjectRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProjectRequest]
  }
  
  extension [Self <: UpdateProjectRequest](x: Self) {
    
    inline def setName(value: ProjectName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: Arn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setSample(value: Sample): Self = StObject.set(x, "Sample", value.asInstanceOf[js.Any])
    
    inline def setSampleUndefined: Self = StObject.set(x, "Sample", js.undefined)
  }
}
