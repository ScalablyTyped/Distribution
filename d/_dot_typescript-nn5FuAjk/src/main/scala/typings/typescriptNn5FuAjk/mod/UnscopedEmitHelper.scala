package typings.typescriptNn5FuAjk.mod

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnscopedEmitHelper
  extends StObject
     with EmitHelperBase
     with EmitHelper {
  
  @JSName("scoped")
  val scoped_UnscopedEmitHelper: `false`
  
  @JSName("text")
  val text_UnscopedEmitHelper: java.lang.String
}
object UnscopedEmitHelper {
  
  inline def apply(name: java.lang.String, text: java.lang.String): UnscopedEmitHelper = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], scoped = false, text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnscopedEmitHelper]
  }
  
  extension [Self <: UnscopedEmitHelper](x: Self) {
    
    inline def setScoped(value: `false`): Self = StObject.set(x, "scoped", value.asInstanceOf[js.Any])
    
    inline def setText(value: java.lang.String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
