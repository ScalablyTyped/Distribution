package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSIndexedAccessType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `29` extends StObject {
  
  var `type`: TSIndexedAccessType
}
object `29` {
  
  inline def apply(): `29` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSIndexedAccessType")
    __obj.asInstanceOf[`29`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `29`] (val x: Self) extends AnyVal {
    
    inline def setType(value: TSIndexedAccessType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
