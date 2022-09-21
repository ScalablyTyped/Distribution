package typings.babelTypes.anon

import typings.babelTypes.mod.BlockStatement_
import typings.babelTypes.mod.Expression
import typings.babelTypes.mod.Statement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Body extends StObject {
  
  var body: BlockStatement_ | Statement | Expression
}
object Body {
  
  inline def apply(body: BlockStatement_ | Statement | Expression): Body = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[Body]
  }
  
  extension [Self <: Body](x: Self) {
    
    inline def setBody(value: BlockStatement_ | Statement | Expression): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
