package typings
package chromeDashAppsLib.chromeNs.contextMenusNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateProperties extends js.Object {
  var checked: js.UndefOr[scala.Boolean] = js.undefined
  /** @see ContextType */
  var contexts: js.UndefOr[
    js.Array[
      chromeDashAppsLib.chromeNs.ToStringLiteral[
        chromeDashAppsLib.Anon_ALL, 
        java.lang.String, 
        stdLib.Exclude[
          java.lang.String, 
          chromeDashAppsLib.chromeDashAppsLibStrings.browser_action | chromeDashAppsLib.chromeDashAppsLibStrings.launcher | chromeDashAppsLib.chromeDashAppsLibStrings.all | chromeDashAppsLib.chromeDashAppsLibStrings.frame | chromeDashAppsLib.chromeDashAppsLibStrings.audio | chromeDashAppsLib.chromeDashAppsLibStrings.link | chromeDashAppsLib.chromeDashAppsLibStrings.page | chromeDashAppsLib.chromeDashAppsLibStrings.selection | chromeDashAppsLib.chromeDashAppsLibStrings.page_action | chromeDashAppsLib.chromeDashAppsLibStrings.editable | chromeDashAppsLib.chromeDashAppsLibStrings.video | chromeDashAppsLib.chromeDashAppsLibStrings.image
        ]
      ]
    ]
  ] = js.undefined
  var documentUrlPatterns: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Information sent when a context menu item is clicked.
    * @since Chrome 44
    */
  var onclick: js.UndefOr[js.Function1[/* info */ OnClickData, scala.Unit]] = js.undefined
  /** Note: You cannot change an item to be a child of one of its own descendants.  */
  var parentId: js.UndefOr[chromeDashAppsLib.chromeNs.integer | java.lang.String] = js.undefined
  var targetUrlPatterns: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** @see ItemType */
  var `type`: js.UndefOr[
    chromeDashAppsLib.chromeNs.ToStringLiteral[
      chromeDashAppsLib.Anon_CHECKBOX, 
      java.lang.String, 
      stdLib.Exclude[
        java.lang.String, 
        chromeDashAppsLib.chromeDashAppsLibStrings.normal | chromeDashAppsLib.chromeDashAppsLibStrings.checkbox | chromeDashAppsLib.chromeDashAppsLibStrings.radio | chromeDashAppsLib.chromeDashAppsLibStrings.separator
      ]
    ]
  ] = js.undefined
  /**
    * Whether the item is visible in the menu.
    * @since Chrome 62.
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object UpdateProperties {
  @scala.inline
  def apply(
    checked: js.UndefOr[scala.Boolean] = js.undefined,
    contexts: js.Array[
      chromeDashAppsLib.chromeNs.ToStringLiteral[
        chromeDashAppsLib.Anon_ALL, 
        java.lang.String, 
        stdLib.Exclude[
          java.lang.String, 
          chromeDashAppsLib.chromeDashAppsLibStrings.browser_action | chromeDashAppsLib.chromeDashAppsLibStrings.launcher | chromeDashAppsLib.chromeDashAppsLibStrings.all | chromeDashAppsLib.chromeDashAppsLibStrings.frame | chromeDashAppsLib.chromeDashAppsLibStrings.audio | chromeDashAppsLib.chromeDashAppsLibStrings.link | chromeDashAppsLib.chromeDashAppsLibStrings.page | chromeDashAppsLib.chromeDashAppsLibStrings.selection | chromeDashAppsLib.chromeDashAppsLibStrings.page_action | chromeDashAppsLib.chromeDashAppsLibStrings.editable | chromeDashAppsLib.chromeDashAppsLibStrings.video | chromeDashAppsLib.chromeDashAppsLibStrings.image
        ]
      ]
    ] = null,
    documentUrlPatterns: js.Array[java.lang.String] = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    onclick: /* info */ OnClickData => scala.Unit = null,
    parentId: chromeDashAppsLib.chromeNs.integer | java.lang.String = null,
    targetUrlPatterns: js.Array[java.lang.String] = null,
    title: java.lang.String = null,
    `type`: chromeDashAppsLib.chromeNs.ToStringLiteral[
      chromeDashAppsLib.Anon_CHECKBOX, 
      java.lang.String, 
      stdLib.Exclude[
        java.lang.String, 
        chromeDashAppsLib.chromeDashAppsLibStrings.normal | chromeDashAppsLib.chromeDashAppsLibStrings.checkbox | chromeDashAppsLib.chromeDashAppsLibStrings.radio | chromeDashAppsLib.chromeDashAppsLibStrings.separator
      ]
    ] = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): UpdateProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (contexts != null) __obj.updateDynamic("contexts")(contexts)
    if (documentUrlPatterns != null) __obj.updateDynamic("documentUrlPatterns")(documentUrlPatterns)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (onclick != null) __obj.updateDynamic("onclick")(js.Any.fromFunction1(onclick))
    if (parentId != null) __obj.updateDynamic("parentId")(parentId.asInstanceOf[js.Any])
    if (targetUrlPatterns != null) __obj.updateDynamic("targetUrlPatterns")(targetUrlPatterns)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[UpdateProperties]
  }
}

