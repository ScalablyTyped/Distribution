package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSUnknownKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `54` extends StObject {
  
  var `type`: TSUnknownKeyword
}
object `54` {
  
  @scala.inline
  def apply(): `54` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSUnknownKeyword")
    __obj.asInstanceOf[`54`]
  }
  
  @scala.inline
  implicit class `54MutableBuilder`[Self <: `54`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSUnknownKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
