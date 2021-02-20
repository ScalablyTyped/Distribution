package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSNeverKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `230` extends StObject {
  
  var `type`: TSNeverKeyword = js.native
}
object `230` {
  
  @scala.inline
  def apply(`type`: TSNeverKeyword): `230` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`230`]
  }
  
  @scala.inline
  implicit class `230MutableBuilder`[Self <: `230`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSNeverKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
