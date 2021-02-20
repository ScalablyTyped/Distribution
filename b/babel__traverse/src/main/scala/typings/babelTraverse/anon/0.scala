package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSArrayType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `0` extends StObject {
  
  var `type`: TSArrayType = js.native
}
object `0` {
  
  @scala.inline
  def apply(`type`: TSArrayType): `0` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSArrayType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
