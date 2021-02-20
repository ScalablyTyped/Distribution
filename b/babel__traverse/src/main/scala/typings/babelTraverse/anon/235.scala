package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.DeclareClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `235` extends StObject {
  
  var `type`: DeclareClass = js.native
}
object `235` {
  
  @scala.inline
  def apply(`type`: DeclareClass): `235` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`235`]
  }
  
  @scala.inline
  implicit class `235MutableBuilder`[Self <: `235`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: DeclareClass): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
