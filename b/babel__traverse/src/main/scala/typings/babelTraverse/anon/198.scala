package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSMethodSignature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `198` extends StObject {
  
  var `type`: TSMethodSignature = js.native
}
object `198` {
  
  @scala.inline
  def apply(`type`: TSMethodSignature): `198` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`198`]
  }
  
  @scala.inline
  implicit class `198MutableBuilder`[Self <: `198`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSMethodSignature): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
