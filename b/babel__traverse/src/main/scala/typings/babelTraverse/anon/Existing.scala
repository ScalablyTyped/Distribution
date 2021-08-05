package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.`var`
import typings.babelTraverse.babelTraverseStrings.const
import typings.babelTraverse.babelTraverseStrings.let
import typings.babelTraverse.mod.Binding
import typings.babelTraverse.mod.NodePath
import typings.babelTraverse.mod.Scope
import typings.babelTypes.mod.Identifier_
import typings.babelTypes.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Existing extends StObject {
  
  var existing: Binding
  
  var identifier: Identifier_
  
  var kind: `var` | let | const
  
  var path: NodePath[Node]
  
  var scope: Scope
}
object Existing {
  
  inline def apply(
    existing: Binding,
    identifier: Identifier_,
    kind: `var` | let | const,
    path: NodePath[Node],
    scope: Scope
  ): Existing = {
    val __obj = js.Dynamic.literal(existing = existing.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[Existing]
  }
  
  extension [Self <: Existing](x: Self) {
    
    inline def setExisting(value: Binding): Self = StObject.set(x, "existing", value.asInstanceOf[js.Any])
    
    inline def setIdentifier(value: Identifier_): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setKind(value: `var` | let | const): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setPath(value: NodePath[Node]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setScope(value: Scope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
  }
}
