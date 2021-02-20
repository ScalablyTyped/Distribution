package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListConfigurationSetsRequest extends StObject {
  
  /**
    * The number of configuration sets to return.
    */
  var MaxItems: js.UndefOr[typings.awsSdk.sesMod.MaxItems] = js.native
  
  /**
    * A token returned from a previous call to ListConfigurationSets to indicate the position of the configuration set in the configuration set list.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sesMod.NextToken] = js.native
}
object ListConfigurationSetsRequest {
  
  @scala.inline
  def apply(): ListConfigurationSetsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListConfigurationSetsRequest]
  }
  
  @scala.inline
  implicit class ListConfigurationSetsRequestMutableBuilder[Self <: ListConfigurationSetsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxItems(value: MaxItems): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxItemsUndefined: Self = StObject.set(x, "MaxItems", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
