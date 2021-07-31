package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.MemberExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `59` extends StObject {
  
  var `type`: MemberExpression
}
object `59` {
  
  @scala.inline
  def apply(): `59` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("MemberExpression")
    __obj.asInstanceOf[`59`]
  }
  
  @scala.inline
  implicit class `59MutableBuilder`[Self <: `59`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: MemberExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
