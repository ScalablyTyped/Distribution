package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateRobotApplicationRequest extends StObject {
  
  /**
    * The application information for the robot application.
    */
  var application: Arn = js.native
  
  /**
    * The revision id for the robot application.
    */
  var currentRevisionId: js.UndefOr[RevisionId] = js.native
  
  /**
    * The robot software suite (ROS distribution) used by the robot application.
    */
  var robotSoftwareSuite: RobotSoftwareSuite = js.native
  
  /**
    * The sources of the robot application.
    */
  var sources: SourceConfigs = js.native
}
object UpdateRobotApplicationRequest {
  
  @scala.inline
  def apply(application: Arn, robotSoftwareSuite: RobotSoftwareSuite, sources: SourceConfigs): UpdateRobotApplicationRequest = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], robotSoftwareSuite = robotSoftwareSuite.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRobotApplicationRequest]
  }
  
  @scala.inline
  implicit class UpdateRobotApplicationRequestMutableBuilder[Self <: UpdateRobotApplicationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Arn): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentRevisionId(value: RevisionId): Self = StObject.set(x, "currentRevisionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentRevisionIdUndefined: Self = StObject.set(x, "currentRevisionId", js.undefined)
    
    @scala.inline
    def setRobotSoftwareSuite(value: RobotSoftwareSuite): Self = StObject.set(x, "robotSoftwareSuite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSources(value: SourceConfigs): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcesVarargs(value: SourceConfig*): Self = StObject.set(x, "sources", js.Array(value :_*))
  }
}
