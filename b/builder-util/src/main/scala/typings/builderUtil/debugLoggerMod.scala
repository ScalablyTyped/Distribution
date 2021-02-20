package typings.builderUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object debugLoggerMod {
  
  @JSImport("builder-util/out/DebugLogger", "DebugLogger")
  @js.native
  class DebugLogger () extends StObject {
    def this(isEnabled: Boolean) = this()
    
    def add(key: String, value: js.Any): Unit = js.native
    
    val data: js.Any = js.native
    
    val isEnabled: Boolean = js.native
    
    def save(file: String): js.Promise[Unit] = js.native
  }
}
