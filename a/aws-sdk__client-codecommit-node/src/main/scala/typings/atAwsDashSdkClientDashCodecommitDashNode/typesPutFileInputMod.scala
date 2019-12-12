package typings.atAwsDashSdkClientDashCodecommitDashNode

import typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.EXECUTABLE
import typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.NORMAL
import typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.SYMLINK
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkTypes.buildAbortMod.AbortSignal
import typings.atAwsDashSdkTypes.buildHttpMod.NodeHttpOptions
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/types/PutFileInput", JSImport.Namespace)
@js.native
object typesPutFileInputMod extends js.Object {
  @js.native
  trait PutFileInput extends InputTypesUnion {
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
      * <p>The name of the branch where you want to add or update the file. If this is an empty repository, this branch will be created.</p>
      */
    var branchName: String = js.native
    /**
      * <p>A message about why this file was added or updated. While optional, adding a message is strongly encouraged in order to provide a more useful commit history for your repository.</p>
      */
    var commitMessage: js.UndefOr[String] = js.native
    /**
      * <p>An email address for the person adding or updating the file.</p>
      */
    var email: js.UndefOr[String] = js.native
    /**
      * <p>The content of the file, in binary object format. </p>
      */
    var fileContent: ArrayBuffer | ArrayBufferView | String = js.native
    /**
      * <p>The file mode permissions of the blob. Valid file mode permissions are listed below.</p>
      */
    var fileMode: js.UndefOr[EXECUTABLE | NORMAL | SYMLINK | String] = js.native
    /**
      * <p>The name of the file you want to add or update, including the relative path to the file in the repository.</p> <note> <p>If the path does not currently exist in the repository, the path will be created as part of adding the file.</p> </note>
      */
    var filePath: String = js.native
    /**
      * <p>The name of the person adding or updating the file. While optional, adding a name is strongly encouraged in order to provide a more useful commit history for your repository.</p>
      */
    var name: js.UndefOr[String] = js.native
    /**
      * <p>The full commit ID of the head commit in the branch where you want to add or update the file. If this is an empty repository, no commit ID is required. If this is not an empty repository, a commit ID is required. </p> <p>The commit ID must match the ID of the head commit at the time of the operation, or an error will occur, and the file will not be added or updated.</p>
      */
    var parentCommitId: js.UndefOr[String] = js.native
    /**
      * <p>The name of the repository where you want to add or update the file.</p>
      */
    var repositoryName: String = js.native
  }
  
}

