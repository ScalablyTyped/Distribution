package typings.chrome.chrome

import typings.chrome.chrome.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Omnibox
////////////////////
/**
  * The omnibox API allows you to register a keyword with Google Chrome's address bar, which is also known as the omnibox.
  * Manifest:  "omnibox": {...}
  * @since Chrome 9.
  */
object omnibox {
  
  type OmniboxInputCancelledEvent = Event[js.Function0[Unit]]
  
  type OmniboxInputChangedEvent = Event[
    js.Function2[
      /* text */ String, 
      /* suggest */ js.Function1[/* suggestResults */ js.Array[SuggestResult], Unit], 
      Unit
    ]
  ]
  
  type OmniboxInputEnteredEvent = Event[
    js.Function2[/* text */ String, /* disposition */ OnInputEnteredDisposition, Unit]
  ]
  
  type OmniboxInputStartedEvent = Event[js.Function0[Unit]]
  
  type OmniboxSuggestionDeletedEvent = Event[js.Function1[/* text */ String, Unit]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.chrome.chromeStrings.currentTab
    - typings.chrome.chromeStrings.newForegroundTab
    - typings.chrome.chromeStrings.newBackgroundTab
  */
  trait OnInputEnteredDisposition extends StObject
  object OnInputEnteredDisposition {
    
    @scala.inline
    def currentTab: typings.chrome.chromeStrings.currentTab = "currentTab".asInstanceOf[typings.chrome.chromeStrings.currentTab]
    
    @scala.inline
    def newBackgroundTab: typings.chrome.chromeStrings.newBackgroundTab = "newBackgroundTab".asInstanceOf[typings.chrome.chromeStrings.newBackgroundTab]
    
    @scala.inline
    def newForegroundTab: typings.chrome.chromeStrings.newForegroundTab = "newForegroundTab".asInstanceOf[typings.chrome.chromeStrings.newForegroundTab]
  }
  
  trait SuggestResult extends StObject {
    
    /** The text that is put into the URL bar, and that is sent to the extension when the user chooses this entry. */
    var content: String
    
    /**
      * Whether the suggest result can be deleted by the user.
      * @since Chrome 63.
      */
    var deletable: js.UndefOr[Boolean] = js.undefined
    
    /** The text that is displayed in the URL dropdown. Can contain XML-style markup for styling. The supported tags are 'url' (for a literal URL), 'match' (for highlighting text that matched what the user's query), and 'dim' (for dim helper text). The styles can be nested, eg. dimmed match. You must escape the five predefined entities to display them as text: stackoverflow.com/a/1091953/89484 */
    var description: String
  }
  object SuggestResult {
    
    @scala.inline
    def apply(content: String, description: String): SuggestResult = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
      __obj.asInstanceOf[SuggestResult]
    }
    
    @scala.inline
    implicit class SuggestResultMutableBuilder[Self <: SuggestResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeletable(value: Boolean): Self = StObject.set(x, "deletable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeletableUndefined: Self = StObject.set(x, "deletable", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    }
  }
  
  trait Suggestion extends StObject {
    
    /** The text that is displayed in the URL dropdown. Can contain XML-style markup for styling. The supported tags are 'url' (for a literal URL), 'match' (for highlighting text that matched what the user's query), and 'dim' (for dim helper text). The styles can be nested, eg. dimmed match. */
    var description: String
  }
  object Suggestion {
    
    @scala.inline
    def apply(description: String): Suggestion = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
      __obj.asInstanceOf[Suggestion]
    }
    
    @scala.inline
    implicit class SuggestionMutableBuilder[Self <: Suggestion] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    }
  }
}
