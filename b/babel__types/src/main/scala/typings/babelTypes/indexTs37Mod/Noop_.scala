package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.Noop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Noop_
  extends BaseNode
     with _Node {
  
  @JSName("type")
  var type_Noop_ : Noop = js.native
}
object Noop_ {
  
  @scala.inline
  def apply(`type`: Noop): Noop_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Noop_]
  }
  
  @scala.inline
  implicit class Noop_MutableBuilder[Self <: Noop_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: Noop): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
