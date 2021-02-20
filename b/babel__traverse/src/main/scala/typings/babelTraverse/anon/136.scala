package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.InterfaceExtends
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `136` extends StObject {
  
  var `type`: InterfaceExtends = js.native
}
object `136` {
  
  @scala.inline
  def apply(`type`: InterfaceExtends): `136` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`136`]
  }
  
  @scala.inline
  implicit class `136MutableBuilder`[Self <: `136`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: InterfaceExtends): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
