package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Atrule
  extends CssNodeCommon
     with CssNode {
  
  var block: Block | Null = js.native
  
  var name: String = js.native
  
  var prelude: AtrulePrelude | Raw | Null = js.native
  
  @JSName("type")
  var type_Atrule: typings.cssTree.cssTreeStrings.Atrule = js.native
}
object Atrule {
  
  @scala.inline
  def apply(name: String, `type`: typings.cssTree.cssTreeStrings.Atrule): Atrule = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Atrule]
  }
  
  @scala.inline
  implicit class AtruleMutableBuilder[Self <: Atrule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlock(value: Block): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockNull: Self = StObject.set(x, "block", null)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrelude(value: AtrulePrelude | Raw): Self = StObject.set(x, "prelude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreludeNull: Self = StObject.set(x, "prelude", null)
    
    @scala.inline
    def setType(value: typings.cssTree.cssTreeStrings.Atrule): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
