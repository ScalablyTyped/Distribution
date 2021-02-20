package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ObjectTypeIndexer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `170` extends StObject {
  
  var `type`: ObjectTypeIndexer = js.native
}
object `170` {
  
  @scala.inline
  def apply(`type`: ObjectTypeIndexer): `170` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`170`]
  }
  
  @scala.inline
  implicit class `170MutableBuilder`[Self <: `170`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ObjectTypeIndexer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
