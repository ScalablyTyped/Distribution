package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.Import
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait Import_
  extends StObject
     with BaseNode
     with Expression
     with Standardized {
  
  @JSName("type")
  var type_Import_ : Import
}
object Import_ {
  
  inline def apply(): Import_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("Import")
    __obj.asInstanceOf[Import_]
  }
  
  extension [Self <: Import_](x: Self) {
    
    inline def setType(value: Import): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
