package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.QualifiedTypeIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait QualifiedTypeIdentifier_
  extends StObject
     with BaseNode
     with Flow {
  
  var id: Identifier_
  
  var qualification: Identifier_ | QualifiedTypeIdentifier_
  
  @JSName("type")
  var type_QualifiedTypeIdentifier_ : QualifiedTypeIdentifier
}
object QualifiedTypeIdentifier_ {
  
  inline def apply(id: Identifier_, qualification: Identifier_ | QualifiedTypeIdentifier_): QualifiedTypeIdentifier_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], qualification = qualification.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("QualifiedTypeIdentifier")
    __obj.asInstanceOf[QualifiedTypeIdentifier_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QualifiedTypeIdentifier_] (val x: Self) extends AnyVal {
    
    inline def setId(value: Identifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setQualification(value: Identifier_ | QualifiedTypeIdentifier_): Self = StObject.set(x, "qualification", value.asInstanceOf[js.Any])
    
    inline def setType(value: QualifiedTypeIdentifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
