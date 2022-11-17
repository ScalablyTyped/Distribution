package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportNamespaceSpecifier_
  extends StObject
     with BaseNode {
  
  var local: Identifier_
  
  @JSName("type")
  var type_ImportNamespaceSpecifier_ : "ImportNamespaceSpecifier"
}
object ImportNamespaceSpecifier_ {
  
  inline def apply(local: Identifier_): ImportNamespaceSpecifier_ = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ImportNamespaceSpecifier")
    __obj.asInstanceOf[ImportNamespaceSpecifier_]
  }
  
  extension [Self <: ImportNamespaceSpecifier_](x: Self) {
    
    inline def setLocal(value: Identifier_): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    inline def setType(value: "ImportNamespaceSpecifier"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
