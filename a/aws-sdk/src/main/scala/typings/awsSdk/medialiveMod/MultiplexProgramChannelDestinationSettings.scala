package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiplexProgramChannelDestinationSettings extends StObject {
  
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
  implicit class MultiplexProgramChannelDestinationSettingsMutableBuilder[Self <: MultiplexProgramChannelDestinationSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMultiplexId(value: stringMin1): Self = StObject.set(x, "MultiplexId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiplexIdUndefined: Self = StObject.set(x, "MultiplexId", js.undefined)
    
    @scala.inline
    def setProgramName(value: stringMin1): Self = StObject.set(x, "ProgramName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgramNameUndefined: Self = StObject.set(x, "ProgramName", js.undefined)
  }
}
