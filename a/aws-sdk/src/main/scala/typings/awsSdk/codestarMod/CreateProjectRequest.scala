package typings.awsSdk.codestarMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateProjectRequest extends StObject {
  
  /**
    * A user- or system-generated token that identifies the entity that requested project creation. This token can be used to repeat the request.
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.native
  
  /**
    * The description of the project, if any.
    */
  var description: js.UndefOr[ProjectDescription] = js.native
  
  /**
    * The ID of the project to be created in AWS CodeStar.
    */
  var id: ProjectId = js.native
  
  /**
    * The display name for the project to be created in AWS CodeStar.
    */
  var name: ProjectName = js.native
  
  /**
    * A list of the Code objects submitted with the project request. If this parameter is specified, the request must also include the toolchain parameter.
    */
  var sourceCode: js.UndefOr[SourceCode] = js.native
  
  /**
    * The tags created for the project.
    */
  var tags: js.UndefOr[Tags] = js.native
  
  /**
    * The name of the toolchain template file submitted with the project request. If this parameter is specified, the request must also include the sourceCode parameter.
    */
  var toolchain: js.UndefOr[Toolchain] = js.native
}
object CreateProjectRequest {
  
  @scala.inline
  def apply(id: ProjectId, name: ProjectName): CreateProjectRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProjectRequest]
  }
  
  @scala.inline
  implicit class CreateProjectRequestMutableBuilder[Self <: CreateProjectRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "clientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestTokenUndefined: Self = StObject.set(x, "clientRequestToken", js.undefined)
    
    @scala.inline
    def setDescription(value: ProjectDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setId(value: ProjectId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: ProjectName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceCode(value: SourceCode): Self = StObject.set(x, "sourceCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceCodeUndefined: Self = StObject.set(x, "sourceCode", js.undefined)
    
    @scala.inline
    def setSourceCodeVarargs(value: Code*): Self = StObject.set(x, "sourceCode", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setToolchain(value: Toolchain): Self = StObject.set(x, "toolchain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolchainUndefined: Self = StObject.set(x, "toolchain", js.undefined)
  }
}
