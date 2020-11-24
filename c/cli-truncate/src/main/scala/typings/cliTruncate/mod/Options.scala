package typings.cliTruncate.mod

import typings.cliTruncate.cliTruncateStrings.end
import typings.cliTruncate.cliTruncateStrings.middle
import typings.cliTruncate.cliTruncateStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
  		Position to truncate the string.
  		@default 'end'
  		*/
  val position: js.UndefOr[start | middle | end] = js.native
  
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
  val preferTruncationOnSpace: js.UndefOr[Boolean] = js.native
  
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
  val space: js.UndefOr[Boolean] = js.native
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
    def setPosition(value: start | middle | end): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setPreferTruncationOnSpace(value: Boolean): Self = this.set("preferTruncationOnSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferTruncationOnSpace: Self = this.set("preferTruncationOnSpace", js.undefined)
    
    @scala.inline
    def setSpace(value: Boolean): Self = this.set("space", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpace: Self = this.set("space", js.undefined)
  }
}
