package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsS3BucketServerSideEncryptionConfiguration extends StObject {
  
  /**
    * The encryption rules that are applied to the S3 bucket.
    */
  var Rules: js.UndefOr[AwsS3BucketServerSideEncryptionRules] = js.undefined
}
object AwsS3BucketServerSideEncryptionConfiguration {
  
  @scala.inline
  def apply(): AwsS3BucketServerSideEncryptionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsS3BucketServerSideEncryptionConfiguration]
  }
  
  @scala.inline
  implicit class AwsS3BucketServerSideEncryptionConfigurationMutableBuilder[Self <: AwsS3BucketServerSideEncryptionConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRules(value: AwsS3BucketServerSideEncryptionRules): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesUndefined: Self = StObject.set(x, "Rules", js.undefined)
    
    @scala.inline
    def setRulesVarargs(value: AwsS3BucketServerSideEncryptionRule*): Self = StObject.set(x, "Rules", js.Array(value :_*))
  }
}
