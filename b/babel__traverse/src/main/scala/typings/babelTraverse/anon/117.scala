package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSTypeQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `117` extends StObject {
  
  var `type`: TSTypeQuery = js.native
}
object `117` {
  
  @scala.inline
  def apply(`type`: TSTypeQuery): `117` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`117`]
  }
  
  @scala.inline
  implicit class `117MutableBuilder`[Self <: `117`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSTypeQuery): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
