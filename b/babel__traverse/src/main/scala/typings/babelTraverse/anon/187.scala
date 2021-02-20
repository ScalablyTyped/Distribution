package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ClassProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `187` extends StObject {
  
  var `type`: ClassProperty = js.native
}
object `187` {
  
  @scala.inline
  def apply(`type`: ClassProperty): `187` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`187`]
  }
  
  @scala.inline
  implicit class `187MutableBuilder`[Self <: `187`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ClassProperty): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
