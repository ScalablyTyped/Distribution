package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.NullableTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `96` extends StObject {
  
  var `type`: NullableTypeAnnotation = js.native
}
object `96` {
  
  @scala.inline
  def apply(`type`: NullableTypeAnnotation): `96` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`96`]
  }
  
  @scala.inline
  implicit class `96MutableBuilder`[Self <: `96`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: NullableTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
