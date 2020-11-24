package typings.cliColor.eraseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Erase extends js.Object {
  
  /**
    * Current line
    */
  val line: String = js.native
  
  /**
    * Right portion of current line
    */
  val lineLeft: String = js.native
  
  /**
    * Left portion of current line
    */
  val lineRight: String = js.native
  
  /**
    * Entire screen
    */
  val screen: String = js.native
  
  /**
    * Left portion of a screen
    */
  val screenLeft: String = js.native
  
  /**
    * Right portion of a screen
    */
  val screenRight: String = js.native
}
object Erase {
  
  @scala.inline
  def apply(
    line: String,
    lineLeft: String,
    lineRight: String,
    screen: String,
    screenLeft: String,
    screenRight: String
  ): Erase = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any], lineLeft = lineLeft.asInstanceOf[js.Any], lineRight = lineRight.asInstanceOf[js.Any], screen = screen.asInstanceOf[js.Any], screenLeft = screenLeft.asInstanceOf[js.Any], screenRight = screenRight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Erase]
  }
  
  @scala.inline
  implicit class EraseOps[Self <: Erase] (val x: Self) extends AnyVal {
    
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
    def setLine(value: String): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineLeft(value: String): Self = this.set("lineLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineRight(value: String): Self = this.set("lineRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreen(value: String): Self = this.set("screen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenLeft(value: String): Self = this.set("screenLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenRight(value: String): Self = this.set("screenRight", value.asInstanceOf[js.Any])
  }
}
