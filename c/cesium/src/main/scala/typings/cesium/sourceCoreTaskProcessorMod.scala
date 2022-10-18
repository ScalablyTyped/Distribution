package typings.cesium

import typings.cesium.mod.TaskProcessor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceCoreTaskProcessorMod {
  
  @JSImport("cesium/Source/Core/TaskProcessor", JSImport.Default)
  @js.native
  open class default protected () extends TaskProcessor {
    def this(workerPath: String) = this()
    def this(workerPath: String, maximumActiveTasks: Double) = this()
  }
}
