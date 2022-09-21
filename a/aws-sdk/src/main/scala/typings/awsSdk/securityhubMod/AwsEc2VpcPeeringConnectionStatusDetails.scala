package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEc2VpcPeeringConnectionStatusDetails extends StObject {
  
  /**
    * The status of the VPC peering connection. 
    */
  var Code: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * A message that provides more information about the status, if applicable. 
    */
  var Message: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEc2VpcPeeringConnectionStatusDetails {
  
  inline def apply(): AwsEc2VpcPeeringConnectionStatusDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2VpcPeeringConnectionStatusDetails]
  }
  
  extension [Self <: AwsEc2VpcPeeringConnectionStatusDetails](x: Self) {
    
    inline def setCode(value: NonEmptyString): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    inline def setMessage(value: NonEmptyString): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
