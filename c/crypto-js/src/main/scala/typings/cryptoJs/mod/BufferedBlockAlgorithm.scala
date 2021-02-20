package typings.cryptoJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Abstract buffered block algorithm template.
  *
  * The property blockSize must be implemented in a concrete subtype.
  */
@js.native
trait BufferedBlockAlgorithm extends StObject {
  
  def _append(data: String): Unit = js.native
  /**
    * Adds new data to this block algorithm's buffer.
    *
    * @param data The data to append. Strings are converted to a WordArray using UTF-8.
    *
    * @example
    *
    *     bufferedBlockAlgorithm._append('data');
    *     bufferedBlockAlgorithm._append(wordArray);
    */
  def _append(data: WordArray): Unit = js.native
  
  /**
    * The number of blocks that should be kept unprocessed in the buffer. Default: 0
    */
  var _minBufferSize: Double = js.native
  
  /**
    * Processes available data blocks.
    *
    * This method invokes _doProcessBlock(offset), which must be implemented by a concrete subtype.
    *
    * @param doFlush Whether all blocks and partial blocks should be processed.
    *
    * @return The processed data.
    *
    * @example
    *
    *     var processedData = bufferedBlockAlgorithm._process();
    *     var processedData = bufferedBlockAlgorithm._process(!!'flush');
    */
  def _process(): WordArray = js.native
  def _process(doFlush: Boolean): WordArray = js.native
  
  /**
    * Resets this block algorithm's data buffer to its initial state.
    *
    * @example
    *
    *     bufferedBlockAlgorithm.reset();
    */
  def reset(): Unit = js.native
}
