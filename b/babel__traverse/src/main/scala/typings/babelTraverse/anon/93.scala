package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.PrivateName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `93` extends StObject {
  
  var `type`: PrivateName = js.native
}
object `93` {
  
  @scala.inline
  def apply(`type`: PrivateName): `93` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`93`]
  }
  
  @scala.inline
  implicit class `93MutableBuilder`[Self <: `93`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: PrivateName): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
