package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.IndexedAccessType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `69` extends StObject {
  
  var `type`: IndexedAccessType
}
object `69` {
  
  inline def apply(): `69` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("IndexedAccessType")
    __obj.asInstanceOf[`69`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `69`] (val x: Self) extends AnyVal {
    
    inline def setType(value: IndexedAccessType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
