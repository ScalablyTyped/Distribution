package typings.deezerSdk.DeezerSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See:\
  * {@link https://developers.deezer.com/sdk/javascript/player | Initialize a player}\
  * {@link https://developers.deezer.com/musicplugins/player | Widget player}
  */
@js.native
trait PlayerOptions extends StObject {
  
  /**
    * The general color of the widget. Has to be a hexadecimal value without the #.
    *
    * Default: 1990DB
    *
    * See:\
    * {@link https://developers.deezer.com/sdk/javascript/player#options | Player options}\
    * {@link https://developers.deezer.com/musicplugins/player | Widget player}
    */
  val color: js.UndefOr[String] = js.native
  
  /**
    * The ID of the div that will contain the widget player
    *
    * To implement a Deezer-like player, set this to the ID attribute of HTML div you want to load
    * the widget player in.
    *
    * An invisible player allows you to create your own UI and JavaScript events.
    *
    * See: {@link https://developers.deezer.com/sdk/javascript/player#options | Player options}
    */
  val container: js.UndefOr[String] = js.native
  
  /**
    * The layout format of the widget
    *
    * Default: classic
    *
    * See:\
    * {@link https://developers.deezer.com/sdk/javascript/player#options | Player options}\
    * {@link https://developers.deezer.com/musicplugins/player | Widget player}
    */
  val format: js.UndefOr[WidgetFormat] = js.native
  
  /**
    * The height of the player in pixels
    *
    * Default: 100%
    *
    * See: {@link https://developers.deezer.com/sdk/javascript/player#options | Player options}
    */
  val height: js.UndefOr[Double] = js.native
  
  /**
    * The general layout of the widget
    *
    * Default: dark
    *
    * See:\
    * {@link https://developers.deezer.com/sdk/javascript/player#options | Player options}\
    * {@link https://developers.deezer.com/musicplugins/player | Widget player}
    */
  val layout: js.UndefOr[WidgetLayout] = js.native
  
  /**
    * The callback function executed after the player has loaded.
    *
    * See: {@link https://developers.deezer.com/sdk/javascript/player#options | Player options}
    */
  var onload: js.UndefOr[js.Function1[/* state */ PlayerState, Unit]] = js.native
  
  /**
    * Whether to display the playlist from the player
    *
    * Default: true
    *
    * See: {@link https://developers.deezer.com/sdk/javascript/player#options | Player options}
    */
  val playlist: js.UndefOr[Boolean] = js.native
  
  /**
    * The layout size of the widget
    *
    * Default: medium
    *
    * See: {@link https://developers.deezer.com/sdk/javascript/player#options | Player options}
    */
  val size: js.UndefOr[WidgetSize] = js.native
  
  /**
    * The width of the player in pixels
    *
    * Default: 100%
    *
    * See: {@link https://developers.deezer.com/sdk/javascript/player#options | Player options}
    */
  val width: js.UndefOr[Double] = js.native
}
object PlayerOptions {
  
  @scala.inline
  def apply(): PlayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlayerOptions]
  }
  
  @scala.inline
  implicit class PlayerOptionsMutableBuilder[Self <: PlayerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setFormat(value: WidgetFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setLayout(value: WidgetLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    @scala.inline
    def setOnload(value: /* state */ PlayerState => Unit): Self = StObject.set(x, "onload", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnloadUndefined: Self = StObject.set(x, "onload", js.undefined)
    
    @scala.inline
    def setPlaylist(value: Boolean): Self = StObject.set(x, "playlist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaylistUndefined: Self = StObject.set(x, "playlist", js.undefined)
    
    @scala.inline
    def setSize(value: WidgetSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
