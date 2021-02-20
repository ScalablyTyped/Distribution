package typings.bip174.interfacesMod

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyValue extends StObject {
  
  var key: Buffer = js.native
  
  var value: Buffer = js.native
}
object KeyValue {
  
  @scala.inline
  def apply(key: Buffer, value: Buffer): KeyValue = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyValue]
  }
  
  @scala.inline
  implicit class KeyValueMutableBuilder[Self <: KeyValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Buffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
