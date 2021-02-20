package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.IntersectionTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `209` extends StObject {
  
  var `type`: IntersectionTypeAnnotation = js.native
}
object `209` {
  
  @scala.inline
  def apply(`type`: IntersectionTypeAnnotation): `209` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`209`]
  }
  
  @scala.inline
  implicit class `209MutableBuilder`[Self <: `209`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: IntersectionTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
