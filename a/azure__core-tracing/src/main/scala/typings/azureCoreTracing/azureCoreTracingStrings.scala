package typings.azureCoreTracing

import typings.azureCoreTracing.mod.TracingSpanKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object azureCoreTracingStrings {
  
  @js.native
  sealed trait client
    extends StObject
       with TracingSpanKind
  inline def client: client = "client".asInstanceOf[client]
  
  @js.native
  sealed trait consumer
    extends StObject
       with TracingSpanKind
  inline def consumer: consumer = "consumer".asInstanceOf[consumer]
  
  @js.native
  sealed trait error extends StObject
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait internal
    extends StObject
       with TracingSpanKind
  inline def internal: internal = "internal".asInstanceOf[internal]
  
  @js.native
  sealed trait producer
    extends StObject
       with TracingSpanKind
  inline def producer: producer = "producer".asInstanceOf[producer]
  
  @js.native
  sealed trait server
    extends StObject
       with TracingSpanKind
  inline def server: server = "server".asInstanceOf[server]
  
  @js.native
  sealed trait success extends StObject
  inline def success: success = "success".asInstanceOf[success]
}
