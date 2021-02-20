package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.JSXText
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `190` extends StObject {
  
  var `type`: JSXText = js.native
}
object `190` {
  
  @scala.inline
  def apply(`type`: JSXText): `190` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`190`]
  }
  
  @scala.inline
  implicit class `190MutableBuilder`[Self <: `190`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: JSXText): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
