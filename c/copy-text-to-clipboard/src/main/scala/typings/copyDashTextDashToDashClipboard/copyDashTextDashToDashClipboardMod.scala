package typings.copyDashTextDashToDashClipboard

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("copy-text-to-clipboard", JSImport.Namespace)
@js.native
object copyDashTextDashToDashClipboardMod extends js.Object {
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function copyTextToClipboard(text: string): boolean;
  // export = copyTextToClipboard;
  @JSName("default")
  var default_Original: Anon_Default = js.native
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
  def apply(text: String): Boolean = js.native
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
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function copyTextToClipboard(text: string): boolean;
  // export = copyTextToClipboard;
  def default(text: String): Boolean = js.native
}

