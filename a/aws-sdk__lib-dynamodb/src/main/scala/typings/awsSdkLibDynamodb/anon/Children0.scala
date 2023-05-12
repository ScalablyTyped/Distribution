package typings.awsSdkLibDynamodb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Children0 extends StObject {
  
  var children: `0`
  
  var key: String
}
object Children0 {
  
  inline def apply(children: `0`, key: String): Children0 = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children0]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Children0] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: `0`): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
