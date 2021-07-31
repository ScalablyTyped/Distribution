package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ThrowStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `137` extends StObject {
  
  var `type`: ThrowStatement
}
object `137` {
  
  @scala.inline
  def apply(): `137` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ThrowStatement")
    __obj.asInstanceOf[`137`]
  }
  
  @scala.inline
  implicit class `137MutableBuilder`[Self <: `137`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ThrowStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
