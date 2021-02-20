package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceInformationStringFilter extends StObject {
  
  /**
    * The filter key name to describe your instances. For example: "InstanceIds"|"AgentVersion"|"PingStatus"|"PlatformTypes"|"ActivationIds"|"IamRole"|"ResourceType"|"AssociationStatus"|"Tag Key"
    */
  var Key: InstanceInformationStringFilterKey = js.native
  
  /**
    * The filter values.
    */
  var Values: InstanceInformationFilterValueSet = js.native
}
object InstanceInformationStringFilter {
  
  @scala.inline
  def apply(Key: InstanceInformationStringFilterKey, Values: InstanceInformationFilterValueSet): InstanceInformationStringFilter = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceInformationStringFilter]
  }
  
  @scala.inline
  implicit class InstanceInformationStringFilterMutableBuilder[Self <: InstanceInformationStringFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: InstanceInformationStringFilterKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: InstanceInformationFilterValueSet): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: InstanceInformationFilterValue*): Self = StObject.set(x, "Values", js.Array(value :_*))
  }
}
