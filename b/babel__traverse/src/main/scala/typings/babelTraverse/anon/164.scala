package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSUndefinedKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `164` extends StObject {
  
  var `type`: TSUndefinedKeyword = js.native
}
object `164` {
  
  @scala.inline
  def apply(`type`: TSUndefinedKeyword): `164` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`164`]
  }
  
  @scala.inline
  implicit class `164MutableBuilder`[Self <: `164`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSUndefinedKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
