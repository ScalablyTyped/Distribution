package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsRdsDbInstanceEndpoint extends StObject {
  
  /**
    * Specifies the DNS address of the DB instance.
    */
  var Address: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Specifies the ID that Amazon Route 53 assigns when you create a hosted zone.
    */
  var HostedZoneId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Specifies the port that the database engine is listening on.
    */
  var Port: js.UndefOr[Integer] = js.undefined
}
object AwsRdsDbInstanceEndpoint {
  
  @scala.inline
  def apply(): AwsRdsDbInstanceEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRdsDbInstanceEndpoint]
  }
  
  @scala.inline
  implicit class AwsRdsDbInstanceEndpointMutableBuilder[Self <: AwsRdsDbInstanceEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: NonEmptyString): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "Address", js.undefined)
    
    @scala.inline
    def setHostedZoneId(value: NonEmptyString): Self = StObject.set(x, "HostedZoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostedZoneIdUndefined: Self = StObject.set(x, "HostedZoneId", js.undefined)
    
    @scala.inline
    def setPort(value: Integer): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
  }
}
