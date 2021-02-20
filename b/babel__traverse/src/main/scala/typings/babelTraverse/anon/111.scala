package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ImportSpecifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `111` extends StObject {
  
  var `type`: ImportSpecifier = js.native
}
object `111` {
  
  @scala.inline
  def apply(`type`: ImportSpecifier): `111` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`111`]
  }
  
  @scala.inline
  implicit class `111MutableBuilder`[Self <: `111`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ImportSpecifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
