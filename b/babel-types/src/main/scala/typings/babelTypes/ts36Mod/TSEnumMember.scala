package typings.babelTypes.ts36Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSEnumMember extends Node {
  
  var id: Identifier_ | StringLiteral_ = js.native
  
  var initializer: Expression | Null = js.native
  
  @JSName("type")
  var type_TSEnumMember: typings.babelTypes.babelTypesStrings.TSEnumMember = js.native
}
object TSEnumMember {
  
  @JSImport("babel-types/ts3.6", "TSEnumMember")
  @js.native
  def apply(id: Identifier_): TSEnumMember = js.native
  @JSImport("babel-types/ts3.6", "TSEnumMember")
  @js.native
  def apply(id: Identifier_, initializer: Expression): TSEnumMember = js.native
  @JSImport("babel-types/ts3.6", "TSEnumMember")
  @js.native
  def apply(id: StringLiteral_): TSEnumMember = js.native
  @JSImport("babel-types/ts3.6", "TSEnumMember")
  @js.native
  def apply(id: StringLiteral_, initializer: Expression): TSEnumMember = js.native
  
  @scala.inline
  implicit class TSEnumMemberMutableBuilder[Self <: TSEnumMember] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Identifier_ | StringLiteral_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitializer(value: Expression): Self = StObject.set(x, "initializer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitializerNull: Self = StObject.set(x, "initializer", null)
    
    @scala.inline
    def setType(value: typings.babelTypes.babelTypesStrings.TSEnumMember): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
