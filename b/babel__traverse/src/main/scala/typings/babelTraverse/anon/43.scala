package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.SwitchStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `43` extends StObject {
  
  var `type`: SwitchStatement = js.native
}
object `43` {
  
  @scala.inline
  def apply(`type`: SwitchStatement): `43` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`43`]
  }
  
  @scala.inline
  implicit class `43MutableBuilder`[Self <: `43`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: SwitchStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
