package typings.awsSdk.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateJobRequest extends js.Object {
  /**
    * A section of the request body that provides information about the file that is being transcoded.
    */
  var Input: js.UndefOr[JobInput] = js.native
  /**
    * A section of the request body that provides information about the files that are being transcoded.
    */
  var Inputs: js.UndefOr[JobInputs] = js.native
  /**
    *  A section of the request body that provides information about the transcoded (target) file. We strongly recommend that you use the Outputs syntax instead of the Output syntax. 
    */
  var Output: js.UndefOr[CreateJobOutput] = js.native
  /**
    * The value, if any, that you want Elastic Transcoder to prepend to the names of all files that this job creates, including output files, thumbnails, and playlists.
    */
  var OutputKeyPrefix: js.UndefOr[Key] = js.native
  /**
    *  A section of the request body that provides information about the transcoded (target) files. We recommend that you use the Outputs syntax instead of the Output syntax. 
    */
  var Outputs: js.UndefOr[CreateJobOutputs] = js.native
  /**
    * The Id of the pipeline that you want Elastic Transcoder to use for transcoding. The pipeline determines several settings, including the Amazon S3 bucket from which Elastic Transcoder gets the files to transcode and the bucket into which Elastic Transcoder puts the transcoded files.
    */
  var PipelineId: Id = js.native
  /**
    * If you specify a preset in PresetId for which the value of Container is fmp4 (Fragmented MP4) or ts (MPEG-TS), Playlists contains information about the master playlists that you want Elastic Transcoder to create. The maximum number of master playlists in a job is 30.
    */
  var Playlists: js.UndefOr[CreateJobPlaylists] = js.native
  /**
    * User-defined metadata that you want to associate with an Elastic Transcoder job. You specify metadata in key/value pairs, and you can add up to 10 key/value pairs per job. Elastic Transcoder does not guarantee that key/value pairs are returned in the same order in which you specify them.
    */
  var UserMetadata: js.UndefOr[typings.awsSdk.elastictranscoderMod.UserMetadata] = js.native
}

object CreateJobRequest {
  @scala.inline
  def apply(
    PipelineId: Id,
    Input: JobInput = null,
    Inputs: JobInputs = null,
    Output: CreateJobOutput = null,
    OutputKeyPrefix: Key = null,
    Outputs: CreateJobOutputs = null,
    Playlists: CreateJobPlaylists = null,
    UserMetadata: UserMetadata = null
  ): CreateJobRequest = {
    val __obj = js.Dynamic.literal(PipelineId = PipelineId.asInstanceOf[js.Any])
    if (Input != null) __obj.updateDynamic("Input")(Input.asInstanceOf[js.Any])
    if (Inputs != null) __obj.updateDynamic("Inputs")(Inputs.asInstanceOf[js.Any])
    if (Output != null) __obj.updateDynamic("Output")(Output.asInstanceOf[js.Any])
    if (OutputKeyPrefix != null) __obj.updateDynamic("OutputKeyPrefix")(OutputKeyPrefix.asInstanceOf[js.Any])
    if (Outputs != null) __obj.updateDynamic("Outputs")(Outputs.asInstanceOf[js.Any])
    if (Playlists != null) __obj.updateDynamic("Playlists")(Playlists.asInstanceOf[js.Any])
    if (UserMetadata != null) __obj.updateDynamic("UserMetadata")(UserMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateJobRequest]
  }
}

