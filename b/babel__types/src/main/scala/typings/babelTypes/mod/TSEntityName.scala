package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.mod.Identifier_
  - typings.babelTypes.mod.TSQualifiedName_
*/
trait TSEntityName
  extends StObject
     with _Node
object TSEntityName {
  
  @scala.inline
  def Identifier_(name: String): typings.babelTypes.mod.Identifier_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], decorators = null, end = null, innerComments = null, leadingComments = null, loc = null, optional = null, start = null, trailingComments = null, typeAnnotation = null)
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[typings.babelTypes.mod.Identifier_]
  }
  
  @scala.inline
  def TSQualifiedName_(left: TSEntityName, right: Identifier_): typings.babelTypes.mod.TSQualifiedName_ = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSQualifiedName")
    __obj.asInstanceOf[typings.babelTypes.mod.TSQualifiedName_]
  }
}
