package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TypeAlias
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `175` extends StObject {
  
  var `type`: TypeAlias = js.native
}
object `175` {
  
  @scala.inline
  def apply(`type`: TypeAlias): `175` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`175`]
  }
  
  @scala.inline
  implicit class `175MutableBuilder`[Self <: `175`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TypeAlias): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
