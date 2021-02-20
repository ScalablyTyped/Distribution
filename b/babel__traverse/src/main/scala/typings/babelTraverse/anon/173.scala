package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.BooleanLiteralTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `173` extends StObject {
  
  var `type`: BooleanLiteralTypeAnnotation = js.native
}
object `173` {
  
  @scala.inline
  def apply(`type`: BooleanLiteralTypeAnnotation): `173` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`173`]
  }
  
  @scala.inline
  implicit class `173MutableBuilder`[Self <: `173`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: BooleanLiteralTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
