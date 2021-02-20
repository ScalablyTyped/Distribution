package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.DoExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `212` extends StObject {
  
  var `type`: DoExpression = js.native
}
object `212` {
  
  @scala.inline
  def apply(`type`: DoExpression): `212` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`212`]
  }
  
  @scala.inline
  implicit class `212MutableBuilder`[Self <: `212`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: DoExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
