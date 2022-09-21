package typings.awsSdk.iotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateAwsAccountWithPartnerAccountResponse extends StObject {
  
  /**
    * The Amazon Resource Name of the resource.
    */
  var Arn: js.UndefOr[PartnerAccountArn] = js.undefined
  
  /**
    * The Sidewalk account credentials.
    */
  var Sidewalk: js.UndefOr[SidewalkAccountInfo] = js.undefined
}
object AssociateAwsAccountWithPartnerAccountResponse {
  
  inline def apply(): AssociateAwsAccountWithPartnerAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateAwsAccountWithPartnerAccountResponse]
  }
  
  extension [Self <: AssociateAwsAccountWithPartnerAccountResponse](x: Self) {
    
    inline def setArn(value: PartnerAccountArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setSidewalk(value: SidewalkAccountInfo): Self = StObject.set(x, "Sidewalk", value.asInstanceOf[js.Any])
    
    inline def setSidewalkUndefined: Self = StObject.set(x, "Sidewalk", js.undefined)
  }
}
