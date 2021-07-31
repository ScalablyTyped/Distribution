package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceAccess extends StObject {
  
  /**
    * Credentials required to access the instance.
    */
  var Credentials: js.UndefOr[InstanceCredentials] = js.undefined
  
  /**
    * A unique identifier for a fleet containing the instance being accessed.
    */
  var FleetId: js.UndefOr[typings.awsSdk.gameliftMod.FleetId] = js.undefined
  
  /**
    * A unique identifier for an instance being accessed.
    */
  var InstanceId: js.UndefOr[typings.awsSdk.gameliftMod.InstanceId] = js.undefined
  
  /**
    * IP address that is assigned to the instance.
    */
  var IpAddress: js.UndefOr[typings.awsSdk.gameliftMod.IpAddress] = js.undefined
  
  /**
    * Operating system that is running on the instance.
    */
  var OperatingSystem: js.UndefOr[typings.awsSdk.gameliftMod.OperatingSystem] = js.undefined
}
object InstanceAccess {
  
  @scala.inline
  def apply(): InstanceAccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceAccess]
  }
  
  @scala.inline
  implicit class InstanceAccessMutableBuilder[Self <: InstanceAccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCredentials(value: InstanceCredentials): Self = StObject.set(x, "Credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialsUndefined: Self = StObject.set(x, "Credentials", js.undefined)
    
    @scala.inline
    def setFleetId(value: FleetId): Self = StObject.set(x, "FleetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFleetIdUndefined: Self = StObject.set(x, "FleetId", js.undefined)
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    @scala.inline
    def setIpAddress(value: IpAddress): Self = StObject.set(x, "IpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpAddressUndefined: Self = StObject.set(x, "IpAddress", js.undefined)
    
    @scala.inline
    def setOperatingSystem(value: OperatingSystem): Self = StObject.set(x, "OperatingSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatingSystemUndefined: Self = StObject.set(x, "OperatingSystem", js.undefined)
  }
}
