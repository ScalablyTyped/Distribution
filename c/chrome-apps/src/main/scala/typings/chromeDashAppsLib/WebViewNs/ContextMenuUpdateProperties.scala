package typings
package chromeDashAppsLib.WebViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextMenuUpdateProperties extends js.Object {
  /**
    * The state of a checkbox or radio item: true for selected and false for unselected.
    * Only one radio item can be selected at a time in a given group of radio items.
    */
  var checked: js.UndefOr[scala.Boolean] = js.undefined
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
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A function that will be called back when the menu item is clicked.
    * @param callback
    */
  var onclick: js.UndefOr[js.Function1[/* info */ js.Any, scala.Unit]] = js.undefined
  /**
    * The ID of a parent menu item; this makes the item a child of a previously added item. <em>Note:</em> You cannot change an item to be a child of one of its own descendants.
    */
  var parentId: js.UndefOr[chromeDashAppsLib.chromeNs.integer | java.lang.String] = js.undefined
  /**
    * Similar to documentUrlPatterns, but lets you filter based on the src attribute of img/audio/video tags and the href of anchor tags.
    */
  var targetUrlPatterns: js.UndefOr[js.Array[_]] = js.undefined
  /** The text to be displayed in the item */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** The type of menu item. */
  var `type`: js.UndefOr[ContextType] = js.undefined
}

object ContextMenuUpdateProperties {
  @scala.inline
  def apply(
    checked: js.UndefOr[scala.Boolean] = js.undefined,
    contexts: js.Array[_] = null,
    documentUrlPatterns: js.Array[_] = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    onclick: js.Function1[/* info */ js.Any, scala.Unit] = null,
    parentId: chromeDashAppsLib.chromeNs.integer | java.lang.String = null,
    targetUrlPatterns: js.Array[_] = null,
    title: java.lang.String = null,
    `type`: ContextType = null
  ): ContextMenuUpdateProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (contexts != null) __obj.updateDynamic("contexts")(contexts)
    if (documentUrlPatterns != null) __obj.updateDynamic("documentUrlPatterns")(documentUrlPatterns)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (onclick != null) __obj.updateDynamic("onclick")(onclick)
    if (parentId != null) __obj.updateDynamic("parentId")(parentId.asInstanceOf[js.Any])
    if (targetUrlPatterns != null) __obj.updateDynamic("targetUrlPatterns")(targetUrlPatterns)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ContextMenuUpdateProperties]
  }
}

