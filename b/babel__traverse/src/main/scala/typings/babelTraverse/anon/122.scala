package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ImportAttribute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `122` extends StObject {
  
  var `type`: ImportAttribute
}
object `122` {
  
  inline def apply(): `122` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ImportAttribute")
    __obj.asInstanceOf[`122`]
  }
  
  extension [Self <: `122`](x: Self) {
    
    inline def setType(value: ImportAttribute): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
