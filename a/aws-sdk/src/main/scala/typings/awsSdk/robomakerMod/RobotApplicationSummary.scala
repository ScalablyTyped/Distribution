package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RobotApplicationSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the robot.
    */
  var arn: js.UndefOr[Arn] = js.native
  
  /**
    * The time, in milliseconds since the epoch, when the robot application was last updated.
    */
  var lastUpdatedAt: js.UndefOr[LastUpdatedAt] = js.native
  
  /**
    * The name of the robot application.
    */
  var name: js.UndefOr[Name] = js.native
  
  /**
    * Information about a robot software suite (ROS distribution).
    */
  var robotSoftwareSuite: js.UndefOr[RobotSoftwareSuite] = js.native
  
  /**
    * The version of the robot application.
    */
  var version: js.UndefOr[Version] = js.native
}
object RobotApplicationSummary {
  
  @scala.inline
  def apply(): RobotApplicationSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RobotApplicationSummary]
  }
  
  @scala.inline
  implicit class RobotApplicationSummaryMutableBuilder[Self <: RobotApplicationSummary] (val x: Self) extends AnyVal {
    
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
    def setRobotSoftwareSuite(value: RobotSoftwareSuite): Self = StObject.set(x, "robotSoftwareSuite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRobotSoftwareSuiteUndefined: Self = StObject.set(x, "robotSoftwareSuite", js.undefined)
    
    @scala.inline
    def setVersion(value: Version): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
