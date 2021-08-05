package typings.awsSdkClientKmsNode

import typings.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKmsNode.typesAliasListEntryMod.UnmarshalledAliasListEntry
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesListAliasesOutputMod {
  
  trait ListAliasesOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>A list of aliases.</p>
      */
    var Aliases: js.UndefOr[js.Array[UnmarshalledAliasListEntry]] = js.undefined
    
    /**
      * <p>When <code>Truncated</code> is true, this element is present and contains the value to use for the <code>Marker</code> parameter in a subsequent request.</p>
      */
    var NextMarker: js.UndefOr[String] = js.undefined
    
    /**
      * <p>A flag that indicates whether there are more items in the list. When this value is true, the list in this response is truncated. To get more items, pass the value of the <code>NextMarker</code> element in this response to the <code>Marker</code> parameter in a subsequent request.</p>
      */
    var Truncated: js.UndefOr[Boolean] = js.undefined
  }
  object ListAliasesOutput {
    
    inline def apply($metadata: ResponseMetadata): ListAliasesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListAliasesOutput]
    }
    
    extension [Self <: ListAliasesOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setAliases(value: js.Array[UnmarshalledAliasListEntry]): Self = StObject.set(x, "Aliases", value.asInstanceOf[js.Any])
      
      inline def setAliasesUndefined: Self = StObject.set(x, "Aliases", js.undefined)
      
      inline def setAliasesVarargs(value: UnmarshalledAliasListEntry*): Self = StObject.set(x, "Aliases", js.Array(value :_*))
      
      inline def setNextMarker(value: String): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
      
      inline def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
      
      inline def setTruncated(value: Boolean): Self = StObject.set(x, "Truncated", value.asInstanceOf[js.Any])
      
      inline def setTruncatedUndefined: Self = StObject.set(x, "Truncated", js.undefined)
    }
  }
}
