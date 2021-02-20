package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.DeclareExportDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `153` extends StObject {
  
  var `type`: DeclareExportDeclaration = js.native
}
object `153` {
  
  @scala.inline
  def apply(`type`: DeclareExportDeclaration): `153` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`153`]
  }
  
  @scala.inline
  implicit class `153MutableBuilder`[Self <: `153`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: DeclareExportDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
