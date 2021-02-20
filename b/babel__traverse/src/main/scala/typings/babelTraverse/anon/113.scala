package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ExportSpecifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `113` extends StObject {
  
  var `type`: ExportSpecifier = js.native
}
object `113` {
  
  @scala.inline
  def apply(`type`: ExportSpecifier): `113` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`113`]
  }
  
  @scala.inline
  implicit class `113MutableBuilder`[Self <: `113`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ExportSpecifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
