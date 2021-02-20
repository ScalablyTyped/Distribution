package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.FunctionExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `188` extends StObject {
  
  var `type`: FunctionExpression = js.native
}
object `188` {
  
  @scala.inline
  def apply(`type`: FunctionExpression): `188` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`188`]
  }
  
  @scala.inline
  implicit class `188MutableBuilder`[Self <: `188`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: FunctionExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
