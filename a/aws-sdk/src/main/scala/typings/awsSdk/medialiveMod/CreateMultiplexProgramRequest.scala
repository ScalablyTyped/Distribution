package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateMultiplexProgramRequest extends js.Object {
  
  /**
    * ID of the multiplex where the program is to be created.
    */
  var MultiplexId: string = js.native
  
  /**
    * The settings for this multiplex program.
    */
  var MultiplexProgramSettings: typings.awsSdk.medialiveMod.MultiplexProgramSettings = js.native
  
  /**
    * Name of multiplex program.
    */
  var ProgramName: string = js.native
  
  /**
    * Unique request ID. This prevents retries from creating multiple
  resources.
    */
  var RequestId: string = js.native
}
object CreateMultiplexProgramRequest {
  
  @scala.inline
  def apply(
    MultiplexId: string,
    MultiplexProgramSettings: MultiplexProgramSettings,
    ProgramName: string,
    RequestId: string
  ): CreateMultiplexProgramRequest = {
    val __obj = js.Dynamic.literal(MultiplexId = MultiplexId.asInstanceOf[js.Any], MultiplexProgramSettings = MultiplexProgramSettings.asInstanceOf[js.Any], ProgramName = ProgramName.asInstanceOf[js.Any], RequestId = RequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMultiplexProgramRequest]
  }
  
  @scala.inline
  implicit class CreateMultiplexProgramRequestOps[Self <: CreateMultiplexProgramRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMultiplexId(value: string): Self = this.set("MultiplexId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiplexProgramSettings(value: MultiplexProgramSettings): Self = this.set("MultiplexProgramSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgramName(value: string): Self = this.set("ProgramName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestId(value: string): Self = this.set("RequestId", value.asInstanceOf[js.Any])
  }
}
