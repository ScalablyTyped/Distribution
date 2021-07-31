package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Greengrass extends StObject {
  
  /**
    * The ARN of the Greengrass group. For more information about how to find a group's ARN, see ListGroups and GetGroup in the AWS IoT Greengrass API Reference.
    */
  var groupArn: ARN
}
object Greengrass {
  
  @scala.inline
  def apply(groupArn: ARN): Greengrass = {
    val __obj = js.Dynamic.literal(groupArn = groupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Greengrass]
  }
  
  @scala.inline
  implicit class GreengrassMutableBuilder[Self <: Greengrass] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupArn(value: ARN): Self = StObject.set(x, "groupArn", value.asInstanceOf[js.Any])
  }
}
