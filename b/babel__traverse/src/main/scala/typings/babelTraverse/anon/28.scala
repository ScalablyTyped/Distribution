package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `28` extends StObject {
  
  var `type`: File
}
object `28` {
  
  inline def apply(): `28` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("File")
    __obj.asInstanceOf[`28`]
  }
  
  extension [Self <: `28`](x: Self) {
    
    inline def setType(value: File): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
