package typings.deezerSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  val DZ: typings.deezerSdk.DeezerSdk.DZ = js.native
  /**
    * See: {@link https://developers.deezer.com/sdk/javascript/init | DZ.init}
    */
  // The client may want to set this, so we have to disable a rule:
  // tslint:disable-next-line:prefer-declare-function
  var dzAsyncInit: js.Function0[Unit] = js.native
  /**
    * See: {@link https://developers.deezer.com/sdk/javascript | Deezer Javascript SDK}
    */
  @js.native
  object DeezerSdk extends js.Object
  
}

