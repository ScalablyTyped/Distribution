package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TemplateLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `76` extends StObject {
  
  var `type`: TemplateLiteral = js.native
}
object `76` {
  
  @scala.inline
  def apply(`type`: TemplateLiteral): `76` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`76`]
  }
  
  @scala.inline
  implicit class `76MutableBuilder`[Self <: `76`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TemplateLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
