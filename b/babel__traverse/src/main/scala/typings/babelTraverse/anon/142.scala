package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSExportAssignment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `142` extends StObject {
  
  var `type`: TSExportAssignment
}
object `142` {
  
  inline def apply(): `142` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSExportAssignment")
    __obj.asInstanceOf[`142`]
  }
  
  extension [Self <: `142`](x: Self) {
    
    inline def setType(value: TSExportAssignment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
