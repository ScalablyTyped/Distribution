package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRobotApplicationRequest extends StObject {
  
  /**
    * The application information for the robot application.
    */
  var application: Arn
  
  /**
    * The revision id for the robot application.
    */
  var currentRevisionId: js.UndefOr[RevisionId] = js.undefined
  
  /**
    * The robot software suite (ROS distribution) used by the robot application.
    */
  var robotSoftwareSuite: RobotSoftwareSuite
  
  /**
    * The sources of the robot application.
    */
  var sources: SourceConfigs
}
object UpdateRobotApplicationRequest {
  
  inline def apply(application: Arn, robotSoftwareSuite: RobotSoftwareSuite, sources: SourceConfigs): UpdateRobotApplicationRequest = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], robotSoftwareSuite = robotSoftwareSuite.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRobotApplicationRequest]
  }
  
  extension [Self <: UpdateRobotApplicationRequest](x: Self) {
    
    inline def setApplication(value: Arn): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    inline def setCurrentRevisionId(value: RevisionId): Self = StObject.set(x, "currentRevisionId", value.asInstanceOf[js.Any])
    
    inline def setCurrentRevisionIdUndefined: Self = StObject.set(x, "currentRevisionId", js.undefined)
    
    inline def setRobotSoftwareSuite(value: RobotSoftwareSuite): Self = StObject.set(x, "robotSoftwareSuite", value.asInstanceOf[js.Any])
    
    inline def setSources(value: SourceConfigs): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesVarargs(value: SourceConfig*): Self = StObject.set(x, "sources", js.Array(value :_*))
  }
}
