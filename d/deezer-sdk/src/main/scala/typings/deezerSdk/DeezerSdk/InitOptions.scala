package typings.deezerSdk.DeezerSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See:\
  * {@link https://developers.deezer.com/sdk/javascript/init | DZ.init}\
  * {@link https://developers.deezer.com/sdk/javascript/player | Initialize a player}
  */
trait InitOptions extends StObject {
  
  val appId: String
  
  val channelUrl: String
  
  val player: js.UndefOr[PlayerOptions] = js.undefined
}
object InitOptions {
  
  inline def apply(appId: String, channelUrl: String): InitOptions = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], channelUrl = channelUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitOptions]
  }
  
  extension [Self <: InitOptions](x: Self) {
    
    inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setChannelUrl(value: String): Self = StObject.set(x, "channelUrl", value.asInstanceOf[js.Any])
    
    inline def setPlayer(value: PlayerOptions): Self = StObject.set(x, "player", value.asInstanceOf[js.Any])
    
    inline def setPlayerUndefined: Self = StObject.set(x, "player", js.undefined)
  }
}
