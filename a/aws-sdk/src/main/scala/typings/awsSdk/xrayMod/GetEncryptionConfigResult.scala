package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetEncryptionConfigResult extends StObject {
  
  /**
    * The encryption configuration document.
    */
  var EncryptionConfig: js.UndefOr[typings.awsSdk.xrayMod.EncryptionConfig] = js.native
}
object GetEncryptionConfigResult {
  
  @scala.inline
  def apply(): GetEncryptionConfigResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEncryptionConfigResult]
  }
  
  @scala.inline
  implicit class GetEncryptionConfigResultMutableBuilder[Self <: GetEncryptionConfigResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncryptionConfig(value: EncryptionConfig): Self = StObject.set(x, "EncryptionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionConfigUndefined: Self = StObject.set(x, "EncryptionConfig", js.undefined)
  }
}
