package typings.cypressImageSnapshot

import org.scalablytyped.runtime.StringDictionary
import typings.cypressImageSnapshot.anon.Path
import typings.cypressImageSnapshot.cypressImageSnapshotStrings.afterColonscreenshot
import typings.cypressImageSnapshot.cypressImageSnapshotStrings.task
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginMod {
  
  @JSImport("cypress-image-snapshot/plugin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Cypress definitions - end */
  inline def addMatchImageSnapshotPlugin(on: PluginEvents, config: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addMatchImageSnapshotPlugin")(on.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @js.native
  trait PluginEvents extends StObject {
    
    def apply(action: afterColonscreenshot, fn: js.Function1[/* details */ Path, Unit]): Unit = js.native
    def apply(action: task, tasks: Tasks): Unit = js.native
  }
  
  type Task = js.Function1[/* value */ Any, Any]
  
  type Tasks = StringDictionary[Task]
}
