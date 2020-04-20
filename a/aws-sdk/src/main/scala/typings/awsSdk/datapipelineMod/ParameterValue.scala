package typings.awsSdk.datapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParameterValue extends js.Object {
  /**
    * The ID of the parameter value.
    */
  var id: fieldNameString = js.native
  /**
    * The field value, expressed as a String.
    */
  var stringValue: fieldStringValue = js.native
}

object ParameterValue {
  @scala.inline
  def apply(id: fieldNameString, stringValue: fieldStringValue): ParameterValue = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], stringValue = stringValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterValue]
  }
}

