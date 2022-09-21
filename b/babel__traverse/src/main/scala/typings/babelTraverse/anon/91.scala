package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSTypeAliasDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `91` extends StObject {
  
  var `type`: TSTypeAliasDeclaration
}
object `91` {
  
  inline def apply(): `91` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSTypeAliasDeclaration")
    __obj.asInstanceOf[`91`]
  }
  
  extension [Self <: `91`](x: Self) {
    
    inline def setType(value: TSTypeAliasDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
