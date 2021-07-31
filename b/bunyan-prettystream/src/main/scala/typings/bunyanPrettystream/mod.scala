package typings.bunyanPrettystream

import typings.bunyanPrettystream.anon.End
import typings.bunyanPrettystream.anon.Mode
import typings.node.NodeJS.WritableStream
import typings.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bunyan-prettystream", JSImport.Namespace)
  @js.native
  /**
    * @param options.mode Output format, can be either `long`, `short`, or `dev`,
    *                     defaults to `long`.
    * @param options.useColor Indicates whether or not output should be colored,
    *                         defaults to `true`.
    */
  class ^ () extends PrettyStream {
    def this(options: Mode) = this()
  }
  
  @js.native
  trait PrettyStream extends Writable {
    
    def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
  }
}
