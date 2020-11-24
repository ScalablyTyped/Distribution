package typings.awsSdk.syntheticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanaryRun extends js.Object {
  
  /**
    * The location where the canary stored artifacts from the run. Artifacts include the log file, screenshots, and HAR files.
    */
  var ArtifactS3Location: js.UndefOr[String] = js.native
  
  /**
    * A unique ID that identifies this canary run.
    */
  var Id: js.UndefOr[UUID] = js.native
  
  /**
    * The name of the canary.
    */
  var Name: js.UndefOr[CanaryName] = js.native
  
  /**
    * The status of this run.
    */
  var Status: js.UndefOr[CanaryRunStatus] = js.native
  
  /**
    * A structure that contains the start and end times of this run.
    */
  var Timeline: js.UndefOr[CanaryRunTimeline] = js.native
}
object CanaryRun {
  
  @scala.inline
  def apply(): CanaryRun = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanaryRun]
  }
  
  @scala.inline
  implicit class CanaryRunOps[Self <: CanaryRun] (val x: Self) extends AnyVal {
    
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
    def setArtifactS3Location(value: String): Self = this.set("ArtifactS3Location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArtifactS3Location: Self = this.set("ArtifactS3Location", js.undefined)
    
    @scala.inline
    def setId(value: UUID): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
    @scala.inline
    def setName(value: CanaryName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setStatus(value: CanaryRunStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setTimeline(value: CanaryRunTimeline): Self = this.set("Timeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeline: Self = this.set("Timeline", js.undefined)
  }
}
