package typings.chessJs.anon

import typings.chessJs.chessJsBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Verbose extends js.Object {
  
  /**
    * The string to test if it is a valid move, if it is not then an
    * empty array is returned
    */
  var square: js.UndefOr[String] = js.native
  
  /** Set to true to return verbose move objects instead of strings */
  var verbose: js.UndefOr[`false`] = js.native
}
object Verbose {
  
  @scala.inline
  def apply(): Verbose = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Verbose]
  }
  
  @scala.inline
  implicit class VerboseOps[Self <: Verbose] (val x: Self) extends AnyVal {
    
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
    def setSquare(value: String): Self = this.set("square", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSquare: Self = this.set("square", js.undefined)
    
    @scala.inline
    def setVerbose(value: `false`): Self = this.set("verbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
  }
}
