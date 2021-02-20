package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.Identifier
import typings.babelTypes.babelTypesStrings.TSQualifiedName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.mod.Identifier_
  - typings.babelTypes.mod.TSQualifiedName_
*/
trait TSEntityName extends _Node
object TSEntityName {
  
  @scala.inline
  def Identifier_(name: String, `type`: Identifier): typings.babelTypes.mod.Identifier_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.Identifier_]
  }
  
  @scala.inline
  def TSQualifiedName_(left: TSEntityName, right: Identifier_, `type`: TSQualifiedName): typings.babelTypes.mod.TSQualifiedName_ = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.TSQualifiedName_]
  }
}
