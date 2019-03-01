package typings
package bootstrapDash3DashTypeaheadLib.Bootstrap3TypeaheadNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Adds an item to the end of the list
    */
  var addItem: js.UndefOr[js.Object] = js.undefined
  /**
    * Call back function to execute after selected an item
    */
  var afterSelect: js.UndefOr[js.Function1[/* item */ java.lang.String, scala.Unit]] = js.undefined
  /**
    * Use this option to add the menu to another div
    */
  var appendTo: js.UndefOr[bootstrapDash3DashTypeaheadLib.JQuery] = js.undefined
  /**
    * Allows you to dictate whether or not the first suggestion is selected automatically
    */
  var autoSelect: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Adds a delay between lookups
    */
  var delay: js.UndefOr[scala.Double] = js.undefined
  /**
    * Method used to get textual representation of an item of the sources
    */
  var displayText: js.UndefOr[
    js.Function1[
      /* item */ java.lang.String | bootstrapDash3DashTypeaheadLib.Anon_Name, 
      java.lang.String
    ]
  ] = js.undefined
  /**
    * Set to true if you want the menu to be the same size than the input it is attached to
    */
  var fitToElement: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Method used to highlight autocomplete results
    */
  var highlighter: js.UndefOr[js.Function1[/* item */ java.lang.String, java.lang.String]] = js.undefined
  /**
    * The max number of items to display in the dropdown
    */
  var items: js.UndefOr[scala.Double] = js.undefined
  /**
    * The method used to determine if a query matches an item
    */
  var matcher: js.UndefOr[js.Function1[/* item */ java.lang.String, scala.Boolean]] = js.undefined
  /**
    * The minimum character length needed before triggering autocomplete suggestions
    */
  var minLength: js.UndefOr[scala.Double] = js.undefined
  /**
    * Number of pixels the scrollable parent container scrolled down
    */
  var scrollHeight: js.UndefOr[scala.Double | js.Function0[scala.Double]] = js.undefined
  /**
    * If hints should be shown as soon as the input gets focus
    */
  var showHintOnFocus: js.UndefOr[
    scala.Boolean | bootstrapDash3DashTypeaheadLib.bootstrapDash3DashTypeaheadLibStrings.all
  ] = js.undefined
  /**
    * Method used to sort autocomplete results
    */
  var sorter: js.UndefOr[js.Function1[/* items */ js.Array[java.lang.String], js.Array[java.lang.String]]] = js.undefined
  /**
    * The data source to query against
    */
  var source: js.UndefOr[
    js.Array[java.lang.String] | js.Array[js.Object] | (js.Function2[
      /* query */ js.UndefOr[java.lang.String], 
      /* process */ js.UndefOr[
        js.Function1[
          /* callback */ js.Any, 
          java.lang.String | js.Array[java.lang.String] | js.Array[js.Object]
        ]
      ], 
      scala.Unit
    ])
  ] = js.undefined
  /**
    * The method used to return selected item
    */
  var updater: js.UndefOr[js.Function1[/* item */ java.lang.String, java.lang.String]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    addItem: js.Object = null,
    afterSelect: js.Function1[/* item */ java.lang.String, scala.Unit] = null,
    appendTo: bootstrapDash3DashTypeaheadLib.JQuery = null,
    autoSelect: js.UndefOr[scala.Boolean] = js.undefined,
    delay: scala.Int | scala.Double = null,
    displayText: js.Function1[
      /* item */ java.lang.String | bootstrapDash3DashTypeaheadLib.Anon_Name, 
      java.lang.String
    ] = null,
    fitToElement: js.UndefOr[scala.Boolean] = js.undefined,
    highlighter: js.Function1[/* item */ java.lang.String, java.lang.String] = null,
    items: scala.Int | scala.Double = null,
    matcher: js.Function1[/* item */ java.lang.String, scala.Boolean] = null,
    minLength: scala.Int | scala.Double = null,
    scrollHeight: scala.Double | js.Function0[scala.Double] = null,
    showHintOnFocus: scala.Boolean | bootstrapDash3DashTypeaheadLib.bootstrapDash3DashTypeaheadLibStrings.all = null,
    sorter: js.Function1[/* items */ js.Array[java.lang.String], js.Array[java.lang.String]] = null,
    source: js.Array[java.lang.String] | js.Array[js.Object] | (js.Function2[
      /* query */ js.UndefOr[java.lang.String], 
      /* process */ js.UndefOr[
        js.Function1[
          /* callback */ js.Any, 
          java.lang.String | js.Array[java.lang.String] | js.Array[js.Object]
        ]
      ], 
      scala.Unit
    ]) = null,
    updater: js.Function1[/* item */ java.lang.String, java.lang.String] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (addItem != null) __obj.updateDynamic("addItem")(addItem)
    if (afterSelect != null) __obj.updateDynamic("afterSelect")(afterSelect)
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo)
    if (!js.isUndefined(autoSelect)) __obj.updateDynamic("autoSelect")(autoSelect)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (displayText != null) __obj.updateDynamic("displayText")(displayText)
    if (!js.isUndefined(fitToElement)) __obj.updateDynamic("fitToElement")(fitToElement)
    if (highlighter != null) __obj.updateDynamic("highlighter")(highlighter)
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (matcher != null) __obj.updateDynamic("matcher")(matcher)
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (scrollHeight != null) __obj.updateDynamic("scrollHeight")(scrollHeight.asInstanceOf[js.Any])
    if (showHintOnFocus != null) __obj.updateDynamic("showHintOnFocus")(showHintOnFocus.asInstanceOf[js.Any])
    if (sorter != null) __obj.updateDynamic("sorter")(sorter)
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (updater != null) __obj.updateDynamic("updater")(updater)
    __obj.asInstanceOf[Options]
  }
}

