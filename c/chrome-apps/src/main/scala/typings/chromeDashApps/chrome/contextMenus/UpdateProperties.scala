package typings.chromeDashApps.chrome.contextMenus

import typings.chromeDashApps.Anon_ALL
import typings.chromeDashApps.Anon_CHECKBOX
import typings.chromeDashApps.chrome.ToStringLiteral
import typings.chromeDashApps.chrome.integer
import typings.chromeDashApps.chromeDashAppsStrings.all_
import typings.chromeDashApps.chromeDashAppsStrings.audio
import typings.chromeDashApps.chromeDashAppsStrings.browser_action
import typings.chromeDashApps.chromeDashAppsStrings.checkbox
import typings.chromeDashApps.chromeDashAppsStrings.editable
import typings.chromeDashApps.chromeDashAppsStrings.frame
import typings.chromeDashApps.chromeDashAppsStrings.image
import typings.chromeDashApps.chromeDashAppsStrings.launcher
import typings.chromeDashApps.chromeDashAppsStrings.link
import typings.chromeDashApps.chromeDashAppsStrings.normal
import typings.chromeDashApps.chromeDashAppsStrings.page
import typings.chromeDashApps.chromeDashAppsStrings.page_action
import typings.chromeDashApps.chromeDashAppsStrings.radio
import typings.chromeDashApps.chromeDashAppsStrings.selection
import typings.chromeDashApps.chromeDashAppsStrings.separator
import typings.chromeDashApps.chromeDashAppsStrings.video
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateProperties extends js.Object {
  var checked: js.UndefOr[Boolean] = js.undefined
  /** @see ContextType */
  var contexts: js.UndefOr[
    js.Array[
      ToStringLiteral[
        Anon_ALL, 
        String, 
        Exclude[
          String, 
          browser_action | selection | video | launcher | image | editable | page_action | page | audio | frame | all_ | link
        ]
      ]
    ]
  ] = js.undefined
  var documentUrlPatterns: js.UndefOr[js.Array[String]] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Information sent when a context menu item is clicked.
    * @since Chrome 44
    */
  var onclick: js.UndefOr[js.Function1[/* info */ OnClickData, Unit]] = js.undefined
  /** Note: You cannot change an item to be a child of one of its own descendants.  */
  var parentId: js.UndefOr[integer | String] = js.undefined
  var targetUrlPatterns: js.UndefOr[js.Array[String]] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  /** @see ItemType */
  var `type`: js.UndefOr[
    ToStringLiteral[Anon_CHECKBOX, String, Exclude[String, normal | checkbox | radio | separator]]
  ] = js.undefined
  /**
    * Whether the item is visible in the menu.
    * @since Chrome 62.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object UpdateProperties {
  @scala.inline
  def apply(
    checked: js.UndefOr[Boolean] = js.undefined,
    contexts: js.Array[
      ToStringLiteral[
        Anon_ALL, 
        String, 
        Exclude[
          String, 
          browser_action | selection | video | launcher | image | editable | page_action | page | audio | frame | all_ | link
        ]
      ]
    ] = null,
    documentUrlPatterns: js.Array[String] = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    onclick: /* info */ OnClickData => Unit = null,
    parentId: integer | String = null,
    targetUrlPatterns: js.Array[String] = null,
    title: String = null,
    `type`: ToStringLiteral[Anon_CHECKBOX, String, Exclude[String, normal | checkbox | radio | separator]] = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): UpdateProperties = {
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
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProperties]
  }
}

