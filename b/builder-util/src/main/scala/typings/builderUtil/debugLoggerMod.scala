package typings.builderUtil

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("builder-util/out/DebugLogger", JSImport.Namespace)
@js.native
object debugLoggerMod extends js.Object {
  
  @js.native
  class DebugLogger () extends js.Object {
    def this(isEnabled: Boolean) = this()
    
    def add(key: String, value: js.Any): Unit = js.native
    
    val data: js.Any = js.native
    
    val isEnabled: Boolean = js.native
    
    def save(file: String): js.Promise[Unit] = js.native
  }
}
