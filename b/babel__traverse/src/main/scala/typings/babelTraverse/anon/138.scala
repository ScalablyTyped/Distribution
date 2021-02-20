package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.V8IntrinsicIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `138` extends StObject {
  
  var `type`: V8IntrinsicIdentifier = js.native
}
object `138` {
  
  @scala.inline
  def apply(`type`: V8IntrinsicIdentifier): `138` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`138`]
  }
  
  @scala.inline
  implicit class `138MutableBuilder`[Self <: `138`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: V8IntrinsicIdentifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
