package typings.awsSdk.marketplacecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartChangeSetRequest extends js.Object {
  
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
  implicit class StartChangeSetRequestOps[Self <: StartChangeSetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCatalog(value: Catalog): Self = this.set("Catalog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeSetVarargs(value: Change*): Self = this.set("ChangeSet", js.Array(value :_*))
    
    @scala.inline
    def setChangeSet(value: RequestedChangeList): Self = this.set("ChangeSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeSetName(value: ChangeSetName): Self = this.set("ChangeSetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChangeSetName: Self = this.set("ChangeSetName", js.undefined)
    
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = this.set("ClientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientRequestToken: Self = this.set("ClientRequestToken", js.undefined)
  }
}
