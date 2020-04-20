package typings.awsSdk.datapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParameterObject extends js.Object {
  /**
    * The attributes of the parameter object.
    */
  var attributes: ParameterAttributeList = js.native
  /**
    * The ID of the parameter object. 
    */
  var id: fieldNameString = js.native
}

object ParameterObject {
  @scala.inline
  def apply(attributes: ParameterAttributeList, id: fieldNameString): ParameterObject = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterObject]
  }
}

