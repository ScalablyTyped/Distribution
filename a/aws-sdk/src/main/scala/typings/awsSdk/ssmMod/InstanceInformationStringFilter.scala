package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceInformationStringFilter extends StObject {
  
  /**
    * The filter key name to describe your managed nodes. For example: "InstanceIds" | "AgentVersion" | "PingStatus" | "PlatformTypes" | "ActivationIds" | "IamRole" | "ResourceType" | "AssociationStatus" | "tag-key" | "tag:{keyname}    Tag Key isn't a valid filter. You must specify either tag-key or tag:{keyname} and a string. Here are some valid examples: tag-key, tag:123, tag:al!, tag:Windows. Here are some invalid examples: tag-keys, Tag Key, tag:, tagKey, abc:keyname. 
    */
  var Key: InstanceInformationStringFilterKey
  
  /**
    * The filter values.
    */
  var Values: InstanceInformationFilterValueSet
}
object InstanceInformationStringFilter {
  
  inline def apply(Key: InstanceInformationStringFilterKey, Values: InstanceInformationFilterValueSet): InstanceInformationStringFilter = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceInformationStringFilter]
  }
  
  extension [Self <: InstanceInformationStringFilter](x: Self) {
    
    inline def setKey(value: InstanceInformationStringFilterKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setValues(value: InstanceInformationFilterValueSet): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: InstanceInformationFilterValue*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
