package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.EU
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`ap-northeast-1`
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`ap-south-1`
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`ap-southeast-1`
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`ap-southeast-2`
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`cn-north-1`
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`eu-central-1`
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`eu-west-1`
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`sa-east-1`
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`us-west-1`
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`us-west-2`
import typings.awsSdkClientS3Browser.typesOutputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.distTypesResponseMod.MetadataBearer
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetBucketLocationOutputMod {
  
  trait GetBucketLocationOutput
    extends StObject
       with MetadataBearer
       with _OutputTypesUnion {
    
    /**
      * _BucketLocationConstraint shape
      */
    var LocationConstraint: js.UndefOr[
        EU | `eu-west-1` | `us-west-1` | `us-west-2` | `ap-south-1` | `ap-southeast-1` | `ap-southeast-2` | `ap-northeast-1` | `sa-east-1` | `cn-north-1` | `eu-central-1` | String
      ] = js.undefined
  }
  object GetBucketLocationOutput {
    
    inline def apply($metadata: ResponseMetadata): GetBucketLocationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetBucketLocationOutput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetBucketLocationOutput] (val x: Self) extends AnyVal {
      
      inline def setLocationConstraint(
        value: EU | `eu-west-1` | `us-west-1` | `us-west-2` | `ap-south-1` | `ap-southeast-1` | `ap-southeast-2` | `ap-northeast-1` | `sa-east-1` | `cn-north-1` | `eu-central-1` | String
      ): Self = StObject.set(x, "LocationConstraint", value.asInstanceOf[js.Any])
      
      inline def setLocationConstraintUndefined: Self = StObject.set(x, "LocationConstraint", js.undefined)
    }
  }
}
