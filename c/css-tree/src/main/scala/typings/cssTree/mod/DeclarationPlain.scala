package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeclarationPlain
  extends CssNodeCommon
     with CssNodePlain {
  
  var important: Boolean | String = js.native
  
  var property: String = js.native
  
  @JSName("type")
  var type_DeclarationPlain: typings.cssTree.cssTreeStrings.Declaration = js.native
  
  var value: ValuePlain | Raw = js.native
}
object DeclarationPlain {
  
  @scala.inline
  def apply(
    important: Boolean | String,
    property: String,
    `type`: typings.cssTree.cssTreeStrings.Declaration,
    value: ValuePlain | Raw
  ): DeclarationPlain = {
    val __obj = js.Dynamic.literal(important = important.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclarationPlain]
  }
  
  @scala.inline
  implicit class DeclarationPlainMutableBuilder[Self <: DeclarationPlain] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImportant(value: Boolean | String): Self = StObject.set(x, "important", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.cssTree.cssTreeStrings.Declaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: ValuePlain | Raw): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
