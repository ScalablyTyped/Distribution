package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListConfigurationSetsResponse extends StObject {
  
  /**
    * An array that contains all of the configuration sets in your Amazon SES account in the current AWS Region.
    */
  var ConfigurationSets: js.UndefOr[ConfigurationSetNameList] = js.undefined
  
  /**
    * A token that indicates that there are additional configuration sets to list. To view additional configuration sets, issue another request to ListConfigurationSets, and pass this token in the NextToken parameter.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sesv2Mod.NextToken] = js.undefined
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
    def setConfigurationSets(value: ConfigurationSetNameList): Self = StObject.set(x, "ConfigurationSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationSetsUndefined: Self = StObject.set(x, "ConfigurationSets", js.undefined)
    
    @scala.inline
    def setConfigurationSetsVarargs(value: ConfigurationSetName*): Self = StObject.set(x, "ConfigurationSets", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
