package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ImportAttribute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `120` extends StObject {
  
  var `type`: ImportAttribute = js.native
}
object `120` {
  
  @scala.inline
  def apply(`type`: ImportAttribute): `120` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`120`]
  }
  
  @scala.inline
  implicit class `120MutableBuilder`[Self <: `120`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ImportAttribute): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
