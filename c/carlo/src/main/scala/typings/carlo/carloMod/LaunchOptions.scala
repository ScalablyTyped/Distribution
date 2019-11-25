package typings.carlo.carloMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchOptions extends WindowOptions {
  /**
    * Additional arguments to pass to the browser instance.
    */
  var args: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Browser to be used, defaults to ['stable']
    */
  var channel: js.UndefOr[js.Array[Channel]] = js.undefined
  /**
    * Path to a Chromium or Chrome executable to run instead of the automatically located Chrome.
    * If executablePath is a relative path, then it is resolved relative to current working directory.
    * Carlo is only guaranteed to work with the latest Chrome stable version.
    */
  var executablePath: js.UndefOr[String] = js.undefined
  /**
    * Application icon to be used in the system dock.
    * Either buffer containing PNG or a path to the PNG file on the file system.
    * This feature is only available in Chrome M72+.
    * One can use 'canary' channel to see it in action before M72 hits stable.
    */
  var icon: js.UndefOr[Buffer | String] = js.undefined
  /**
    * Optional parameters to share between Carlo instances.
    */
  var paramsForReuse: js.UndefOr[js.Any] = js.undefined
  /**
    * Application title
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    *  Path to a User Data Directory. This folder is created upon the first app launch and contains user settings and Web storage data. Defaults to '.profile'.
    */
  var userDataDir: js.UndefOr[String] = js.undefined
}

object LaunchOptions {
  @scala.inline
  def apply(
    args: js.Array[String] = null,
    bgcolor: String = null,
    channel: js.Array[Channel] = null,
    executablePath: String = null,
    height: Int | Double = null,
    icon: Buffer | String = null,
    left: Int | Double = null,
    paramsForReuse: js.Any = null,
    title: String = null,
    top: Int | Double = null,
    userDataDir: String = null,
    width: Int | Double = null
  ): LaunchOptions = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (bgcolor != null) __obj.updateDynamic("bgcolor")(bgcolor.asInstanceOf[js.Any])
    if (channel != null) __obj.updateDynamic("channel")(channel.asInstanceOf[js.Any])
    if (executablePath != null) __obj.updateDynamic("executablePath")(executablePath.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (paramsForReuse != null) __obj.updateDynamic("paramsForReuse")(paramsForReuse.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (userDataDir != null) __obj.updateDynamic("userDataDir")(userDataDir.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchOptions]
  }
}

