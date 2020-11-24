package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeConfigurationSetRequest extends js.Object {
  
  /**
    * A list of configuration set attributes to return.
    */
  var ConfigurationSetAttributeNames: js.UndefOr[ConfigurationSetAttributeList] = js.native
  
  /**
    * The name of the configuration set to describe.
    */
  var ConfigurationSetName: typings.awsSdk.sesMod.ConfigurationSetName = js.native
}
object DescribeConfigurationSetRequest {
  
  @scala.inline
  def apply(ConfigurationSetName: ConfigurationSetName): DescribeConfigurationSetRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeConfigurationSetRequest]
  }
  
  @scala.inline
  implicit class DescribeConfigurationSetRequestOps[Self <: DescribeConfigurationSetRequest] (val x: Self) extends AnyVal {
    
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
    def setConfigurationSetName(value: ConfigurationSetName): Self = this.set("ConfigurationSetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationSetAttributeNamesVarargs(value: ConfigurationSetAttribute*): Self = this.set("ConfigurationSetAttributeNames", js.Array(value :_*))
    
    @scala.inline
    def setConfigurationSetAttributeNames(value: ConfigurationSetAttributeList): Self = this.set("ConfigurationSetAttributeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigurationSetAttributeNames: Self = this.set("ConfigurationSetAttributeNames", js.undefined)
  }
}
