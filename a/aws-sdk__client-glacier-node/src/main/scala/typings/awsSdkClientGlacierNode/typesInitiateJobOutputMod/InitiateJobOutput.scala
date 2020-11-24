package typings.awsSdkClientGlacierNode.typesInitiateJobOutputMod

import typings.awsSdkClientGlacierNode.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitiateJobOutput extends _OutputTypesUnion {
  
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  
  /**
    * <p>The ID of the job.</p>
    */
  var jobId: js.UndefOr[String] = js.native
  
  /**
    * <p>The path to the location of where the select results are stored.</p>
    */
  var jobOutputPath: js.UndefOr[String] = js.native
  
  /**
    * <p>The relative URI path of the job.</p>
    */
  var location: js.UndefOr[String] = js.native
}
object InitiateJobOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata): InitiateJobOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitiateJobOutput]
  }
  
  @scala.inline
  implicit class InitiateJobOutputOps[Self <: InitiateJobOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set$metadata(value: ResponseMetadata): Self = this.set("$metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobId(value: String): Self = this.set("jobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobId: Self = this.set("jobId", js.undefined)
    
    @scala.inline
    def setJobOutputPath(value: String): Self = this.set("jobOutputPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobOutputPath: Self = this.set("jobOutputPath", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
  }
}
