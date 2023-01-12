package typings.cssWhat.libEsTypesMod

import typings.cssWhat.libEsTypesMod.SelectorType.Universal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UniversalSelector
  extends StObject
     with Selector {
  
  var namespace: String | Null
  
  var `type`: Universal
}
object UniversalSelector {
  
  inline def apply(`type`: Universal): UniversalSelector = {
    val __obj = js.Dynamic.literal(namespace = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UniversalSelector]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UniversalSelector] (val x: Self) extends AnyVal {
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceNull: Self = StObject.set(x, "namespace", null)
    
    inline def setType(value: Universal): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
