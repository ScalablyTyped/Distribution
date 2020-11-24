package typings.awsSdkClientS3Node.typesCorsconfigurationMod

import typings.awsSdkClientS3Node.typesCorsruleMod.UnmarshalledCORSRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledCORSConfiguration extends CORSConfiguration {
  
  /**
    * _CORSRules shape
    */
  @JSName("CORSRules")
  var CORSRules_UnmarshalledCORSConfiguration: js.Array[UnmarshalledCORSRule] = js.native
}
object UnmarshalledCORSConfiguration {
  
  @scala.inline
  def apply(CORSRules: js.Array[UnmarshalledCORSRule]): UnmarshalledCORSConfiguration = {
    val __obj = js.Dynamic.literal(CORSRules = CORSRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledCORSConfiguration]
  }
  
  @scala.inline
  implicit class UnmarshalledCORSConfigurationOps[Self <: UnmarshalledCORSConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCORSRulesVarargs(value: UnmarshalledCORSRule*): Self = this.set("CORSRules", js.Array(value :_*))
    
    @scala.inline
    def setCORSRules(value: js.Array[UnmarshalledCORSRule]): Self = this.set("CORSRules", value.asInstanceOf[js.Any])
  }
}
