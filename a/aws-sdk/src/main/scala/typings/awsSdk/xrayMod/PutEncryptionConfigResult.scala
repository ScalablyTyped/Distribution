package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutEncryptionConfigResult extends StObject {
  
  /**
    * The new encryption configuration.
    */
  var EncryptionConfig: js.UndefOr[typings.awsSdk.xrayMod.EncryptionConfig] = js.undefined
}
object PutEncryptionConfigResult {
  
  @scala.inline
  def apply(): PutEncryptionConfigResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutEncryptionConfigResult]
  }
  
  @scala.inline
  implicit class PutEncryptionConfigResultMutableBuilder[Self <: PutEncryptionConfigResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncryptionConfig(value: EncryptionConfig): Self = StObject.set(x, "EncryptionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionConfigUndefined: Self = StObject.set(x, "EncryptionConfig", js.undefined)
  }
}
