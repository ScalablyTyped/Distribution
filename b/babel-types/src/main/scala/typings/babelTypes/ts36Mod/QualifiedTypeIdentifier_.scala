package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.QualifiedTypeIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QualifiedTypeIdentifier_
  extends StObject
     with Node
     with Flow {
  
  var id: Identifier_
  
  var qualification: Identifier_ | QualifiedTypeIdentifier_
  
  @JSName("type")
  var type_QualifiedTypeIdentifier_ : QualifiedTypeIdentifier
}
object QualifiedTypeIdentifier_ {
  
  inline def apply(
    end: Double,
    id: Identifier_,
    loc: SourceLocation,
    qualification: Identifier_ | QualifiedTypeIdentifier_,
    start: Double
  ): QualifiedTypeIdentifier_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], qualification = qualification.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("QualifiedTypeIdentifier")
    __obj.asInstanceOf[QualifiedTypeIdentifier_]
  }
  
  extension [Self <: QualifiedTypeIdentifier_](x: Self) {
    
    inline def setId(value: Identifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setQualification(value: Identifier_ | QualifiedTypeIdentifier_): Self = StObject.set(x, "qualification", value.asInstanceOf[js.Any])
    
    inline def setType(value: QualifiedTypeIdentifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
