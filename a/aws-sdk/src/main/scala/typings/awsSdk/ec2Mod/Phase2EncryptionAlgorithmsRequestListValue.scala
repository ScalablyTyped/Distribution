package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Phase2EncryptionAlgorithmsRequestListValue extends StObject {
  
  /**
    * The encryption algorithm.
    */
  var Value: js.UndefOr[String] = js.undefined
}
object Phase2EncryptionAlgorithmsRequestListValue {
  
  @scala.inline
  def apply(): Phase2EncryptionAlgorithmsRequestListValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Phase2EncryptionAlgorithmsRequestListValue]
  }
  
  @scala.inline
  implicit class Phase2EncryptionAlgorithmsRequestListValueMutableBuilder[Self <: Phase2EncryptionAlgorithmsRequestListValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
