package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.V8IntrinsicIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait V8IntrinsicIdentifier_
  extends BaseNode
     with _Node {
  
  var name: String = js.native
  
  @JSName("type")
  var type_V8IntrinsicIdentifier_ : V8IntrinsicIdentifier = js.native
}
object V8IntrinsicIdentifier_ {
  
  @scala.inline
  def apply(name: String, `type`: V8IntrinsicIdentifier): V8IntrinsicIdentifier_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[V8IntrinsicIdentifier_]
  }
  
  @scala.inline
  implicit class V8IntrinsicIdentifier_MutableBuilder[Self <: V8IntrinsicIdentifier_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: V8IntrinsicIdentifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
