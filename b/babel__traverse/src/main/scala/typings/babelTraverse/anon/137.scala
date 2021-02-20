package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ThrowStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `137` extends StObject {
  
  var `type`: ThrowStatement = js.native
}
object `137` {
  
  @scala.inline
  def apply(`type`: ThrowStatement): `137` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`137`]
  }
  
  @scala.inline
  implicit class `137MutableBuilder`[Self <: `137`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ThrowStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
