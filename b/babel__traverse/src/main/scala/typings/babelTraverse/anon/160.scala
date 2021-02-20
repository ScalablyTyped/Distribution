package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.Super
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `160` extends StObject {
  
  var `type`: Super = js.native
}
object `160` {
  
  @scala.inline
  def apply(`type`: Super): `160` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`160`]
  }
  
  @scala.inline
  implicit class `160MutableBuilder`[Self <: `160`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: Super): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
