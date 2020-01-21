package typings.awsSdk.datapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParameterAttribute extends js.Object {
  /**
    * The field identifier.
    */
  var key: attributeNameString = js.native
  /**
    * The field value, expressed as a String.
    */
  var stringValue: attributeValueString = js.native
}

object ParameterAttribute {
  @scala.inline
  def apply(key: attributeNameString, stringValue: attributeValueString): ParameterAttribute = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], stringValue = stringValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ParameterAttribute]
  }
}

