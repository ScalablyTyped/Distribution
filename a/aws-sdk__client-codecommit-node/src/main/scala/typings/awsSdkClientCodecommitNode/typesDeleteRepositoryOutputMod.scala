package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDeleteRepositoryOutputMod {
  
  @js.native
  trait DeleteRepositoryOutput extends OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * <p>The ID of the repository that was deleted.</p>
      */
    var repositoryId: js.UndefOr[String] = js.native
  }
  object DeleteRepositoryOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): DeleteRepositoryOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteRepositoryOutput]
    }
    
    @scala.inline
    implicit class DeleteRepositoryOutputMutableBuilder[Self <: DeleteRepositoryOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepositoryId(value: String): Self = StObject.set(x, "repositoryId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepositoryIdUndefined: Self = StObject.set(x, "repositoryId", js.undefined)
    }
  }
}
