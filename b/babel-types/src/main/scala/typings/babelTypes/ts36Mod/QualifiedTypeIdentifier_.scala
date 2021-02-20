package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.QualifiedTypeIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QualifiedTypeIdentifier_
  extends Node
     with Flow {
  
  var id: Identifier_ = js.native
  
  var qualification: Identifier_ | QualifiedTypeIdentifier_ = js.native
  
  @JSName("type")
  var type_QualifiedTypeIdentifier_ : QualifiedTypeIdentifier = js.native
}
object QualifiedTypeIdentifier_ {
  
  @scala.inline
  def apply(
    end: Double,
    id: Identifier_,
    loc: SourceLocation,
    qualification: Identifier_ | QualifiedTypeIdentifier_,
    start: Double,
    `type`: QualifiedTypeIdentifier
  ): QualifiedTypeIdentifier_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], qualification = qualification.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QualifiedTypeIdentifier_]
  }
  
  @scala.inline
  implicit class QualifiedTypeIdentifier_MutableBuilder[Self <: QualifiedTypeIdentifier_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Identifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualification(value: Identifier_ | QualifiedTypeIdentifier_): Self = StObject.set(x, "qualification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: QualifiedTypeIdentifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
