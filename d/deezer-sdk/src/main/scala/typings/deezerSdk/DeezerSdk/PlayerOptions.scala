package typings.deezerSdk.DeezerSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See:\
  * {@link https://developers.deezer.com/sdk/javascript/player | Initialize a player}\
  * {@link https://developers.deezer.com/musicplugins/player | Widget player}
  */
@js.native
trait PlayerOptions extends js.Object {
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
  implicit class PlayerOptionsOps[Self <: PlayerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setContainer(value: String): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setFormat(value: WidgetFormat): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setLayout(value: WidgetLayout): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    @scala.inline
    def setOnload(value: /* state */ PlayerState => Unit): Self = this.set("onload", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnload: Self = this.set("onload", js.undefined)
    @scala.inline
    def setPlaylist(value: Boolean): Self = this.set("playlist", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaylist: Self = this.set("playlist", js.undefined)
    @scala.inline
    def setSize(value: WidgetSize): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

