package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputClippingSettings extends StObject {
  
  /**
    * The source of the timecodes in the source being clipped.
    */
  var InputTimecodeSource: typings.awsSdk.medialiveMod.InputTimecodeSource = js.native
  
  /**
    * Settings to identify the start of the clip.
    */
  var StartTimecode: js.UndefOr[typings.awsSdk.medialiveMod.StartTimecode] = js.native
  
  /**
    * Settings to identify the end of the clip.
    */
  var StopTimecode: js.UndefOr[typings.awsSdk.medialiveMod.StopTimecode] = js.native
}
object InputClippingSettings {
  
  @scala.inline
  def apply(InputTimecodeSource: InputTimecodeSource): InputClippingSettings = {
    val __obj = js.Dynamic.literal(InputTimecodeSource = InputTimecodeSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputClippingSettings]
  }
  
  @scala.inline
  implicit class InputClippingSettingsMutableBuilder[Self <: InputClippingSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputTimecodeSource(value: InputTimecodeSource): Self = StObject.set(x, "InputTimecodeSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimecode(value: StartTimecode): Self = StObject.set(x, "StartTimecode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimecodeUndefined: Self = StObject.set(x, "StartTimecode", js.undefined)
    
    @scala.inline
    def setStopTimecode(value: StopTimecode): Self = StObject.set(x, "StopTimecode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopTimecodeUndefined: Self = StObject.set(x, "StopTimecode", js.undefined)
  }
}
