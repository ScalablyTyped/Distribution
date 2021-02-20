package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateRobotRequest extends StObject {
  
  /**
    * The target architecture of the robot.
    */
  var architecture: Architecture = js.native
  
  /**
    * The Greengrass group id.
    */
  var greengrassGroupId: Id = js.native
  
  /**
    * The name for the robot.
    */
  var name: Name = js.native
  
  /**
    * A map that contains tag keys and tag values that are attached to the robot.
    */
  var tags: js.UndefOr[TagMap] = js.native
}
object CreateRobotRequest {
  
  @scala.inline
  def apply(architecture: Architecture, greengrassGroupId: Id, name: Name): CreateRobotRequest = {
    val __obj = js.Dynamic.literal(architecture = architecture.asInstanceOf[js.Any], greengrassGroupId = greengrassGroupId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRobotRequest]
  }
  
  @scala.inline
  implicit class CreateRobotRequestMutableBuilder[Self <: CreateRobotRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArchitecture(value: Architecture): Self = StObject.set(x, "architecture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGreengrassGroupId(value: Id): Self = StObject.set(x, "greengrassGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
