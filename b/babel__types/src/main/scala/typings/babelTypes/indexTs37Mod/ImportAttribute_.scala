package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.ImportAttribute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportAttribute_
  extends BaseNode
     with _Node {
  
  var key: Identifier_ | StringLiteral_ = js.native
  
  @JSName("type")
  var type_ImportAttribute_ : ImportAttribute = js.native
  
  var value: StringLiteral_ = js.native
}
object ImportAttribute_ {
  
  @scala.inline
  def apply(key: Identifier_ | StringLiteral_, `type`: ImportAttribute, value: StringLiteral_): ImportAttribute_ = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportAttribute_]
  }
  
  @scala.inline
  implicit class ImportAttribute_MutableBuilder[Self <: ImportAttribute_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: Identifier_ | StringLiteral_): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ImportAttribute): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: StringLiteral_): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
