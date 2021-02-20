package typings.cssTree.mod

import typings.cssTree.cssTreeStrings.AtKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DSNodeAtWord extends DSNode {
  
  var name: String = js.native
  
  var `type`: AtKeyword = js.native
}
object DSNodeAtWord {
  
  @scala.inline
  def apply(name: String, `type`: AtKeyword): DSNodeAtWord = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DSNodeAtWord]
  }
  
  @scala.inline
  implicit class DSNodeAtWordMutableBuilder[Self <: DSNodeAtWord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: AtKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
