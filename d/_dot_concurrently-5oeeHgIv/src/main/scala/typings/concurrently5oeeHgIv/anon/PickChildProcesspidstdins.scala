package typings.concurrently5oeeHgIv.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<node.child_process.ChildProcess, 'pid' | 'stdin' | 'stdout' | 'stderr'> */
trait PickChildProcesspidstdins extends StObject {
  
  var pid: js.UndefOr[Any] = js.undefined
  
  var stderr: js.UndefOr[Any] = js.undefined
  
  var stdin: js.UndefOr[Any] = js.undefined
  
  var stdout: js.UndefOr[Any] = js.undefined
}
object PickChildProcesspidstdins {
  
  inline def apply(): PickChildProcesspidstdins = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickChildProcesspidstdins]
  }
  
  extension [Self <: PickChildProcesspidstdins](x: Self) {
    
    inline def setPid(value: Any): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
    
    inline def setPidUndefined: Self = StObject.set(x, "pid", js.undefined)
    
    inline def setStderr(value: Any): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
    
    inline def setStderrUndefined: Self = StObject.set(x, "stderr", js.undefined)
    
    inline def setStdin(value: Any): Self = StObject.set(x, "stdin", value.asInstanceOf[js.Any])
    
    inline def setStdinUndefined: Self = StObject.set(x, "stdin", js.undefined)
    
    inline def setStdout(value: Any): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
    
    inline def setStdoutUndefined: Self = StObject.set(x, "stdout", js.undefined)
  }
}
