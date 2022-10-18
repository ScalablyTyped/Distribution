package typings.awsSdk.clientsSupportappMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSlackChannelConfigurationsResult extends StObject {
  
  /**
    * The point where pagination should resume when the response returns only partial results.
    */
  var nextToken: js.UndefOr[paginationToken] = js.undefined
  
  /**
    * The configurations for a Slack channel.
    */
  var slackChannelConfigurations: slackChannelConfigurationList
}
object ListSlackChannelConfigurationsResult {
  
  inline def apply(slackChannelConfigurations: slackChannelConfigurationList): ListSlackChannelConfigurationsResult = {
    val __obj = js.Dynamic.literal(slackChannelConfigurations = slackChannelConfigurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSlackChannelConfigurationsResult]
  }
  
  extension [Self <: ListSlackChannelConfigurationsResult](x: Self) {
    
    inline def setNextToken(value: paginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSlackChannelConfigurations(value: slackChannelConfigurationList): Self = StObject.set(x, "slackChannelConfigurations", value.asInstanceOf[js.Any])
    
    inline def setSlackChannelConfigurationsVarargs(value: SlackChannelConfiguration*): Self = StObject.set(x, "slackChannelConfigurations", js.Array(value*))
  }
}
