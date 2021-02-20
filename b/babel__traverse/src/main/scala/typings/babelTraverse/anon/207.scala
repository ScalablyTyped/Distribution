package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ClassImplements
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `207` extends StObject {
  
  var `type`: ClassImplements = js.native
}
object `207` {
  
  @scala.inline
  def apply(`type`: ClassImplements): `207` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`207`]
  }
  
  @scala.inline
  implicit class `207MutableBuilder`[Self <: `207`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ClassImplements): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
