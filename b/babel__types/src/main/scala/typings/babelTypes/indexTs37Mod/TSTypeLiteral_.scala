package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.TSTypeLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait TSTypeLiteral_
  extends TSType
     with BaseNode {
  
  var members: js.Array[TSTypeElement] = js.native
  
  @JSName("type")
  var type_TSTypeLiteral_ : TSTypeLiteral = js.native
}
object TSTypeLiteral_ {
  
  @scala.inline
  def apply(members: js.Array[TSTypeElement], `type`: TSTypeLiteral): TSTypeLiteral_ = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTypeLiteral_]
  }
  
  @scala.inline
  implicit class TSTypeLiteral_MutableBuilder[Self <: TSTypeLiteral_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMembers(value: js.Array[TSTypeElement]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembersVarargs(value: TSTypeElement*): Self = StObject.set(x, "members", js.Array(value :_*))
    
    @scala.inline
    def setType(value: TSTypeLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
