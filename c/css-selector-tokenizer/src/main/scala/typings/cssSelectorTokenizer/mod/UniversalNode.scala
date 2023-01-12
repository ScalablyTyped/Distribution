package typings.cssSelectorTokenizer.mod

import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.universal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UniversalNode
  extends StObject
     with BaseNode
     with SelectorNodeType {
  
  var namespace: js.UndefOr[String] = js.undefined
  
  var `type`: universal
}
object UniversalNode {
  
  inline def apply(): UniversalNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("universal")
    __obj.asInstanceOf[UniversalNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UniversalNode] (val x: Self) extends AnyVal {
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    inline def setType(value: universal): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
