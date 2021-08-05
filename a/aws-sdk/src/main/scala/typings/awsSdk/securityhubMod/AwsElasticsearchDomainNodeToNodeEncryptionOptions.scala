package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsElasticsearchDomainNodeToNodeEncryptionOptions extends StObject {
  
  /**
    * Whether node-to-node encryption is enabled.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
}
object AwsElasticsearchDomainNodeToNodeEncryptionOptions {
  
  inline def apply(): AwsElasticsearchDomainNodeToNodeEncryptionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsElasticsearchDomainNodeToNodeEncryptionOptions]
  }
  
  extension [Self <: AwsElasticsearchDomainNodeToNodeEncryptionOptions](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
  }
}
