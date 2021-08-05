package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ExportSpecifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `113` extends StObject {
  
  var `type`: ExportSpecifier
}
object `113` {
  
  inline def apply(): `113` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ExportSpecifier")
    __obj.asInstanceOf[`113`]
  }
  
  extension [Self <: `113`](x: Self) {
    
    inline def setType(value: ExportSpecifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
