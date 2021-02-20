package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSParameterProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `191` extends StObject {
  
  var `type`: TSParameterProperty = js.native
}
object `191` {
  
  @scala.inline
  def apply(`type`: TSParameterProperty): `191` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`191`]
  }
  
  @scala.inline
  implicit class `191MutableBuilder`[Self <: `191`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSParameterProperty): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
