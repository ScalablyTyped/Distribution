package typings.backbone.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Validable extends StObject {
  
  var validate: js.UndefOr[Boolean] = js.native
}
object Validable {
  
  @scala.inline
  def apply(): Validable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Validable]
  }
  
  @scala.inline
  implicit class ValidableMutableBuilder[Self <: Validable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValidate(value: Boolean): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
  }
}
