package typings.awsSdk.ssoadminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeInstanceAccessControlAttributeConfigurationResponse extends StObject {
  
  /**
    * Gets the list of IAM Identity Center identity store attributes that have been added to your ABAC configuration.
    */
  var InstanceAccessControlAttributeConfiguration: js.UndefOr[typings.awsSdk.ssoadminMod.InstanceAccessControlAttributeConfiguration] = js.undefined
  
  /**
    * The status of the attribute configuration process.
    */
  var Status: js.UndefOr[InstanceAccessControlAttributeConfigurationStatus] = js.undefined
  
  /**
    * Provides more details about the current status of the specified attribute.
    */
  var StatusReason: js.UndefOr[InstanceAccessControlAttributeConfigurationStatusReason] = js.undefined
}
object DescribeInstanceAccessControlAttributeConfigurationResponse {
  
  inline def apply(): DescribeInstanceAccessControlAttributeConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInstanceAccessControlAttributeConfigurationResponse]
  }
  
  extension [Self <: DescribeInstanceAccessControlAttributeConfigurationResponse](x: Self) {
    
    inline def setInstanceAccessControlAttributeConfiguration(value: InstanceAccessControlAttributeConfiguration): Self = StObject.set(x, "InstanceAccessControlAttributeConfiguration", value.asInstanceOf[js.Any])
    
    inline def setInstanceAccessControlAttributeConfigurationUndefined: Self = StObject.set(x, "InstanceAccessControlAttributeConfiguration", js.undefined)
    
    inline def setStatus(value: InstanceAccessControlAttributeConfigurationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusReason(value: InstanceAccessControlAttributeConfigurationStatusReason): Self = StObject.set(x, "StatusReason", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonUndefined: Self = StObject.set(x, "StatusReason", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
