package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSIndexedAccessType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `28` extends StObject {
  
  var `type`: TSIndexedAccessType
}
object `28` {
  
  inline def apply(): `28` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSIndexedAccessType")
    __obj.asInstanceOf[`28`]
  }
  
  extension [Self <: `28`](x: Self) {
    
    inline def setType(value: TSIndexedAccessType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
