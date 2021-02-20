package typings.babelPluginJestHoist

import typings.babelTypes.mod.Identifier_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait DeclareJestObjGetterIdentifier extends StObject {
    
    def declareJestObjGetterIdentifier(): Identifier_ = js.native
    
    var jestObjGetterIdentifier: js.UndefOr[Identifier_] = js.native
  }
  object DeclareJestObjGetterIdentifier {
    
    @scala.inline
    def apply(declareJestObjGetterIdentifier: () => Identifier_): DeclareJestObjGetterIdentifier = {
      val __obj = js.Dynamic.literal(declareJestObjGetterIdentifier = js.Any.fromFunction0(declareJestObjGetterIdentifier))
      __obj.asInstanceOf[DeclareJestObjGetterIdentifier]
    }
    
    @scala.inline
    implicit class DeclareJestObjGetterIdentifierMutableBuilder[Self <: DeclareJestObjGetterIdentifier] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeclareJestObjGetterIdentifier(value: () => Identifier_): Self = StObject.set(x, "declareJestObjGetterIdentifier", js.Any.fromFunction0(value))
      
      @scala.inline
      def setJestObjGetterIdentifier(value: Identifier_): Self = StObject.set(x, "jestObjGetterIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJestObjGetterIdentifierUndefined: Self = StObject.set(x, "jestObjGetterIdentifier", js.undefined)
    }
  }
}
