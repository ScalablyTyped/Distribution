package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsCloudFrontDistributionLogging extends StObject {
  
  /**
    * The Amazon S3 bucket to store the access logs in.
    */
  var Bucket: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * With this field, you can enable or disable the selected distribution.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether you want CloudFront to include cookies in access logs.
    */
  var IncludeCookies: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An optional string that you want CloudFront to use as a prefix to the access log filenames for this distribution.
    */
  var Prefix: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsCloudFrontDistributionLogging {
  
  @scala.inline
  def apply(): AwsCloudFrontDistributionLogging = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCloudFrontDistributionLogging]
  }
  
  @scala.inline
  implicit class AwsCloudFrontDistributionLoggingMutableBuilder[Self <: AwsCloudFrontDistributionLogging] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucket(value: NonEmptyString): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketUndefined: Self = StObject.set(x, "Bucket", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    @scala.inline
    def setIncludeCookies(value: Boolean): Self = StObject.set(x, "IncludeCookies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeCookiesUndefined: Self = StObject.set(x, "IncludeCookies", js.undefined)
    
    @scala.inline
    def setPrefix(value: NonEmptyString): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
  }
}
