package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeConfigurationSetRequest extends StObject {
  
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
  implicit class DescribeConfigurationSetRequestMutableBuilder[Self <: DescribeConfigurationSetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationSetAttributeNames(value: ConfigurationSetAttributeList): Self = StObject.set(x, "ConfigurationSetAttributeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationSetAttributeNamesUndefined: Self = StObject.set(x, "ConfigurationSetAttributeNames", js.undefined)
    
    @scala.inline
    def setConfigurationSetAttributeNamesVarargs(value: ConfigurationSetAttribute*): Self = StObject.set(x, "ConfigurationSetAttributeNames", js.Array(value :_*))
    
    @scala.inline
    def setConfigurationSetName(value: ConfigurationSetName): Self = StObject.set(x, "ConfigurationSetName", value.asInstanceOf[js.Any])
  }
}
