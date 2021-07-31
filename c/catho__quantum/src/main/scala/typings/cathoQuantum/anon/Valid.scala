package typings.cathoQuantum.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Valid extends StObject {
  
  var valid: Boolean
}
object Valid {
  
  @scala.inline
  def apply(valid: Boolean): Valid = {
    val __obj = js.Dynamic.literal(valid = valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Valid]
  }
  
  @scala.inline
  implicit class ValidMutableBuilder[Self <: Valid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
  }
}
