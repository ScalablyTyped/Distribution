package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ArgumentPlaceholder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArgumentPlaceholder_
  extends BaseNode
     with _Node {
  
  @JSName("type")
  var type_ArgumentPlaceholder_ : ArgumentPlaceholder = js.native
}
object ArgumentPlaceholder_ {
  
  @scala.inline
  def apply(`type`: ArgumentPlaceholder): ArgumentPlaceholder_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgumentPlaceholder_]
  }
  
  @scala.inline
  implicit class ArgumentPlaceholder_MutableBuilder[Self <: ArgumentPlaceholder_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ArgumentPlaceholder): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
