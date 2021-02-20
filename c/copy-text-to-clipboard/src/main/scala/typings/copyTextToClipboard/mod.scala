package typings.copyTextToClipboard

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Copy text to the clipboard.
  	Must be called in response to a user gesture event, like `click` or `keyup`.
  	@param text - The text to copy to clipboard.
  	@returns Whether it succeeded to copy the text.
  	@example
  	```
  	import copy = require('copy-text-to-clipboard');
  	button.addEventListener('click', () => {
  		copy('🦄🌈');
  	});
  	```
  	*/
  @JSImport("copy-text-to-clipboard", JSImport.Namespace)
  @js.native
  def apply(text: String): Boolean = js.native
  @JSImport("copy-text-to-clipboard", JSImport.Namespace)
  @js.native
  def apply(text: String, options: Options): Boolean = js.native
  
  @JSImport("copy-text-to-clipboard", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function copyTextToClipboard(text: string): boolean;
  // export = copyTextToClipboard;
  @JSImport("copy-text-to-clipboard", "default")
  @js.native
  def default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof copyTextToClipboard */ js.Any = js.native
  @scala.inline
  def default_=(
    x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof copyTextToClipboard */ js.Any
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  @js.native
  trait Options extends StObject {
    
    /**
    		Specify a DOM element where the temporary, behind-the-scenes `textarea` should be appended, in cases where you need to stay within a focus trap, like in a modal.
    		@default document.body
    		@example
    		```
    		import copy = require('copy-text-to-clipboard');
    		const modalWithFocusTrap = document.getElementById('modal');
    		button.addEventListener('click', () => {
    			copy('🦄🌈', {
    				target: modalWithFocusTrap
    			});
    		});
    		```
    		*/
    var target: js.UndefOr[HTMLElement] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
}
