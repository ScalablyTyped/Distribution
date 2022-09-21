package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListConfigurationSetsResponse extends StObject {
  
  /**
    * A list of configuration sets.
    */
  var ConfigurationSets: js.UndefOr[typings.awsSdk.sesMod.ConfigurationSets] = js.undefined
  
  /**
    * A token indicating that there are additional configuration sets available to be listed. Pass this token to successive calls of ListConfigurationSets. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.sesMod.NextToken] = js.undefined
}
object ListConfigurationSetsResponse {
  
  inline def apply(): ListConfigurationSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListConfigurationSetsResponse]
  }
  
  extension [Self <: ListConfigurationSetsResponse](x: Self) {
    
    inline def setConfigurationSets(value: ConfigurationSets): Self = StObject.set(x, "ConfigurationSets", value.asInstanceOf[js.Any])
    
    inline def setConfigurationSetsUndefined: Self = StObject.set(x, "ConfigurationSets", js.undefined)
    
    inline def setConfigurationSetsVarargs(value: ConfigurationSet*): Self = StObject.set(x, "ConfigurationSets", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
