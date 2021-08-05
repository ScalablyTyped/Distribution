package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhysicalResourceIdContextKeyValuePair extends StObject {
  
  /**
    * The resource context key.
    */
  var Key: typings.awsSdk.cloudformationMod.Key
  
  /**
    * The resource context value.
    */
  var Value: typings.awsSdk.cloudformationMod.Value
}
object PhysicalResourceIdContextKeyValuePair {
  
  inline def apply(Key: Key, Value: Value): PhysicalResourceIdContextKeyValuePair = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhysicalResourceIdContextKeyValuePair]
  }
  
  extension [Self <: PhysicalResourceIdContextKeyValuePair](x: Self) {
    
    inline def setKey(value: Key): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Value): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
