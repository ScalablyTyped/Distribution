package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSBigIntKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `52` extends StObject {
  
  var `type`: TSBigIntKeyword
}
object `52` {
  
  @scala.inline
  def apply(): `52` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSBigIntKeyword")
    __obj.asInstanceOf[`52`]
  }
  
  @scala.inline
  implicit class `52MutableBuilder`[Self <: `52`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSBigIntKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
