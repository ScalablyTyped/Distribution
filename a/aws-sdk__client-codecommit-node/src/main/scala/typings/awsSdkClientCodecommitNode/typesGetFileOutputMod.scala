package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.EXECUTABLE
import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.NORMAL
import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.SYMLINK
import typings.awsSdkClientCodecommitNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetFileOutputMod {
  
  trait GetFileOutput
    extends StObject
       with OutputTypesUnion {
    
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
    var fileContent: js.typedarray.Uint8Array
    
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
    
    inline def apply(
      $metadata: ResponseMetadata,
      blobId: String,
      commitId: String,
      fileContent: js.typedarray.Uint8Array,
      fileMode: EXECUTABLE | NORMAL | SYMLINK | String,
      filePath: String,
      fileSize: Double
    ): GetFileOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], blobId = blobId.asInstanceOf[js.Any], commitId = commitId.asInstanceOf[js.Any], fileContent = fileContent.asInstanceOf[js.Any], fileMode = fileMode.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], fileSize = fileSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetFileOutput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetFileOutput] (val x: Self) extends AnyVal {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setBlobId(value: String): Self = StObject.set(x, "blobId", value.asInstanceOf[js.Any])
      
      inline def setCommitId(value: String): Self = StObject.set(x, "commitId", value.asInstanceOf[js.Any])
      
      inline def setFileContent(value: js.typedarray.Uint8Array): Self = StObject.set(x, "fileContent", value.asInstanceOf[js.Any])
      
      inline def setFileMode(value: EXECUTABLE | NORMAL | SYMLINK | String): Self = StObject.set(x, "fileMode", value.asInstanceOf[js.Any])
      
      inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
      
      inline def setFileSize(value: Double): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
    }
  }
}
