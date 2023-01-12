package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSTypeAliasDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `92` extends StObject {
  
  var `type`: TSTypeAliasDeclaration
}
object `92` {
  
  inline def apply(): `92` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSTypeAliasDeclaration")
    __obj.asInstanceOf[`92`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `92`] (val x: Self) extends AnyVal {
    
    inline def setType(value: TSTypeAliasDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
