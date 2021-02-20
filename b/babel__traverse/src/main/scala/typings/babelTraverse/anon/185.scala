package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ForStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `185` extends StObject {
  
  var `type`: ForStatement = js.native
}
object `185` {
  
  @scala.inline
  def apply(`type`: ForStatement): `185` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`185`]
  }
  
  @scala.inline
  implicit class `185MutableBuilder`[Self <: `185`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ForStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
