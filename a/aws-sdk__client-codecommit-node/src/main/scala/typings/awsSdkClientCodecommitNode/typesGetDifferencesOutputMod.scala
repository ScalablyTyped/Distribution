package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.typesDifferenceMod.UnmarshalledDifference
import typings.awsSdkClientCodecommitNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetDifferencesOutputMod {
  
  trait GetDifferencesOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>An enumeration token that can be used in a request to return the next batch of the results.</p>
      */
    var NextToken: js.UndefOr[String] = js.undefined
    
    /**
      * <p>A differences data type object that contains information about the differences, including whether the difference is added, modified, or deleted (A, D, M).</p>
      */
    var differences: js.UndefOr[js.Array[UnmarshalledDifference]] = js.undefined
  }
  object GetDifferencesOutput {
    
    inline def apply($metadata: ResponseMetadata): GetDifferencesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetDifferencesOutput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetDifferencesOutput] (val x: Self) extends AnyVal {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setDifferences(value: js.Array[UnmarshalledDifference]): Self = StObject.set(x, "differences", value.asInstanceOf[js.Any])
      
      inline def setDifferencesUndefined: Self = StObject.set(x, "differences", js.undefined)
      
      inline def setDifferencesVarargs(value: UnmarshalledDifference*): Self = StObject.set(x, "differences", js.Array(value*))
      
      inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    }
  }
}
