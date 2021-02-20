package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.BooleanTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `178` extends StObject {
  
  var `type`: BooleanTypeAnnotation = js.native
}
object `178` {
  
  @scala.inline
  def apply(`type`: BooleanTypeAnnotation): `178` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`178`]
  }
  
  @scala.inline
  implicit class `178MutableBuilder`[Self <: `178`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: BooleanTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
