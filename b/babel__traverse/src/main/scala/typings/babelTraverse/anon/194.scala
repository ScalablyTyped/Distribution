package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSTupleType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `194` extends StObject {
  
  var `type`: TSTupleType
}
object `194` {
  
  @scala.inline
  def apply(): `194` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSTupleType")
    __obj.asInstanceOf[`194`]
  }
  
  @scala.inline
  implicit class `194MutableBuilder`[Self <: `194`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSTupleType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
