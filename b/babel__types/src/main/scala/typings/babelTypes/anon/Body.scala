package typings.babelTypes.anon

import typings.babelTypes.indexTs37Mod.BlockStatement_
import typings.babelTypes.indexTs37Mod.Expression
import typings.babelTypes.indexTs37Mod.Statement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Body extends StObject {
  
  var body: BlockStatement_ | Statement | Expression = js.native
}
object Body {
  
  @scala.inline
  def apply(body: BlockStatement_ | Statement | Expression): Body = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[Body]
  }
  
  @scala.inline
  implicit class BodyMutableBuilder[Self <: Body] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: BlockStatement_ | Statement | Expression): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
