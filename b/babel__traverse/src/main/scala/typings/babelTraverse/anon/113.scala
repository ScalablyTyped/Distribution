package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ImportSpecifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `113` extends StObject {
  
  var `type`: ImportSpecifier
}
object `113` {
  
  inline def apply(): `113` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ImportSpecifier")
    __obj.asInstanceOf[`113`]
  }
  
  extension [Self <: `113`](x: Self) {
    
    inline def setType(value: ImportSpecifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
