package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fmp4HlsSettings extends js.Object {
  /**
    * List all the audio groups that are used with the video output stream. Input all the audio GROUP-IDs that are associated to the video, separate by ','.
    */
  var AudioRenditionSets: js.UndefOr[string] = js.native
  /**
    * If set to passthrough, Nielsen inaudible tones for media tracking will be detected in the input audio and an equivalent ID3 tag will be inserted in the output.
    */
  var NielsenId3Behavior: js.UndefOr[Fmp4NielsenId3Behavior] = js.native
  /**
    * When set to passthrough, timed metadata is passed through from input to output.
    */
  var TimedMetadataBehavior: js.UndefOr[Fmp4TimedMetadataBehavior] = js.native
}

object Fmp4HlsSettings {
  @scala.inline
  def apply(
    AudioRenditionSets: string = null,
    NielsenId3Behavior: Fmp4NielsenId3Behavior = null,
    TimedMetadataBehavior: Fmp4TimedMetadataBehavior = null
  ): Fmp4HlsSettings = {
    val __obj = js.Dynamic.literal()
    if (AudioRenditionSets != null) __obj.updateDynamic("AudioRenditionSets")(AudioRenditionSets.asInstanceOf[js.Any])
    if (NielsenId3Behavior != null) __obj.updateDynamic("NielsenId3Behavior")(NielsenId3Behavior.asInstanceOf[js.Any])
    if (TimedMetadataBehavior != null) __obj.updateDynamic("TimedMetadataBehavior")(TimedMetadataBehavior.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fmp4HlsSettings]
  }
}

