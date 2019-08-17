package typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreCORSConfigurationMod

import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreCORSRuleMod._CORSRule
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _CORSConfiguration extends js.Object {
  /**
    * _CORSRules shape
    */
  var CORSRules: js.Array[_CORSRule] | Iterable[_CORSRule]
}

object _CORSConfiguration {
  @scala.inline
  def apply(CORSRules: js.Array[_CORSRule] | Iterable[_CORSRule]): _CORSConfiguration = {
    val __obj = js.Dynamic.literal(CORSRules = CORSRules.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_CORSConfiguration]
  }
}

