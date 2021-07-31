package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.DeclareModuleExports
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `216` extends StObject {
  
  var `type`: DeclareModuleExports
}
object `216` {
  
  @scala.inline
  def apply(): `216` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("DeclareModuleExports")
    __obj.asInstanceOf[`216`]
  }
  
  @scala.inline
  implicit class `216MutableBuilder`[Self <: `216`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: DeclareModuleExports): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
