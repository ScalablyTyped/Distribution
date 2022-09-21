package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.DeclaredPredicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeclaredPredicate_
  extends StObject
     with BaseNode
     with Flow
     with FlowPredicate
     with Node {
  
  @JSName("type")
  var type_DeclaredPredicate_ : DeclaredPredicate
  
  var value: Flow
}
object DeclaredPredicate_ {
  
  inline def apply(value: Flow): DeclaredPredicate_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclaredPredicate")
    __obj.asInstanceOf[DeclaredPredicate_]
  }
  
  extension [Self <: DeclaredPredicate_](x: Self) {
    
    inline def setType(value: DeclaredPredicate): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Flow): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
