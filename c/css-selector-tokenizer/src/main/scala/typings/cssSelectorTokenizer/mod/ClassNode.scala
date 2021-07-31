package typings.cssSelectorTokenizer.mod

import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.`class`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassNode
  extends StObject
     with BaseNode
     with SelectorNodeType {
  
  @JSName("name")
  var name_ClassNode: String
  
  var `type`: `class`
}
object ClassNode {
  
  @scala.inline
  def apply(name: String): ClassNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("class")
    __obj.asInstanceOf[ClassNode]
  }
  
  @scala.inline
  implicit class ClassNodeMutableBuilder[Self <: ClassNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `class`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
