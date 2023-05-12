package typings.bufferCrc32

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * crc32 that works with binary data and fancy character sets.
    *
    * @example
    * import crc32 = require('buffer-crc32');
    *
    * // works with buffers
    * const buf = Buffer.from([0x00, 0x73, 0x75, 0x70, 0x20, 0x62, 0x72, 0x6f, 0x00]);
    * crc32(buf); // -> <Buffer 94 5a ab 4a>
    *
    * // will cast to buffer if given a string, so you can
    * // directly use foreign characters safely
    * crc32('自動販売機'); // -> <Buffer cb 03 1a c5>
    *
    * // and works in append mode too
    * let partialCrc = crc32('hey');
    * partialCrc = crc32(' ', partialCrc);
    * partialCrc = crc32('sup', partialCrc);
    * partialCrc = crc32(' ', partialCrc);
    * const finalCrc = crc32('bros', partialCrc); // -> <Buffer 47 fa 55 70>
    */
  inline def apply(input: String): Buffer = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def apply(input: String, partialCrc: Double): Buffer = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], partialCrc.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def apply(input: String, partialCrc: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], partialCrc.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def apply(input: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def apply(input: Buffer, partialCrc: Double): Buffer = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], partialCrc.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def apply(input: Buffer, partialCrc: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], partialCrc.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  @JSImport("buffer-crc32", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Convenience method that returns a signed int instead of a `Buffer`.
    *
    * @example
    * import crc32 = require('buffer-crc32');
    *
    * // works with buffers
    * const buf = Buffer.from([0x00, 0x73, 0x75, 0x70, 0x20, 0x62, 0x72, 0x6f, 0x00]);
    * crc32.signed(buf); // -> -1805997238
    */
  inline def signed(buffer: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("signed")(buffer.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def signed(buffer: String, partialCrc: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("signed")(buffer.asInstanceOf[js.Any], partialCrc.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def signed(buffer: String, partialCrc: Buffer): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("signed")(buffer.asInstanceOf[js.Any], partialCrc.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def signed(buffer: Buffer): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("signed")(buffer.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def signed(buffer: Buffer, partialCrc: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("signed")(buffer.asInstanceOf[js.Any], partialCrc.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def signed(buffer: Buffer, partialCrc: Buffer): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("signed")(buffer.asInstanceOf[js.Any], partialCrc.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Convenience method that returns an unsigned int instead of a `Buffer`.
    *
    * @example
    * import crc32 = require('buffer-crc32');
    *
    * // works with buffers
    * const buf = Buffer.from([0x00, 0x73, 0x75, 0x70, 0x20, 0x62, 0x72, 0x6f, 0x00]);
    * crc32.unsigned(buf); // -> 2488970058
    */
  inline def unsigned(buffer: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("unsigned")(buffer.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def unsigned(buffer: String, partialCrc: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("unsigned")(buffer.asInstanceOf[js.Any], partialCrc.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def unsigned(buffer: String, partialCrc: Buffer): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("unsigned")(buffer.asInstanceOf[js.Any], partialCrc.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def unsigned(buffer: Buffer): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("unsigned")(buffer.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def unsigned(buffer: Buffer, partialCrc: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("unsigned")(buffer.asInstanceOf[js.Any], partialCrc.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def unsigned(buffer: Buffer, partialCrc: Buffer): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("unsigned")(buffer.asInstanceOf[js.Any], partialCrc.asInstanceOf[js.Any])).asInstanceOf[Double]
}
