package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyReservedInstancesResult extends StObject {
  
  /**
    * The ID for the modification.
    */
  var ReservedInstancesModificationId: js.UndefOr[String] = js.native
}
object ModifyReservedInstancesResult {
  
  @scala.inline
  def apply(): ModifyReservedInstancesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyReservedInstancesResult]
  }
  
  @scala.inline
  implicit class ModifyReservedInstancesResultMutableBuilder[Self <: ModifyReservedInstancesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReservedInstancesModificationId(value: String): Self = StObject.set(x, "ReservedInstancesModificationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedInstancesModificationIdUndefined: Self = StObject.set(x, "ReservedInstancesModificationId", js.undefined)
  }
}
