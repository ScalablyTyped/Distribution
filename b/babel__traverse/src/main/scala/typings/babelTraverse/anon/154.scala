package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ObjectTypeProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `154` extends StObject {
  
  var `type`: ObjectTypeProperty = js.native
}
object `154` {
  
  @scala.inline
  def apply(`type`: ObjectTypeProperty): `154` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`154`]
  }
  
  @scala.inline
  implicit class `154MutableBuilder`[Self <: `154`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ObjectTypeProperty): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
