package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeclarationListPlain
  extends StObject
     with CssNodeCommon
     with CssNodePlain {
  
  var children: js.Array[CssNodePlain]
  
  @JSName("type")
  var type_DeclarationListPlain: typings.cssTree.cssTreeStrings.DeclarationList
}
object DeclarationListPlain {
  
  @scala.inline
  def apply(children: js.Array[CssNodePlain]): DeclarationListPlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclarationList")
    __obj.asInstanceOf[DeclarationListPlain]
  }
  
  @scala.inline
  implicit class DeclarationListPlainMutableBuilder[Self <: DeclarationListPlain] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[CssNodePlain]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: CssNodePlain*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setType(value: typings.cssTree.cssTreeStrings.DeclarationList): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
