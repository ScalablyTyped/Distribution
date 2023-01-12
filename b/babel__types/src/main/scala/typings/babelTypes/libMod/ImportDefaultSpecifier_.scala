package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.ImportDefaultSpecifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportDefaultSpecifier_
  extends StObject
     with BaseNode
     with ModuleSpecifier
     with Node
     with Standardized {
  
  var local: Identifier_
  
  @JSName("type")
  var type_ImportDefaultSpecifier_ : ImportDefaultSpecifier
}
object ImportDefaultSpecifier_ {
  
  inline def apply(local: Identifier_): ImportDefaultSpecifier_ = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ImportDefaultSpecifier")
    __obj.asInstanceOf[ImportDefaultSpecifier_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImportDefaultSpecifier_] (val x: Self) extends AnyVal {
    
    inline def setLocal(value: Identifier_): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    inline def setType(value: ImportDefaultSpecifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
