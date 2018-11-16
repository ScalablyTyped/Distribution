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

