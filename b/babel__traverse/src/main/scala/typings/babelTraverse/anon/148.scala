package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.Variance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `148` extends StObject {
  
  var `type`: Variance = js.native
}
object `148` {
  
  @scala.inline
  def apply(`type`: Variance): `148` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`148`]
  }
  
  @scala.inline
  implicit class `148MutableBuilder`[Self <: `148`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: Variance): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
