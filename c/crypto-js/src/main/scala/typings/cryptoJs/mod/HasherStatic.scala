package typings.cryptoJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HasherStatic extends StObject {
  
  /**
    * Initializes a newly created hasher.
    *
    * @param cfg (Optional) The configuration options to use for this hash computation.
    *
    * @example
    *
    *     var hasher = CryptoJS.algo.SHA256.create();
    */
  def create(): Hasher = js.native
  def create(cfg: js.Object): Hasher = js.native
}
