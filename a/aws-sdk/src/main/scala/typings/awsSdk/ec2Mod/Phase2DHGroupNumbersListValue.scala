package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Phase2DHGroupNumbersListValue extends StObject {
  
  /**
    * The Diffie-Hellmann group number.
    */
  var Value: js.UndefOr[Integer] = js.native
}
object Phase2DHGroupNumbersListValue {
  
  @scala.inline
  def apply(): Phase2DHGroupNumbersListValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Phase2DHGroupNumbersListValue]
  }
  
  @scala.inline
  implicit class Phase2DHGroupNumbersListValueMutableBuilder[Self <: Phase2DHGroupNumbersListValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: Integer): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
