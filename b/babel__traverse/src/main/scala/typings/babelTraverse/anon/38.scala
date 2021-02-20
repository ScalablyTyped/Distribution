package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.WhileStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `38` extends StObject {
  
  var `type`: WhileStatement = js.native
}
object `38` {
  
  @scala.inline
  def apply(`type`: WhileStatement): `38` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`38`]
  }
  
  @scala.inline
  implicit class `38MutableBuilder`[Self <: `38`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: WhileStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
