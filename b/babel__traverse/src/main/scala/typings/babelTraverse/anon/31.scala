package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.JSXExpressionContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `31` extends StObject {
  
  var `type`: JSXExpressionContainer = js.native
}
object `31` {
  
  @scala.inline
  def apply(`type`: JSXExpressionContainer): `31` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`31`]
  }
  
  @scala.inline
  implicit class `31MutableBuilder`[Self <: `31`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: JSXExpressionContainer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
