package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.EXECUTABLE
import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.NORMAL
import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.SYMLINK
import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/types/GetFileOutput", JSImport.Namespace)
@js.native
object typesGetFileOutputMod extends js.Object {
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
  
}

