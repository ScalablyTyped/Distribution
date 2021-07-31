package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicRuleDestinationConfiguration extends StObject {
  
  /**
    * Configuration of the HTTP URL.
    */
  var httpUrlConfiguration: js.UndefOr[HttpUrlDestinationConfiguration] = js.undefined
}
object TopicRuleDestinationConfiguration {
  
  @scala.inline
  def apply(): TopicRuleDestinationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopicRuleDestinationConfiguration]
  }
  
  @scala.inline
  implicit class TopicRuleDestinationConfigurationMutableBuilder[Self <: TopicRuleDestinationConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHttpUrlConfiguration(value: HttpUrlDestinationConfiguration): Self = StObject.set(x, "httpUrlConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpUrlConfigurationUndefined: Self = StObject.set(x, "httpUrlConfiguration", js.undefined)
  }
}
