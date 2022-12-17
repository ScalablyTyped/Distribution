package typings.bsLogger

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLoggerContextMod {
  
  @js.native
  sealed trait LogContexts extends StObject
  @JSImport("bs-logger/dist/logger/context", "LogContexts")
  @js.native
  object LogContexts extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[LogContexts & String] = js.native
    
    @js.native
    sealed trait _package
      extends StObject
         with LogContexts
    /* "package" */ val _package: typings.bsLogger.distLoggerContextMod.LogContexts._package & String = js.native
    
    @js.native
    sealed trait application
      extends StObject
         with LogContexts
    /* "application" */ val application: typings.bsLogger.distLoggerContextMod.LogContexts.application & String = js.native
    
    @js.native
    sealed trait hostname
      extends StObject
         with LogContexts
    /* "hostname" */ val hostname: typings.bsLogger.distLoggerContextMod.LogContexts.hostname & String = js.native
    
    @js.native
    sealed trait logLevel
      extends StObject
         with LogContexts
    /* "logLevel" */ val logLevel: typings.bsLogger.distLoggerContextMod.LogContexts.logLevel & String = js.native
    
    @js.native
    sealed trait namespace
      extends StObject
         with LogContexts
    /* "namespace" */ val namespace: typings.bsLogger.distLoggerContextMod.LogContexts.namespace & String = js.native
  }
  
  @js.native
  trait LogContext
    extends StObject
       with /* key */ StringDictionary[Any]
}
