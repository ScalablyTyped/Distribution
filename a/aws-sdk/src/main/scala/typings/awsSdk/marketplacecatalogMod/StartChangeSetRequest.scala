package typings.awsSdk.marketplacecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartChangeSetRequest extends StObject {
  
  /**
    * The catalog related to the request. Fixed value: AWSMarketplace 
    */
  var Catalog: typings.awsSdk.marketplacecatalogMod.Catalog = js.native
  
  /**
    * Array of change object.
    */
  var ChangeSet: RequestedChangeList = js.native
  
  /**
    * Optional case sensitive string of up to 100 ASCII characters. The change set name can be used to filter the list of change sets. 
    */
  var ChangeSetName: js.UndefOr[typings.awsSdk.marketplacecatalogMod.ChangeSetName] = js.native
  
  /**
    * A unique token to identify the request to ensure idempotency.
    */
  var ClientRequestToken: js.UndefOr[typings.awsSdk.marketplacecatalogMod.ClientRequestToken] = js.native
}
object StartChangeSetRequest {
  
  @scala.inline
  def apply(Catalog: Catalog, ChangeSet: RequestedChangeList): StartChangeSetRequest = {
    val __obj = js.Dynamic.literal(Catalog = Catalog.asInstanceOf[js.Any], ChangeSet = ChangeSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartChangeSetRequest]
  }
  
  @scala.inline
  implicit class StartChangeSetRequestMutableBuilder[Self <: StartChangeSetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatalog(value: Catalog): Self = StObject.set(x, "Catalog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeSet(value: RequestedChangeList): Self = StObject.set(x, "ChangeSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeSetName(value: ChangeSetName): Self = StObject.set(x, "ChangeSetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeSetNameUndefined: Self = StObject.set(x, "ChangeSetName", js.undefined)
    
    @scala.inline
    def setChangeSetVarargs(value: Change*): Self = StObject.set(x, "ChangeSet", js.Array(value :_*))
    
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
  }
}
