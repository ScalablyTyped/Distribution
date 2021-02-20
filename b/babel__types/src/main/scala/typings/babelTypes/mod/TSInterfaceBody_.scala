package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSInterfaceBody
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSInterfaceBody_
  extends BaseNode
     with _Node {
  
  var body: js.Array[TSTypeElement] = js.native
  
  @JSName("type")
  var type_TSInterfaceBody_ : TSInterfaceBody = js.native
}
object TSInterfaceBody_ {
  
  @scala.inline
  def apply(body: js.Array[TSTypeElement], `type`: TSInterfaceBody): TSInterfaceBody_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSInterfaceBody_]
  }
  
  @scala.inline
  implicit class TSInterfaceBody_MutableBuilder[Self <: TSInterfaceBody_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: js.Array[TSTypeElement]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyVarargs(value: TSTypeElement*): Self = StObject.set(x, "body", js.Array(value :_*))
    
    @scala.inline
    def setType(value: TSInterfaceBody): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
