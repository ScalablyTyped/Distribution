package typings.bip174.srcLibInterfacesMod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyValue extends StObject {
  
  var key: Buffer
  
  var value: Buffer
}
object KeyValue {
  
  inline def apply(key: Buffer, value: Buffer): KeyValue = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyValue] (val x: Self) extends AnyVal {
    
    inline def setKey(value: Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Buffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
