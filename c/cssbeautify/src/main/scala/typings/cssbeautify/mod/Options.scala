package typings.cssbeautify.mod

import typings.cssbeautify.cssbeautifyStrings.`end-of-line`
import typings.cssbeautify.cssbeautifyStrings.`separate-line`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * Always inserts a semicolon after the last ruleset(default is false)
    */
  var autosemicolon: js.UndefOr[Boolean] = js.native
  
  /**
    * A string used for the indentation of the declaration (default is 4
    * spaces).
    */
  var indent: js.UndefOr[String] = js.native
  
  /**
    * Defines the placement of open curly brace, either end-of-line (default)
    * or separate-line
    */
  var openbrace: js.UndefOr[`end-of-line` | `separate-line`] = js.native
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
    def setAutosemicolon(value: Boolean): Self = this.set("autosemicolon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutosemicolon: Self = this.set("autosemicolon", js.undefined)
    
    @scala.inline
    def setIndent(value: String): Self = this.set("indent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndent: Self = this.set("indent", js.undefined)
    
    @scala.inline
    def setOpenbrace(value: `end-of-line` | `separate-line`): Self = this.set("openbrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenbrace: Self = this.set("openbrace", js.undefined)
  }
}
