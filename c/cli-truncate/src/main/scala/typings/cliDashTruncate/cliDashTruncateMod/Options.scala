package typings.cliDashTruncate.cliDashTruncateMod

import typings.cliDashTruncate.cliDashTruncateStrings.end
import typings.cliDashTruncate.cliDashTruncateStrings.middle
import typings.cliDashTruncate.cliDashTruncateStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Position to truncate the string.
  		@default 'end'
  		*/
  val position: js.UndefOr[start | middle | end] = js.undefined
  /**
  		Truncate the string from a whitespace if it is within 3 characters from the actual breaking point.
  		@default false
  		@example
  		```
  		cliTruncate('unicorns rainbow dragons', 20, {position: 'start', preferTruncationOnSpace: true});
  		//=> '…rainbow dragons'
  		cliTruncate('unicorns rainbow dragons', 20, {position: 'middle', preferTruncationOnSpace: true});
  		//=> 'unicorns…dragons'
  		cliTruncate('unicorns rainbow dragons', 6, {position: 'end', preferTruncationOnSpace: true});
  		//=> 'unico…'
  		````
  		*/
  val preferTruncationOnSpace: js.UndefOr[Boolean] = js.undefined
  /**
  		Add a space between the text and the ellipsis.
  		@default false
  		@example
  		```
  		cliTruncate('unicorns', 5, {position: 'end', space: true});
  		//=> 'uni …'
  		cliTruncate('unicorns', 5, {position: 'end', space: false});
  		//=> 'unic…'
  		cliTruncate('unicorns', 6, {position: 'start', space: true});
  		//=> '… orns'
  		cliTruncate('unicorns', 7, {position: 'middle', space: true});
  		//=> 'uni … s'
  		```
  		*/
  val space: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    position: start | middle | end = null,
    preferTruncationOnSpace: js.UndefOr[Boolean] = js.undefined,
    space: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(preferTruncationOnSpace)) __obj.updateDynamic("preferTruncationOnSpace")(preferTruncationOnSpace.asInstanceOf[js.Any])
    if (!js.isUndefined(space)) __obj.updateDynamic("space")(space.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

