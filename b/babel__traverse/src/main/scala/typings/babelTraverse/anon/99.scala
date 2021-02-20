package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSStringKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `99` extends StObject {
  
  var `type`: TSStringKeyword = js.native
}
object `99` {
  
  @scala.inline
  def apply(`type`: TSStringKeyword): `99` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`99`]
  }
  
  @scala.inline
  implicit class `99MutableBuilder`[Self <: `99`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSStringKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
