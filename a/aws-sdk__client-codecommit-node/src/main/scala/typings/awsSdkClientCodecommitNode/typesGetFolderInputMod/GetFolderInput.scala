package typings.awsSdkClientCodecommitNode.typesGetFolderInputMod

import typings.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkTypes.abortMod.AbortSignal
import typings.awsSdkTypes.httpMod.NodeHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFolderInput extends InputTypesUnion {
  /**
    * An object that may be queried to determine if the underlying operation has been aborted.
    *
    * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
    */
  @JSName("$abortSignal")
  var $abortSignal: js.UndefOr[AbortSignal] = js.native
  /**
    * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
    */
  @JSName("$httpOptions")
  var $httpOptions: js.UndefOr[NodeHttpOptions] = js.native
  /**
    * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
    */
  @JSName("$maxRetries")
  var $maxRetries: js.UndefOr[Double] = js.native
  /**
    * <p>A fully-qualified reference used to identify a commit that contains the version of the folder's content to return. A fully-qualified reference can be a commit ID, branch name, tag, or reference such as HEAD. If no specifier is provided, the folder content will be returned as it exists in the HEAD commit.</p>
    */
  var commitSpecifier: js.UndefOr[String] = js.native
  /**
    * <p>The fully-qualified path to the folder whose contents will be returned, including the folder name. For example, /examples is a fully-qualified path to a folder named examples that was created off of the root directory (/) of a repository. </p>
    */
  var folderPath: String = js.native
  /**
    * <p>The name of the repository.</p>
    */
  var repositoryName: String = js.native
}

object GetFolderInput {
  @scala.inline
  def apply(folderPath: String, repositoryName: String): GetFolderInput = {
    val __obj = js.Dynamic.literal(folderPath = folderPath.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFolderInput]
  }
  @scala.inline
  implicit class GetFolderInputOps[Self <: GetFolderInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFolderPath(value: String): Self = this.set("folderPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepositoryName(value: String): Self = this.set("repositoryName", value.asInstanceOf[js.Any])
    @scala.inline
    def set$abortSignal(value: AbortSignal): Self = this.set("$abortSignal", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$abortSignal: Self = this.set("$abortSignal", js.undefined)
    @scala.inline
    def set$httpOptions(value: NodeHttpOptions): Self = this.set("$httpOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$httpOptions: Self = this.set("$httpOptions", js.undefined)
    @scala.inline
    def set$maxRetries(value: Double): Self = this.set("$maxRetries", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$maxRetries: Self = this.set("$maxRetries", js.undefined)
    @scala.inline
    def setCommitSpecifier(value: String): Self = this.set("commitSpecifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommitSpecifier: Self = this.set("commitSpecifier", js.undefined)
  }
  
}

