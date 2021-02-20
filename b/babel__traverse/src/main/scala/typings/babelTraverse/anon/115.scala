package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSPropertySignature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `115` extends StObject {
  
  var `type`: TSPropertySignature = js.native
}
object `115` {
  
  @scala.inline
  def apply(`type`: TSPropertySignature): `115` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`115`]
  }
  
  @scala.inline
  implicit class `115MutableBuilder`[Self <: `115`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSPropertySignature): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
