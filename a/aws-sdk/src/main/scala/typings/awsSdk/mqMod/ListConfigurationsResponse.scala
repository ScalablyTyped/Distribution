package typings.awsSdk.mqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListConfigurationsResponse extends StObject {
  
  /**
    * The list of all revisions for the specified configuration.
    */
  var Configurations: js.UndefOr[listOfConfiguration] = js.undefined
  
  /**
    * The maximum number of configurations that Amazon MQ can return per page (20 by default). This value must be an integer from 5 to 100.
    */
  var MaxResults: js.UndefOr[integer] = js.undefined
  
  /**
    * The token that specifies the next page of results Amazon MQ should return. To request the first page, leave nextToken empty.
    */
  var NextToken: js.UndefOr[string] = js.undefined
}
object ListConfigurationsResponse {
  
  @scala.inline
  def apply(): ListConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListConfigurationsResponse]
  }
  
  @scala.inline
  implicit class ListConfigurationsResponseMutableBuilder[Self <: ListConfigurationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurations(value: listOfConfiguration): Self = StObject.set(x, "Configurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationsUndefined: Self = StObject.set(x, "Configurations", js.undefined)
    
    @scala.inline
    def setConfigurationsVarargs(value: Configuration*): Self = StObject.set(x, "Configurations", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: integer): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
