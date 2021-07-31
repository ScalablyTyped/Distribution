package typings.awsSdk.serverlessapplicationrepositoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetApplicationRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the application.
    */
  var ApplicationId: string
  
  /**
    * The semantic version of the application to get.
    */
  var SemanticVersion: js.UndefOr[string] = js.undefined
}
object GetApplicationRequest {
  
  @scala.inline
  def apply(ApplicationId: string): GetApplicationRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetApplicationRequest]
  }
  
  @scala.inline
  implicit class GetApplicationRequestMutableBuilder[Self <: GetApplicationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSemanticVersion(value: string): Self = StObject.set(x, "SemanticVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSemanticVersionUndefined: Self = StObject.set(x, "SemanticVersion", js.undefined)
  }
}
