package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.BigIntLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `179` extends StObject {
  
  var `type`: BigIntLiteral
}
object `179` {
  
  @scala.inline
  def apply(): `179` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("BigIntLiteral")
    __obj.asInstanceOf[`179`]
  }
  
  @scala.inline
  implicit class `179MutableBuilder`[Self <: `179`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: BigIntLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
