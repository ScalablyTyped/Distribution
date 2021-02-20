package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.YieldExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `11` extends StObject {
  
  var `type`: YieldExpression = js.native
}
object `11` {
  
  @scala.inline
  def apply(`type`: YieldExpression): `11` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`11`]
  }
  
  @scala.inline
  implicit class `11MutableBuilder`[Self <: `11`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: YieldExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
