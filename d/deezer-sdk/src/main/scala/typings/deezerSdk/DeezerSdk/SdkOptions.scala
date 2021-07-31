package typings.deezerSdk.DeezerSdk

import typings.deezerSdk.anon.Accesstoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://developers.deezer.com/sdk/javascript/ready | DZ.ready}
  */
trait SdkOptions extends StObject {
  
  /**
    * In addition to the PlayerState properties,
    * {@link https://developers.deezer.com/sdk/javascript/ready | DZ.ready} also documents the
    * property current_track, but the author of this comment was not able no retrieve it.
    */
  val player: PlayerState
  
  val token: Accesstoken
}
object SdkOptions {
  
  @scala.inline
  def apply(player: PlayerState, token: Accesstoken): SdkOptions = {
    val __obj = js.Dynamic.literal(player = player.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[SdkOptions]
  }
  
  @scala.inline
  implicit class SdkOptionsMutableBuilder[Self <: SdkOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlayer(value: PlayerState): Self = StObject.set(x, "player", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToken(value: Accesstoken): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
