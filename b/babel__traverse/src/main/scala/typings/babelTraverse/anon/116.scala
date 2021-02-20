package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ExistsTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `116` extends StObject {
  
  var `type`: ExistsTypeAnnotation = js.native
}
object `116` {
  
  @scala.inline
  def apply(`type`: ExistsTypeAnnotation): `116` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`116`]
  }
  
  @scala.inline
  implicit class `116MutableBuilder`[Self <: `116`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ExistsTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
