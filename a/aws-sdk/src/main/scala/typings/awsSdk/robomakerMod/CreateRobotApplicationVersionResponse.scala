package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRobotApplicationVersionResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the robot application.
    */
  var arn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The time, in milliseconds since the epoch, when the robot application was last updated.
    */
  var lastUpdatedAt: js.UndefOr[LastUpdatedAt] = js.undefined
  
  /**
    * The name of the robot application.
    */
  var name: js.UndefOr[Name] = js.undefined
  
  /**
    * The revision id of the robot application.
    */
  var revisionId: js.UndefOr[RevisionId] = js.undefined
  
  /**
    * The robot software suite (ROS distribution) used by the robot application.
    */
  var robotSoftwareSuite: js.UndefOr[RobotSoftwareSuite] = js.undefined
  
  /**
    * The sources of the robot application.
    */
  var sources: js.UndefOr[Sources] = js.undefined
  
  /**
    * The version of the robot application.
    */
  var version: js.UndefOr[Version] = js.undefined
}
object CreateRobotApplicationVersionResponse {
  
  @scala.inline
  def apply(): CreateRobotApplicationVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRobotApplicationVersionResponse]
  }
  
  @scala.inline
  implicit class CreateRobotApplicationVersionResponseMutableBuilder[Self <: CreateRobotApplicationVersionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setLastUpdatedAt(value: LastUpdatedAt): Self = StObject.set(x, "lastUpdatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedAtUndefined: Self = StObject.set(x, "lastUpdatedAt", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRevisionId(value: RevisionId): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionIdUndefined: Self = StObject.set(x, "revisionId", js.undefined)
    
    @scala.inline
    def setRobotSoftwareSuite(value: RobotSoftwareSuite): Self = StObject.set(x, "robotSoftwareSuite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRobotSoftwareSuiteUndefined: Self = StObject.set(x, "robotSoftwareSuite", js.undefined)
    
    @scala.inline
    def setSources(value: Sources): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    @scala.inline
    def setSourcesVarargs(value: Source*): Self = StObject.set(x, "sources", js.Array(value :_*))
    
    @scala.inline
    def setVersion(value: Version): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
