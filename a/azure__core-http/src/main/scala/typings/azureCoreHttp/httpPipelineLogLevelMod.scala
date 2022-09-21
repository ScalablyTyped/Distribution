package typings.azureCoreHttp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpPipelineLogLevelMod {
  
  @js.native
  sealed trait HttpPipelineLogLevel extends StObject
  @JSImport("@azure/core-http/types/latest/src/httpPipelineLogLevel", "HttpPipelineLogLevel")
  @js.native
  object HttpPipelineLogLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[HttpPipelineLogLevel & Double] = js.native
    
    /**
      * An error log.
      */
    @js.native
    sealed trait ERROR
      extends StObject
         with HttpPipelineLogLevel
    /* 1 */ val ERROR: typings.azureCoreHttp.httpPipelineLogLevelMod.HttpPipelineLogLevel.ERROR & Double = js.native
    
    /**
      * An information log.
      */
    @js.native
    sealed trait INFO
      extends StObject
         with HttpPipelineLogLevel
    /* 3 */ val INFO: typings.azureCoreHttp.httpPipelineLogLevelMod.HttpPipelineLogLevel.INFO & Double = js.native
    
    /**
      * A log level that indicates that no logs will be logged.
      */
    @js.native
    sealed trait OFF
      extends StObject
         with HttpPipelineLogLevel
    /* 0 */ val OFF: typings.azureCoreHttp.httpPipelineLogLevelMod.HttpPipelineLogLevel.OFF & Double = js.native
    
    /**
      * A warning log.
      */
    @js.native
    sealed trait WARNING
      extends StObject
         with HttpPipelineLogLevel
    /* 2 */ val WARNING: typings.azureCoreHttp.httpPipelineLogLevelMod.HttpPipelineLogLevel.WARNING & Double = js.native
  }
}
