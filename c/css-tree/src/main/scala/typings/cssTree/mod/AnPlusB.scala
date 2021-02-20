package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnPlusB
  extends CssNodeCommon
     with CssNode
     with CssNodePlain {
  
  var a: String | Null = js.native
  
  var b: String | Null = js.native
  
  @JSName("type")
  var type_AnPlusB: typings.cssTree.cssTreeStrings.AnPlusB = js.native
}
object AnPlusB {
  
  @scala.inline
  def apply(`type`: typings.cssTree.cssTreeStrings.AnPlusB): AnPlusB = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnPlusB]
  }
  
  @scala.inline
  implicit class AnPlusBMutableBuilder[Self <: AnPlusB] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setA(value: String): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setANull: Self = StObject.set(x, "a", null)
    
    @scala.inline
    def setB(value: String): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBNull: Self = StObject.set(x, "b", null)
    
    @scala.inline
    def setType(value: typings.cssTree.cssTreeStrings.AnPlusB): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
