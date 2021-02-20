package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ClassPrivateProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `223` extends StObject {
  
  var `type`: ClassPrivateProperty = js.native
}
object `223` {
  
  @scala.inline
  def apply(`type`: ClassPrivateProperty): `223` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`223`]
  }
  
  @scala.inline
  implicit class `223MutableBuilder`[Self <: `223`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ClassPrivateProperty): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
