package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ObjectTypeIndexer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `175` extends StObject {
  
  var `type`: ObjectTypeIndexer
}
object `175` {
  
  inline def apply(): `175` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ObjectTypeIndexer")
    __obj.asInstanceOf[`175`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `175`] (val x: Self) extends AnyVal {
    
    inline def setType(value: ObjectTypeIndexer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
