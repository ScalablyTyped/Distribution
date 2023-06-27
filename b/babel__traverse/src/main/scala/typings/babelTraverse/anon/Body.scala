package typings.babelTraverse.anon

import typings.babelTypes.mod.BlockStatement_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Body extends StObject {
  
  var body: BlockStatement_
}
object Body {
  
  inline def apply(body: BlockStatement_): Body = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[Body]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Body] (val x: Self) extends AnyVal {
    
    inline def setBody(value: BlockStatement_): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
