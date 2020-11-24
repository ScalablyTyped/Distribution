package typings.awsSdk.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Job extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) for the job.
    */
  var Arn: js.UndefOr[String] = js.native
  
  /**
    * The identifier that Elastic Transcoder assigned to the job. You use this value to get settings for the job or to delete the job.
    */
  var Id: js.UndefOr[typings.awsSdk.elastictranscoderMod.Id] = js.native
  
  /**
    * A section of the request or response body that provides information about the file that is being transcoded.
    */
  var Input: js.UndefOr[JobInput] = js.native
  
  /**
    * Information about the files that you're transcoding. If you specified multiple files for this job, Elastic Transcoder stitches the files together to make one output.
    */
  var Inputs: js.UndefOr[JobInputs] = js.native
  
  /**
    * If you specified one output for a job, information about that output. If you specified multiple outputs for a job, the Output object lists information about the first output. This duplicates the information that is listed for the first output in the Outputs object.  Outputs recommended instead.  A section of the request or response body that provides information about the transcoded (target) file. 
    */
  var Output: js.UndefOr[JobOutput] = js.native
  
  /**
    * The value, if any, that you want Elastic Transcoder to prepend to the names of all files that this job creates, including output files, thumbnails, and playlists. We recommend that you add a / or some other delimiter to the end of the OutputKeyPrefix.
    */
  var OutputKeyPrefix: js.UndefOr[Key] = js.native
  
  /**
    * Information about the output files. We recommend that you use the Outputs syntax for all jobs, even when you want Elastic Transcoder to transcode a file into only one format. Do not use both the Outputs and Output syntaxes in the same request. You can create a maximum of 30 outputs per job.  If you specify more than one output for a job, Elastic Transcoder creates the files for each output in the order in which you specify them in the job.
    */
  var Outputs: js.UndefOr[JobOutputs] = js.native
  
  /**
    *  The Id of the pipeline that you want Elastic Transcoder to use for transcoding. The pipeline determines several settings, including the Amazon S3 bucket from which Elastic Transcoder gets the files to transcode and the bucket into which Elastic Transcoder puts the transcoded files. 
    */
  var PipelineId: js.UndefOr[Id] = js.native
  
  /**
    *  Outputs in Fragmented MP4 or MPEG-TS format only.  If you specify a preset in PresetId for which the value of Container is fmp4 (Fragmented MP4) or ts (MPEG-TS), Playlists contains information about the master playlists that you want Elastic Transcoder to create. The maximum number of master playlists in a job is 30.
    */
  var Playlists: js.UndefOr[typings.awsSdk.elastictranscoderMod.Playlists] = js.native
  
  /**
    *  The status of the job: Submitted, Progressing, Complete, Canceled, or Error. 
    */
  var Status: js.UndefOr[JobStatus] = js.native
  
  /**
    * Details about the timing of a job.
    */
  var Timing: js.UndefOr[typings.awsSdk.elastictranscoderMod.Timing] = js.native
  
  /**
    * User-defined metadata that you want to associate with an Elastic Transcoder job. You specify metadata in key/value pairs, and you can add up to 10 key/value pairs per job. Elastic Transcoder does not guarantee that key/value pairs are returned in the same order in which you specify them. Metadata keys and values must use characters from the following list:    0-9     A-Z and a-z     Space    The following symbols: _.:/=+-%@   
    */
  var UserMetadata: js.UndefOr[typings.awsSdk.elastictranscoderMod.UserMetadata] = js.native
}
object Job {
  
  @scala.inline
  def apply(): Job = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Job]
  }
  
  @scala.inline
  implicit class JobOps[Self <: Job] (val x: Self) extends AnyVal {
    
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
    def setArn(value: String): Self = this.set("Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    
    @scala.inline
    def setId(value: Id): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
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
    def setOutput(value: JobOutput): Self = this.set("Output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutput: Self = this.set("Output", js.undefined)
    
    @scala.inline
    def setOutputKeyPrefix(value: Key): Self = this.set("OutputKeyPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputKeyPrefix: Self = this.set("OutputKeyPrefix", js.undefined)
    
    @scala.inline
    def setOutputsVarargs(value: JobOutput*): Self = this.set("Outputs", js.Array(value :_*))
    
    @scala.inline
    def setOutputs(value: JobOutputs): Self = this.set("Outputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputs: Self = this.set("Outputs", js.undefined)
    
    @scala.inline
    def setPipelineId(value: Id): Self = this.set("PipelineId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePipelineId: Self = this.set("PipelineId", js.undefined)
    
    @scala.inline
    def setPlaylistsVarargs(value: Playlist*): Self = this.set("Playlists", js.Array(value :_*))
    
    @scala.inline
    def setPlaylists(value: Playlists): Self = this.set("Playlists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaylists: Self = this.set("Playlists", js.undefined)
    
    @scala.inline
    def setStatus(value: JobStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setTiming(value: Timing): Self = this.set("Timing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTiming: Self = this.set("Timing", js.undefined)
    
    @scala.inline
    def setUserMetadata(value: UserMetadata): Self = this.set("UserMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserMetadata: Self = this.set("UserMetadata", js.undefined)
  }
}
