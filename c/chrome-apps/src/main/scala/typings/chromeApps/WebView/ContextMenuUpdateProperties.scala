package typings.chromeApps.WebView

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextMenuUpdateProperties extends js.Object {
  /**
    * The state of a checkbox or radio item: true for selected and false for unselected.
    * Only one radio item can be selected at a time in a given group of radio items.
    */
  var checked: js.UndefOr[Boolean] = js.undefined
  /**
    * List of contexts this menu item will appear in.
    */
  var contexts: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Lets you restrict the item to apply only to documents whose URL matches one of the given patterns.
    * (This applies to frames as well.)
    */
  var documentUrlPatterns: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Whether this context menu item is enabled or disabled.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * A function that will be called back when the menu item is clicked.
    * @param callback
    */
  var onclick: js.UndefOr[js.Function1[/* info */ js.Any, Unit]] = js.undefined
  /**
    * The ID of a parent menu item; this makes the item a child of a previously added item. <em>Note:</em> You cannot change an item to be a child of one of its own descendants.
    */
  var parentId: js.UndefOr[integer | String] = js.undefined
  /**
    * Similar to documentUrlPatterns, but lets you filter based on the src attribute of img/audio/video tags and the href of anchor tags.
    */
  var targetUrlPatterns: js.UndefOr[js.Array[_]] = js.undefined
  /** The text to be displayed in the item */
  var title: js.UndefOr[String] = js.undefined
  /** The type of menu item. */
  var `type`: js.UndefOr[ContextType] = js.undefined
}

object ContextMenuUpdateProperties {
  @scala.inline
  def apply(
    checked: js.UndefOr[Boolean] = js.undefined,
    contexts: js.Array[_] = null,
    documentUrlPatterns: js.Array[_] = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    onclick: /* info */ js.Any => Unit = null,
    parentId: integer | String = null,
    targetUrlPatterns: js.Array[_] = null,
    title: String = null,
    `type`: ContextType = null
  ): ContextMenuUpdateProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (contexts != null) __obj.updateDynamic("contexts")(contexts.asInstanceOf[js.Any])
    if (documentUrlPatterns != null) __obj.updateDynamic("documentUrlPatterns")(documentUrlPatterns.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (onclick != null) __obj.updateDynamic("onclick")(js.Any.fromFunction1(onclick))
    if (parentId != null) __obj.updateDynamic("parentId")(parentId.asInstanceOf[js.Any])
    if (targetUrlPatterns != null) __obj.updateDynamic("targetUrlPatterns")(targetUrlPatterns.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextMenuUpdateProperties]
  }
}

