package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.EmptyStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait EmptyStatement_
  extends StObject
     with BaseNode
     with Standardized
     with Statement {
  
  @JSName("type")
  var type_EmptyStatement_ : EmptyStatement
}
object EmptyStatement_ {
  
  inline def apply(): EmptyStatement_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("EmptyStatement")
    __obj.asInstanceOf[EmptyStatement_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EmptyStatement_] (val x: Self) extends AnyVal {
    
    inline def setType(value: EmptyStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
