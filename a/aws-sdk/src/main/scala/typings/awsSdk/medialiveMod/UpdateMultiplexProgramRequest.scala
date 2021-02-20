package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateMultiplexProgramRequest extends StObject {
  
  /**
    * The ID of the multiplex of the program to update.
    */
  var MultiplexId: string = js.native
  
  /**
    * The new settings for a multiplex program.
    */
  var MultiplexProgramSettings: js.UndefOr[typings.awsSdk.medialiveMod.MultiplexProgramSettings] = js.native
  
  /**
    * The name of the program to update.
    */
  var ProgramName: string = js.native
}
object UpdateMultiplexProgramRequest {
  
  @scala.inline
  def apply(MultiplexId: string, ProgramName: string): UpdateMultiplexProgramRequest = {
    val __obj = js.Dynamic.literal(MultiplexId = MultiplexId.asInstanceOf[js.Any], ProgramName = ProgramName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMultiplexProgramRequest]
  }
  
  @scala.inline
  implicit class UpdateMultiplexProgramRequestMutableBuilder[Self <: UpdateMultiplexProgramRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMultiplexId(value: string): Self = StObject.set(x, "MultiplexId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiplexProgramSettings(value: MultiplexProgramSettings): Self = StObject.set(x, "MultiplexProgramSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiplexProgramSettingsUndefined: Self = StObject.set(x, "MultiplexProgramSettings", js.undefined)
    
    @scala.inline
    def setProgramName(value: string): Self = StObject.set(x, "ProgramName", value.asInstanceOf[js.Any])
  }
}
