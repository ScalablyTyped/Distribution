package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.LogicalExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `68` extends StObject {
  
  var `type`: LogicalExpression = js.native
}
object `68` {
  
  @scala.inline
  def apply(`type`: LogicalExpression): `68` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`68`]
  }
  
  @scala.inline
  implicit class `68MutableBuilder`[Self <: `68`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: LogicalExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
