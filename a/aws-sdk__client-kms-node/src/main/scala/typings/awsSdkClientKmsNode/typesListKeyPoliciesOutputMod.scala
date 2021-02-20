package typings.awsSdkClientKmsNode

import typings.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesListKeyPoliciesOutputMod {
  
  @js.native
  trait ListKeyPoliciesOutput extends OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * <p>When <code>Truncated</code> is true, this element is present and contains the value to use for the <code>Marker</code> parameter in a subsequent request.</p>
      */
    var NextMarker: js.UndefOr[String] = js.native
    
    /**
      * <p>A list of key policy names. Currently, there is only one key policy per CMK and it is always named <code>default</code>.</p>
      */
    var PolicyNames: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * <p>A flag that indicates whether there are more items in the list. When this value is true, the list in this response is truncated. To get more items, pass the value of the <code>NextMarker</code> element in this response to the <code>Marker</code> parameter in a subsequent request.</p>
      */
    var Truncated: js.UndefOr[Boolean] = js.native
  }
  object ListKeyPoliciesOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): ListKeyPoliciesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListKeyPoliciesOutput]
    }
    
    @scala.inline
    implicit class ListKeyPoliciesOutputMutableBuilder[Self <: ListKeyPoliciesOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextMarker(value: String): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
      
      @scala.inline
      def setPolicyNames(value: js.Array[String]): Self = StObject.set(x, "PolicyNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyNamesUndefined: Self = StObject.set(x, "PolicyNames", js.undefined)
      
      @scala.inline
      def setPolicyNamesVarargs(value: String*): Self = StObject.set(x, "PolicyNames", js.Array(value :_*))
      
      @scala.inline
      def setTruncated(value: Boolean): Self = StObject.set(x, "Truncated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTruncatedUndefined: Self = StObject.set(x, "Truncated", js.undefined)
    }
  }
}
