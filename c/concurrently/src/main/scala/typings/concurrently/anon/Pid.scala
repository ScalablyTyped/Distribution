package typings.concurrently.anon

import typings.concurrently.distSrcCommandMod.ChildProcess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pid extends StObject {
  
  var pid: Double
  
  var process: ChildProcess
}
object Pid {
  
  inline def apply(pid: Double, process: ChildProcess): Pid = {
    val __obj = js.Dynamic.literal(pid = pid.asInstanceOf[js.Any], process = process.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Pid] (val x: Self) extends AnyVal {
    
    inline def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
    
    inline def setProcess(value: ChildProcess): Self = StObject.set(x, "process", value.asInstanceOf[js.Any])
  }
}
