package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.DeclareFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeclareFunction_
  extends Node
     with Declaration
     with Flow
     with FlowDeclaration
     with Statement {
  
  var id: Identifier_ = js.native
  
  @JSName("type")
  var type_DeclareFunction_ : DeclareFunction = js.native
}
object DeclareFunction_ {
  
  @scala.inline
  def apply(end: Double, id: Identifier_, loc: SourceLocation, start: Double, `type`: DeclareFunction): DeclareFunction_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclareFunction_]
  }
  
  @scala.inline
  implicit class DeclareFunction_MutableBuilder[Self <: DeclareFunction_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Identifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: DeclareFunction): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
