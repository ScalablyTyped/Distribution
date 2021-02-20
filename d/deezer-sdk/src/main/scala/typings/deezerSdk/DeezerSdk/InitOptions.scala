package typings.deezerSdk.DeezerSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See:\
  * {@link https://developers.deezer.com/sdk/javascript/init | DZ.init}\
  * {@link https://developers.deezer.com/sdk/javascript/player | Initialize a player}
  */
@js.native
trait InitOptions extends StObject {
  
  val appId: String = js.native
  
  val channelUrl: String = js.native
  
  val player: js.UndefOr[PlayerOptions] = js.native
}
object InitOptions {
  
  @scala.inline
  def apply(appId: String, channelUrl: String): InitOptions = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], channelUrl = channelUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitOptions]
  }
  
  @scala.inline
  implicit class InitOptionsMutableBuilder[Self <: InitOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelUrl(value: String): Self = StObject.set(x, "channelUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayer(value: PlayerOptions): Self = StObject.set(x, "player", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayerUndefined: Self = StObject.set(x, "player", js.undefined)
  }
}
