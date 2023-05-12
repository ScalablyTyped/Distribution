package typings.awsSdkLibDynamodb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyString extends StObject {
  
  var children: Unit
  
  var key: String
}
object KeyString {
  
  inline def apply(children: Unit, key: String): KeyString = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyString] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: Unit): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
