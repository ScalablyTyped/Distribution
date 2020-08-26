package typings.awsSdk.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobOutput extends js.Object {
  /**
    * The album art to be associated with the output file, if any.
    */
  var AlbumArt: js.UndefOr[JobAlbumArt] = js.native
  /**
    * If Elastic Transcoder used a preset with a ColorSpaceConversionMode to transcode the output file, the AppliedColorSpaceConversion parameter shows the conversion used. If no ColorSpaceConversionMode was defined in the preset, this parameter is not be included in the job response.
    */
  var AppliedColorSpaceConversion: js.UndefOr[String] = js.native
  /**
    * You can configure Elastic Transcoder to transcode captions, or subtitles, from one format to another. All captions must be in UTF-8. Elastic Transcoder supports two types of captions:    Embedded: Embedded captions are included in the same file as the audio and video. Elastic Transcoder supports only one embedded caption per language, to a maximum of 300 embedded captions per file. Valid input values include: CEA-608 (EIA-608, first non-empty channel only), CEA-708 (EIA-708, first non-empty channel only), and mov-text  Valid outputs include: mov-text  Elastic Transcoder supports a maximum of one embedded format per output.    Sidecar: Sidecar captions are kept in a separate metadata file from the audio and video data. Sidecar captions require a player that is capable of understanding the relationship between the video file and the sidecar file. Elastic Transcoder supports only one sidecar caption per language, to a maximum of 20 sidecar captions per file. Valid input values include: dfxp (first div element only), ebu-tt, scc, smpt, srt, ttml (first div element only), and webvtt  Valid outputs include: dfxp (first div element only), scc, srt, and webvtt.   If you want ttml or smpte-tt compatible captions, specify dfxp as your output format. Elastic Transcoder does not support OCR (Optical Character Recognition), does not accept pictures as a valid input for captions, and is not available for audio-only transcoding. Elastic Transcoder does not preserve text formatting (for example, italics) during the transcoding process. To remove captions or leave the captions empty, set Captions to null. To pass through existing captions unchanged, set the MergePolicy to MergeRetain, and pass in a null CaptionSources array. For more information on embedded files, see the Subtitles Wikipedia page. For more information on sidecar files, see the Extensible Metadata Platform and Sidecar file Wikipedia pages.
    */
  var Captions: js.UndefOr[typings.awsSdk.elastictranscoderMod.Captions] = js.native
  /**
    * You can create an output file that contains an excerpt from the input file. This excerpt, called a clip, can come from the beginning, middle, or end of the file. The Composition object contains settings for the clips that make up an output file. For the current release, you can only specify settings for a single clip per output file. The Composition object cannot be null.
    */
  var Composition: js.UndefOr[typings.awsSdk.elastictranscoderMod.Composition] = js.native
  /**
    * Duration of the output file, in seconds.
    */
  var Duration: js.UndefOr[NullableLong] = js.native
  /**
    * Duration of the output file, in milliseconds.
    */
  var DurationMillis: js.UndefOr[NullableLong] = js.native
  /**
    * The encryption settings, if any, that you want Elastic Transcoder to apply to your output files. If you choose to use encryption, you must specify a mode to use. If you choose not to use encryption, Elastic Transcoder writes an unencrypted file to your Amazon S3 bucket.
    */
  var Encryption: js.UndefOr[typings.awsSdk.elastictranscoderMod.Encryption] = js.native
  /**
    * File size of the output file, in bytes.
    */
  var FileSize: js.UndefOr[NullableLong] = js.native
  /**
    * Frame rate of the output file, in frames per second.
    */
  var FrameRate: js.UndefOr[FloatString] = js.native
  /**
    * Height of the output file, in pixels.
    */
  var Height: js.UndefOr[NullableInteger] = js.native
  /**
    * A sequential counter, starting with 1, that identifies an output among the outputs from the current job. In the Output syntax, this value is always 1.
    */
  var Id: js.UndefOr[String] = js.native
  /**
    *  The name to assign to the transcoded file. Elastic Transcoder saves the file in the Amazon S3 bucket specified by the OutputBucket object in the pipeline that is specified by the pipeline ID.
    */
  var Key: js.UndefOr[typings.awsSdk.elastictranscoderMod.Key] = js.native
  /**
    * The value of the Id object for the preset that you want to use for this job. The preset determines the audio, video, and thumbnail settings that Elastic Transcoder uses for transcoding. To use a preset that you created, specify the preset ID that Elastic Transcoder returned in the response when you created the preset. You can also use the Elastic Transcoder system presets, which you can get with ListPresets.
    */
  var PresetId: js.UndefOr[Id] = js.native
  /**
    * The number of degrees clockwise by which you want Elastic Transcoder to rotate the output relative to the input. Enter one of the following values:  auto, 0, 90, 180, 270   The value auto generally works only if the file that you're transcoding contains rotation metadata.
    */
  var Rotate: js.UndefOr[typings.awsSdk.elastictranscoderMod.Rotate] = js.native
  /**
    *  (Outputs in Fragmented MP4 or MPEG-TS format only.  If you specify a preset in PresetId for which the value of Container is fmp4 (Fragmented MP4) or ts (MPEG-TS), SegmentDuration is the target maximum duration of each segment in seconds. For HLSv3 format playlists, each media segment is stored in a separate .ts file. For HLSv4, MPEG-DASH, and Smooth playlists, all media segments for an output are stored in a single file. Each segment is approximately the length of the SegmentDuration, though individual segments might be shorter or longer. The range of valid values is 1 to 60 seconds. If the duration of the video is not evenly divisible by SegmentDuration, the duration of the last segment is the remainder of total length/SegmentDuration. Elastic Transcoder creates an output-specific playlist for each output HLS output that you specify in OutputKeys. To add an output to the master playlist for this job, include it in the OutputKeys of the associated playlist.
    */
  var SegmentDuration: js.UndefOr[FloatString] = js.native
  /**
    *  The status of one output in a job. If you specified only one output for the job, Outputs:Status is always the same as Job:Status. If you specified more than one output:     Job:Status and Outputs:Status for all of the outputs is Submitted until Elastic Transcoder starts to process the first output.   When Elastic Transcoder starts to process the first output, Outputs:Status for that output and Job:Status both change to Progressing. For each output, the value of Outputs:Status remains Submitted until Elastic Transcoder starts to process the output.   Job:Status remains Progressing until all of the outputs reach a terminal status, either Complete or Error.   When all of the outputs reach a terminal status, Job:Status changes to Complete only if Outputs:Status for all of the outputs is Complete. If Outputs:Status for one or more outputs is Error, the terminal status for Job:Status is also Error.   The value of Status is one of the following: Submitted, Progressing, Complete, Canceled, or Error. 
    */
  var Status: js.UndefOr[JobStatus] = js.native
  /**
    * Information that further explains Status.
    */
  var StatusDetail: js.UndefOr[Description] = js.native
  /**
    * The encryption settings, if any, that you want Elastic Transcoder to apply to your thumbnail.
    */
  var ThumbnailEncryption: js.UndefOr[Encryption] = js.native
  /**
    * Whether you want Elastic Transcoder to create thumbnails for your videos and, if so, how you want Elastic Transcoder to name the files. If you don't want Elastic Transcoder to create thumbnails, specify "". If you do want Elastic Transcoder to create thumbnails, specify the information that you want to include in the file name for each thumbnail. You can specify the following values in any sequence:     {count} (Required): If you want to create thumbnails, you must include {count} in the ThumbnailPattern object. Wherever you specify {count}, Elastic Transcoder adds a five-digit sequence number (beginning with 00001) to thumbnail file names. The number indicates where a given thumbnail appears in the sequence of thumbnails for a transcoded file.   If you specify a literal value and/or {resolution} but you omit {count}, Elastic Transcoder returns a validation error and does not create the job.     Literal values (Optional): You can specify literal values anywhere in the ThumbnailPattern object. For example, you can include them as a file name prefix or as a delimiter between {resolution} and {count}.      {resolution} (Optional): If you want Elastic Transcoder to include the resolution in the file name, include {resolution} in the ThumbnailPattern object.    When creating thumbnails, Elastic Transcoder automatically saves the files in the format (.jpg or .png) that appears in the preset that you specified in the PresetID value of CreateJobOutput. Elastic Transcoder also appends the applicable file name extension.
    */
  var ThumbnailPattern: js.UndefOr[typings.awsSdk.elastictranscoderMod.ThumbnailPattern] = js.native
  /**
    * Information about the watermarks that you want Elastic Transcoder to add to the video during transcoding. You can specify up to four watermarks for each output. Settings for each watermark must be defined in the preset that you specify in Preset for the current output. Watermarks are added to the output video in the sequence in which you list them in the job output—the first watermark in the list is added to the output video first, the second watermark in the list is added next, and so on. As a result, if the settings in a preset cause Elastic Transcoder to place all watermarks in the same location, the second watermark that you add covers the first one, the third one covers the second, and the fourth one covers the third.
    */
  var Watermarks: js.UndefOr[JobWatermarks] = js.native
  /**
    * Specifies the width of the output file in pixels.
    */
  var Width: js.UndefOr[NullableInteger] = js.native
}

