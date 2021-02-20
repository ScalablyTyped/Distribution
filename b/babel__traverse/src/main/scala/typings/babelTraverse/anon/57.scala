package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSVoidKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `57` extends StObject {
  
  var `type`: TSVoidKeyword = js.native
}
object `57` {
  
  @scala.inline
  def apply(`type`: TSVoidKeyword): `57` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`57`]
  }
  
  @scala.inline
  implicit class `57MutableBuilder`[Self <: `57`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSVoidKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
