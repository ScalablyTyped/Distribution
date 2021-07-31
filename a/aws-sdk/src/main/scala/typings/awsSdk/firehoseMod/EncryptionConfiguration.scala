package typings.awsSdk.firehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncryptionConfiguration extends StObject {
  
  /**
    * The encryption key.
    */
  var KMSEncryptionConfig: js.UndefOr[typings.awsSdk.firehoseMod.KMSEncryptionConfig] = js.undefined
  
  /**
    * Specifically override existing encryption information to ensure that no encryption is used.
    */
  var NoEncryptionConfig: js.UndefOr[typings.awsSdk.firehoseMod.NoEncryptionConfig] = js.undefined
}
object EncryptionConfiguration {
  
  @scala.inline
  def apply(): EncryptionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncryptionConfiguration]
  }
  
  @scala.inline
  implicit class EncryptionConfigurationMutableBuilder[Self <: EncryptionConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKMSEncryptionConfig(value: KMSEncryptionConfig): Self = StObject.set(x, "KMSEncryptionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKMSEncryptionConfigUndefined: Self = StObject.set(x, "KMSEncryptionConfig", js.undefined)
    
    @scala.inline
    def setNoEncryptionConfig(value: NoEncryptionConfig): Self = StObject.set(x, "NoEncryptionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoEncryptionConfigUndefined: Self = StObject.set(x, "NoEncryptionConfig", js.undefined)
  }
}
