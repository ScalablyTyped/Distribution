package typings.chainsafeIsIp

import org.scalablytyped.runtime.Instantiable1
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libParserMod {
  
  @JSImport("@chainsafe/is-ip/lib/parser", "Parser")
  @js.native
  open class Parser ()
    extends StObject
       with Instantiable1[/* input */ String, Parser] {
    
    /* private */ var index: Any = js.native
    
    /* private */ var input: Any = js.native
    
    /** Run a parser, but fail if the entire input wasn't consumed. Doesn't run atomically. */
    def parseWith[T /* <: Fn */](fn: T): js.UndefOr[ReturnType[T]] = js.native
    
    /** Peek the next character from the input */
    def peekChar(): js.UndefOr[String] = js.native
    
    /** Run a parser, and restore the pre-parse state if it fails. */
    def readAtomically[T /* <: Fn */](fn: T): ReturnType[T] = js.native
    
    /** Read the next character from the input */
    def readChar(): js.UndefOr[String] = js.native
    
    /** Read the next character from the input if it matches the target. */
    def readGivenChar(target: String): js.UndefOr[String] = js.native
    
    /** Read an IP Address, either IPv4 or IPv6. */
    def readIPAddr(): js.UndefOr[js.typedarray.Uint8Array] = js.native
    
    /** Read an IPv4 address. */
    def readIPv4Addr(): js.UndefOr[js.typedarray.Uint8Array] = js.native
    
    /** Read an IPv6 Address. */
    def readIPv6Addr(): js.UndefOr[js.typedarray.Uint8Array] = js.native
    
    /**
      * Read a number off the front of the input in the given radix, stopping
      * at the first non-digit character or eof. Fails if the number has more
      * digits than max_digits or if there is no number.
      */
    def readNumber(radix: Double, maxDigits: Double, allowZeroPrefix: Boolean, maxBytes: Double): js.UndefOr[Double] = js.native
    def readNumber(radix: Double, maxDigits: Unit, allowZeroPrefix: Boolean, maxBytes: Double): js.UndefOr[Double] = js.native
    
    /**
      * Helper for reading separators in an indexed loop. Reads the separator
      * character iff index > 0, then runs the parser. When used in a loop,
      * the separator character will only be read on index > 0 (see
      * readIPv4Addr for an example)
      */
    def readSeparator[T /* <: Fn */](sep: String, index: Double, inner: T): ReturnType[T] = js.native
  }
  
  type Fn = js.Function1[/* foo */ Any, Any]
}
