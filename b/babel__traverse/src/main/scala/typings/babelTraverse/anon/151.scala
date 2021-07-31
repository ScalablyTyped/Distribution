package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSTypeLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `151` extends StObject {
  
  var `type`: TSTypeLiteral
}
object `151` {
  
  @scala.inline
  def apply(): `151` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSTypeLiteral")
    __obj.asInstanceOf[`151`]
  }
  
  @scala.inline
  implicit class `151MutableBuilder`[Self <: `151`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSTypeLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
