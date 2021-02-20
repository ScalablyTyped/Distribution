package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateRobotApplicationRequest extends StObject {
  
  /**
    * The name of the robot application.
    */
  var name: Name = js.native
  
  /**
    * The robot software suite (ROS distribuition) used by the robot application.
    */
  var robotSoftwareSuite: RobotSoftwareSuite = js.native
  
  /**
    * The sources of the robot application.
    */
  var sources: SourceConfigs = js.native
  
  /**
    * A map that contains tag keys and tag values that are attached to the robot application.
    */
  var tags: js.UndefOr[TagMap] = js.native
}
object CreateRobotApplicationRequest {
  
  @scala.inline
  def apply(name: Name, robotSoftwareSuite: RobotSoftwareSuite, sources: SourceConfigs): CreateRobotApplicationRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], robotSoftwareSuite = robotSoftwareSuite.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRobotApplicationRequest]
  }
  
  @scala.inline
  implicit class CreateRobotApplicationRequestMutableBuilder[Self <: CreateRobotApplicationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRobotSoftwareSuite(value: RobotSoftwareSuite): Self = StObject.set(x, "robotSoftwareSuite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSources(value: SourceConfigs): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcesVarargs(value: SourceConfig*): Self = StObject.set(x, "sources", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
