package typings.cassandraDriver.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NextExecution extends StObject {
  
  var nextExecution: js.Function = js.native
}
object NextExecution {
  
  @scala.inline
  def apply(nextExecution: js.Function): NextExecution = {
    val __obj = js.Dynamic.literal(nextExecution = nextExecution.asInstanceOf[js.Any])
    __obj.asInstanceOf[NextExecution]
  }
  
  @scala.inline
  implicit class NextExecutionMutableBuilder[Self <: NextExecution] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextExecution(value: js.Function): Self = StObject.set(x, "nextExecution", value.asInstanceOf[js.Any])
  }
}
