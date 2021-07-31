package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TypeParameter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `168` extends StObject {
  
  var `type`: TypeParameter
}
object `168` {
  
  @scala.inline
  def apply(): `168` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TypeParameter")
    __obj.asInstanceOf[`168`]
  }
  
  @scala.inline
  implicit class `168MutableBuilder`[Self <: `168`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TypeParameter): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
