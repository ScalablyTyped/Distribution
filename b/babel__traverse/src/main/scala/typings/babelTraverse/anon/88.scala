package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSNamespaceExportDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `88` extends StObject {
  
  var `type`: TSNamespaceExportDeclaration = js.native
}
object `88` {
  
  @scala.inline
  def apply(`type`: TSNamespaceExportDeclaration): `88` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`88`]
  }
  
  @scala.inline
  implicit class `88MutableBuilder`[Self <: `88`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSNamespaceExportDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
