package typings.chunkedDc.jasmine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuiteOrSpec extends StObject {
  
  var description: String
  
  var env: Env
  
  var id: Double
  
  var queue: Queue
}
object SuiteOrSpec {
  
  inline def apply(description: String, env: Env, id: Double, queue: Queue): SuiteOrSpec = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuiteOrSpec]
  }
  
  extension [Self <: SuiteOrSpec](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setEnv(value: Env): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setQueue(value: Queue): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
  }
}
