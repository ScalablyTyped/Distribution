package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.DeclareVariable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeclareVariable_
  extends StObject
     with Node
     with Declaration
     with Flow
     with FlowDeclaration
     with Statement {
  
  var id: Identifier_
  
  @JSName("type")
  var type_DeclareVariable_ : DeclareVariable
}
object DeclareVariable_ {
  
  inline def apply(end: Double, id: Identifier_, loc: SourceLocation, start: Double): DeclareVariable_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclareVariable")
    __obj.asInstanceOf[DeclareVariable_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeclareVariable_] (val x: Self) extends AnyVal {
    
    inline def setId(value: Identifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: DeclareVariable): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
