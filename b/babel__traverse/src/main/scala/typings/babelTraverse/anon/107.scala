package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.DeclareExportAllDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `107` extends StObject {
  
  var `type`: DeclareExportAllDeclaration = js.native
}
object `107` {
  
  @scala.inline
  def apply(`type`: DeclareExportAllDeclaration): `107` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`107`]
  }
  
  @scala.inline
  implicit class `107MutableBuilder`[Self <: `107`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: DeclareExportAllDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
