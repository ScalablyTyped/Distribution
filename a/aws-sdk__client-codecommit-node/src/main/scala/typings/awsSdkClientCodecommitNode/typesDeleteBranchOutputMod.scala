package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesBranchInfoMod.UnmarshalledBranchInfo
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDeleteBranchOutputMod {
  
  trait DeleteBranchOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>Information about the branch deleted by the operation, including the branch name and the commit ID that was the tip of the branch.</p>
      */
    var deletedBranch: js.UndefOr[UnmarshalledBranchInfo] = js.undefined
  }
  object DeleteBranchOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): DeleteBranchOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteBranchOutput]
    }
    
    @scala.inline
    implicit class DeleteBranchOutputMutableBuilder[Self <: DeleteBranchOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeletedBranch(value: UnmarshalledBranchInfo): Self = StObject.set(x, "deletedBranch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeletedBranchUndefined: Self = StObject.set(x, "deletedBranch", js.undefined)
    }
  }
}
