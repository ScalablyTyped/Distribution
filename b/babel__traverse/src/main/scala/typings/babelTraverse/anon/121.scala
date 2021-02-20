package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ObjectExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `121` extends StObject {
  
  var `type`: ObjectExpression = js.native
}
object `121` {
  
  @scala.inline
  def apply(`type`: ObjectExpression): `121` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`121`]
  }
  
  @scala.inline
  implicit class `121MutableBuilder`[Self <: `121`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ObjectExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
