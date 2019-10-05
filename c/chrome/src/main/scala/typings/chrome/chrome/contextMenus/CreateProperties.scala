package typings.chrome.chrome.contextMenus

import typings.chrome.chrome.tabs.Tab
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateProperties extends js.Object {
  /** Optional. The initial state of a checkbox or radio item: true for selected and false for unselected. Only one radio item can be selected at a time in a given group of radio items.  */
  var checked: js.UndefOr[Boolean] = js.undefined
  /** Optional. List of contexts this menu item will appear in. Defaults to ['page'] if not specified.  */
  var contexts: js.UndefOr[js.Array[String]] = js.undefined
  /** Optional. Lets you restrict the item to apply only to documents whose URL matches one of the given patterns. (This applies to frames as well.) For details on the format of a pattern, see Match Patterns.  */
  var documentUrlPatterns: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Optional.
    * Since Chrome 20.
    * Whether this context menu item is enabled or disabled. Defaults to true.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional.
    * Since Chrome 21.
    * The unique ID to assign to this item. Mandatory for event pages. Cannot be the same as another ID for this extension.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * Optional.
    * A function that will be called back when the menu item is clicked. Event pages cannot use this; instead, they should register a listener for chrome.contextMenus.onClicked.
    * @param info Information sent when a context menu item is clicked.
    * @param tab The details of the tab where the click took place. Note: this parameter only present for extensions.
    */
  var onclick: js.UndefOr[js.Function2[/* info */ OnClickData, /* tab */ Tab, Unit]] = js.undefined
  /** Optional. The ID of a parent menu item; this makes the item a child of a previously added item.  */
  var parentId: js.UndefOr[js.Any] = js.undefined
  /** Optional. Similar to documentUrlPatterns, but lets you filter based on the src attribute of img/audio/video tags and the href of anchor tags.  */
  var targetUrlPatterns: js.UndefOr[js.Array[String]] = js.undefined
  /** Optional. The text to be displayed in the item; this is required unless type is 'separator'. When the context is 'selection', you can use %s within the string to show the selected text. For example, if this parameter's value is "Translate '%s' to Pig Latin" and the user selects the word "cool", the context menu item for the selection is "Translate 'cool' to Pig Latin".  */
  var title: js.UndefOr[String] = js.undefined
  /** Optional. The type of menu item. Defaults to 'normal' if not specified.  */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * Optional.
    * Since Chrome 62.
    * Whether the item is visible in the menu.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object CreateProperties {
  @scala.inline
  def apply(
    checked: js.UndefOr[Boolean] = js.undefined,
    contexts: js.Array[String] = null,
    documentUrlPatterns: js.Array[String] = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    onclick: (/* info */ OnClickData, /* tab */ Tab) => Unit = null,
    parentId: js.Any = null,
    targetUrlPatterns: js.Array[String] = null,
    title: String = null,
    `type`: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): CreateProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (contexts != null) __obj.updateDynamic("contexts")(contexts)
    if (documentUrlPatterns != null) __obj.updateDynamic("documentUrlPatterns")(documentUrlPatterns)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (id != null) __obj.updateDynamic("id")(id)
    if (onclick != null) __obj.updateDynamic("onclick")(js.Any.fromFunction2(onclick))
    if (parentId != null) __obj.updateDynamic("parentId")(parentId)
    if (targetUrlPatterns != null) __obj.updateDynamic("targetUrlPatterns")(targetUrlPatterns)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[CreateProperties]
  }
}

