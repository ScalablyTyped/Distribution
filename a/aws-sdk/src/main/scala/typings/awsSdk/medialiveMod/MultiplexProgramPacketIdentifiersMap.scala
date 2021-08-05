package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiplexProgramPacketIdentifiersMap extends StObject {
  
  var AudioPids: js.UndefOr[listOfInteger] = js.undefined
  
  var DvbSubPids: js.UndefOr[listOfInteger] = js.undefined
  
  var DvbTeletextPid: js.UndefOr[integer] = js.undefined
  
  var EtvPlatformPid: js.UndefOr[integer] = js.undefined
  
  var EtvSignalPid: js.UndefOr[integer] = js.undefined
  
  var KlvDataPids: js.UndefOr[listOfInteger] = js.undefined
  
  var PcrPid: js.UndefOr[integer] = js.undefined
  
  var PmtPid: js.UndefOr[integer] = js.undefined
  
  var PrivateMetadataPid: js.UndefOr[integer] = js.undefined
  
  var Scte27Pids: js.UndefOr[listOfInteger] = js.undefined
  
  var Scte35Pid: js.UndefOr[integer] = js.undefined
  
  var TimedMetadataPid: js.UndefOr[integer] = js.undefined
  
  var VideoPid: js.UndefOr[integer] = js.undefined
}
object MultiplexProgramPacketIdentifiersMap {
  
  inline def apply(): MultiplexProgramPacketIdentifiersMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiplexProgramPacketIdentifiersMap]
  }
  
  extension [Self <: MultiplexProgramPacketIdentifiersMap](x: Self) {
    
    inline def setAudioPids(value: listOfInteger): Self = StObject.set(x, "AudioPids", value.asInstanceOf[js.Any])
    
    inline def setAudioPidsUndefined: Self = StObject.set(x, "AudioPids", js.undefined)
    
    inline def setAudioPidsVarargs(value: integer*): Self = StObject.set(x, "AudioPids", js.Array(value :_*))
    
    inline def setDvbSubPids(value: listOfInteger): Self = StObject.set(x, "DvbSubPids", value.asInstanceOf[js.Any])
    
    inline def setDvbSubPidsUndefined: Self = StObject.set(x, "DvbSubPids", js.undefined)
    
    inline def setDvbSubPidsVarargs(value: integer*): Self = StObject.set(x, "DvbSubPids", js.Array(value :_*))
    
    inline def setDvbTeletextPid(value: integer): Self = StObject.set(x, "DvbTeletextPid", value.asInstanceOf[js.Any])
    
    inline def setDvbTeletextPidUndefined: Self = StObject.set(x, "DvbTeletextPid", js.undefined)
    
    inline def setEtvPlatformPid(value: integer): Self = StObject.set(x, "EtvPlatformPid", value.asInstanceOf[js.Any])
    
    inline def setEtvPlatformPidUndefined: Self = StObject.set(x, "EtvPlatformPid", js.undefined)
    
    inline def setEtvSignalPid(value: integer): Self = StObject.set(x, "EtvSignalPid", value.asInstanceOf[js.Any])
    
    inline def setEtvSignalPidUndefined: Self = StObject.set(x, "EtvSignalPid", js.undefined)
    
    inline def setKlvDataPids(value: listOfInteger): Self = StObject.set(x, "KlvDataPids", value.asInstanceOf[js.Any])
    
    inline def setKlvDataPidsUndefined: Self = StObject.set(x, "KlvDataPids", js.undefined)
    
    inline def setKlvDataPidsVarargs(value: integer*): Self = StObject.set(x, "KlvDataPids", js.Array(value :_*))
    
    inline def setPcrPid(value: integer): Self = StObject.set(x, "PcrPid", value.asInstanceOf[js.Any])
    
    inline def setPcrPidUndefined: Self = StObject.set(x, "PcrPid", js.undefined)
    
    inline def setPmtPid(value: integer): Self = StObject.set(x, "PmtPid", value.asInstanceOf[js.Any])
    
    inline def setPmtPidUndefined: Self = StObject.set(x, "PmtPid", js.undefined)
    
    inline def setPrivateMetadataPid(value: integer): Self = StObject.set(x, "PrivateMetadataPid", value.asInstanceOf[js.Any])
    
    inline def setPrivateMetadataPidUndefined: Self = StObject.set(x, "PrivateMetadataPid", js.undefined)
    
    inline def setScte27Pids(value: listOfInteger): Self = StObject.set(x, "Scte27Pids", value.asInstanceOf[js.Any])
    
    inline def setScte27PidsUndefined: Self = StObject.set(x, "Scte27Pids", js.undefined)
    
    inline def setScte27PidsVarargs(value: integer*): Self = StObject.set(x, "Scte27Pids", js.Array(value :_*))
    
    inline def setScte35Pid(value: integer): Self = StObject.set(x, "Scte35Pid", value.asInstanceOf[js.Any])
    
    inline def setScte35PidUndefined: Self = StObject.set(x, "Scte35Pid", js.undefined)
    
    inline def setTimedMetadataPid(value: integer): Self = StObject.set(x, "TimedMetadataPid", value.asInstanceOf[js.Any])
    
    inline def setTimedMetadataPidUndefined: Self = StObject.set(x, "TimedMetadataPid", js.undefined)
    
    inline def setVideoPid(value: integer): Self = StObject.set(x, "VideoPid", value.asInstanceOf[js.Any])
    
    inline def setVideoPidUndefined: Self = StObject.set(x, "VideoPid", js.undefined)
  }
}
