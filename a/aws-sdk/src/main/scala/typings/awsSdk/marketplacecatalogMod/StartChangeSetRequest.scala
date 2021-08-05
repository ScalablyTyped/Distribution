package typings.awsSdk.marketplacecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartChangeSetRequest extends StObject {
  
  /**
    * The catalog related to the request. Fixed value: AWSMarketplace 
    */
  var Catalog: typings.awsSdk.marketplacecatalogMod.Catalog
  
  /**
    * Array of change object.
    */
  var ChangeSet: RequestedChangeList
  
  /**
    * Optional case sensitive string of up to 100 ASCII characters. The change set name can be used to filter the list of change sets. 
    */
  var ChangeSetName: js.UndefOr[typings.awsSdk.marketplacecatalogMod.ChangeSetName] = js.undefined
  
  /**
    * A unique token to identify the request to ensure idempotency.
    */
  var ClientRequestToken: js.UndefOr[typings.awsSdk.marketplacecatalogMod.ClientRequestToken] = js.undefined
}
object StartChangeSetRequest {
  
  inline def apply(Catalog: Catalog, ChangeSet: RequestedChangeList): StartChangeSetRequest = {
    val __obj = js.Dynamic.literal(Catalog = Catalog.asInstanceOf[js.Any], ChangeSet = ChangeSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartChangeSetRequest]
  }
  
  extension [Self <: StartChangeSetRequest](x: Self) {
    
    inline def setCatalog(value: Catalog): Self = StObject.set(x, "Catalog", value.asInstanceOf[js.Any])
    
    inline def setChangeSet(value: RequestedChangeList): Self = StObject.set(x, "ChangeSet", value.asInstanceOf[js.Any])
    
    inline def setChangeSetName(value: ChangeSetName): Self = StObject.set(x, "ChangeSetName", value.asInstanceOf[js.Any])
    
    inline def setChangeSetNameUndefined: Self = StObject.set(x, "ChangeSetName", js.undefined)
    
    inline def setChangeSetVarargs(value: Change*): Self = StObject.set(x, "ChangeSet", js.Array(value :_*))
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
  }
}
