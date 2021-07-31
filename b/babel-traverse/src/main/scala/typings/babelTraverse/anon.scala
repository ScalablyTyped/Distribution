package typings.babelTraverse

import typings.babelTraverse.babelTraverseStrings.`var`
import typings.babelTraverse.babelTraverseStrings.const
import typings.babelTraverse.babelTraverseStrings.let
import typings.babelTraverse.mod.Binding
import typings.babelTraverse.mod.Node
import typings.babelTraverse.mod.NodePath
import typings.babelTraverse.mod.Scope
import typings.babelTypes.ts36Mod.Identifier_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Confident extends StObject {
    
    var confident: Boolean
    
    var value: js.Any
  }
  object Confident {
    
    @scala.inline
    def apply(confident: Boolean, value: js.Any): Confident = {
      val __obj = js.Dynamic.literal(confident = confident.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Confident]
    }
    
    @scala.inline
    implicit class ConfidentMutableBuilder[Self <: Confident] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfident(value: Boolean): Self = StObject.set(x, "confident", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Existing extends StObject {
    
    var existing: Binding
    
    var identifier: Identifier_
    
    var kind: `var` | let | const
    
    var path: NodePath[Node]
    
    var scope: Scope
  }
  object Existing {
    
    @scala.inline
    def apply(
      existing: Binding,
      identifier: Identifier_,
      kind: `var` | let | const,
      path: NodePath[Node],
      scope: Scope
    ): Existing = {
      val __obj = js.Dynamic.literal(existing = existing.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[Existing]
    }
    
    @scala.inline
    implicit class ExistingMutableBuilder[Self <: Existing] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExisting(value: Binding): Self = StObject.set(x, "existing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentifier(value: Identifier_): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKind(value: `var` | let | const): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: NodePath[Node]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScope(value: Scope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    }
  }
}
