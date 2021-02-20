package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.DecimalLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `201` extends StObject {
  
  var `type`: DecimalLiteral = js.native
}
object `201` {
  
  @scala.inline
  def apply(`type`: DecimalLiteral): `201` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201`]
  }
  
  @scala.inline
  implicit class `201MutableBuilder`[Self <: `201`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: DecimalLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
