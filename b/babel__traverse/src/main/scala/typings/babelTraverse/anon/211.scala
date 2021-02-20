package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSObjectKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `211` extends StObject {
  
  var `type`: TSObjectKeyword = js.native
}
object `211` {
  
  @scala.inline
  def apply(`type`: TSObjectKeyword): `211` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`211`]
  }
  
  @scala.inline
  implicit class `211MutableBuilder`[Self <: `211`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSObjectKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
