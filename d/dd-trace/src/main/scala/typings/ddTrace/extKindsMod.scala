package typings.ddTrace

import typings.ddTrace.ddTraceStrings.client
import typings.ddTrace.ddTraceStrings.consumer
import typings.ddTrace.ddTraceStrings.producer
import typings.ddTrace.ddTraceStrings.server
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extKindsMod {
  
  @JSImport("dd-trace/ext/kinds", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("dd-trace/ext/kinds", "CLIENT")
  @js.native
  def CLIENT: client = js.native
  inline def CLIENT_=(x: client): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLIENT")(x.asInstanceOf[js.Any])
  
  @JSImport("dd-trace/ext/kinds", "CONSUMER")
  @js.native
  def CONSUMER: consumer = js.native
  inline def CONSUMER_=(x: consumer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONSUMER")(x.asInstanceOf[js.Any])
  
  @JSImport("dd-trace/ext/kinds", "PRODUCER")
  @js.native
  def PRODUCER: producer = js.native
  inline def PRODUCER_=(x: producer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRODUCER")(x.asInstanceOf[js.Any])
  
  @JSImport("dd-trace/ext/kinds", "SERVER")
  @js.native
  def SERVER: server = js.native
  inline def SERVER_=(x: server): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SERVER")(x.asInstanceOf[js.Any])
}
