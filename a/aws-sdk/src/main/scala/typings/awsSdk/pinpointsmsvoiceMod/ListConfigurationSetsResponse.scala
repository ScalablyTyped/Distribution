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
  
  @scala.inline
  def apply(): ListConfigurationSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListConfigurationSetsResponse]
  }
  
  @scala.inline
  implicit class ListConfigurationSetsResponseMutableBuilder[Self <: ListConfigurationSetsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationSets(value: ConfigurationSets): Self = StObject.set(x, "ConfigurationSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationSetsUndefined: Self = StObject.set(x, "ConfigurationSets", js.undefined)
    
    @scala.inline
    def setConfigurationSetsVarargs(value: WordCharactersWithDelimiters*): Self = StObject.set(x, "ConfigurationSets", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextTokenString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
