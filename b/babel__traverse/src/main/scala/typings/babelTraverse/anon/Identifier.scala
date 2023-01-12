package typings.babelTraverse.anon

import typings.babelTraverse.mod.BindingKind
import typings.babelTraverse.mod.NodePath
import typings.babelTraverse.mod.Scope
import typings.babelTypes.mod.Identifier_
import typings.babelTypes.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Identifier extends StObject {
  
  var identifier: Identifier_
  
  var kind: BindingKind
  
  var path: NodePath[Node]
  
  var scope: Scope
}
object Identifier {
  
  inline def apply(identifier: Identifier_, kind: BindingKind, path: NodePath[Node], scope: Scope): Identifier = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[Identifier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Identifier] (val x: Self) extends AnyVal {
    
    inline def setIdentifier(value: Identifier_): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setKind(value: BindingKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setPath(value: NodePath[Node]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setScope(value: Scope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
  }
}
