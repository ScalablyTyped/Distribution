package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.VoidTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `104` extends StObject {
  
  var `type`: VoidTypeAnnotation = js.native
}
object `104` {
  
  @scala.inline
  def apply(`type`: VoidTypeAnnotation): `104` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`104`]
  }
  
  @scala.inline
  implicit class `104MutableBuilder`[Self <: `104`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: VoidTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
