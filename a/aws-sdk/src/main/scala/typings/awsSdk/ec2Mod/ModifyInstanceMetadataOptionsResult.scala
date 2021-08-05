package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyInstanceMetadataOptionsResult extends StObject {
  
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
  
  /**
    * The metadata options for the instance.
    */
  var InstanceMetadataOptions: js.UndefOr[InstanceMetadataOptionsResponse] = js.undefined
}
object ModifyInstanceMetadataOptionsResult {
  
  inline def apply(): ModifyInstanceMetadataOptionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyInstanceMetadataOptionsResult]
  }
  
  extension [Self <: ModifyInstanceMetadataOptionsResult](x: Self) {
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    inline def setInstanceMetadataOptions(value: InstanceMetadataOptionsResponse): Self = StObject.set(x, "InstanceMetadataOptions", value.asInstanceOf[js.Any])
    
    inline def setInstanceMetadataOptionsUndefined: Self = StObject.set(x, "InstanceMetadataOptions", js.undefined)
  }
}
