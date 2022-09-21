package typings.awsSdk.iotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateAwsAccountWithPartnerAccountRequest extends StObject {
  
  /**
    * Each resource must have a unique client request token. If you try to create a new resource with the same token as a resource that already exists, an exception occurs. If you omit this value, AWS SDKs will automatically generate a unique client request. 
    */
  var ClientRequestToken: js.UndefOr[typings.awsSdk.iotwirelessMod.ClientRequestToken] = js.undefined
  
  /**
    * The Sidewalk account credentials.
    */
  var Sidewalk: SidewalkAccountInfo
  
  /**
    * The tags to attach to the specified resource. Tags are metadata that you can use to manage a resource.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object AssociateAwsAccountWithPartnerAccountRequest {
  
  inline def apply(Sidewalk: SidewalkAccountInfo): AssociateAwsAccountWithPartnerAccountRequest = {
    val __obj = js.Dynamic.literal(Sidewalk = Sidewalk.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateAwsAccountWithPartnerAccountRequest]
  }
  
  extension [Self <: AssociateAwsAccountWithPartnerAccountRequest](x: Self) {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setSidewalk(value: SidewalkAccountInfo): Self = StObject.set(x, "Sidewalk", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
