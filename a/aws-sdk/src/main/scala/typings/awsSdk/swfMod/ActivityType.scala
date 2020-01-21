package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivityType extends js.Object {
  /**
    * The name of this activity.  The combination of activity type name and version must be unique within a domain. 
    */
  var name: Name = js.native
  /**
    * The version of this activity.  The combination of activity type name and version must be unique with in a domain. 
    */
  var version: Version = js.native
}

object ActivityType {
  @scala.inline
  def apply(name: Name, version: Version): ActivityType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ActivityType]
  }
}

