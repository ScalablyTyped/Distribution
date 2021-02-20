package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ArrowFunctionExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `143` extends StObject {
  
  var `type`: ArrowFunctionExpression = js.native
}
object `143` {
  
  @scala.inline
  def apply(`type`: ArrowFunctionExpression): `143` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`143`]
  }
  
  @scala.inline
  implicit class `143MutableBuilder`[Self <: `143`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ArrowFunctionExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
