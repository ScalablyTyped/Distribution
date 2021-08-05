package typings.awsSdk.docdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderableDBInstanceOption extends StObject {
  
  /**
    * A list of Availability Zones for an instance.
    */
  var AvailabilityZones: js.UndefOr[AvailabilityZoneList] = js.undefined
  
  /**
    * The instance class for an instance.
    */
  var DBInstanceClass: js.UndefOr[String] = js.undefined
  
  /**
    * The engine type of an instance.
    */
  var Engine: js.UndefOr[String] = js.undefined
  
  /**
    * The engine version of an instance.
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The license model for an instance.
    */
  var LicenseModel: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether an instance is in a virtual private cloud (VPC).
    */
  var Vpc: js.UndefOr[Boolean] = js.undefined
}
object OrderableDBInstanceOption {
  
  inline def apply(): OrderableDBInstanceOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderableDBInstanceOption]
  }
  
  extension [Self <: OrderableDBInstanceOption](x: Self) {
    
    inline def setAvailabilityZones(value: AvailabilityZoneList): Self = StObject.set(x, "AvailabilityZones", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZonesUndefined: Self = StObject.set(x, "AvailabilityZones", js.undefined)
    
    inline def setAvailabilityZonesVarargs(value: AvailabilityZone*): Self = StObject.set(x, "AvailabilityZones", js.Array(value :_*))
    
    inline def setDBInstanceClass(value: String): Self = StObject.set(x, "DBInstanceClass", value.asInstanceOf[js.Any])
    
    inline def setDBInstanceClassUndefined: Self = StObject.set(x, "DBInstanceClass", js.undefined)
    
    inline def setEngine(value: String): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    inline def setEngineUndefined: Self = StObject.set(x, "Engine", js.undefined)
    
    inline def setEngineVersion(value: String): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    inline def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    inline def setLicenseModel(value: String): Self = StObject.set(x, "LicenseModel", value.asInstanceOf[js.Any])
    
    inline def setLicenseModelUndefined: Self = StObject.set(x, "LicenseModel", js.undefined)
    
    inline def setVpc(value: Boolean): Self = StObject.set(x, "Vpc", value.asInstanceOf[js.Any])
    
    inline def setVpcUndefined: Self = StObject.set(x, "Vpc", js.undefined)
  }
}
