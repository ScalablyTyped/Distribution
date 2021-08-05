package typings.awsSdk.mediapackageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CmafEncryption extends StObject {
  
  /**
    * Time (in seconds) between each encryption key rotation.
    */
  var KeyRotationIntervalSeconds: js.UndefOr[integer] = js.undefined
  
  var SpekeKeyProvider: typings.awsSdk.mediapackageMod.SpekeKeyProvider
}
object CmafEncryption {
  
  inline def apply(SpekeKeyProvider: SpekeKeyProvider): CmafEncryption = {
    val __obj = js.Dynamic.literal(SpekeKeyProvider = SpekeKeyProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[CmafEncryption]
  }
  
  extension [Self <: CmafEncryption](x: Self) {
    
    inline def setKeyRotationIntervalSeconds(value: integer): Self = StObject.set(x, "KeyRotationIntervalSeconds", value.asInstanceOf[js.Any])
    
    inline def setKeyRotationIntervalSecondsUndefined: Self = StObject.set(x, "KeyRotationIntervalSeconds", js.undefined)
    
    inline def setSpekeKeyProvider(value: SpekeKeyProvider): Self = StObject.set(x, "SpekeKeyProvider", value.asInstanceOf[js.Any])
  }
}
