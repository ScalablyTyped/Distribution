package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.JSXClosingElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `126` extends StObject {
  
  var `type`: JSXClosingElement = js.native
}
object `126` {
  
  @scala.inline
  def apply(`type`: JSXClosingElement): `126` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`126`]
  }
  
  @scala.inline
  implicit class `126MutableBuilder`[Self <: `126`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: JSXClosingElement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
