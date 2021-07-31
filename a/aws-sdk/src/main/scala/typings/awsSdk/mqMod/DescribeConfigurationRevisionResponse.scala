package typings.awsSdk.mqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeConfigurationRevisionResponse extends StObject {
  
  /**
    * Required. The unique ID that Amazon MQ generates for the configuration.
    */
  var ConfigurationId: js.UndefOr[string] = js.undefined
  
  /**
    * Required. The date and time of the configuration.
    */
  var Created: js.UndefOr[timestampIso8601] = js.undefined
  
  /**
    * Required. The base64-encoded XML configuration.
    */
  var Data: js.UndefOr[string] = js.undefined
  
  /**
    * The description of the configuration.
    */
  var Description: js.UndefOr[string] = js.undefined
}
object DescribeConfigurationRevisionResponse {
  
  @scala.inline
  def apply(): DescribeConfigurationRevisionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConfigurationRevisionResponse]
  }
  
  @scala.inline
  implicit class DescribeConfigurationRevisionResponseMutableBuilder[Self <: DescribeConfigurationRevisionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationId(value: string): Self = StObject.set(x, "ConfigurationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationIdUndefined: Self = StObject.set(x, "ConfigurationId", js.undefined)
    
    @scala.inline
    def setCreated(value: timestampIso8601): Self = StObject.set(x, "Created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedUndefined: Self = StObject.set(x, "Created", js.undefined)
    
    @scala.inline
    def setData(value: string): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "Data", js.undefined)
    
    @scala.inline
    def setDescription(value: string): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
  }
}
