package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSEnumDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `89` extends StObject {
  
  var `type`: TSEnumDeclaration
}
object `89` {
  
  inline def apply(): `89` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSEnumDeclaration")
    __obj.asInstanceOf[`89`]
  }
  
  extension [Self <: `89`](x: Self) {
    
    inline def setType(value: TSEnumDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
