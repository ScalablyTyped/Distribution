package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSTupleType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `199` extends StObject {
  
  var `type`: TSTupleType
}
object `199` {
  
  inline def apply(): `199` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSTupleType")
    __obj.asInstanceOf[`199`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `199`] (val x: Self) extends AnyVal {
    
    inline def setType(value: TSTupleType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
