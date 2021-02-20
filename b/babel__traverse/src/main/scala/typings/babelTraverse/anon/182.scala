package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSInterfaceDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `182` extends StObject {
  
  var `type`: TSInterfaceDeclaration = js.native
}
object `182` {
  
  @scala.inline
  def apply(`type`: TSInterfaceDeclaration): `182` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`182`]
  }
  
  @scala.inline
  implicit class `182MutableBuilder`[Self <: `182`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSInterfaceDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
