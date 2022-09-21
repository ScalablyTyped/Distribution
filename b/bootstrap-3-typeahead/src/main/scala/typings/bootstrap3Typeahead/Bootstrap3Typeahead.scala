package typings.bootstrap3Typeahead

import typings.bootstrap3Typeahead.anon.Name
import typings.bootstrap3Typeahead.bootstrap3TypeaheadStrings.all
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Bootstrap3Typeahead {
  
  trait Options extends StObject {
    
    /**
      * Adds an item to the end of the list
      */
    var addItem: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Call back function to execute after selected an item
      */
    var afterSelect: js.UndefOr[js.ThisFunction1[/* this */ Typeahead, /* item */ String | js.Object, Unit]] = js.undefined
    
    /**
      * Use this option to add the menu to another div
      */
    var appendTo: js.UndefOr[JQuery] = js.undefined
    
    /**
      * Allows you to dictate whether or not the first suggestion is selected automatically
      */
    var autoSelect: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Adds a delay between lookups
      */
    var delay: js.UndefOr[Double] = js.undefined
    
    /**
      * Method used to get textual representation of an item of the sources
      */
    var displayText: js.UndefOr[js.Function1[/* item */ String | Name, String]] = js.undefined
    
    /**
      * Set to true if you want the menu to be the same size than the input it is attached to
      */
    var fitToElement: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Method used to highlight autocomplete results
      */
    var highlighter: js.UndefOr[js.Function1[/* item */ String, String]] = js.undefined
    
    /**
      * The max number of items to display in the dropdown
      */
    var items: js.UndefOr[Double | all] = js.undefined
    
    /**
      * The method used to determine if a query matches an item
      */
    var matcher: js.UndefOr[js.Function1[/* item */ String, Boolean]] = js.undefined
    
    /**
      * The minimum character length needed before triggering autocomplete suggestions
      */
    var minLength: js.UndefOr[Double] = js.undefined
    
    /**
      * Number of pixels the scrollable parent container scrolled down
      */
    var scrollHeight: js.UndefOr[Double | js.Function0[Double]] = js.undefined
    
    /**
      * If hints should be shown as soon as the input gets focus
      */
    var showHintOnFocus: js.UndefOr[Boolean | all] = js.undefined
    
    /**
      * Method used to sort autocomplete results
      */
    var sorter: js.UndefOr[js.Function1[/* items */ js.Array[String], js.Array[String]]] = js.undefined
    
    /**
      * The data source to query against
      */
    var source: js.UndefOr[
        (js.Array[js.Object | String]) | (js.Function2[
          /* query */ js.UndefOr[String], 
          /* process */ js.UndefOr[js.Function1[/* callback */ Any, String | (js.Array[js.Object | String])]], 
          Unit
        ])
      ] = js.undefined
    
    /**
      * The method used to return selected item
      */
    var updater: js.UndefOr[js.Function1[/* item */ String, String]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAddItem(value: js.Object): Self = StObject.set(x, "addItem", value.asInstanceOf[js.Any])
      
      inline def setAddItemUndefined: Self = StObject.set(x, "addItem", js.undefined)
      
      inline def setAfterSelect(value: js.ThisFunction1[/* this */ Typeahead, /* item */ String | js.Object, Unit]): Self = StObject.set(x, "afterSelect", value.asInstanceOf[js.Any])
      
      inline def setAfterSelectUndefined: Self = StObject.set(x, "afterSelect", js.undefined)
      
      inline def setAppendTo(value: JQuery): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
      
      inline def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
      
      inline def setAutoSelect(value: Boolean): Self = StObject.set(x, "autoSelect", value.asInstanceOf[js.Any])
      
      inline def setAutoSelectUndefined: Self = StObject.set(x, "autoSelect", js.undefined)
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setDisplayText(value: /* item */ String | Name => String): Self = StObject.set(x, "displayText", js.Any.fromFunction1(value))
      
      inline def setDisplayTextUndefined: Self = StObject.set(x, "displayText", js.undefined)
      
      inline def setFitToElement(value: Boolean): Self = StObject.set(x, "fitToElement", value.asInstanceOf[js.Any])
      
      inline def setFitToElementUndefined: Self = StObject.set(x, "fitToElement", js.undefined)
      
      inline def setHighlighter(value: /* item */ String => String): Self = StObject.set(x, "highlighter", js.Any.fromFunction1(value))
      
      inline def setHighlighterUndefined: Self = StObject.set(x, "highlighter", js.undefined)
      
      inline def setItems(value: Double | all): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setMatcher(value: /* item */ String => Boolean): Self = StObject.set(x, "matcher", js.Any.fromFunction1(value))
      
      inline def setMatcherUndefined: Self = StObject.set(x, "matcher", js.undefined)
      
      inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
      
      inline def setScrollHeight(value: Double | js.Function0[Double]): Self = StObject.set(x, "scrollHeight", value.asInstanceOf[js.Any])
      
      inline def setScrollHeightFunction0(value: () => Double): Self = StObject.set(x, "scrollHeight", js.Any.fromFunction0(value))
      
      inline def setScrollHeightUndefined: Self = StObject.set(x, "scrollHeight", js.undefined)
      
      inline def setShowHintOnFocus(value: Boolean | all): Self = StObject.set(x, "showHintOnFocus", value.asInstanceOf[js.Any])
      
      inline def setShowHintOnFocusUndefined: Self = StObject.set(x, "showHintOnFocus", js.undefined)
      
      inline def setSorter(value: /* items */ js.Array[String] => js.Array[String]): Self = StObject.set(x, "sorter", js.Any.fromFunction1(value))
      
      inline def setSorterUndefined: Self = StObject.set(x, "sorter", js.undefined)
      
      inline def setSource(
        value: (js.Array[js.Object | String]) | (js.Function2[
              /* query */ js.UndefOr[String], 
              /* process */ js.UndefOr[js.Function1[/* callback */ Any, String | (js.Array[js.Object | String])]], 
              Unit
            ])
      ): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceFunction2(
        value: (/* query */ js.UndefOr[String], /* process */ js.UndefOr[js.Function1[/* callback */ Any, String | (js.Array[js.Object | String])]]) => Unit
      ): Self = StObject.set(x, "source", js.Any.fromFunction2(value))
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setSourceVarargs(value: (js.Object | String)*): Self = StObject.set(x, "source", js.Array(value*))
      
      inline def setUpdater(value: /* item */ String => String): Self = StObject.set(x, "updater", js.Any.fromFunction1(value))
      
      inline def setUpdaterUndefined: Self = StObject.set(x, "updater", js.undefined)
    }
  }
  
  trait Typeahead extends StObject {
    
    @JSName("$element")
    var $element: JQuery
    
    var options: Options
  }
  object Typeahead {
    
    inline def apply($element: JQuery, options: Options): Typeahead = {
      val __obj = js.Dynamic.literal($element = $element.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[Typeahead]
    }
    
    extension [Self <: Typeahead](x: Self) {
      
      inline def set$element(value: JQuery): Self = StObject.set(x, "$element", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
}
