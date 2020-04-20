package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkflowType extends js.Object {
  /**
    *  The name of the workflow type.  The combination of workflow type name and version must be unique with in a domain. 
    */
  var name: Name = js.native
  /**
    *  The version of the workflow type.  The combination of workflow type name and version must be unique with in a domain. 
    */
  var version: Version = js.native
}

object WorkflowType {
  @scala.inline
  def apply(name: Name, version: Version): WorkflowType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowType]
  }
}

