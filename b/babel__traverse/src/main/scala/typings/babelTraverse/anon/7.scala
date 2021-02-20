package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSAsExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `7` extends StObject {
  
  var `type`: TSAsExpression = js.native
}
object `7` {
  
  @scala.inline
  def apply(`type`: TSAsExpression): `7` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`7`]
  }
  
  @scala.inline
  implicit class `7MutableBuilder`[Self <: `7`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSAsExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
