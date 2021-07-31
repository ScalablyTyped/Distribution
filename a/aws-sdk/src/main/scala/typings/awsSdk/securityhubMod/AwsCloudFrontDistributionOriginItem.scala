package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsCloudFrontDistributionOriginItem extends StObject {
  
  /**
    * Amazon S3 origins: The DNS name of the Amazon S3 bucket from which you want CloudFront to get objects for this origin.
    */
  var DomainName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * A unique identifier for the origin or origin group.
    */
  var Id: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * An optional element that causes CloudFront to request your content from a directory in your Amazon S3 bucket or your custom origin.
    */
  var OriginPath: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * An origin that is an S3 bucket that is not configured with static website hosting.
    */
  var S3OriginConfig: js.UndefOr[AwsCloudFrontDistributionOriginS3OriginConfig] = js.undefined
}
object AwsCloudFrontDistributionOriginItem {
  
  @scala.inline
  def apply(): AwsCloudFrontDistributionOriginItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCloudFrontDistributionOriginItem]
  }
  
  @scala.inline
  implicit class AwsCloudFrontDistributionOriginItemMutableBuilder[Self <: AwsCloudFrontDistributionOriginItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainName(value: NonEmptyString): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainNameUndefined: Self = StObject.set(x, "DomainName", js.undefined)
    
    @scala.inline
    def setId(value: NonEmptyString): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setOriginPath(value: NonEmptyString): Self = StObject.set(x, "OriginPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginPathUndefined: Self = StObject.set(x, "OriginPath", js.undefined)
    
    @scala.inline
    def setS3OriginConfig(value: AwsCloudFrontDistributionOriginS3OriginConfig): Self = StObject.set(x, "S3OriginConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3OriginConfigUndefined: Self = StObject.set(x, "S3OriginConfig", js.undefined)
  }
}
