package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiplexProgramSettings extends js.Object {
  
  /**
    * Indicates which pipeline is preferred by the multiplex for program ingest.
    */
  var PreferredChannelPipeline: js.UndefOr[typings.awsSdk.medialiveMod.PreferredChannelPipeline] = js.native
  
  /**
    * Unique program number.
    */
  var ProgramNumber: integerMin0Max65535 = js.native
  
  /**
    * Transport stream service descriptor configuration for the Multiplex program.
    */
  var ServiceDescriptor: js.UndefOr[MultiplexProgramServiceDescriptor] = js.native
  
  /**
    * Program video settings configuration.
    */
  var VideoSettings: js.UndefOr[MultiplexVideoSettings] = js.native
}
object MultiplexProgramSettings {
  
  @scala.inline
  def apply(ProgramNumber: integerMin0Max65535): MultiplexProgramSettings = {
    val __obj = js.Dynamic.literal(ProgramNumber = ProgramNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiplexProgramSettings]
  }
  
  @scala.inline
  implicit class MultiplexProgramSettingsOps[Self <: MultiplexProgramSettings] (val x: Self) extends AnyVal {
    
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
    def setProgramNumber(value: integerMin0Max65535): Self = this.set("ProgramNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredChannelPipeline(value: PreferredChannelPipeline): Self = this.set("PreferredChannelPipeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferredChannelPipeline: Self = this.set("PreferredChannelPipeline", js.undefined)
    
    @scala.inline
    def setServiceDescriptor(value: MultiplexProgramServiceDescriptor): Self = this.set("ServiceDescriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceDescriptor: Self = this.set("ServiceDescriptor", js.undefined)
    
    @scala.inline
    def setVideoSettings(value: MultiplexVideoSettings): Self = this.set("VideoSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoSettings: Self = this.set("VideoSettings", js.undefined)
  }
}
