package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MpdSettings extends StObject {
  
  /**
    * Use this setting only in DASH output groups that include sidecar TTML or IMSC captions.  You specify sidecar captions in a separate output from your audio and video. Choose Raw (RAW) for captions in a single XML file in a raw container. Choose Fragmented MPEG-4 (FRAGMENTED_MP4) for captions in XML format contained within fragmented MP4 files. This set of fragmented MP4 files is separate from your video and audio fragmented MP4 files.
    */
  var CaptionContainerType: js.UndefOr[MpdCaptionContainerType] = js.native
  
  /**
    * Use this setting only when you specify SCTE-35 markers from ESAM. Choose INSERT to put SCTE-35 markers in this output at the insertion points that you specify in an ESAM XML document. Provide the document in the setting SCC XML (sccXml).
    */
  var Scte35Esam: js.UndefOr[MpdScte35Esam] = js.native
  
  /**
    * Ignore this setting unless you have SCTE-35 markers in your input video file. Choose Passthrough (PASSTHROUGH) if you want SCTE-35 markers that appear in your input to also appear in this output. Choose None (NONE) if you don't want those SCTE-35 markers in this output.
    */
  var Scte35Source: js.UndefOr[MpdScte35Source] = js.native
}
object MpdSettings {
  
  @scala.inline
  def apply(): MpdSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MpdSettings]
  }
  
  @scala.inline
  implicit class MpdSettingsMutableBuilder[Self <: MpdSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaptionContainerType(value: MpdCaptionContainerType): Self = StObject.set(x, "CaptionContainerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptionContainerTypeUndefined: Self = StObject.set(x, "CaptionContainerType", js.undefined)
    
    @scala.inline
    def setScte35Esam(value: MpdScte35Esam): Self = StObject.set(x, "Scte35Esam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScte35EsamUndefined: Self = StObject.set(x, "Scte35Esam", js.undefined)
    
    @scala.inline
    def setScte35Source(value: MpdScte35Source): Self = StObject.set(x, "Scte35Source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScte35SourceUndefined: Self = StObject.set(x, "Scte35Source", js.undefined)
  }
}
