package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetMergeConflictsOutputMod {
  
  trait GetMergeConflictsOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>The commit ID of the destination commit specifier that was used in the merge evaluation.</p>
      */
    var destinationCommitId: String
    
    /**
      * <p>A Boolean value that indicates whether the code is mergable by the specified merge option.</p>
      */
    var mergeable: Boolean
    
    /**
      * <p>The commit ID of the source commit specifier that was used in the merge evaluation.</p>
      */
    var sourceCommitId: String
  }
  object GetMergeConflictsOutput {
    
    @scala.inline
    def apply(
      $metadata: ResponseMetadata,
      destinationCommitId: String,
      mergeable: Boolean,
      sourceCommitId: String
    ): GetMergeConflictsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], destinationCommitId = destinationCommitId.asInstanceOf[js.Any], mergeable = mergeable.asInstanceOf[js.Any], sourceCommitId = sourceCommitId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetMergeConflictsOutput]
    }
    
    @scala.inline
    implicit class GetMergeConflictsOutputMutableBuilder[Self <: GetMergeConflictsOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinationCommitId(value: String): Self = StObject.set(x, "destinationCommitId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMergeable(value: Boolean): Self = StObject.set(x, "mergeable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceCommitId(value: String): Self = StObject.set(x, "sourceCommitId", value.asInstanceOf[js.Any])
    }
  }
}
