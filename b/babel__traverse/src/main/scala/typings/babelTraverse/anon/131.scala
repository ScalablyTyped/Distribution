package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.InferredPredicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `131` extends StObject {
  
  var `type`: InferredPredicate = js.native
}
object `131` {
  
  @scala.inline
  def apply(`type`: InferredPredicate): `131` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`131`]
  }
  
  @scala.inline
  implicit class `131MutableBuilder`[Self <: `131`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: InferredPredicate): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
