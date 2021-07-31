package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSTypePredicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `181` extends StObject {
  
  var `type`: TSTypePredicate
}
object `181` {
  
  @scala.inline
  def apply(): `181` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSTypePredicate")
    __obj.asInstanceOf[`181`]
  }
  
  @scala.inline
  implicit class `181MutableBuilder`[Self <: `181`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSTypePredicate): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
