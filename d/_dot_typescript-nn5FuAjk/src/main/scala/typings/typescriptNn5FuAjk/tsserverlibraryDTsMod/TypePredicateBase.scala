package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypePredicateBase extends StObject {
  
  var kind: TypePredicateKind
  
  var `type`: js.UndefOr[Type] = js.undefined
}
object TypePredicateBase {
  
  inline def apply(kind: TypePredicateKind): TypePredicateBase = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypePredicateBase]
  }
  
  extension [Self <: TypePredicateBase](x: Self) {
    
    inline def setKind(value: TypePredicateKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
