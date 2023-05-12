package typings.cucumberCucumber.libApiTypesMod

import typings.cucumberCucumber.libRuntimeMod.IRuntimeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRunOptionsRuntime
  extends StObject
     with IRuntimeOptions {
  
  var parallel: Double
}
object IRunOptionsRuntime {
  
  inline def apply(
    dryRun: Boolean,
    failFast: Boolean,
    filterStacktraces: Boolean,
    parallel: Double,
    retry: Double,
    retryTagFilter: String,
    strict: Boolean,
    worldParameters: Any
  ): IRunOptionsRuntime = {
    val __obj = js.Dynamic.literal(dryRun = dryRun.asInstanceOf[js.Any], failFast = failFast.asInstanceOf[js.Any], filterStacktraces = filterStacktraces.asInstanceOf[js.Any], parallel = parallel.asInstanceOf[js.Any], retry = retry.asInstanceOf[js.Any], retryTagFilter = retryTagFilter.asInstanceOf[js.Any], strict = strict.asInstanceOf[js.Any], worldParameters = worldParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRunOptionsRuntime]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IRunOptionsRuntime] (val x: Self) extends AnyVal {
    
    inline def setParallel(value: Double): Self = StObject.set(x, "parallel", value.asInstanceOf[js.Any])
  }
}
