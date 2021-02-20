package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSUnionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `91` extends StObject {
  
  var `type`: TSUnionType = js.native
}
object `91` {
  
  @scala.inline
  def apply(`type`: TSUnionType): `91` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`91`]
  }
  
  @scala.inline
  implicit class `91MutableBuilder`[Self <: `91`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSUnionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
