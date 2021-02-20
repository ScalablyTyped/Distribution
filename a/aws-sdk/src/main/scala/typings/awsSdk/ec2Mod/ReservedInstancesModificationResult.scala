package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReservedInstancesModificationResult extends StObject {
  
  /**
    * The ID for the Reserved Instances that were created as part of the modification request. This field is only available when the modification is fulfilled.
    */
  var ReservedInstancesId: js.UndefOr[String] = js.native
  
  /**
    * The target Reserved Instances configurations supplied as part of the modification request.
    */
  var TargetConfiguration: js.UndefOr[ReservedInstancesConfiguration] = js.native
}
object ReservedInstancesModificationResult {
  
  @scala.inline
  def apply(): ReservedInstancesModificationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservedInstancesModificationResult]
  }
  
  @scala.inline
  implicit class ReservedInstancesModificationResultMutableBuilder[Self <: ReservedInstancesModificationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReservedInstancesId(value: String): Self = StObject.set(x, "ReservedInstancesId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedInstancesIdUndefined: Self = StObject.set(x, "ReservedInstancesId", js.undefined)
    
    @scala.inline
    def setTargetConfiguration(value: ReservedInstancesConfiguration): Self = StObject.set(x, "TargetConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetConfigurationUndefined: Self = StObject.set(x, "TargetConfiguration", js.undefined)
  }
}
