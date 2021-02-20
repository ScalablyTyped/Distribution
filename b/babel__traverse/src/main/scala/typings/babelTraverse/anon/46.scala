package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.CallExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `46` extends StObject {
  
  var `type`: CallExpression = js.native
}
object `46` {
  
  @scala.inline
  def apply(`type`: CallExpression): `46` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`46`]
  }
  
  @scala.inline
  implicit class `46MutableBuilder`[Self <: `46`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: CallExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
