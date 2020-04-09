package typings.copyTextToClipboard.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("copy-text-to-clipboard", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function copyTextToClipboard(text: string): boolean;
  // export = copyTextToClipboard;
  var default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof copyTextToClipboard */ js.Any = js.native
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
  def apply(text: String, options: Options): Boolean = js.native
}

