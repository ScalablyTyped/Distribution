package typings.copyTextToClipboard.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
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
  var target: js.UndefOr[HTMLElement] = js.undefined
}

object Options {
  @scala.inline
  def apply(target: HTMLElement = null): Options = {
    val __obj = js.Dynamic.literal()
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

