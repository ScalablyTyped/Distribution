package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NexGuardFileMarkerSettings extends StObject {
  
  /**
    * Use the base64 license string that Nagra provides you. Enter it directly in your JSON job specification or in the console. Required when you include Nagra NexGuard File Marker watermarking (NexGuardWatermarkingSettings) in your job.
    */
  var License: js.UndefOr[stringMin1Max100000] = js.undefined
  
  /**
    * Specify the payload ID that you want associated with this output. Valid values vary depending on your Nagra NexGuard forensic watermarking workflow. Required when you include Nagra NexGuard File Marker watermarking (NexGuardWatermarkingSettings) in your job. For PreRelease Content (NGPR/G2), specify an integer from 1 through 4,194,303. You must generate a unique ID for each asset you watermark, and keep a record of which ID you have assigned to each asset. Neither Nagra nor MediaConvert keep track of the relationship between output files and your IDs. For OTT Streaming, create two adaptive bitrate (ABR) stacks for each asset. Do this by setting up two output groups. For one output group, set the value of Payload ID (payload) to 0 in every output. For the other output group, set Payload ID (payload) to 1 in every output.
    */
  var Payload: js.UndefOr[integerMin0Max4194303] = js.undefined
  
  /**
    * Enter one of the watermarking preset strings that Nagra provides you. Required when you include Nagra NexGuard File Marker watermarking (NexGuardWatermarkingSettings) in your job.
    */
  var Preset: js.UndefOr[stringMin1Max256] = js.undefined
  
  /**
    * Optional. Ignore this setting unless Nagra support directs you to specify a value. When you don't specify a value here, the Nagra NexGuard library uses its default value.
    */
  var Strength: js.UndefOr[WatermarkingStrength] = js.undefined
}
object NexGuardFileMarkerSettings {
  
  inline def apply(): NexGuardFileMarkerSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NexGuardFileMarkerSettings]
  }
  
  extension [Self <: NexGuardFileMarkerSettings](x: Self) {
    
    inline def setLicense(value: stringMin1Max100000): Self = StObject.set(x, "License", value.asInstanceOf[js.Any])
    
    inline def setLicenseUndefined: Self = StObject.set(x, "License", js.undefined)
    
    inline def setPayload(value: integerMin0Max4194303): Self = StObject.set(x, "Payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "Payload", js.undefined)
    
    inline def setPreset(value: stringMin1Max256): Self = StObject.set(x, "Preset", value.asInstanceOf[js.Any])
    
    inline def setPresetUndefined: Self = StObject.set(x, "Preset", js.undefined)
    
    inline def setStrength(value: WatermarkingStrength): Self = StObject.set(x, "Strength", value.asInstanceOf[js.Any])
    
    inline def setStrengthUndefined: Self = StObject.set(x, "Strength", js.undefined)
  }
}
