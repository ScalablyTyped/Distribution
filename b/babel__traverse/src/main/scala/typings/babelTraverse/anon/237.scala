package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.GenericTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `237` extends StObject {
  
  var `type`: GenericTypeAnnotation = js.native
}
object `237` {
  
  @scala.inline
  def apply(`type`: GenericTypeAnnotation): `237` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`237`]
  }
  
  @scala.inline
  implicit class `237MutableBuilder`[Self <: `237`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: GenericTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
