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
  
  @scala.inline
  def apply(): AwsElasticsearchDomainNodeToNodeEncryptionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsElasticsearchDomainNodeToNodeEncryptionOptions]
  }
  
  @scala.inline
  implicit class AwsElasticsearchDomainNodeToNodeEncryptionOptionsMutableBuilder[Self <: AwsElasticsearchDomainNodeToNodeEncryptionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
  }
}
