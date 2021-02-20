package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ArrayExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `55` extends StObject {
  
  var `type`: ArrayExpression = js.native
}
object `55` {
  
  @scala.inline
  def apply(`type`: ArrayExpression): `55` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`55`]
  }
  
  @scala.inline
  implicit class `55MutableBuilder`[Self <: `55`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ArrayExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
