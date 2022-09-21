package typings.typescriptNn5FuAjk.mod

import typings.typescriptNn5FuAjk.mod.TypePredicateKind.This
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThisTypePredicate
  extends StObject
     with TypePredicateBase
     with TypePredicate {
  
  @JSName("kind")
  var kind_ThisTypePredicate: This
  
  var parameterIndex: Unit
  
  var parameterName: Unit
  
  @JSName("type")
  var type_ThisTypePredicate: Type
}
object ThisTypePredicate {
  
  inline def apply(kind: This, parameterIndex: Unit, parameterName: Unit, `type`: Type): ThisTypePredicate = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], parameterIndex = parameterIndex.asInstanceOf[js.Any], parameterName = parameterName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThisTypePredicate]
  }
  
  extension [Self <: ThisTypePredicate](x: Self) {
    
    inline def setKind(value: This): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setParameterIndex(value: Unit): Self = StObject.set(x, "parameterIndex", value.asInstanceOf[js.Any])
    
    inline def setParameterName(value: Unit): Self = StObject.set(x, "parameterName", value.asInstanceOf[js.Any])
    
    inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