object JobOutput {
  @scala.inline
  def apply(): JobOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobOutput]
  }
  @scala.inline
  implicit class JobOutputOps[Self <: JobOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlbumArt(value: JobAlbumArt): Self = this.set("AlbumArt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlbumArt: Self = this.set("AlbumArt", js.undefined)
    @scala.inline
    def setAppliedColorSpaceConversion(value: String): Self = this.set("AppliedColorSpaceConversion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppliedColorSpaceConversion: Self = this.set("AppliedColorSpaceConversion", js.undefined)
    @scala.inline
    def setCaptions(value: Captions): Self = this.set("Captions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaptions: Self = this.set("Captions", js.undefined)
    @scala.inline
    def setCompositionVarargs(value: Clip*): Self = this.set("Composition", js.Array(value :_*))
    @scala.inline
    def setComposition(value: Composition): Self = this.set("Composition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComposition: Self = this.set("Composition", js.undefined)
    @scala.inline
    def setDuration(value: NullableLong): Self = this.set("Duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("Duration", js.undefined)
    @scala.inline
    def setDurationMillis(value: NullableLong): Self = this.set("DurationMillis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDurationMillis: Self = this.set("DurationMillis", js.undefined)
    @scala.inline
    def setEncryption(value: Encryption): Self = this.set("Encryption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncryption: Self = this.set("Encryption", js.undefined)
    @scala.inline
    def setFileSize(value: NullableLong): Self = this.set("FileSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileSize: Self = this.set("FileSize", js.undefined)
    @scala.inline
    def setFrameRate(value: FloatString): Self = this.set("FrameRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrameRate: Self = this.set("FrameRate", js.undefined)
    @scala.inline
    def setHeight(value: NullableInteger): Self = this.set("Height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("Height", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    @scala.inline
    def setKey(value: Key): Self = this.set("Key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("Key", js.undefined)
    @scala.inline
    def setPresetId(value: Id): Self = this.set("PresetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePresetId: Self = this.set("PresetId", js.undefined)
    @scala.inline
    def setRotate(value: Rotate): Self = this.set("Rotate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotate: Self = this.set("Rotate", js.undefined)
    @scala.inline
    def setSegmentDuration(value: FloatString): Self = this.set("SegmentDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegmentDuration: Self = this.set("SegmentDuration", js.undefined)
    @scala.inline
    def setStatus(value: JobStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setStatusDetail(value: Description): Self = this.set("StatusDetail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusDetail: Self = this.set("StatusDetail", js.undefined)
    @scala.inline
    def setThumbnailEncryption(value: Encryption): Self = this.set("ThumbnailEncryption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbnailEncryption: Self = this.set("ThumbnailEncryption", js.undefined)
    @scala.inline
    def setThumbnailPattern(value: ThumbnailPattern): Self = this.set("ThumbnailPattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbnailPattern: Self = this.set("ThumbnailPattern", js.undefined)
    @scala.inline
    def setWatermarksVarargs(value: JobWatermark*): Self = this.set("Watermarks", js.Array(value :_*))
    @scala.inline
    def setWatermarks(value: JobWatermarks): Self = this.set("Watermarks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWatermarks: Self = this.set("Watermarks", js.undefined)
    @scala.inline
    def setWidth(value: NullableInteger): Self = this.set("Width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("Width", js.undefined)
  }
  
}

