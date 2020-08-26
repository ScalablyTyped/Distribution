package typings.awsSdkClientCodecommitNode.typesGetFileOutputMod

import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.EXECUTABLE
import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.NORMAL
import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.SYMLINK
import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFileOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>The blob ID of the object that represents the file content.</p>
    */
  var blobId: String = js.native
  /**
    * <p>The full commit ID of the commit that contains the content returned by GetFile.</p>
    */
  var commitId: String = js.native
  /**
    * <p>The base-64 encoded binary data object that represents the content of the file.</p>
    */
  var fileContent: Uint8Array = js.native
  /**
    * <p>The extrapolated file mode permissions of the blob. Valid values include strings such as EXECUTABLE and not numeric values.</p> <note> <p>The file mode permissions returned by this API are not the standard file mode permission values, such as 100644, but rather extrapolated values. See below for a full list of supported return values.</p> </note>
    */
  var fileMode: EXECUTABLE | NORMAL | SYMLINK | String = js.native
  /**
    * <p>The fully qualified path to the specified file. This returns the name and extension of the file.</p>
    */
  var filePath: String = js.native
  /**
    * <p>The size of the contents of the file, in bytes.</p>
    */
  var fileSize: Double = js.native
}

object GetFileOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    blobId: String,
    commitId: String,
    fileContent: Uint8Array,
    fileMode: EXECUTABLE | NORMAL | SYMLINK | String,
    filePath: String,
    fileSize: Double
  ): GetFileOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], blobId = blobId.asInstanceOf[js.Any], commitId = commitId.asInstanceOf[js.Any], fileContent = fileContent.asInstanceOf[js.Any], fileMode = fileMode.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], fileSize = fileSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFileOutput]
  }
  @scala.inline
  implicit class GetFileOutputOps[Self <: GetFileOutput] (val x: Self) extends AnyVal {
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
    def set$metadata(value: ResponseMetadata): Self = this.set("$metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlobId(value: String): Self = this.set("blobId", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommitId(value: String): Self = this.set("commitId", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileContent(value: Uint8Array): Self = this.set("fileContent", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileMode(value: EXECUTABLE | NORMAL | SYMLINK | String): Self = this.set("fileMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilePath(value: String): Self = this.set("filePath", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileSize(value: Double): Self = this.set("fileSize", value.asInstanceOf[js.Any])
  }
  
}

