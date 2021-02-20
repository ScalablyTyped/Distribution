package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.UpdateExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `98` extends StObject {
  
  var `type`: UpdateExpression = js.native
}
object `98` {
  
  @scala.inline
  def apply(`type`: UpdateExpression): `98` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`98`]
  }
  
  @scala.inline
  implicit class `98MutableBuilder`[Self <: `98`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: UpdateExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
