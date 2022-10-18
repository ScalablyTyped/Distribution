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
    
    @js.native
    sealed trait _package
      extends StObject
         with LogContexts
    
    @js.native
    sealed trait application
      extends StObject
         with LogContexts
    
    @js.native
    sealed trait hostname
      extends StObject
         with LogContexts
    
    @js.native
    sealed trait logLevel
      extends StObject
         with LogContexts
    
    @js.native
    sealed trait namespace
      extends StObject
         with LogContexts
  }
  
  @js.native
  trait LogContext
    extends StObject
       with /* key */ StringDictionary[Any]
}
