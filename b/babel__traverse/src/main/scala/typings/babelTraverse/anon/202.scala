package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSIndexSignature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `202` extends StObject {
  
  var `type`: TSIndexSignature = js.native
}
object `202` {
  
  @scala.inline
  def apply(`type`: TSIndexSignature): `202` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`202`]
  }
  
  @scala.inline
  implicit class `202MutableBuilder`[Self <: `202`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSIndexSignature): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
