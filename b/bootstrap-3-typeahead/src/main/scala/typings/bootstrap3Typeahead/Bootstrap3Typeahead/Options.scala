package typings.bootstrap3Typeahead.Bootstrap3Typeahead

import typings.bootstrap3Typeahead.JQuery
import typings.bootstrap3Typeahead.anon.Name
import typings.bootstrap3Typeahead.bootstrap3TypeaheadStrings.all
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Adds an item to the end of the list
    */
  var addItem: js.UndefOr[js.Object] = js.native
  /**
    * Call back function to execute after selected an item
    */
  var afterSelect: js.UndefOr[js.ThisFunction1[/* this */ Typeahead, /* item */ String | js.Object, Unit]] = js.native
  /**
    * Use this option to add the menu to another div
    */
  var appendTo: js.UndefOr[JQuery] = js.native
  /**
    * Allows you to dictate whether or not the first suggestion is selected automatically
    */
  var autoSelect: js.UndefOr[Boolean] = js.native
  /**
    * Adds a delay between lookups
    */
  var delay: js.UndefOr[Double] = js.native
  /**
    * Method used to get textual representation of an item of the sources
    */
  var displayText: js.UndefOr[js.Function1[/* item */ String | Name, String]] = js.native
  /**
    * Set to true if you want the menu to be the same size than the input it is attached to
    */
  var fitToElement: js.UndefOr[Boolean] = js.native
  /**
    * Method used to highlight autocomplete results
    */
  var highlighter: js.UndefOr[js.Function1[/* item */ String, String]] = js.native
  /**
    * The max number of items to display in the dropdown
    */
  var items: js.UndefOr[Double | all] = js.native
  /**
    * The method used to determine if a query matches an item
    */
  var matcher: js.UndefOr[js.Function1[/* item */ String, Boolean]] = js.native
  /**
    * The minimum character length needed before triggering autocomplete suggestions
    */
  var minLength: js.UndefOr[Double] = js.native
  /**
    * Number of pixels the scrollable parent container scrolled down
    */
  var scrollHeight: js.UndefOr[Double | js.Function0[Double]] = js.native
  /**
    * If hints should be shown as soon as the input gets focus
    */
  var showHintOnFocus: js.UndefOr[Boolean | all] = js.native
  /**
    * Method used to sort autocomplete results
    */
  var sorter: js.UndefOr[js.Function1[/* items */ js.Array[String], js.Array[String]]] = js.native
  /**
    * The data source to query against
    */
  var source: js.UndefOr[
    (js.Array[js.Object | String]) | (js.Function2[
      /* query */ js.UndefOr[String], 
      /* process */ js.UndefOr[js.Function1[/* callback */ js.Any, String | (js.Array[js.Object | String])]], 
      Unit
    ])
  ] = js.native
  /**
    * The method used to return selected item
    */
  var updater: js.UndefOr[js.Function1[/* item */ String, String]] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddItem(value: js.Object): Self = this.set("addItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddItem: Self = this.set("addItem", js.undefined)
    @scala.inline
    def setAfterSelect(value: js.ThisFunction1[/* this */ Typeahead, /* item */ String | js.Object, Unit]): Self = this.set("afterSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterSelect: Self = this.set("afterSelect", js.undefined)
    @scala.inline
    def setAppendTo(value: JQuery): Self = this.set("appendTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppendTo: Self = this.set("appendTo", js.undefined)
    @scala.inline
    def setAutoSelect(value: Boolean): Self = this.set("autoSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoSelect: Self = this.set("autoSelect", js.undefined)
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setDisplayText(value: /* item */ String | Name => String): Self = this.set("displayText", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDisplayText: Self = this.set("displayText", js.undefined)
    @scala.inline
    def setFitToElement(value: Boolean): Self = this.set("fitToElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFitToElement: Self = this.set("fitToElement", js.undefined)
    @scala.inline
    def setHighlighter(value: /* item */ String => String): Self = this.set("highlighter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHighlighter: Self = this.set("highlighter", js.undefined)
    @scala.inline
    def setItems(value: Double | all): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setMatcher(value: /* item */ String => Boolean): Self = this.set("matcher", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMatcher: Self = this.set("matcher", js.undefined)
    @scala.inline
    def setMinLength(value: Double): Self = this.set("minLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinLength: Self = this.set("minLength", js.undefined)
    @scala.inline
    def setScrollHeightFunction0(value: () => Double): Self = this.set("scrollHeight", js.Any.fromFunction0(value))
    @scala.inline
    def setScrollHeight(value: Double | js.Function0[Double]): Self = this.set("scrollHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollHeight: Self = this.set("scrollHeight", js.undefined)
    @scala.inline
    def setShowHintOnFocus(value: Boolean | all): Self = this.set("showHintOnFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowHintOnFocus: Self = this.set("showHintOnFocus", js.undefined)
    @scala.inline
    def setSorter(value: /* items */ js.Array[String] => js.Array[String]): Self = this.set("sorter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSorter: Self = this.set("sorter", js.undefined)
    @scala.inline
    def setSourceFunction2(
      value: (/* query */ js.UndefOr[String], /* process */ js.UndefOr[js.Function1[/* callback */ js.Any, String | (js.Array[js.Object | String])]]) => Unit
    ): Self = this.set("source", js.Any.fromFunction2(value))
    @scala.inline
    def setSourceVarargs(value: (js.Object | String)*): Self = this.set("source", js.Array(value :_*))
    @scala.inline
    def setSource(
      value: (js.Array[js.Object | String]) | (js.Function2[
          /* query */ js.UndefOr[String], 
          /* process */ js.UndefOr[js.Function1[/* callback */ js.Any, String | (js.Array[js.Object | String])]], 
          Unit
        ])
    ): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setUpdater(value: /* item */ String => String): Self = this.set("updater", js.Any.fromFunction1(value))
    @scala.inline
    def deleteUpdater: Self = this.set("updater", js.undefined)
  }
  
}

