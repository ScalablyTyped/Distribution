package typings.awsSdk.mediapackagevodMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAssetResponse extends StObject {
  
  /**
    * The ARN of the Asset.
    */
  var Arn: js.UndefOr[string] = js.undefined
  
  /**
    * The time the Asset was initially submitted for Ingest.
    */
  var CreatedAt: js.UndefOr[string] = js.undefined
  
  /**
    * The list of egress endpoints available for the Asset.
    */
  var EgressEndpoints: js.UndefOr[listOfEgressEndpoint] = js.undefined
  
  /**
    * The unique identifier for the Asset.
    */
  var Id: js.UndefOr[string] = js.undefined
  
  /**
    * The ID of the PackagingGroup for the Asset.
    */
  var PackagingGroupId: js.UndefOr[string] = js.undefined
  
  /**
    * The resource ID to include in SPEKE key requests.
    */
  var ResourceId: js.UndefOr[string] = js.undefined
  
  /**
    * ARN of the source object in S3.
    */
  var SourceArn: js.UndefOr[string] = js.undefined
  
  /**
    * The IAM role_arn used to access the source S3 bucket.
    */
  var SourceRoleArn: js.UndefOr[string] = js.undefined
  
  var Tags: js.UndefOr[typings.awsSdk.mediapackagevodMod.Tags] = js.undefined
}
object DescribeAssetResponse {
  
  inline def apply(): DescribeAssetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAssetResponse]
  }
  
  extension [Self <: DescribeAssetResponse](x: Self) {
    
    inline def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCreatedAt(value: string): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setEgressEndpoints(value: listOfEgressEndpoint): Self = StObject.set(x, "EgressEndpoints", value.asInstanceOf[js.Any])
    
    inline def setEgressEndpointsUndefined: Self = StObject.set(x, "EgressEndpoints", js.undefined)
    
    inline def setEgressEndpointsVarargs(value: EgressEndpoint*): Self = StObject.set(x, "EgressEndpoints", js.Array(value*))
    
    inline def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setPackagingGroupId(value: string): Self = StObject.set(x, "PackagingGroupId", value.asInstanceOf[js.Any])
    
    inline def setPackagingGroupIdUndefined: Self = StObject.set(x, "PackagingGroupId", js.undefined)
    
    inline def setResourceId(value: string): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    inline def setSourceArn(value: string): Self = StObject.set(x, "SourceArn", value.asInstanceOf[js.Any])
    
    inline def setSourceArnUndefined: Self = StObject.set(x, "SourceArn", js.undefined)
    
    inline def setSourceRoleArn(value: string): Self = StObject.set(x, "SourceRoleArn", value.asInstanceOf[js.Any])
    
    inline def setSourceRoleArnUndefined: Self = StObject.set(x, "SourceRoleArn", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
