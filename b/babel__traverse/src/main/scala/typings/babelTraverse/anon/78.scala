package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ExportDefaultDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `78` extends StObject {
  
  var `type`: ExportDefaultDeclaration = js.native
}
object `78` {
  
  @scala.inline
  def apply(`type`: ExportDefaultDeclaration): `78` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`78`]
  }
  
  @scala.inline
  implicit class `78MutableBuilder`[Self <: `78`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ExportDefaultDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
