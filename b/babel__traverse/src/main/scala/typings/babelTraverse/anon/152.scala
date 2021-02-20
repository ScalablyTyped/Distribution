package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.NumberLiteralTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `152` extends StObject {
  
  var `type`: NumberLiteralTypeAnnotation = js.native
}
object `152` {
  
  @scala.inline
  def apply(`type`: NumberLiteralTypeAnnotation): `152` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`152`]
  }
  
  @scala.inline
  implicit class `152MutableBuilder`[Self <: `152`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: NumberLiteralTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
