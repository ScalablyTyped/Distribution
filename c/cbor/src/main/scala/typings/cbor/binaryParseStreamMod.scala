package typings.cbor

import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Transform
import typings.node.streamMod.TransformOptions
import typings.std.Generator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object binaryParseStreamMod {
  
  /**
    * BinaryParseStream is a TransformStream that consumes buffers and outputs
    * objects on the other end.  It expects your subclass to implement a `_parse`
    * method that is a generator.  When your generator yields a number, it'll be
    * fed a buffer of that length from the input.  When your generator returns,
    * the return value will be pushed to the output side.
    *
    * @extends stream.Transform
    */
  @JSImport("cbor/types/vendor/binary-parse-stream", JSImport.Namespace)
  @js.native
  open class ^ protected () extends BinaryParseStream {
    /**
      * Creates an instance of BinaryParseStream.
      *
      * @param {stream.TransformOptions} options Stream options.
      * @memberof BinaryParseStream
      */
    def this(options: TransformOptions) = this()
  }
  
  /**
    * BinaryParseStream is a TransformStream that consumes buffers and outputs
    * objects on the other end.  It expects your subclass to implement a `_parse`
    * method that is a generator.  When your generator yields a number, it'll be
    * fed a buffer of that length from the input.  When your generator returns,
    * the return value will be pushed to the output side.
    *
    * @extends stream.Transform
    */
  @js.native
  trait BinaryParseStream extends Transform {
    
    var __fresh: Boolean = js.native
    
    var __needed: Double = js.native
    
    var __parser: Generator[Double, Unit, Buffer] = js.native
    
    def __restart(): Unit = js.native
    
    /**
      * Subclasses must override this to set their parsing behavior.  Yield a
      * number to receive a Buffer of that many bytes.
      *
      * @abstract
      * @returns {Generator<number, undefined, Buffer>}
      */
    def _parse(): Generator[Double, Unit, Buffer] = js.native
    
    var bs: typings.nofilter.mod.^ = js.native
  }
}
