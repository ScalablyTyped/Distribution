package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ArrayPattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `112` extends StObject {
  
  var `type`: ArrayPattern
}
object `112` {
  
  @scala.inline
  def apply(): `112` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ArrayPattern")
    __obj.asInstanceOf[`112`]
  }
  
  @scala.inline
  implicit class `112MutableBuilder`[Self <: `112`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ArrayPattern): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
