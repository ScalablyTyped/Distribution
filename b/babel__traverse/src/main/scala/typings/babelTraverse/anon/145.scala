package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TypeofTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `145` extends StObject {
  
  var `type`: TypeofTypeAnnotation = js.native
}
object `145` {
  
  @scala.inline
  def apply(`type`: TypeofTypeAnnotation): `145` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`145`]
  }
  
  @scala.inline
  implicit class `145MutableBuilder`[Self <: `145`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TypeofTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
