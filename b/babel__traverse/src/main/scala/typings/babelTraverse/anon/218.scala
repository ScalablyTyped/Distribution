package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSBooleanKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `218` extends StObject {
  
  var `type`: TSBooleanKeyword = js.native
}
object `218` {
  
  @scala.inline
  def apply(`type`: TSBooleanKeyword): `218` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`218`]
  }
  
  @scala.inline
  implicit class `218MutableBuilder`[Self <: `218`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSBooleanKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
