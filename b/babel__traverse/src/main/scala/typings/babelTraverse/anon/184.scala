package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ClassMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `184` extends StObject {
  
  var `type`: ClassMethod = js.native
}
object `184` {
  
  @scala.inline
  def apply(`type`: ClassMethod): `184` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`184`]
  }
  
  @scala.inline
  implicit class `184MutableBuilder`[Self <: `184`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ClassMethod): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
