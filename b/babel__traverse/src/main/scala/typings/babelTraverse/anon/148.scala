package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.Variance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `148` extends StObject {
  
  var `type`: Variance
}
object `148` {
  
  @scala.inline
  def apply(): `148` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Variance")
    __obj.asInstanceOf[`148`]
  }
  
  @scala.inline
  implicit class `148MutableBuilder`[Self <: `148`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: Variance): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
