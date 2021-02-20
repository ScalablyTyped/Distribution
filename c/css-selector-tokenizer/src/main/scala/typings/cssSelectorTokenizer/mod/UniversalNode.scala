package typings.cssSelectorTokenizer.mod

import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.universal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UniversalNode
  extends SelectorNodeType
     with BaseNode {
  
  var namespace: js.UndefOr[String] = js.native
  
  var `type`: universal = js.native
}
object UniversalNode {
  
  @scala.inline
  def apply(`type`: universal): UniversalNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UniversalNode]
  }
  
  @scala.inline
  implicit class UniversalNodeMutableBuilder[Self <: UniversalNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    @scala.inline
    def setType(value: universal): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
