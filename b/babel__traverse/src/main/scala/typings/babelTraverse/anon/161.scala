package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ForOfStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `161` extends StObject {
  
  var `type`: ForOfStatement = js.native
}
object `161` {
  
  @scala.inline
  def apply(`type`: ForOfStatement): `161` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`161`]
  }
  
  @scala.inline
  implicit class `161MutableBuilder`[Self <: `161`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ForOfStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
