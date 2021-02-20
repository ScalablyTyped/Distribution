package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NielsenNonLinearWatermarkSettings extends StObject {
  
  /**
    * Choose the type of Nielsen watermarks that you want in your outputs. When you choose NAES 2 and NW (NAES2_AND_NW), you must provide a value for the setting SID (sourceId). When you choose CBET (CBET), you must provide a value for the setting CSID (cbetSourceId). When you choose NAES 2, NW, and CBET (NAES2_AND_NW_AND_CBET), you must provide values for both of these settings.
    */
  var ActiveWatermarkProcess: js.UndefOr[NielsenActiveWatermarkProcessType] = js.native
  
  /**
    * Optional. Use this setting when you want the service to include an ADI file in the Nielsen  metadata .zip file. To provide an ADI file, store it in Amazon S3 and provide a URL to it  here. The URL should be in the following format: S3://bucket/path/ADI-file. For more information about the metadata .zip file, see the setting Metadata destination (metadataDestination).
    */
  var AdiFilename: js.UndefOr[stringPatternS3] = js.native
  
  /**
    * Use the asset ID that you provide to Nielsen to uniquely identify this asset. Required for all Nielsen non-linear watermarking.
    */
  var AssetId: js.UndefOr[stringMin1Max20] = js.native
  
  /**
    * Use the asset name that you provide to Nielsen for this asset. Required for all Nielsen non-linear watermarking.
    */
  var AssetName: js.UndefOr[stringMin1Max50] = js.native
  
  /**
    * Use the CSID that Nielsen provides to you. This CBET source ID should be unique to your Nielsen account but common to all of your output assets that have CBET watermarking. Required when you choose a value for the setting Watermark types (ActiveWatermarkProcess) that includes CBET.
    */
  var CbetSourceId: js.UndefOr[stringPattern0xAFaF0908190908] = js.native
  
  /**
    * Optional. If this asset uses an episode ID with Nielsen, provide it here.
    */
  var EpisodeId: js.UndefOr[stringMin1Max20] = js.native
  
  /**
    * Specify the Amazon S3 location where you want MediaConvert to save your Nielsen non-linear metadata .zip file. This Amazon S3 bucket must be in the same Region as the one where you do your MediaConvert transcoding. If you want to include an ADI file in this .zip file, use the setting ADI file (adiFilename) to specify it. MediaConvert delivers the Nielsen metadata .zip files only to your metadata destination Amazon S3 bucket. It doesn't deliver the .zip files to Nielsen. You are responsible for delivering the metadata .zip files to Nielsen.
    */
  var MetadataDestination: js.UndefOr[stringPatternS3] = js.native
  
  /**
    * Use the SID that Nielsen provides to you. This source ID should be unique to your Nielsen account but common to all of your output assets. Required for all Nielsen non-linear watermarking. This ID should be unique to your Nielsen account but common to all of your output assets. Required for all Nielsen non-linear watermarking.
    */
  var SourceId: js.UndefOr[integerMin0Max65534] = js.native
  
  /**
    * Required. Specify whether your source content already contains Nielsen non-linear watermarks. When you set this value to Watermarked (WATERMARKED), the service fails the job. Nielsen requires that you add non-linear watermarking to only clean content that doesn't already  have non-linear Nielsen watermarks.
    */
  var SourceWatermarkStatus: js.UndefOr[NielsenSourceWatermarkStatusType] = js.native
  
  /**
    * Specify the endpoint for the TIC server that you have deployed and configured in the AWS Cloud. Required for all Nielsen non-linear watermarking. MediaConvert can't connect directly to a TIC server. Instead, you must use API Gateway to provide a RESTful interface between MediaConvert and a TIC server that you deploy in your AWS account. For more information on deploying a TIC server in your AWS account and the required API Gateway, contact Nielsen support.
    */
  var TicServerUrl: js.UndefOr[stringPatternHttps] = js.native
  
  /**
    * To create assets that have the same TIC values in each audio track, keep the default value Share TICs (SAME_TICS_PER_TRACK). To create assets that have unique TIC values for each audio track, choose Use unique TICs (RESERVE_UNIQUE_TICS_PER_TRACK).
    */
  var UniqueTicPerAudioTrack: js.UndefOr[NielsenUniqueTicPerAudioTrackType] = js.native
}
object NielsenNonLinearWatermarkSettings {
  
  @scala.inline
  def apply(): NielsenNonLinearWatermarkSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NielsenNonLinearWatermarkSettings]
  }
  
  @scala.inline
  implicit class NielsenNonLinearWatermarkSettingsMutableBuilder[Self <: NielsenNonLinearWatermarkSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveWatermarkProcess(value: NielsenActiveWatermarkProcessType): Self = StObject.set(x, "ActiveWatermarkProcess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveWatermarkProcessUndefined: Self = StObject.set(x, "ActiveWatermarkProcess", js.undefined)
    
    @scala.inline
    def setAdiFilename(value: stringPatternS3): Self = StObject.set(x, "AdiFilename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdiFilenameUndefined: Self = StObject.set(x, "AdiFilename", js.undefined)
    
    @scala.inline
    def setAssetId(value: stringMin1Max20): Self = StObject.set(x, "AssetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetIdUndefined: Self = StObject.set(x, "AssetId", js.undefined)
    
    @scala.inline
    def setAssetName(value: stringMin1Max50): Self = StObject.set(x, "AssetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetNameUndefined: Self = StObject.set(x, "AssetName", js.undefined)
    
    @scala.inline
    def setCbetSourceId(value: stringPattern0xAFaF0908190908): Self = StObject.set(x, "CbetSourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCbetSourceIdUndefined: Self = StObject.set(x, "CbetSourceId", js.undefined)
    
    @scala.inline
    def setEpisodeId(value: stringMin1Max20): Self = StObject.set(x, "EpisodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEpisodeIdUndefined: Self = StObject.set(x, "EpisodeId", js.undefined)
    
    @scala.inline
    def setMetadataDestination(value: stringPatternS3): Self = StObject.set(x, "MetadataDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataDestinationUndefined: Self = StObject.set(x, "MetadataDestination", js.undefined)
    
    @scala.inline
    def setSourceId(value: integerMin0Max65534): Self = StObject.set(x, "SourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceIdUndefined: Self = StObject.set(x, "SourceId", js.undefined)
    
    @scala.inline
    def setSourceWatermarkStatus(value: NielsenSourceWatermarkStatusType): Self = StObject.set(x, "SourceWatermarkStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceWatermarkStatusUndefined: Self = StObject.set(x, "SourceWatermarkStatus", js.undefined)
    
    @scala.inline
    def setTicServerUrl(value: stringPatternHttps): Self = StObject.set(x, "TicServerUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicServerUrlUndefined: Self = StObject.set(x, "TicServerUrl", js.undefined)
    
    @scala.inline
    def setUniqueTicPerAudioTrack(value: NielsenUniqueTicPerAudioTrackType): Self = StObject.set(x, "UniqueTicPerAudioTrack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueTicPerAudioTrackUndefined: Self = StObject.set(x, "UniqueTicPerAudioTrack", js.undefined)
  }
}
