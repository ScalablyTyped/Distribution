package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AWSLocation extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the subnet that the device is located in.
    */
  var SubnetArn: js.UndefOr[typings.awsSdk.networkmanagerMod.SubnetArn] = js.undefined
  
  /**
    * The Zone that the device is located in. Specify the ID of an Availability Zone, Local Zone, Wavelength Zone, or an Outpost.
    */
  var Zone: js.UndefOr[ConstrainedString] = js.undefined
}
object AWSLocation {
  
  inline def apply(): AWSLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AWSLocation]
  }
  
  extension [Self <: AWSLocation](x: Self) {
    
    inline def setSubnetArn(value: SubnetArn): Self = StObject.set(x, "SubnetArn", value.asInstanceOf[js.Any])
    
    inline def setSubnetArnUndefined: Self = StObject.set(x, "SubnetArn", js.undefined)
    
    inline def setZone(value: ConstrainedString): Self = StObject.set(x, "Zone", value.asInstanceOf[js.Any])
    
    inline def setZoneUndefined: Self = StObject.set(x, "Zone", js.undefined)
  }
}
