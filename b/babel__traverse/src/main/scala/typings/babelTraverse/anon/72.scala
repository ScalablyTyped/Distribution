package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.JSXOpeningElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `72` extends StObject {
  
  var `type`: JSXOpeningElement = js.native
}
object `72` {
  
  @scala.inline
  def apply(`type`: JSXOpeningElement): `72` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`72`]
  }
  
  @scala.inline
  implicit class `72MutableBuilder`[Self <: `72`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: JSXOpeningElement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
