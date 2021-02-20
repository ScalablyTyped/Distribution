package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSConditionalType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `17` extends StObject {
  
  var `type`: TSConditionalType = js.native
}
object `17` {
  
  @scala.inline
  def apply(`type`: TSConditionalType): `17` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`17`]
  }
  
  @scala.inline
  implicit class `17MutableBuilder`[Self <: `17`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSConditionalType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
