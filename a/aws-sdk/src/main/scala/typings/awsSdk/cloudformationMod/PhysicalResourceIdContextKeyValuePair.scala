package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhysicalResourceIdContextKeyValuePair extends StObject {
  
  /**
    * The resource context key.
    */
  var Key: typings.awsSdk.cloudformationMod.Key = js.native
  
  /**
    * The resource context value.
    */
  var Value: typings.awsSdk.cloudformationMod.Value = js.native
}
object PhysicalResourceIdContextKeyValuePair {
  
  @scala.inline
  def apply(Key: Key, Value: Value): PhysicalResourceIdContextKeyValuePair = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhysicalResourceIdContextKeyValuePair]
  }
  
  @scala.inline
  implicit class PhysicalResourceIdContextKeyValuePairMutableBuilder[Self <: PhysicalResourceIdContextKeyValuePair] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: Key): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Value): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
