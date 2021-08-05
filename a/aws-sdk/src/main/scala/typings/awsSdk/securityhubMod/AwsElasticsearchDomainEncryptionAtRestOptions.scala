package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsElasticsearchDomainEncryptionAtRestOptions extends StObject {
  
  /**
    * Whether encryption at rest is enabled.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The KMS key ID. Takes the form 1a2a3a4-1a2a-3a4a-5a6a-1a2a3a4a5a6a.
    */
  var KmsKeyId: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsElasticsearchDomainEncryptionAtRestOptions {
  
  inline def apply(): AwsElasticsearchDomainEncryptionAtRestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsElasticsearchDomainEncryptionAtRestOptions]
  }
  
  extension [Self <: AwsElasticsearchDomainEncryptionAtRestOptions](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    inline def setKmsKeyId(value: NonEmptyString): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
  }
}
