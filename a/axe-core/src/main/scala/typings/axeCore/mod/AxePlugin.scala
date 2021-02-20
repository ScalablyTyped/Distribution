package typings.axeCore.mod

import typings.axeCore.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AxePlugin extends StObject {
  
  var cleanup: js.UndefOr[js.Function1[/* callback */ js.Function, Unit]] = js.native
  
  var commands: js.Array[Callback] = js.native
  
  var id: String = js.native
  
  def run(args: js.Any*): js.Any = js.native
}
object AxePlugin {
  
  @scala.inline
  def apply(commands: js.Array[Callback], id: String, run: /* repeated */ js.Any => js.Any): AxePlugin = {
    val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], run = js.Any.fromFunction1(run))
    __obj.asInstanceOf[AxePlugin]
  }
  
  @scala.inline
  implicit class AxePluginMutableBuilder[Self <: AxePlugin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCleanup(value: /* callback */ js.Function => Unit): Self = StObject.set(x, "cleanup", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCleanupUndefined: Self = StObject.set(x, "cleanup", js.undefined)
    
    @scala.inline
    def setCommands(value: js.Array[Callback]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandsVarargs(value: Callback*): Self = StObject.set(x, "commands", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRun(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "run", js.Any.fromFunction1(value))
  }
}
