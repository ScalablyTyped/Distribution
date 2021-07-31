package typings.awsSdk.syntheticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanaryRun extends StObject {
  
  /**
    * The location where the canary stored artifacts from the run. Artifacts include the log file, screenshots, and HAR files.
    */
  var ArtifactS3Location: js.UndefOr[String] = js.undefined
  
  /**
    * A unique ID that identifies this canary run.
    */
  var Id: js.UndefOr[UUID] = js.undefined
  
  /**
    * The name of the canary.
    */
  var Name: js.UndefOr[CanaryName] = js.undefined
  
  /**
    * The status of this run.
    */
  var Status: js.UndefOr[CanaryRunStatus] = js.undefined
  
  /**
    * A structure that contains the start and end times of this run.
    */
  var Timeline: js.UndefOr[CanaryRunTimeline] = js.undefined
}
object CanaryRun {
  
  @scala.inline
  def apply(): CanaryRun = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanaryRun]
  }
  
  @scala.inline
  implicit class CanaryRunMutableBuilder[Self <: CanaryRun] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArtifactS3Location(value: String): Self = StObject.set(x, "ArtifactS3Location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtifactS3LocationUndefined: Self = StObject.set(x, "ArtifactS3Location", js.undefined)
    
    @scala.inline
    def setId(value: UUID): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setName(value: CanaryName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setStatus(value: CanaryRunStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setTimeline(value: CanaryRunTimeline): Self = StObject.set(x, "Timeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimelineUndefined: Self = StObject.set(x, "Timeline", js.undefined)
  }
}
