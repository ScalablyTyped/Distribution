package typings
package chromeDashAppsLib.chromeNs.contextMenusNs

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
  var checked: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * List of contexts this menu item will appear in.
    * @default ['page'] - Defaults to ['page'] if not specified.
    * @see ContextType
    **/
  var contexts: js.UndefOr[
    js.Array[
      chromeDashAppsLib.chromeNs.ToStringLiteral[
        chromeDashAppsLib.Anon_ALL, 
        java.lang.String, 
        stdLib.Exclude[
          java.lang.String, 
          /* import warning: ImportType.apply Failed type conversion: chrome-apps.Anon_ALL[keyof chrome-apps.Anon_ALL] */ js.Any
        ]
      ]
    ]
  ] = js.undefined
  /**
    * Lets you restrict the item to apply only to documents whose URL
    * matches one of the given patterns. (This applies to frames as well.)
    * For details on the format of a pattern, see Match Patterns.
    **/
  var documentUrlPatterns: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Whether this context menu item is enabled or disabled.
    * @default true
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The unique ID to assign to this item.
    * Mandatory for event pages.
    * Cannot be the same as another ID for this app.
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A function that will be called back when the menu item is clicked. Event pages cannot use this; instead, they should register a listener for chrome.contextMenus.onClicked.
    * @param info Information sent when a context menu item is clicked.
    */
  var onclick: js.UndefOr[js.Function1[/* info */ OnClickData, scala.Unit]] = js.undefined
  /** The ID of a parent menu item; this makes the item a child of a previously added item.  */
  var parentId: js.UndefOr[chromeDashAppsLib.chromeNs.integer | java.lang.String] = js.undefined
  /**
    * Similar to documentUrlPatterns,
    * but lets you filter based on the src attribute
    * of img/audio/video tags and the href of anchor tags.
    **/
  var targetUrlPatterns: js.UndefOr[js.Array[java.lang.String]] = js.undefined
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
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The type of menu item.
    * @default 'normal' - Defaults to 'normal' if not specified.
    * @see ItemType
    */
  var `type`: js.UndefOr[
    chromeDashAppsLib.chromeNs.ToStringLiteral[
      chromeDashAppsLib.Anon_CHECKBOX, 
      java.lang.String, 
      stdLib.Exclude[
        java.lang.String, 
        /* import warning: ImportType.apply Failed type conversion: chrome-apps.Anon_CHECKBOX[keyof chrome-apps.Anon_CHECKBOX] */ js.Any
      ]
    ]
  ] = js.undefined
  /**
    * Whether the item is visible in the menu.
    * @since Chrome 62.
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object CreateProperties {
  @scala.inline
  def apply(
    checked: js.UndefOr[scala.Boolean] = js.undefined,
    contexts: js.Array[
      chromeDashAppsLib.chromeNs.ToStringLiteral[
        chromeDashAppsLib.Anon_ALL, 
        java.lang.String, 
        stdLib.Exclude[
          java.lang.String, 
          /* import warning: ImportType.apply Failed type conversion: chrome-apps.Anon_ALL[keyof chrome-apps.Anon_ALL] */ js.Any
        ]
      ]
    ] = null,
    documentUrlPatterns: js.Array[java.lang.String] = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    onclick: /* info */ OnClickData => scala.Unit = null,
    parentId: chromeDashAppsLib.chromeNs.integer | java.lang.String = null,
    targetUrlPatterns: js.Array[java.lang.String] = null,
    title: java.lang.String = null,
    `type`: chromeDashAppsLib.chromeNs.ToStringLiteral[
      chromeDashAppsLib.Anon_CHECKBOX, 
      java.lang.String, 
      stdLib.Exclude[
        java.lang.String, 
        /* import warning: ImportType.apply Failed type conversion: chrome-apps.Anon_CHECKBOX[keyof chrome-apps.Anon_CHECKBOX] */ js.Any
      ]
    ] = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): CreateProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (contexts != null) __obj.updateDynamic("contexts")(contexts)
    if (documentUrlPatterns != null) __obj.updateDynamic("documentUrlPatterns")(documentUrlPatterns)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (id != null) __obj.updateDynamic("id")(id)
    if (onclick != null) __obj.updateDynamic("onclick")(js.Any.fromFunction1(onclick))
    if (parentId != null) __obj.updateDynamic("parentId")(parentId.asInstanceOf[js.Any])
    if (targetUrlPatterns != null) __obj.updateDynamic("targetUrlPatterns")(targetUrlPatterns)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[CreateProperties]
  }
}

