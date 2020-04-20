package typings.chromeApps.chrome.contextMenus

import typings.chromeApps.AnonALL
import typings.chromeApps.AnonCHECKBOX
import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chrome.integer
import typings.chromeApps.chromeAppsStrings.ALL
import typings.chromeApps.chromeAppsStrings.AUDIO
import typings.chromeApps.chromeAppsStrings.BROWSER_ACTION
import typings.chromeApps.chromeAppsStrings.CHECKBOX
import typings.chromeApps.chromeAppsStrings.EDITABLE
import typings.chromeApps.chromeAppsStrings.FRAME
import typings.chromeApps.chromeAppsStrings.IMAGE
import typings.chromeApps.chromeAppsStrings.LAUNCHER
import typings.chromeApps.chromeAppsStrings.LINK
import typings.chromeApps.chromeAppsStrings.NORMAL
import typings.chromeApps.chromeAppsStrings.PAGE
import typings.chromeApps.chromeAppsStrings.PAGE_ACTION
import typings.chromeApps.chromeAppsStrings.RADIO
import typings.chromeApps.chromeAppsStrings.SELECTION
import typings.chromeApps.chromeAppsStrings.SEPARATOR
import typings.chromeApps.chromeAppsStrings.VIDEO
import typings.chromeApps.chromeAppsStrings.all__
import typings.chromeApps.chromeAppsStrings.audio_
import typings.chromeApps.chromeAppsStrings.browser_action_
import typings.chromeApps.chromeAppsStrings.checkbox_
import typings.chromeApps.chromeAppsStrings.editable_
import typings.chromeApps.chromeAppsStrings.frame_
import typings.chromeApps.chromeAppsStrings.image_
import typings.chromeApps.chromeAppsStrings.launcher_
import typings.chromeApps.chromeAppsStrings.link_
import typings.chromeApps.chromeAppsStrings.normal_
import typings.chromeApps.chromeAppsStrings.page_
import typings.chromeApps.chromeAppsStrings.page_action_
import typings.chromeApps.chromeAppsStrings.radio_
import typings.chromeApps.chromeAppsStrings.selection_
import typings.chromeApps.chromeAppsStrings.separator_
import typings.chromeApps.chromeAppsStrings.video_
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
        AnonALL, 
        ALL | PAGE | FRAME | SELECTION | LINK | EDITABLE | IMAGE | VIDEO | AUDIO | LAUNCHER | BROWSER_ACTION | PAGE_ACTION, 
        Exclude[
          ALL | PAGE | FRAME | SELECTION | LINK | EDITABLE | IMAGE | VIDEO | AUDIO | LAUNCHER | BROWSER_ACTION | PAGE_ACTION, 
          browser_action_ | selection_ | video_ | launcher_ | image_ | editable_ | page_action_ | page_ | audio_ | frame_ | all__ | link_
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
    ToStringLiteral[
      AnonCHECKBOX, 
      NORMAL | CHECKBOX | RADIO | SEPARATOR, 
      Exclude[NORMAL | CHECKBOX | RADIO | SEPARATOR, normal_ | checkbox_ | radio_ | separator_]
    ]
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
        AnonALL, 
        ALL | PAGE | FRAME | SELECTION | LINK | EDITABLE | IMAGE | VIDEO | AUDIO | LAUNCHER | BROWSER_ACTION | PAGE_ACTION, 
        Exclude[
          ALL | PAGE | FRAME | SELECTION | LINK | EDITABLE | IMAGE | VIDEO | AUDIO | LAUNCHER | BROWSER_ACTION | PAGE_ACTION, 
          browser_action_ | selection_ | video_ | launcher_ | image_ | editable_ | page_action_ | page_ | audio_ | frame_ | all__ | link_
        ]
      ]
    ] = null,
    documentUrlPatterns: js.Array[String] = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    onclick: /* info */ OnClickData => Unit = null,
    parentId: integer | String = null,
    targetUrlPatterns: js.Array[String] = null,
    title: String = null,
    `type`: ToStringLiteral[
      AnonCHECKBOX, 
      NORMAL | CHECKBOX | RADIO | SEPARATOR, 
      Exclude[NORMAL | CHECKBOX | RADIO | SEPARATOR, normal_ | checkbox_ | radio_ | separator_]
    ] = null,
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

