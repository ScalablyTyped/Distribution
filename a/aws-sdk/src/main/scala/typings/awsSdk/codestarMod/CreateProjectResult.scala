package typings.awsSdk.codestarMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateProjectResult extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the created project.
    */
  var arn: ProjectArn = js.native
  
  /**
    * A user- or system-generated token that identifies the entity that requested project creation.
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.native
  
  /**
    * The ID of the project.
    */
  var id: ProjectId = js.native
  
  /**
    * Reserved for future use.
    */
  var projectTemplateId: js.UndefOr[ProjectTemplateId] = js.native
}
object CreateProjectResult {
  
  @scala.inline
  def apply(arn: ProjectArn, id: ProjectId): CreateProjectResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProjectResult]
  }
  
  @scala.inline
  implicit class CreateProjectResultMutableBuilder[Self <: CreateProjectResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: ProjectArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "clientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestTokenUndefined: Self = StObject.set(x, "clientRequestToken", js.undefined)
    
    @scala.inline
    def setId(value: ProjectId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectTemplateId(value: ProjectTemplateId): Self = StObject.set(x, "projectTemplateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectTemplateIdUndefined: Self = StObject.set(x, "projectTemplateId", js.undefined)
  }
}
