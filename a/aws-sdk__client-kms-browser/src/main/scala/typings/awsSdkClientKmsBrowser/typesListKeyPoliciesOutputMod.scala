package typings.awsSdkClientKmsBrowser

import typings.awsSdkClientKmsBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesListKeyPoliciesOutputMod {
  
  trait ListKeyPoliciesOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>When <code>Truncated</code> is true, this element is present and contains the value to use for the <code>Marker</code> parameter in a subsequent request.</p>
      */
    var NextMarker: js.UndefOr[String] = js.undefined
    
    /**
      * <p>A list of key policy names. Currently, there is only one key policy per CMK and it is always named <code>default</code>.</p>
      */
    var PolicyNames: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * <p>A flag that indicates whether there are more items in the list. When this value is true, the list in this response is truncated. To get more items, pass the value of the <code>NextMarker</code> element in this response to the <code>Marker</code> parameter in a subsequent request.</p>
      */
    var Truncated: js.UndefOr[Boolean] = js.undefined
  }
  object ListKeyPoliciesOutput {
    
    inline def apply($metadata: ResponseMetadata): ListKeyPoliciesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListKeyPoliciesOutput]
    }
    
    extension [Self <: ListKeyPoliciesOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setNextMarker(value: String): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
      
      inline def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
      
      inline def setPolicyNames(value: js.Array[String]): Self = StObject.set(x, "PolicyNames", value.asInstanceOf[js.Any])
      
      inline def setPolicyNamesUndefined: Self = StObject.set(x, "PolicyNames", js.undefined)
      
      inline def setPolicyNamesVarargs(value: String*): Self = StObject.set(x, "PolicyNames", js.Array(value*))
      
      inline def setTruncated(value: Boolean): Self = StObject.set(x, "Truncated", value.asInstanceOf[js.Any])
      
      inline def setTruncatedUndefined: Self = StObject.set(x, "Truncated", js.undefined)
    }
  }
}
