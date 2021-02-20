package typings.babelTypes.ts36Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSTypeLiteral
  extends Node
     with TSType {
  
  var members: js.Array[TSTypeElement] = js.native
  
  @JSName("type")
  var type_TSTypeLiteral: typings.babelTypes.babelTypesStrings.TSTypeLiteral = js.native
}
object TSTypeLiteral {
  
  @JSImport("babel-types/ts3.6", "TSTypeLiteral")
  @js.native
  def apply(members: js.Array[TSTypeElement]): TSTypeLiteral = js.native
  
  @scala.inline
  implicit class TSTypeLiteralMutableBuilder[Self <: TSTypeLiteral] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMembers(value: js.Array[TSTypeElement]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembersVarargs(value: TSTypeElement*): Self = StObject.set(x, "members", js.Array(value :_*))
    
    @scala.inline
    def setType(value: typings.babelTypes.babelTypesStrings.TSTypeLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
