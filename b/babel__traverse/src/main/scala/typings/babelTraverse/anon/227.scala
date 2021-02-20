package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ThisExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `227` extends StObject {
  
  var `type`: ThisExpression = js.native
}
object `227` {
  
  @scala.inline
  def apply(`type`: ThisExpression): `227` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`227`]
  }
  
  @scala.inline
  implicit class `227MutableBuilder`[Self <: `227`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ThisExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
