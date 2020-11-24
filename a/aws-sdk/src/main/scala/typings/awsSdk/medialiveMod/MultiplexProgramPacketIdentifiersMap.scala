package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiplexProgramPacketIdentifiersMap extends js.Object {
  
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
  implicit class MultiplexProgramPacketIdentifiersMapOps[Self <: MultiplexProgramPacketIdentifiersMap] (val x: Self) extends AnyVal {
    
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
    def setAudioPidsVarargs(value: integer*): Self = this.set("AudioPids", js.Array(value :_*))
    
    @scala.inline
    def setAudioPids(value: listOfInteger): Self = this.set("AudioPids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudioPids: Self = this.set("AudioPids", js.undefined)
    
    @scala.inline
    def setDvbSubPidsVarargs(value: integer*): Self = this.set("DvbSubPids", js.Array(value :_*))
    
    @scala.inline
    def setDvbSubPids(value: listOfInteger): Self = this.set("DvbSubPids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDvbSubPids: Self = this.set("DvbSubPids", js.undefined)
    
    @scala.inline
    def setDvbTeletextPid(value: integer): Self = this.set("DvbTeletextPid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDvbTeletextPid: Self = this.set("DvbTeletextPid", js.undefined)
    
    @scala.inline
    def setEtvPlatformPid(value: integer): Self = this.set("EtvPlatformPid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtvPlatformPid: Self = this.set("EtvPlatformPid", js.undefined)
    
    @scala.inline
    def setEtvSignalPid(value: integer): Self = this.set("EtvSignalPid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtvSignalPid: Self = this.set("EtvSignalPid", js.undefined)
    
    @scala.inline
    def setKlvDataPidsVarargs(value: integer*): Self = this.set("KlvDataPids", js.Array(value :_*))
    
    @scala.inline
    def setKlvDataPids(value: listOfInteger): Self = this.set("KlvDataPids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKlvDataPids: Self = this.set("KlvDataPids", js.undefined)
    
    @scala.inline
    def setPcrPid(value: integer): Self = this.set("PcrPid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePcrPid: Self = this.set("PcrPid", js.undefined)
    
    @scala.inline
    def setPmtPid(value: integer): Self = this.set("PmtPid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePmtPid: Self = this.set("PmtPid", js.undefined)
    
    @scala.inline
    def setPrivateMetadataPid(value: integer): Self = this.set("PrivateMetadataPid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateMetadataPid: Self = this.set("PrivateMetadataPid", js.undefined)
    
    @scala.inline
    def setScte27PidsVarargs(value: integer*): Self = this.set("Scte27Pids", js.Array(value :_*))
    
    @scala.inline
    def setScte27Pids(value: listOfInteger): Self = this.set("Scte27Pids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScte27Pids: Self = this.set("Scte27Pids", js.undefined)
    
    @scala.inline
    def setScte35Pid(value: integer): Self = this.set("Scte35Pid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScte35Pid: Self = this.set("Scte35Pid", js.undefined)
    
    @scala.inline
    def setTimedMetadataPid(value: integer): Self = this.set("TimedMetadataPid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimedMetadataPid: Self = this.set("TimedMetadataPid", js.undefined)
    
    @scala.inline
    def setVideoPid(value: integer): Self = this.set("VideoPid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoPid: Self = this.set("VideoPid", js.undefined)
  }
}
