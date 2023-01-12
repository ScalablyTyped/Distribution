package typings.concurrently.anon

import typings.node.eventsMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Process extends StObject {
  
  var process: ^
}
object Process {
  
  inline def apply(process: ^): Process = {
    val __obj = js.Dynamic.literal(process = process.asInstanceOf[js.Any])
    __obj.asInstanceOf[Process]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Process] (val x: Self) extends AnyVal {
    
    inline def setProcess(value: ^): Self = StObject.set(x, "process", value.asInstanceOf[js.Any])
  }
}
