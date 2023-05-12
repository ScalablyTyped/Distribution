package typings.ckeditorCkeditor5Highlight

import typings.std.Plugin
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcHighlightuiMod {
  
  @JSImport("@ckeditor/ckeditor5-highlight/src/highlightui", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with HighlightUI
  
  @js.native
  trait HighlightUI
    extends StObject
       with Plugin {
    
    /**
      * Internal method for creating highlight buttons.
      *
      * @param name The name of the button.
      * @param label The label for the button.
      * @param icon The button icon.
      * @param value The `value` property passed to the executed command.
      * @param decorateButton A callback getting ButtonView instance so that it can be further customized.
      */
    /* private */ var _addButton: Any = js.native
    
    /**
      * Creates the split button dropdown UI from the provided highlight options.
      */
    /* private */ var _addDropdown: Any = js.native
    
    /**
      * Creates a toolbar button from the provided highlight option.
      */
    /* private */ var _addHighlighterButton: Any = js.native
    
    /**
      * Creates the "Remove highlight" button.
      */
    /* private */ var _addRemoveHighlightButton: Any = js.native
    
    /**
      * @inheritDoc
      */
    def init(): Unit = js.native
    
    /**
      * Returns the localized option titles provided by the plugin.
      *
      * The following localized titles corresponding with default
      * {@link module:highlight/highlightconfig~HighlightConfig#options} are available:
      *
      * * `'Yellow marker'`,
      * * `'Green marker'`,
      * * `'Pink marker'`,
      * * `'Blue marker'`,
      * * `'Red pen'`,
      * * `'Green pen'`.
      */
    def localizedOptionTitles: Record[String, String] = js.native
  }
}
