package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.AssignmentPattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `63` extends StObject {
  
  var `type`: AssignmentPattern = js.native
}
object `63` {
  
  @scala.inline
  def apply(`type`: AssignmentPattern): `63` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`63`]
  }
  
  @scala.inline
  implicit class `63MutableBuilder`[Self <: `63`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: AssignmentPattern): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
