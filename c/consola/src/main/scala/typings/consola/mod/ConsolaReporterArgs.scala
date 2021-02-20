package typings.consola.mod

import typings.node.NodeJS.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConsolaReporterArgs extends StObject {
  
  var async: Boolean = js.native
  
  var stderr: WritableStream = js.native
  
  var stdout: WritableStream = js.native
}
object ConsolaReporterArgs {
  
  @scala.inline
  def apply(async: Boolean, stderr: WritableStream, stdout: WritableStream): ConsolaReporterArgs = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsolaReporterArgs]
  }
  
  @scala.inline
  implicit class ConsolaReporterArgsMutableBuilder[Self <: ConsolaReporterArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStderr(value: WritableStream): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStdout(value: WritableStream): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
  }
}
