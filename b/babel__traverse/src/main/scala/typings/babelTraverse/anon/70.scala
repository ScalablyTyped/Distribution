package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TaggedTemplateExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `70` extends StObject {
  
  var `type`: TaggedTemplateExpression = js.native
}
object `70` {
  
  @scala.inline
  def apply(`type`: TaggedTemplateExpression): `70` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`70`]
  }
  
  @scala.inline
  implicit class `70MutableBuilder`[Self <: `70`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TaggedTemplateExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
