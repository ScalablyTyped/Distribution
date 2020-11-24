package typings.awsSdk.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(PipelineId: Id): CreateJobRequest = {
    val __obj = js.Dynamic.literal(PipelineId = PipelineId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateJobRequest]
  }
  
  @scala.inline
  implicit class CreateJobRequestOps[Self <: CreateJobRequest] (val x: Self) extends AnyVal {
    
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
    def setPipelineId(value: Id): Self = this.set("PipelineId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInput(value: JobInput): Self = this.set("Input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInput: Self = this.set("Input", js.undefined)
    
    @scala.inline
    def setInputsVarargs(value: JobInput*): Self = this.set("Inputs", js.Array(value :_*))
    
    @scala.inline
    def setInputs(value: JobInputs): Self = this.set("Inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputs: Self = this.set("Inputs", js.undefined)
    
    @scala.inline
    def setOutput(value: CreateJobOutput): Self = this.set("Output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutput: Self = this.set("Output", js.undefined)
    
    @scala.inline
    def setOutputKeyPrefix(value: Key): Self = this.set("OutputKeyPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputKeyPrefix: Self = this.set("OutputKeyPrefix", js.undefined)
    
    @scala.inline
    def setOutputsVarargs(value: CreateJobOutput*): Self = this.set("Outputs", js.Array(value :_*))
    
    @scala.inline
    def setOutputs(value: CreateJobOutputs): Self = this.set("Outputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputs: Self = this.set("Outputs", js.undefined)
    
    @scala.inline
    def setPlaylistsVarargs(value: CreateJobPlaylist*): Self = this.set("Playlists", js.Array(value :_*))
    
    @scala.inline
    def setPlaylists(value: CreateJobPlaylists): Self = this.set("Playlists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaylists: Self = this.set("Playlists", js.undefined)
    
    @scala.inline
    def setUserMetadata(value: UserMetadata): Self = this.set("UserMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserMetadata: Self = this.set("UserMetadata", js.undefined)
  }
}
