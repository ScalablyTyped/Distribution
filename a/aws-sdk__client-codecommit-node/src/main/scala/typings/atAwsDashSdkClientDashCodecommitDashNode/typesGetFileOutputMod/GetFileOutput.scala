package typings.atAwsDashSdkClientDashCodecommitDashNode.typesGetFileOutputMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.EXECUTABLE
import typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.NORMAL
import typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.SYMLINK
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFileOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>The blob ID of the object that represents the file content.</p>
    */
  var blobId: String
  /**
    * <p>The full commit ID of the commit that contains the content returned by GetFile.</p>
    */
  var commitId: String
  /**
    * <p>The base-64 encoded binary data object that represents the content of the file.</p>
    */
  var fileContent: Uint8Array
  /**
    * <p>The extrapolated file mode permissions of the blob. Valid values include strings such as EXECUTABLE and not numeric values.</p> <note> <p>The file mode permissions returned by this API are not the standard file mode permission values, such as 100644, but rather extrapolated values. See below for a full list of supported return values.</p> </note>
    */
  var fileMode: EXECUTABLE | NORMAL | SYMLINK | String
  /**
    * <p>The fully qualified path to the specified file. This returns the name and extension of the file.</p>
    */
  var filePath: String
  /**
    * <p>The size of the contents of the file, in bytes.</p>
    */
  var fileSize: Double
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
}

