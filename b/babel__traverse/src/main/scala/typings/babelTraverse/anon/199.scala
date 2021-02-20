package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ParenthesizedExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `199` extends StObject {
  
  var `type`: ParenthesizedExpression = js.native
}
object `199` {
  
  @scala.inline
  def apply(`type`: ParenthesizedExpression): `199` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`199`]
  }
  
  @scala.inline
  implicit class `199MutableBuilder`[Self <: `199`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ParenthesizedExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
