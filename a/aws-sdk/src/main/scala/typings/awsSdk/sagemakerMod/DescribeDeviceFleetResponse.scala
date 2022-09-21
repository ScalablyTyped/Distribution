package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDeviceFleetResponse extends StObject {
  
  /**
    * Timestamp of when the device fleet was created.
    */
  var CreationTime: js.Date
  
  /**
    * A description of the fleet.
    */
  var Description: js.UndefOr[DeviceFleetDescription] = js.undefined
  
  /**
    * The The Amazon Resource Name (ARN) of the fleet.
    */
  var DeviceFleetArn: typings.awsSdk.sagemakerMod.DeviceFleetArn
  
  /**
    * The name of the fleet.
    */
  var DeviceFleetName: EntityName
  
  /**
    * The Amazon Resource Name (ARN) alias created in Amazon Web Services Internet of Things (IoT).
    */
  var IotRoleAlias: js.UndefOr[typings.awsSdk.sagemakerMod.IotRoleAlias] = js.undefined
  
  /**
    * Timestamp of when the device fleet was last updated.
    */
  var LastModifiedTime: js.Date
  
  /**
    * The output configuration for storing sampled data.
    */
  var OutputConfig: EdgeOutputConfig
  
  /**
    * The Amazon Resource Name (ARN) that has access to Amazon Web Services Internet of Things (IoT).
    */
  var RoleArn: js.UndefOr[typings.awsSdk.sagemakerMod.RoleArn] = js.undefined
}
object DescribeDeviceFleetResponse {
  
  inline def apply(
    CreationTime: js.Date,
    DeviceFleetArn: DeviceFleetArn,
    DeviceFleetName: EntityName,
    LastModifiedTime: js.Date,
    OutputConfig: EdgeOutputConfig
  ): DescribeDeviceFleetResponse = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], DeviceFleetArn = DeviceFleetArn.asInstanceOf[js.Any], DeviceFleetName = DeviceFleetName.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any], OutputConfig = OutputConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDeviceFleetResponse]
  }
  
  extension [Self <: DescribeDeviceFleetResponse](x: Self) {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: DeviceFleetDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDeviceFleetArn(value: DeviceFleetArn): Self = StObject.set(x, "DeviceFleetArn", value.asInstanceOf[js.Any])
    
    inline def setDeviceFleetName(value: EntityName): Self = StObject.set(x, "DeviceFleetName", value.asInstanceOf[js.Any])
    
    inline def setIotRoleAlias(value: IotRoleAlias): Self = StObject.set(x, "IotRoleAlias", value.asInstanceOf[js.Any])
    
    inline def setIotRoleAliasUndefined: Self = StObject.set(x, "IotRoleAlias", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setOutputConfig(value: EdgeOutputConfig): Self = StObject.set(x, "OutputConfig", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
  }
}
