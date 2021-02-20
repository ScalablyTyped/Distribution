package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.BindExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `77` extends StObject {
  
  var `type`: BindExpression = js.native
}
object `77` {
  
  @scala.inline
  def apply(`type`: BindExpression): `77` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`77`]
  }
  
  @scala.inline
  implicit class `77MutableBuilder`[Self <: `77`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: BindExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
