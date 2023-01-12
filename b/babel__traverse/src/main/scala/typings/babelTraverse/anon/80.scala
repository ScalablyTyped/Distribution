package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ExportDefaultDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `80` extends StObject {
  
  var `type`: ExportDefaultDeclaration
}
object `80` {
  
  inline def apply(): `80` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ExportDefaultDeclaration")
    __obj.asInstanceOf[`80`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `80`] (val x: Self) extends AnyVal {
    
    inline def setType(value: ExportDefaultDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
