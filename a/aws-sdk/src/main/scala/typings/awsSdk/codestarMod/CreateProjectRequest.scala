package typings.awsSdk.codestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateProjectRequest extends js.Object {
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
  def apply(
    id: ProjectId,
    name: ProjectName,
    clientRequestToken: ClientRequestToken = null,
    description: ProjectDescription = null,
    sourceCode: SourceCode = null,
    tags: Tags = null,
    toolchain: Toolchain = null
  ): CreateProjectRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (clientRequestToken != null) __obj.updateDynamic("clientRequestToken")(clientRequestToken.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (sourceCode != null) __obj.updateDynamic("sourceCode")(sourceCode.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (toolchain != null) __obj.updateDynamic("toolchain")(toolchain.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProjectRequest]
  }
}

