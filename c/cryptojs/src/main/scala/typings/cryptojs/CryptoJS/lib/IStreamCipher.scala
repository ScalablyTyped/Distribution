package typings.cryptojs.CryptoJS.lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStreamCipher[C] extends ICipher[C] {
  
  var blockSize: Double = js.native
  
  var drop: js.UndefOr[Double] = js.native
}
