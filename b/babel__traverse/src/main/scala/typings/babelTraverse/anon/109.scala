package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `109` extends StObject {
  
  var `type`: TSTypeAnnotation = js.native
}
object `109` {
  
  @scala.inline
  def apply(`type`: TSTypeAnnotation): `109` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`109`]
  }
  
  @scala.inline
  implicit class `109MutableBuilder`[Self <: `109`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
