package typings.azureCoreHttpCompat.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HttpPipelineLogLevel extends StObject
@JSImport("@azure/core-http-compat", "HttpPipelineLogLevel")
@js.native
object HttpPipelineLogLevel extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HttpPipelineLogLevel & Double] = js.native
  
  @js.native
  sealed trait ERROR
    extends StObject
       with HttpPipelineLogLevel
  /* 1 */ val ERROR: typings.azureCoreHttpCompat.mod.HttpPipelineLogLevel.ERROR & Double = js.native
  
  @js.native
  sealed trait INFO
    extends StObject
       with HttpPipelineLogLevel
  /* 3 */ val INFO: typings.azureCoreHttpCompat.mod.HttpPipelineLogLevel.INFO & Double = js.native
  
  @js.native
  sealed trait OFF
    extends StObject
       with HttpPipelineLogLevel
  /* 0 */ val OFF: typings.azureCoreHttpCompat.mod.HttpPipelineLogLevel.OFF & Double = js.native
  
  @js.native
  sealed trait WARNING
    extends StObject
       with HttpPipelineLogLevel
  /* 2 */ val WARNING: typings.azureCoreHttpCompat.mod.HttpPipelineLogLevel.WARNING & Double = js.native
}
