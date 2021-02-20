package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TemplateElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `189` extends StObject {
  
  var `type`: TemplateElement = js.native
}
object `189` {
  
  @scala.inline
  def apply(`type`: TemplateElement): `189` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`189`]
  }
  
  @scala.inline
  implicit class `189MutableBuilder`[Self <: `189`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TemplateElement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
