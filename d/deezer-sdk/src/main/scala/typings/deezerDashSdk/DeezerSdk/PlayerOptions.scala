package typings.deezerDashSdk.DeezerSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See:\
  * {@link https://developers.deezer.com/sdk/javascript/player | Initialize a player}\
  * {@link https://developers.deezer.com/musicplugins/player | Widget player}
  */
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
  val color: js.UndefOr[String] = js.undefined
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
  val container: js.UndefOr[String] = js.undefined
  /**
    * The layout format of the widget
    *
    * Default: classic
    *
    * See:\
    * {@link https://developers.deezer.com/sdk/javascript/player#options | Player options}\
    * {@link https://developers.deezer.com/musicplugins/player | Widget player}
    */
  val format: js.UndefOr[WidgetFormat] = js.undefined
  /**
    * The height of the player in pixels
    *
    * Default: 100%
    *
    * See: {@link https://developers.deezer.com/sdk/javascript/player#options | Player options}
    */
  val height: js.UndefOr[Double] = js.undefined
  /**
    * The general layout of the widget
    *
    * Default: dark
    *
    * See:\
    * {@link https://developers.deezer.com/sdk/javascript/player#options | Player options}\
    * {@link https://developers.deezer.com/musicplugins/player | Widget player}
    */
  val layout: js.UndefOr[WidgetLayout] = js.undefined
  /**
    * The callback function executed after the player has loaded.
    *
    * See: {@link https://developers.deezer.com/sdk/javascript/player#options | Player options}
    */
  var onload: js.UndefOr[js.Function1[/* state */ PlayerState, Unit]] = js.undefined
  /**
    * Whether to display the playlist from the player
    *
    * Default: true
    *
    * See: {@link https://developers.deezer.com/sdk/javascript/player#options | Player options}
    */
  val playlist: js.UndefOr[Boolean] = js.undefined
  /**
    * The layout size of the widget
    *
    * Default: medium
    *
    * See: {@link https://developers.deezer.com/sdk/javascript/player#options | Player options}
    */
  val size: js.UndefOr[WidgetSize] = js.undefined
  /**
    * The width of the player in pixels
    *
    * Default: 100%
    *
    * See: {@link https://developers.deezer.com/sdk/javascript/player#options | Player options}
    */
  val width: js.UndefOr[Double] = js.undefined
}

object PlayerOptions {
  @scala.inline
  def apply(
    color: String = null,
    container: String = null,
    format: WidgetFormat = null,
    height: Int | Double = null,
    layout: WidgetLayout = null,
    onload: /* state */ PlayerState => Unit = null,
    playlist: js.UndefOr[Boolean] = js.undefined,
    size: WidgetSize = null,
    width: Int | Double = null
  ): PlayerOptions = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (container != null) __obj.updateDynamic("container")(container)
    if (format != null) __obj.updateDynamic("format")(format)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (onload != null) __obj.updateDynamic("onload")(js.Any.fromFunction1(onload))
    if (!js.isUndefined(playlist)) __obj.updateDynamic("playlist")(playlist)
    if (size != null) __obj.updateDynamic("size")(size)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayerOptions]
  }
}

