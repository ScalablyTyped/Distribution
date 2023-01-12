package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.DeclareInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `161` extends StObject {
  
  var `type`: DeclareInterface
}
object `161` {
  
  inline def apply(): `161` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("DeclareInterface")
    __obj.asInstanceOf[`161`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `161`] (val x: Self) extends AnyVal {
    
    inline def setType(value: DeclareInterface): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
