package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ArrayTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `84` extends StObject {
  
  var `type`: ArrayTypeAnnotation = js.native
}
object `84` {
  
  @scala.inline
  def apply(`type`: ArrayTypeAnnotation): `84` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`84`]
  }
  
  @scala.inline
  implicit class `84MutableBuilder`[Self <: `84`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ArrayTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
