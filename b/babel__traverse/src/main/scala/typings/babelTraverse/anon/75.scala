package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.QualifiedTypeIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `75` extends StObject {
  
  var `type`: QualifiedTypeIdentifier
}
object `75` {
  
  inline def apply(): `75` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("QualifiedTypeIdentifier")
    __obj.asInstanceOf[`75`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `75`] (val x: Self) extends AnyVal {
    
    inline def setType(value: QualifiedTypeIdentifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
