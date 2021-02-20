package typings.css.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Declaration extends Node {
  
  /** The property name, trimmed from whitespace and comments. May not be empty. */
  var property: js.UndefOr[String] = js.native
  
  /** The value of the property, trimmed from whitespace and comments. Empty values are allowed. */
  var value: js.UndefOr[String] = js.native
}
object Declaration {
  
  @scala.inline
  def apply(): Declaration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Declaration]
  }
  
  @scala.inline
  implicit class DeclarationMutableBuilder[Self <: Declaration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
