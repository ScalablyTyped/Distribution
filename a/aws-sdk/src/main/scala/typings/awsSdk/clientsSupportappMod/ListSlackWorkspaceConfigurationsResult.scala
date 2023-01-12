package typings.awsSdk.clientsSupportappMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSlackWorkspaceConfigurationsResult extends StObject {
  
  /**
    * The point where pagination should resume when the response returns only partial results.
    */
  var nextToken: js.UndefOr[paginationToken] = js.undefined
  
  /**
    * The configurations for a Slack workspace.
    */
  var slackWorkspaceConfigurations: js.UndefOr[SlackWorkspaceConfigurationList] = js.undefined
}
object ListSlackWorkspaceConfigurationsResult {
  
  inline def apply(): ListSlackWorkspaceConfigurationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSlackWorkspaceConfigurationsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSlackWorkspaceConfigurationsResult] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: paginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSlackWorkspaceConfigurations(value: SlackWorkspaceConfigurationList): Self = StObject.set(x, "slackWorkspaceConfigurations", value.asInstanceOf[js.Any])
    
    inline def setSlackWorkspaceConfigurationsUndefined: Self = StObject.set(x, "slackWorkspaceConfigurations", js.undefined)
    
    inline def setSlackWorkspaceConfigurationsVarargs(value: SlackWorkspaceConfiguration*): Self = StObject.set(x, "slackWorkspaceConfigurations", js.Array(value*))
  }
}
