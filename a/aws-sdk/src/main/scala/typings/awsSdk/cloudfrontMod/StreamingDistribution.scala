package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamingDistribution extends StObject {
  
  /**
    * The ARN (Amazon Resource Name) for the distribution. For example: arn:aws:cloudfront::123456789012:distribution/EDFDVBD632BHDS5, where 123456789012 is your AWS account ID.
    */
  var ARN: String
  
  /**
    * A complex type that lists the AWS accounts, if any, that you included in the TrustedSigners complex type for this distribution. These are the accounts that you want to allow to create signed URLs for private content. The Signer complex type lists the AWS account number of the trusted signer or self if the signer is the AWS account that created the distribution. The Signer element also includes the IDs of any active CloudFront key pairs that are associated with the trusted signer's AWS account. If no KeyPairId element appears for a Signer, that signer can't create signed URLs. For more information, see Serving Private Content through CloudFront in the Amazon CloudFront Developer Guide. 
    */
  var ActiveTrustedSigners: typings.awsSdk.cloudfrontMod.ActiveTrustedSigners
  
  /**
    * The domain name that corresponds to the streaming distribution, for example, s5c39gqb8ow64r.cloudfront.net. 
    */
  var DomainName: String
  
  /**
    * The identifier for the RTMP distribution. For example: EGTXBD79EXAMPLE.
    */
  var Id: String
  
  /**
    * The date and time that the distribution was last modified. 
    */
  var LastModifiedTime: js.UndefOr[timestamp] = js.undefined
  
  /**
    * The current status of the RTMP distribution. When the status is Deployed, the distribution's information is propagated to all CloudFront edge locations.
    */
  var Status: String
  
  /**
    * The current configuration information for the RTMP distribution.
    */
  var StreamingDistributionConfig: typings.awsSdk.cloudfrontMod.StreamingDistributionConfig
}
object StreamingDistribution {
  
  @scala.inline
  def apply(
    ARN: String,
    ActiveTrustedSigners: ActiveTrustedSigners,
    DomainName: String,
    Id: String,
    Status: String,
    StreamingDistributionConfig: StreamingDistributionConfig
  ): StreamingDistribution = {
    val __obj = js.Dynamic.literal(ARN = ARN.asInstanceOf[js.Any], ActiveTrustedSigners = ActiveTrustedSigners.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], StreamingDistributionConfig = StreamingDistributionConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamingDistribution]
  }
  
  @scala.inline
  implicit class StreamingDistributionMutableBuilder[Self <: StreamingDistribution] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setARN(value: String): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveTrustedSigners(value: ActiveTrustedSigners): Self = StObject.set(x, "ActiveTrustedSigners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainName(value: String): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTime(value: timestamp): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamingDistributionConfig(value: StreamingDistributionConfig): Self = StObject.set(x, "StreamingDistributionConfig", value.asInstanceOf[js.Any])
  }
}
