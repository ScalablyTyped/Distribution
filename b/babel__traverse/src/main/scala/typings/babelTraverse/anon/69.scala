package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.OpaqueType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `69` extends StObject {
  
  var `type`: OpaqueType = js.native
}
object `69` {
  
  @scala.inline
  def apply(`type`: OpaqueType): `69` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`69`]
  }
  
  @scala.inline
  implicit class `69MutableBuilder`[Self <: `69`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: OpaqueType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
