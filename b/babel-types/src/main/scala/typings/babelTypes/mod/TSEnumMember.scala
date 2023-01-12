package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSEnumMember
  extends StObject
     with Node {
  
  var id: Identifier_ | StringLiteral_
  
  var initializer: Expression | Null
  
  @JSName("type")
  var type_TSEnumMember: typings.babelTypes.babelTypesStrings.TSEnumMember
}
object TSEnumMember {
  
  @JSImport("babel-types", "TSEnumMember")
  @js.native
  def apply(id: Identifier_): TSEnumMember = js.native
  @JSImport("babel-types", "TSEnumMember")
  @js.native
  def apply(id: Identifier_, initializer: Expression): TSEnumMember = js.native
  @JSImport("babel-types", "TSEnumMember")
  @js.native
  def apply(id: StringLiteral_): TSEnumMember = js.native
  @JSImport("babel-types", "TSEnumMember")
  @js.native
  def apply(id: StringLiteral_, initializer: Expression): TSEnumMember = js.native
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TSEnumMember] (val x: Self) extends AnyVal {
    
    inline def setId(value: Identifier_ | StringLiteral_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInitializer(value: Expression): Self = StObject.set(x, "initializer", value.asInstanceOf[js.Any])
    
    inline def setInitializerNull: Self = StObject.set(x, "initializer", null)
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSEnumMember): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
