package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSParenthesizedType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `220` extends StObject {
  
  var `type`: TSParenthesizedType
}
object `220` {
  
  @scala.inline
  def apply(): `220` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSParenthesizedType")
    __obj.asInstanceOf[`220`]
  }
  
  @scala.inline
  implicit class `220MutableBuilder`[Self <: `220`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSParenthesizedType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
