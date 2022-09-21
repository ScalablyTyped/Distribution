package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This Streams API interface represents a readable stream of byte data. The Fetch API offers a concrete instance of a ReadableStream through the body property of a Response object. */
@js.native
trait ReadableStream[R] extends StObject {
  
  def cancel(): Promise[Unit] = js.native
  def cancel(reason: Any): Promise[Unit] = js.native
  
  def getReader(): ReadableStreamDefaultReader[R] = js.native
  
  val locked: scala.Boolean = js.native
  
  def pipeThrough[T](transform: ReadableWritablePair[T, R]): ReadableStream[T] = js.native
  def pipeThrough[T](transform: ReadableWritablePair[T, R], options: StreamPipeOptions): ReadableStream[T] = js.native
  
  def pipeTo(destination: WritableStream[R]): Promise[Unit] = js.native
  def pipeTo(destination: WritableStream[R], options: StreamPipeOptions): Promise[Unit] = js.native
  
  def tee(): js.Tuple2[ReadableStream[R], ReadableStream[R]] = js.native
}
