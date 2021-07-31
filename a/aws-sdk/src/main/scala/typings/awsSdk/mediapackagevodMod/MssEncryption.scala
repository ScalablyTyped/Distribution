package typings.awsSdk.mediapackagevodMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MssEncryption extends StObject {
  
  var SpekeKeyProvider: typings.awsSdk.mediapackagevodMod.SpekeKeyProvider
}
object MssEncryption {
  
  @scala.inline
  def apply(SpekeKeyProvider: SpekeKeyProvider): MssEncryption = {
    val __obj = js.Dynamic.literal(SpekeKeyProvider = SpekeKeyProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[MssEncryption]
  }
  
  @scala.inline
  implicit class MssEncryptionMutableBuilder[Self <: MssEncryption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSpekeKeyProvider(value: SpekeKeyProvider): Self = StObject.set(x, "SpekeKeyProvider", value.asInstanceOf[js.Any])
  }
}
