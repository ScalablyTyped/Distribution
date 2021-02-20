package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSEnumDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `89` extends StObject {
  
  var `type`: TSEnumDeclaration = js.native
}
object `89` {
  
  @scala.inline
  def apply(`type`: TSEnumDeclaration): `89` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`89`]
  }
  
  @scala.inline
  implicit class `89MutableBuilder`[Self <: `89`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSEnumDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
