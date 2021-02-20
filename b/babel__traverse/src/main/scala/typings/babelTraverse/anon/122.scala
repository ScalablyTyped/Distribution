package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.JSXEmptyExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `122` extends StObject {
  
  var `type`: JSXEmptyExpression = js.native
}
object `122` {
  
  @scala.inline
  def apply(`type`: JSXEmptyExpression): `122` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`122`]
  }
  
  @scala.inline
  implicit class `122MutableBuilder`[Self <: `122`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: JSXEmptyExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
