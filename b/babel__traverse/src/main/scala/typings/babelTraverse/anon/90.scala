package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSEnumDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `90` extends StObject {
  
  var `type`: TSEnumDeclaration
}
object `90` {
  
  inline def apply(): `90` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSEnumDeclaration")
    __obj.asInstanceOf[`90`]
  }
  
  extension [Self <: `90`](x: Self) {
    
    inline def setType(value: TSEnumDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
