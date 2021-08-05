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
  
  inline def apply(): AwsS3BucketServerSideEncryptionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsS3BucketServerSideEncryptionConfiguration]
  }
  
  extension [Self <: AwsS3BucketServerSideEncryptionConfiguration](x: Self) {
    
    inline def setRules(value: AwsS3BucketServerSideEncryptionRules): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "Rules", js.undefined)
    
    inline def setRulesVarargs(value: AwsS3BucketServerSideEncryptionRule*): Self = StObject.set(x, "Rules", js.Array(value :_*))
  }
}
