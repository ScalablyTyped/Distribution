package typings.awsSdkClientKmsBrowser

import typings.awsSdkClientKmsBrowser.typesKeyMetadataMod.UnmarshalledKeyMetadata
import typings.awsSdkClientKmsBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDescribeKeyOutputMod {
  
  trait DescribeKeyOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>Metadata associated with the key.</p>
      */
    var KeyMetadata: js.UndefOr[UnmarshalledKeyMetadata] = js.undefined
  }
  object DescribeKeyOutput {
    
    inline def apply($metadata: ResponseMetadata): DescribeKeyOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[DescribeKeyOutput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DescribeKeyOutput] (val x: Self) extends AnyVal {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setKeyMetadata(value: UnmarshalledKeyMetadata): Self = StObject.set(x, "KeyMetadata", value.asInstanceOf[js.Any])
      
      inline def setKeyMetadataUndefined: Self = StObject.set(x, "KeyMetadata", js.undefined)
    }
  }
}
