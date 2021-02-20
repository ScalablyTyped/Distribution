package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AtrulePlain
  extends CssNodeCommon
     with CssNodePlain {
  
  var block: BlockPlain | Null = js.native
  
  var name: String = js.native
  
  var prelude: AtrulePreludePlain | Raw | Null = js.native
  
  @JSName("type")
  var type_AtrulePlain: typings.cssTree.cssTreeStrings.Atrule = js.native
}
object AtrulePlain {
  
  @scala.inline
  def apply(name: String, `type`: typings.cssTree.cssTreeStrings.Atrule): AtrulePlain = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AtrulePlain]
  }
  
  @scala.inline
  implicit class AtrulePlainMutableBuilder[Self <: AtrulePlain] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlock(value: BlockPlain): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockNull: Self = StObject.set(x, "block", null)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrelude(value: AtrulePreludePlain | Raw): Self = StObject.set(x, "prelude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreludeNull: Self = StObject.set(x, "prelude", null)
    
    @scala.inline
    def setType(value: typings.cssTree.cssTreeStrings.Atrule): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
