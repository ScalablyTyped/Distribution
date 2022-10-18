package typings.awsSdkClientGlacierNode

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientGlacierNode.typesOutputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesListTagsForVaultOutputMod {
  
  trait ListTagsForVaultOutput
    extends StObject
       with _OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>The tags attached to the vault. Each tag is composed of a key and a value.</p>
      */
    var Tags: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object ListTagsForVaultOutput {
    
    inline def apply($metadata: ResponseMetadata): ListTagsForVaultOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListTagsForVaultOutput]
    }
    
    extension [Self <: ListTagsForVaultOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    }
  }
}
