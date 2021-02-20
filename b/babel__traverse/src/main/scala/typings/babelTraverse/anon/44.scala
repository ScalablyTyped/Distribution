package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.OptionalCallExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `44` extends StObject {
  
  var `type`: OptionalCallExpression = js.native
}
object `44` {
  
  @scala.inline
  def apply(`type`: OptionalCallExpression): `44` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`44`]
  }
  
  @scala.inline
  implicit class `44MutableBuilder`[Self <: `44`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: OptionalCallExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
