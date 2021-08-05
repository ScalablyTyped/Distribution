package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `27` extends StObject {
  
  var `type`: File
}
object `27` {
  
  inline def apply(): `27` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("File")
    __obj.asInstanceOf[`27`]
  }
  
  extension [Self <: `27`](x: Self) {
    
    inline def setType(value: File): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
