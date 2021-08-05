package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuccessfulInstanceCreditSpecificationItem extends StObject {
  
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
}
object SuccessfulInstanceCreditSpecificationItem {
  
  inline def apply(): SuccessfulInstanceCreditSpecificationItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuccessfulInstanceCreditSpecificationItem]
  }
  
  extension [Self <: SuccessfulInstanceCreditSpecificationItem](x: Self) {
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
  }
}
