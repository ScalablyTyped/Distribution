package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Phase1EncryptionAlgorithmsListValue extends StObject {
  
  /**
    * The value for the encryption algorithm.
    */
  var Value: js.UndefOr[String] = js.native
}
object Phase1EncryptionAlgorithmsListValue {
  
  @scala.inline
  def apply(): Phase1EncryptionAlgorithmsListValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Phase1EncryptionAlgorithmsListValue]
  }
  
  @scala.inline
  implicit class Phase1EncryptionAlgorithmsListValueMutableBuilder[Self <: Phase1EncryptionAlgorithmsListValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
