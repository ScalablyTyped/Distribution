package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSThisType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `203` extends StObject {
  
  var `type`: TSThisType = js.native
}
object `203` {
  
  @scala.inline
  def apply(`type`: TSThisType): `203` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`203`]
  }
  
  @scala.inline
  implicit class `203MutableBuilder`[Self <: `203`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSThisType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
