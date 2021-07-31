package typings.browserReadablestreamToIt

import typings.browserReadablestreamToIt.anon.PreventCancel
import typings.std.AsyncIterable
import typings.std.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Turns a browser readable stream into an async iterable. Async iteration over
    * returned iterable will lock give stream, preventing any other consumer from
    * acquiring a reader. The lock will be released if iteration loop is broken. To
    * prevent stream cancelling optional `{ preventCancel: true }` could be passed
    * as a second argument.
    * @template T
    * @param {ReadableStream<T>} stream
    * @param {Object} [options]
    * @param {boolean} [options.preventCancel=boolean]
    * @returns {AsyncIterable<T>}
    */
  @scala.inline
  def apply[T](stream: ReadableStream[T]): AsyncIterable[T] = ^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any]).asInstanceOf[AsyncIterable[T]]
  @scala.inline
  def apply[T](stream: ReadableStream[T], options: PreventCancel): AsyncIterable[T] = (^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[T]]
  
  @JSImport("browser-readablestream-to-it/dist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
