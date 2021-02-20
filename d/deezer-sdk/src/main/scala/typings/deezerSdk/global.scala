package typings.deezerSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("DZ")
  @js.native
  val DZ: typings.deezerSdk.DeezerSdk.DZ = js.native
  
  /**
    * See: {@link https://developers.deezer.com/sdk/javascript/init | DZ.init}
    */
  // The client may want to set this, so we have to disable a rule:
  // tslint:disable-next-line:prefer-declare-function
  @JSGlobal("dzAsyncInit")
  @js.native
  def dzAsyncInit: js.Function0[Unit] = js.native
  @scala.inline
  def dzAsyncInit_=(x: js.Function0[Unit]): Unit = js.Dynamic.global.updateDynamic("dzAsyncInit")(x.asInstanceOf[js.Any])
  
  /**
    * See: {@link https://developers.deezer.com/sdk/javascript | Deezer Javascript SDK}
    */
  object DeezerSdk
}
