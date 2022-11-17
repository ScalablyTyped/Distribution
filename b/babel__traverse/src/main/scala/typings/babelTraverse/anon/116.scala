package typings.babelTraverse.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `116` extends StObject {
  
  var `type`: "ExportSpecifier"
}
object `116` {
  
  inline def apply(): `116` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ExportSpecifier")
    __obj.asInstanceOf[`116`]
  }
  
  extension [Self <: `116`](x: Self) {
    
    inline def setType(value: "ExportSpecifier"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
