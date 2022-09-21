package typings.awsSdk.pinpointsmsvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListConfigurationSetsResponse extends StObject {
  
  /**
    * An object that contains a list of configuration sets for your account in the current region.
    */
  var ConfigurationSets: js.UndefOr[typings.awsSdk.pinpointsmsvoiceMod.ConfigurationSets] = js.undefined
  
  /**
    * A token returned from a previous call to ListConfigurationSets to indicate the position in the list of configuration sets.
    */
  var NextToken: js.UndefOr[NextTokenString] = js.undefined
}
object ListConfigurationSetsResponse {
  
  inline def apply(): ListConfigurationSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListConfigurationSetsResponse]
  }
  
  extension [Self <: ListConfigurationSetsResponse](x: Self) {
    
    inline def setConfigurationSets(value: ConfigurationSets): Self = StObject.set(x, "ConfigurationSets", value.asInstanceOf[js.Any])
    
    inline def setConfigurationSetsUndefined: Self = StObject.set(x, "ConfigurationSets", js.undefined)
    
    inline def setConfigurationSetsVarargs(value: WordCharactersWithDelimiters*): Self = StObject.set(x, "ConfigurationSets", js.Array(value*))
    
    inline def setNextToken(value: NextTokenString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
