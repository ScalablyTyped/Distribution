package typings.cssWhat.libEsTypesMod

import typings.cssWhat.libEsTypesMod.SelectorType.Tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagSelector
  extends StObject
     with Selector {
  
  var name: String
  
  var namespace: String | Null
  
  var `type`: Tag
}
object TagSelector {
  
  inline def apply(name: String, `type`: Tag): TagSelector = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagSelector]
  }
  
  extension [Self <: TagSelector](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceNull: Self = StObject.set(x, "namespace", null)
    
    inline def setType(value: Tag): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
