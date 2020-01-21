package typings.awsSdk.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CaptionFormat extends js.Object {
  /**
    * The encryption settings, if any, that you want Elastic Transcoder to apply to your caption formats.
    */
  var Encryption: js.UndefOr[typings.awsSdk.elastictranscoderMod.Encryption] = js.native
  /**
    * The format you specify determines whether Elastic Transcoder generates an embedded or sidecar caption for this output.    Valid Embedded Caption Formats:     for FLAC: None    For MP3: None    For MP4: mov-text    For MPEG-TS: None    For ogg: None    For webm: None      Valid Sidecar Caption Formats: Elastic Transcoder supports dfxp (first div element only), scc, srt, and webvtt. If you want ttml or smpte-tt compatible captions, specify dfxp as your output format.    For FMP4: dfxp    Non-FMP4 outputs: All sidecar types    fmp4 captions have an extension of .ismt   
    */
  var Format: js.UndefOr[CaptionFormatFormat] = js.native
  /**
    * The prefix for caption filenames, in the form description-{language}, where:    description is a description of the video.    {language} is a literal value that Elastic Transcoder replaces with the two- or three-letter code for the language of the caption in the output file names.   If you don't include {language} in the file name pattern, Elastic Transcoder automatically appends "{language}" to the value that you specify for the description. In addition, Elastic Transcoder automatically appends the count to the end of the segment files. For example, suppose you're transcoding into srt format. When you enter "Sydney-{language}-sunrise", and the language of the captions is English (en), the name of the first caption file is be Sydney-en-sunrise00000.srt.
    */
  var Pattern: js.UndefOr[CaptionFormatPattern] = js.native
}

object CaptionFormat {
  @scala.inline
  def apply(
    Encryption: Encryption = null,
    Format: CaptionFormatFormat = null,
    Pattern: CaptionFormatPattern = null
  ): CaptionFormat = {
    val __obj = js.Dynamic.literal()
    if (Encryption != null) __obj.updateDynamic("Encryption")(Encryption.asInstanceOf[js.Any])
    if (Format != null) __obj.updateDynamic("Format")(Format.asInstanceOf[js.Any])
    if (Pattern != null) __obj.updateDynamic("Pattern")(Pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptionFormat]
  }
}

