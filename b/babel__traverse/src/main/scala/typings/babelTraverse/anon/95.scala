package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSNonNullExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `95` extends StObject {
  
  var `type`: TSNonNullExpression = js.native
}
object `95` {
  
  @scala.inline
  def apply(`type`: TSNonNullExpression): `95` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`95`]
  }
  
  @scala.inline
  implicit class `95MutableBuilder`[Self <: `95`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSNonNullExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
