package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSUnionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `93` extends StObject {
  
  var `type`: TSUnionType
}
object `93` {
  
  inline def apply(): `93` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSUnionType")
    __obj.asInstanceOf[`93`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `93`] (val x: Self) extends AnyVal {
    
    inline def setType(value: TSUnionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
