package typings.atAwsDashSdkClientDashCodecommitDashNode

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscoreFileMod._UnmarshalledFile
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscoreFolderMod._UnmarshalledFolder
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscoreSubModuleMod._UnmarshalledSubModule
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscoreSymbolicLinkMod._UnmarshalledSymbolicLink
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/types/GetFolderOutput", JSImport.Namespace)
@js.native
object typesGetFolderOutputMod extends js.Object {
  @js.native
  trait GetFolderOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>The full commit ID used as a reference for which version of the folder content is returned.</p>
      */
    var commitId: String = js.native
    /**
      * <p>The list of files that exist in the specified folder, if any.</p>
      */
    var files: js.UndefOr[js.Array[_UnmarshalledFile]] = js.native
    /**
      * <p>The fully-qualified path of the folder whose contents are returned.</p>
      */
    var folderPath: String = js.native
    /**
      * <p>The list of folders that exist beneath the specified folder, if any.</p>
      */
    var subFolders: js.UndefOr[js.Array[_UnmarshalledFolder]] = js.native
    /**
      * <p>The list of submodules that exist in the specified folder, if any.</p>
      */
    var subModules: js.UndefOr[js.Array[_UnmarshalledSubModule]] = js.native
    /**
      * <p>The list of symbolic links to other files and folders that exist in the specified folder, if any.</p>
      */
    var symbolicLinks: js.UndefOr[js.Array[_UnmarshalledSymbolicLink]] = js.native
    /**
      * <p>The full SHA-1 pointer of the tree information for the commit that contains the folder.</p>
      */
    var treeId: js.UndefOr[String] = js.native
  }
  
}

