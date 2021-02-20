package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.StringLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `128` extends StObject {
  
  var `type`: StringLiteral = js.native
}
object `128` {
  
  @scala.inline
  def apply(`type`: StringLiteral): `128` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`128`]
  }
  
  @scala.inline
  implicit class `128MutableBuilder`[Self <: `128`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: StringLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
