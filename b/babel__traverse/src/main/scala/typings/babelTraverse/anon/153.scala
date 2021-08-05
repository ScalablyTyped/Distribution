package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.DeclareExportDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `153` extends StObject {
  
  var `type`: DeclareExportDeclaration
}
object `153` {
  
  inline def apply(): `153` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("DeclareExportDeclaration")
    __obj.asInstanceOf[`153`]
  }
  
  extension [Self <: `153`](x: Self) {
    
    inline def setType(value: DeclareExportDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
