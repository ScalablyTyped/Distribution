package typings.awsSdkClientS3Node.typesCorsconfigurationMod

import typings.awsSdkClientS3Node.typesCorsruleMod.UnmarshalledCORSRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledCORSConfiguration extends CORSConfiguration {
  /**
    * _CORSRules shape
    */
  @JSName("CORSRules")
  var CORSRules_UnmarshalledCORSConfiguration: js.Array[UnmarshalledCORSRule]
}

object UnmarshalledCORSConfiguration {
  @scala.inline
  def apply(CORSRules: js.Array[UnmarshalledCORSRule]): UnmarshalledCORSConfiguration = {
    val __obj = js.Dynamic.literal(CORSRules = CORSRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledCORSConfiguration]
  }
}

