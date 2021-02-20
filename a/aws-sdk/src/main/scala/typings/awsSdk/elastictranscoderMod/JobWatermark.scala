package typings.awsSdk.elastictranscoderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobWatermark extends StObject {
  
  /**
    * The encryption settings, if any, that you want Elastic Transcoder to apply to your watermarks.
    */
  var Encryption: js.UndefOr[typings.awsSdk.elastictranscoderMod.Encryption] = js.native
  
  /**
    *  The name of the .png or .jpg file that you want to use for the watermark. To determine which Amazon S3 bucket contains the specified file, Elastic Transcoder checks the pipeline specified by Pipeline; the Input Bucket object in that pipeline identifies the bucket.  If the file name includes a prefix, for example, logos/128x64.png, include the prefix in the key. If the file isn't in the specified bucket, Elastic Transcoder returns an error. 
    */
  var InputKey: js.UndefOr[WatermarkKey] = js.native
  
  /**
    * The ID of the watermark settings that Elastic Transcoder uses to add watermarks to the video during transcoding. The settings are in the preset specified by Preset for the current output. In that preset, the value of Watermarks Id tells Elastic Transcoder which settings to use.
    */
  var PresetWatermarkId: js.UndefOr[typings.awsSdk.elastictranscoderMod.PresetWatermarkId] = js.native
}
object JobWatermark {
  
  @scala.inline
  def apply(): JobWatermark = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobWatermark]
  }
  
  @scala.inline
  implicit class JobWatermarkMutableBuilder[Self <: JobWatermark] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncryption(value: Encryption): Self = StObject.set(x, "Encryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionUndefined: Self = StObject.set(x, "Encryption", js.undefined)
    
    @scala.inline
    def setInputKey(value: WatermarkKey): Self = StObject.set(x, "InputKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputKeyUndefined: Self = StObject.set(x, "InputKey", js.undefined)
    
    @scala.inline
    def setPresetWatermarkId(value: PresetWatermarkId): Self = StObject.set(x, "PresetWatermarkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresetWatermarkIdUndefined: Self = StObject.set(x, "PresetWatermarkId", js.undefined)
  }
}
