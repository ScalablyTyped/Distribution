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

trait CreateProperties extends js.Object {
  /**
    * The initial state of a checkbox or radio item:
    * true for selected and false for unselected.
    * Only one radio item can be selected at a time
    * in a given group of radio items.
    **/
  var checked: js.UndefOr[Boolean] = js.undefined
  /**
    * List of contexts this menu item will appear in.
    * @default ['page'] - Defaults to ['page'] if not specified.
    * @see ContextType
    **/
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
  /**
    * Lets you restrict the item to apply only to documents whose URL
    * matches one of the given patterns. (This applies to frames as well.)
    * For details on the format of a pattern, see Match Patterns.
    **/
  var documentUrlPatterns: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Whether this context menu item is enabled or disabled.
    * @default true
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The unique ID to assign to this item.
    * Mandatory for event pages.
    * Cannot be the same as another ID for this app.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * A function that will be called back when the menu item is clicked. Event pages cannot use this; instead, they should register a listener for chrome.contextMenus.onClicked.
    * @param info Information sent when a context menu item is clicked.
    */
  var onclick: js.UndefOr[js.Function1[/* info */ OnClickData, Unit]] = js.undefined
  /** The ID of a parent menu item; this makes the item a child of a previously added item.  */
  var parentId: js.UndefOr[integer | String] = js.undefined
  /**
    * Similar to documentUrlPatterns,
    * but lets you filter based on the src attribute
    * of img/audio/video tags and the href of anchor tags.
    **/
  var targetUrlPatterns: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The text to be displayed in the item;
    * this is required unless type is 'separator'.
    * When the context is 'selection', you can use
    * %s within the string to show the selected text.
    * For example, if this parameter's value is
    * 'Translate '%s' to Pig Latin' and the user
    * selects the word 'cool', the context menu
    * item for the selection is 'Translate 'cool'
    * to Pig Latin'.
    **/
  var title: js.UndefOr[String] = js.undefined
  /**
    * The type of menu item.
    * @default 'normal' - Defaults to 'normal' if not specified.
    * @see ItemType
    */
  var `type`: js.UndefOr[
    ToStringLiteral[Anon_CHECKBOX, String, Exclude[String, normal | checkbox | radio | separator]]
  ] = js.undefined
  /**
    * Whether the item is visible in the menu.
    * @since Chrome 62.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object CreateProperties {
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
    id: String = null,
    onclick: /* info */ OnClickData => Unit = null,
    parentId: integer | String = null,
    targetUrlPatterns: js.Array[String] = null,
    title: String = null,
    `type`: ToStringLiteral[Anon_CHECKBOX, String, Exclude[String, normal | checkbox | radio | separator]] = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): CreateProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (contexts != null) __obj.updateDynamic("contexts")(contexts.asInstanceOf[js.Any])
    if (documentUrlPatterns != null) __obj.updateDynamic("documentUrlPatterns")(documentUrlPatterns.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (onclick != null) __obj.updateDynamic("onclick")(js.Any.fromFunction1(onclick))
    if (parentId != null) __obj.updateDynamic("parentId")(parentId.asInstanceOf[js.Any])
    if (targetUrlPatterns != null) __obj.updateDynamic("targetUrlPatterns")(targetUrlPatterns.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProperties]
  }
}

