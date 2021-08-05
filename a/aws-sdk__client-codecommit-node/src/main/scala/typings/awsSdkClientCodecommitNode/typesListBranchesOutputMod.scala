package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesListBranchesOutputMod {
  
  trait ListBranchesOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>The list of branch names.</p>
      */
    var branches: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * <p>An enumeration token that returns the batch of the results.</p>
      */
    var nextToken: js.UndefOr[String] = js.undefined
  }
  object ListBranchesOutput {
    
    inline def apply($metadata: ResponseMetadata): ListBranchesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListBranchesOutput]
    }
    
    extension [Self <: ListBranchesOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setBranches(value: js.Array[String]): Self = StObject.set(x, "branches", value.asInstanceOf[js.Any])
      
      inline def setBranchesUndefined: Self = StObject.set(x, "branches", js.undefined)
      
      inline def setBranchesVarargs(value: String*): Self = StObject.set(x, "branches", js.Array(value :_*))
      
      inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
      
      inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    }
  }
}
