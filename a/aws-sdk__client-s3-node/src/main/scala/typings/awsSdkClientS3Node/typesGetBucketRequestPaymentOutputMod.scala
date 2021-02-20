package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.BucketOwner
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Requester
import typings.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetBucketRequestPaymentOutputMod {
  
  @js.native
  trait GetBucketRequestPaymentOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    
    /**
      * <p>Specifies who pays for the download and request fees.</p>
      */
    var Payer: js.UndefOr[Requester | BucketOwner | String] = js.native
  }
  object GetBucketRequestPaymentOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): GetBucketRequestPaymentOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetBucketRequestPaymentOutput]
    }
    
    @scala.inline
    implicit class GetBucketRequestPaymentOutputMutableBuilder[Self <: GetBucketRequestPaymentOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPayer(value: Requester | BucketOwner | String): Self = StObject.set(x, "Payer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayerUndefined: Self = StObject.set(x, "Payer", js.undefined)
    }
  }
}
