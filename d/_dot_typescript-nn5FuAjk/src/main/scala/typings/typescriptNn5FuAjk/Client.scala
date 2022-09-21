package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The Client interface represents an executable context such as a Worker, or a SharedWorker. Window clients are represented by the more-specific WindowClient. You can get Client/WindowClient objects from methods such as Clients.matchAll() and Clients.get(). */
@js.native
trait Client extends StObject {
  
  val frameType: FrameType = js.native
  
  val id: java.lang.String = js.native
  
  def postMessage(message: Any): Unit = js.native
  def postMessage(message: Any, options: StructuredSerializeOptions): Unit = js.native
  def postMessage(message: Any, transfer: Array[Transferable]): Unit = js.native
  
  val `type`: ClientTypes = js.native
  
  val url: java.lang.String = js.native
}
