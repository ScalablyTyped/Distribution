package typings.cssSelectorTokenizer.mod

import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.spacing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpacingNode
  extends SelectorNodeType
     with BaseNode {
  
  var `type`: spacing = js.native
  
  var value: String = js.native
}
object SpacingNode {
  
  @scala.inline
  def apply(`type`: spacing, value: String): SpacingNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpacingNode]
  }
  
  @scala.inline
  implicit class SpacingNodeMutableBuilder[Self <: SpacingNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: spacing): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
