package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputLossFailoverSettings extends StObject {
  
  /**
    * The amount of time (in milliseconds) that no input is detected. After that time, an input failover will occur.
    */
  var InputLossThresholdMsec: js.UndefOr[integerMin100] = js.native
}
object InputLossFailoverSettings {
  
  @scala.inline
  def apply(): InputLossFailoverSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputLossFailoverSettings]
  }
  
  @scala.inline
  implicit class InputLossFailoverSettingsMutableBuilder[Self <: InputLossFailoverSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputLossThresholdMsec(value: integerMin100): Self = StObject.set(x, "InputLossThresholdMsec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputLossThresholdMsecUndefined: Self = StObject.set(x, "InputLossThresholdMsec", js.undefined)
  }
}
