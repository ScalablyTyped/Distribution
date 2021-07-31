package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSTypeOperator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `51` extends StObject {
  
  var `type`: TSTypeOperator
}
object `51` {
  
  @scala.inline
  def apply(): `51` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSTypeOperator")
    __obj.asInstanceOf[`51`]
  }
  
  @scala.inline
  implicit class `51MutableBuilder`[Self <: `51`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSTypeOperator): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
