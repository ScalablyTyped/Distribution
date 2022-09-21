package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteMultiplexProgramResponse extends StObject {
  
  /**
    * The MediaLive channel associated with the program.
    */
  var ChannelId: js.UndefOr[string] = js.undefined
  
  /**
    * The settings for this multiplex program.
    */
  var MultiplexProgramSettings: js.UndefOr[typings.awsSdk.medialiveMod.MultiplexProgramSettings] = js.undefined
  
  /**
    * The packet identifier map for this multiplex program.
    */
  var PacketIdentifiersMap: js.UndefOr[MultiplexProgramPacketIdentifiersMap] = js.undefined
  
  /**
    * Contains information about the current sources for the specified program in the specified multiplex. Keep in mind that each multiplex pipeline connects to both pipelines in a given source channel (the channel identified by the program). But only one of those channel pipelines is ever active at one time.
    */
  var PipelineDetails: js.UndefOr[listOfMultiplexProgramPipelineDetail] = js.undefined
  
  /**
    * The name of the multiplex program.
    */
  var ProgramName: js.UndefOr[string] = js.undefined
}
object DeleteMultiplexProgramResponse {
  
  inline def apply(): DeleteMultiplexProgramResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteMultiplexProgramResponse]
  }
  
  extension [Self <: DeleteMultiplexProgramResponse](x: Self) {
    
    inline def setChannelId(value: string): Self = StObject.set(x, "ChannelId", value.asInstanceOf[js.Any])
    
    inline def setChannelIdUndefined: Self = StObject.set(x, "ChannelId", js.undefined)
    
    inline def setMultiplexProgramSettings(value: MultiplexProgramSettings): Self = StObject.set(x, "MultiplexProgramSettings", value.asInstanceOf[js.Any])
    
    inline def setMultiplexProgramSettingsUndefined: Self = StObject.set(x, "MultiplexProgramSettings", js.undefined)
    
    inline def setPacketIdentifiersMap(value: MultiplexProgramPacketIdentifiersMap): Self = StObject.set(x, "PacketIdentifiersMap", value.asInstanceOf[js.Any])
    
    inline def setPacketIdentifiersMapUndefined: Self = StObject.set(x, "PacketIdentifiersMap", js.undefined)
    
    inline def setPipelineDetails(value: listOfMultiplexProgramPipelineDetail): Self = StObject.set(x, "PipelineDetails", value.asInstanceOf[js.Any])
    
    inline def setPipelineDetailsUndefined: Self = StObject.set(x, "PipelineDetails", js.undefined)
    
    inline def setPipelineDetailsVarargs(value: MultiplexProgramPipelineDetail*): Self = StObject.set(x, "PipelineDetails", js.Array(value*))
    
    inline def setProgramName(value: string): Self = StObject.set(x, "ProgramName", value.asInstanceOf[js.Any])
    
    inline def setProgramNameUndefined: Self = StObject.set(x, "ProgramName", js.undefined)
  }
}
