package typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreCORSConfigurationMod

import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreCORSRuleMod._UnmarshalledCORSRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledCORSConfiguration extends _CORSConfiguration {
  /**
    * _CORSRules shape
    */
  @JSName("CORSRules")
  var CORSRules__UnmarshalledCORSConfiguration: js.Array[_UnmarshalledCORSRule]
}

object _UnmarshalledCORSConfiguration {
  @scala.inline
  def apply(CORSRules: js.Array[_UnmarshalledCORSRule]): _UnmarshalledCORSConfiguration = {
    val __obj = js.Dynamic.literal(CORSRules = CORSRules.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_UnmarshalledCORSConfiguration]
  }
}

