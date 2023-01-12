package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSExportAssignment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `145` extends StObject {
  
  var `type`: TSExportAssignment
}
object `145` {
  
  inline def apply(): `145` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSExportAssignment")
    __obj.asInstanceOf[`145`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `145`] (val x: Self) extends AnyVal {
    
    inline def setType(value: TSExportAssignment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
