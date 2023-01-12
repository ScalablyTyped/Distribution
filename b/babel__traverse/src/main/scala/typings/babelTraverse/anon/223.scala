package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.DeclareModuleExports
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `223` extends StObject {
  
  var `type`: DeclareModuleExports
}
object `223` {
  
  inline def apply(): `223` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("DeclareModuleExports")
    __obj.asInstanceOf[`223`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `223`] (val x: Self) extends AnyVal {
    
    inline def setType(value: DeclareModuleExports): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
