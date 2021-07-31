package typings.awsSdk.mediapackageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DashEncryption extends StObject {
  
  /**
    * Time (in seconds) between each encryption key rotation.
    */
  var KeyRotationIntervalSeconds: js.UndefOr[integer] = js.undefined
  
  var SpekeKeyProvider: typings.awsSdk.mediapackageMod.SpekeKeyProvider
}
object DashEncryption {
  
  @scala.inline
  def apply(SpekeKeyProvider: SpekeKeyProvider): DashEncryption = {
    val __obj = js.Dynamic.literal(SpekeKeyProvider = SpekeKeyProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashEncryption]
  }
  
  @scala.inline
  implicit class DashEncryptionMutableBuilder[Self <: DashEncryption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyRotationIntervalSeconds(value: integer): Self = StObject.set(x, "KeyRotationIntervalSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyRotationIntervalSecondsUndefined: Self = StObject.set(x, "KeyRotationIntervalSeconds", js.undefined)
    
    @scala.inline
    def setSpekeKeyProvider(value: SpekeKeyProvider): Self = StObject.set(x, "SpekeKeyProvider", value.asInstanceOf[js.Any])
  }
}
