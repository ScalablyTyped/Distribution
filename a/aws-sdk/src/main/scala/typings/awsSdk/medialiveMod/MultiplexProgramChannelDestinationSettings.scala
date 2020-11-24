package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiplexProgramChannelDestinationSettings extends js.Object {
  
  /**
    * The ID of the Multiplex that the encoder is providing output to. You do not need to specify the individual inputs to the Multiplex; MediaLive will handle the connection of the two MediaLive pipelines to the two Multiplex instances.
  The Multiplex must be in the same region as the Channel.
    */
  var MultiplexId: js.UndefOr[stringMin1] = js.native
  
  /**
    * The program name of the Multiplex program that the encoder is providing output to.
    */
  var ProgramName: js.UndefOr[stringMin1] = js.native
}
object MultiplexProgramChannelDestinationSettings {
  
  @scala.inline
  def apply(): MultiplexProgramChannelDestinationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiplexProgramChannelDestinationSettings]
  }
  
  @scala.inline
  implicit class MultiplexProgramChannelDestinationSettingsOps[Self <: MultiplexProgramChannelDestinationSettings] (val x: Self) extends AnyVal {
    
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
    def setMultiplexId(value: stringMin1): Self = this.set("MultiplexId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiplexId: Self = this.set("MultiplexId", js.undefined)
    
    @scala.inline
    def setProgramName(value: stringMin1): Self = this.set("ProgramName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgramName: Self = this.set("ProgramName", js.undefined)
  }
}
