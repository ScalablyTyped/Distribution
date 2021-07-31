package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ImportDefaultSpecifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait ImportDefaultSpecifier_
  extends StObject
     with BaseNode
     with ModuleSpecifier {
  
  var local: Identifier_
  
  @JSName("type")
  var type_ImportDefaultSpecifier_ : ImportDefaultSpecifier
}
object ImportDefaultSpecifier_ {
  
  @scala.inline
  def apply(local: Identifier_): ImportDefaultSpecifier_ = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ImportDefaultSpecifier")
    __obj.asInstanceOf[ImportDefaultSpecifier_]
  }
  
  @scala.inline
  implicit class ImportDefaultSpecifier_MutableBuilder[Self <: ImportDefaultSpecifier_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocal(value: Identifier_): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ImportDefaultSpecifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
