package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RobotSoftwareSuite extends StObject {
  
  /**
    * The name of the robot software suite (ROS distribution).
    */
  var name: js.UndefOr[RobotSoftwareSuiteType] = js.native
  
  /**
    * The version of the robot software suite (ROS distribution).
    */
  var version: js.UndefOr[RobotSoftwareSuiteVersionType] = js.native
}
object RobotSoftwareSuite {
  
  @scala.inline
  def apply(): RobotSoftwareSuite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RobotSoftwareSuite]
  }
  
  @scala.inline
  implicit class RobotSoftwareSuiteMutableBuilder[Self <: RobotSoftwareSuite] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: RobotSoftwareSuiteType): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setVersion(value: RobotSoftwareSuiteVersionType): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
