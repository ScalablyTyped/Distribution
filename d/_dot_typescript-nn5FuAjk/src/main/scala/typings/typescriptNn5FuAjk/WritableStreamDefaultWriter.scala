package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This Streams API interface is the object returned by WritableStream.getWriter() and once created locks the < writer to the WritableStream ensuring that no other streams can write to the underlying sink. */
@js.native
trait WritableStreamDefaultWriter[W] extends StObject {
  
  def abort(): Promise[Unit] = js.native
  def abort(reason: Any): Promise[Unit] = js.native
  
  def close(): Promise[Unit] = js.native
  
  val closed: Promise[Unit] = js.native
  
  val desiredSize: Double | Null = js.native
  
  val ready: Promise[Unit] = js.native
  
  def releaseLock(): Unit = js.native
  
  def write(): Promise[Unit] = js.native
  def write(chunk: W): Promise[Unit] = js.native
}
