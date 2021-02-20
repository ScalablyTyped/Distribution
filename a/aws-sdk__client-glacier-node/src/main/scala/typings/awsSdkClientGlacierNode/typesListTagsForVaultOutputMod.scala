package typings.awsSdkClientGlacierNode

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientGlacierNode.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesListTagsForVaultOutputMod {
  
  @js.native
  trait ListTagsForVaultOutput extends _OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * <p>The tags attached to the vault. Each tag is composed of a key and a value.</p>
      */
    var Tags: js.UndefOr[StringDictionary[String]] = js.native
  }
  object ListTagsForVaultOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): ListTagsForVaultOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListTagsForVaultOutput]
    }
    
    @scala.inline
    implicit class ListTagsForVaultOutputMutableBuilder[Self <: ListTagsForVaultOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    }
  }
}
