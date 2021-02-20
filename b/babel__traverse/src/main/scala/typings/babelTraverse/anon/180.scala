package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSOptionalType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `180` extends StObject {
  
  var `type`: TSOptionalType = js.native
}
object `180` {
  
  @scala.inline
  def apply(`type`: TSOptionalType): `180` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`180`]
  }
  
  @scala.inline
  implicit class `180MutableBuilder`[Self <: `180`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSOptionalType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
