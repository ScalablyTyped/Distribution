package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** TextEncoder takes a stream of code points as input and emits a stream of bytes. For a more scalable, non-native library, see StringView – a C-like representation of strings based on typed arrays. */
@js.native
trait TextEncoder
  extends StObject
     with TextEncoderCommon {
  
  /** Returns the result of running UTF-8's encoder. */
  def encode(): Uint8Array = js.native
  def encode(input: java.lang.String): Uint8Array = js.native
  
  /** Runs the UTF-8 encoder on source, stores the result of that operation into destination, and returns the progress made as an object wherein read is the number of converted code units of source and written is the number of bytes modified in destination. */
  def encodeInto(source: java.lang.String, destination: Uint8Array): TextEncoderEncodeIntoResult = js.native
}
