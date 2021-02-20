package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiplexProgramPacketIdentifiersMap extends StObject {
  
  var AudioPids: js.UndefOr[listOfInteger] = js.native
  
  var DvbSubPids: js.UndefOr[listOfInteger] = js.native
  
  var DvbTeletextPid: js.UndefOr[integer] = js.native
  
  var EtvPlatformPid: js.UndefOr[integer] = js.native
  
  var EtvSignalPid: js.UndefOr[integer] = js.native
  
  var KlvDataPids: js.UndefOr[listOfInteger] = js.native
  
  var PcrPid: js.UndefOr[integer] = js.native
  
  var PmtPid: js.UndefOr[integer] = js.native
  
  var PrivateMetadataPid: js.UndefOr[integer] = js.native
  
  var Scte27Pids: js.UndefOr[listOfInteger] = js.native
  
  var Scte35Pid: js.UndefOr[integer] = js.native
  
  var TimedMetadataPid: js.UndefOr[integer] = js.native
  
  var VideoPid: js.UndefOr[integer] = js.native
}
object MultiplexProgramPacketIdentifiersMap {
  
  @scala.inline
  def apply(): MultiplexProgramPacketIdentifiersMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiplexProgramPacketIdentifiersMap]
  }
  
  @scala.inline
  implicit class MultiplexProgramPacketIdentifiersMapMutableBuilder[Self <: MultiplexProgramPacketIdentifiersMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudioPids(value: listOfInteger): Self = StObject.set(x, "AudioPids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioPidsUndefined: Self = StObject.set(x, "AudioPids", js.undefined)
    
    @scala.inline
    def setAudioPidsVarargs(value: integer*): Self = StObject.set(x, "AudioPids", js.Array(value :_*))
    
    @scala.inline
    def setDvbSubPids(value: listOfInteger): Self = StObject.set(x, "DvbSubPids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDvbSubPidsUndefined: Self = StObject.set(x, "DvbSubPids", js.undefined)
    
    @scala.inline
    def setDvbSubPidsVarargs(value: integer*): Self = StObject.set(x, "DvbSubPids", js.Array(value :_*))
    
    @scala.inline
    def setDvbTeletextPid(value: integer): Self = StObject.set(x, "DvbTeletextPid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDvbTeletextPidUndefined: Self = StObject.set(x, "DvbTeletextPid", js.undefined)
    
    @scala.inline
    def setEtvPlatformPid(value: integer): Self = StObject.set(x, "EtvPlatformPid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtvPlatformPidUndefined: Self = StObject.set(x, "EtvPlatformPid", js.undefined)
    
    @scala.inline
    def setEtvSignalPid(value: integer): Self = StObject.set(x, "EtvSignalPid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtvSignalPidUndefined: Self = StObject.set(x, "EtvSignalPid", js.undefined)
    
    @scala.inline
    def setKlvDataPids(value: listOfInteger): Self = StObject.set(x, "KlvDataPids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKlvDataPidsUndefined: Self = StObject.set(x, "KlvDataPids", js.undefined)
    
    @scala.inline
    def setKlvDataPidsVarargs(value: integer*): Self = StObject.set(x, "KlvDataPids", js.Array(value :_*))
    
    @scala.inline
    def setPcrPid(value: integer): Self = StObject.set(x, "PcrPid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPcrPidUndefined: Self = StObject.set(x, "PcrPid", js.undefined)
    
    @scala.inline
    def setPmtPid(value: integer): Self = StObject.set(x, "PmtPid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPmtPidUndefined: Self = StObject.set(x, "PmtPid", js.undefined)
    
    @scala.inline
    def setPrivateMetadataPid(value: integer): Self = StObject.set(x, "PrivateMetadataPid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateMetadataPidUndefined: Self = StObject.set(x, "PrivateMetadataPid", js.undefined)
    
    @scala.inline
    def setScte27Pids(value: listOfInteger): Self = StObject.set(x, "Scte27Pids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScte27PidsUndefined: Self = StObject.set(x, "Scte27Pids", js.undefined)
    
    @scala.inline
    def setScte27PidsVarargs(value: integer*): Self = StObject.set(x, "Scte27Pids", js.Array(value :_*))
    
    @scala.inline
    def setScte35Pid(value: integer): Self = StObject.set(x, "Scte35Pid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScte35PidUndefined: Self = StObject.set(x, "Scte35Pid", js.undefined)
    
    @scala.inline
    def setTimedMetadataPid(value: integer): Self = StObject.set(x, "TimedMetadataPid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimedMetadataPidUndefined: Self = StObject.set(x, "TimedMetadataPid", js.undefined)
    
    @scala.inline
    def setVideoPid(value: integer): Self = StObject.set(x, "VideoPid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoPidUndefined: Self = StObject.set(x, "VideoPid", js.undefined)
  }
}
