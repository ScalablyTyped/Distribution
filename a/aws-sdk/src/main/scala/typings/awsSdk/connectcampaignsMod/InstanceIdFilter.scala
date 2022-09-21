package typings.awsSdk.connectcampaignsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceIdFilter extends StObject {
  
  var operator: InstanceIdFilterOperator
  
  var value: InstanceId
}
object InstanceIdFilter {
  
  inline def apply(operator: InstanceIdFilterOperator, value: InstanceId): InstanceIdFilter = {
    val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceIdFilter]
  }
  
  extension [Self <: InstanceIdFilter](x: Self) {
    
    inline def setOperator(value: InstanceIdFilterOperator): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setValue(value: InstanceId): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
