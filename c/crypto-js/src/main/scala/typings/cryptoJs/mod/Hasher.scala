package typings.cryptoJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Abstract hasher template.
  */
@js.native
trait Hasher extends StObject {
  
  /**
    * The number of 32-bit words this hasher operates on. Default: 16 (512 bits)
    */
  var blockSize: Double = js.native
  
  def finalize(messaegUpdate: String): WordArray = js.native
  def finalize(messaegUpdate: WordArray): WordArray = js.native
  
  /**
    * Resets this hasher to its initial state.
    *
    * @example
    *
    *     hasher.reset();
    */
  def reset(): Unit = js.native
  
  def update(messageUpdate: String): this.type = js.native
  /**
    * Updates this hasher with a message.
    *
    * @param messageUpdate The message to append.
    *
    * @return This hasher.
    *
    * @example
    *
    *     hasher.update('message');
    *     hasher.update(wordArray);
    */
  def update(messageUpdate: WordArray): this.type = js.native
}
