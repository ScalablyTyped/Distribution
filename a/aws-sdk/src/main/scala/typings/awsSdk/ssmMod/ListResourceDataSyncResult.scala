package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListResourceDataSyncResult extends StObject {
  
  /**
    * The token for the next set of items to return. Use this token to get the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
  
  /**
    * A list of your current Resource Data Sync configurations and their statuses.
    */
  var ResourceDataSyncItems: js.UndefOr[ResourceDataSyncItemList] = js.native
}
object ListResourceDataSyncResult {
  
  @scala.inline
  def apply(): ListResourceDataSyncResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResourceDataSyncResult]
  }
  
  @scala.inline
  implicit class ListResourceDataSyncResultMutableBuilder[Self <: ListResourceDataSyncResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setResourceDataSyncItems(value: ResourceDataSyncItemList): Self = StObject.set(x, "ResourceDataSyncItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceDataSyncItemsUndefined: Self = StObject.set(x, "ResourceDataSyncItems", js.undefined)
    
    @scala.inline
    def setResourceDataSyncItemsVarargs(value: ResourceDataSyncItem*): Self = StObject.set(x, "ResourceDataSyncItems", js.Array(value :_*))
  }
}
