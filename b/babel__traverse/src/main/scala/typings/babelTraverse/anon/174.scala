package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ExportNamespaceSpecifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `174` extends StObject {
  
  var `type`: ExportNamespaceSpecifier = js.native
}
object `174` {
  
  @scala.inline
  def apply(`type`: ExportNamespaceSpecifier): `174` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`174`]
  }
  
  @scala.inline
  implicit class `174MutableBuilder`[Self <: `174`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ExportNamespaceSpecifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
