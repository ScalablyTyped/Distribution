package typings.awsSdk.daxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParameterGroup extends js.Object {
  /**
    * A description of the parameter group.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The name of the parameter group.
    */
  var ParameterGroupName: js.UndefOr[String] = js.native
}

object ParameterGroup {
  @scala.inline
  def apply(Description: String = null, ParameterGroupName: String = null): ParameterGroup = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (ParameterGroupName != null) __obj.updateDynamic("ParameterGroupName")(ParameterGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterGroup]
  }
}

