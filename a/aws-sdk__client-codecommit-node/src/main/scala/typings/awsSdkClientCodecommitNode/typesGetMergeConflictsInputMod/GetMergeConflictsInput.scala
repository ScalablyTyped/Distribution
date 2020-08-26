package typings.awsSdkClientCodecommitNode.typesGetMergeConflictsInputMod

import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.FAST_FORWARD_MERGE
import typings.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkTypes.abortMod.AbortSignal
import typings.awsSdkTypes.httpMod.NodeHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMergeConflictsInput extends InputTypesUnion {
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
    * <p>The branch, tag, HEAD, or other fully qualified reference used to identify a commit. For example, a branch name or a full commit ID.</p>
    */
  var destinationCommitSpecifier: String = js.native
  /**
    * <p>The merge option or strategy you want to use to merge the code. The only valid value is FAST_FORWARD_MERGE.</p>
    */
  var mergeOption: FAST_FORWARD_MERGE | String = js.native
  /**
    * <p>The name of the repository where the pull request was created.</p>
    */
  var repositoryName: String = js.native
  /**
    * <p>The branch, tag, HEAD, or other fully qualified reference used to identify a commit. For example, a branch name or a full commit ID.</p>
    */
  var sourceCommitSpecifier: String = js.native
}

object GetMergeConflictsInput {
  @scala.inline
  def apply(
    destinationCommitSpecifier: String,
    mergeOption: FAST_FORWARD_MERGE | String,
    repositoryName: String,
    sourceCommitSpecifier: String
  ): GetMergeConflictsInput = {
    val __obj = js.Dynamic.literal(destinationCommitSpecifier = destinationCommitSpecifier.asInstanceOf[js.Any], mergeOption = mergeOption.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any], sourceCommitSpecifier = sourceCommitSpecifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMergeConflictsInput]
  }
  @scala.inline
  implicit class GetMergeConflictsInputOps[Self <: GetMergeConflictsInput] (val x: Self) extends AnyVal {
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
    def setDestinationCommitSpecifier(value: String): Self = this.set("destinationCommitSpecifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setMergeOption(value: FAST_FORWARD_MERGE | String): Self = this.set("mergeOption", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepositoryName(value: String): Self = this.set("repositoryName", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceCommitSpecifier(value: String): Self = this.set("sourceCommitSpecifier", value.asInstanceOf[js.Any])
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
  }
  
}

