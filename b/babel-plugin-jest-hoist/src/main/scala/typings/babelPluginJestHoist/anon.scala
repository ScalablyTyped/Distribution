package typings.babelPluginJestHoist

import typings.babelTypes.mod.Identifier_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DeclareJestObjGetterIdentifier extends StObject {
    
    def declareJestObjGetterIdentifier(): Identifier_
    
    var jestObjGetterIdentifier: js.UndefOr[Identifier_] = js.undefined
  }
  object DeclareJestObjGetterIdentifier {
    
    inline def apply(declareJestObjGetterIdentifier: () => Identifier_): DeclareJestObjGetterIdentifier = {
      val __obj = js.Dynamic.literal(declareJestObjGetterIdentifier = js.Any.fromFunction0(declareJestObjGetterIdentifier))
      __obj.asInstanceOf[DeclareJestObjGetterIdentifier]
    }
    
    extension [Self <: DeclareJestObjGetterIdentifier](x: Self) {
      
      inline def setDeclareJestObjGetterIdentifier(value: () => Identifier_): Self = StObject.set(x, "declareJestObjGetterIdentifier", js.Any.fromFunction0(value))
      
      inline def setJestObjGetterIdentifier(value: Identifier_): Self = StObject.set(x, "jestObjGetterIdentifier", value.asInstanceOf[js.Any])
      
      inline def setJestObjGetterIdentifierUndefined: Self = StObject.set(x, "jestObjGetterIdentifier", js.undefined)
    }
  }
}
