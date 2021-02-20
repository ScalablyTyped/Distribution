package typings.awsSdkClientKmsBrowser

import typings.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKmsBrowser.typesKeyMetadataMod.UnmarshalledKeyMetadata
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDescribeKeyOutputMod {
  
  @js.native
  trait DescribeKeyOutput extends OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * <p>Metadata associated with the key.</p>
      */
    var KeyMetadata: js.UndefOr[UnmarshalledKeyMetadata] = js.native
  }
  object DescribeKeyOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): DescribeKeyOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[DescribeKeyOutput]
    }
    
    @scala.inline
    implicit class DescribeKeyOutputMutableBuilder[Self <: DescribeKeyOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyMetadata(value: UnmarshalledKeyMetadata): Self = StObject.set(x, "KeyMetadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyMetadataUndefined: Self = StObject.set(x, "KeyMetadata", js.undefined)
    }
  }
}
