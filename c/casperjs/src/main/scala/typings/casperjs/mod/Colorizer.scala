package typings.casperjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Colorizer extends js.Object {
  
  def colorize(text: String, styleName: String): Unit = js.native
  
  def format(text: String, style: js.Any): Unit = js.native
}
object Colorizer {
  
  @scala.inline
  def apply(colorize: (String, String) => Unit, format: (String, js.Any) => Unit): Colorizer = {
    val __obj = js.Dynamic.literal(colorize = js.Any.fromFunction2(colorize), format = js.Any.fromFunction2(format))
    __obj.asInstanceOf[Colorizer]
  }
  
  @scala.inline
  implicit class ColorizerOps[Self <: Colorizer] (val x: Self) extends AnyVal {
    
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
    def setColorize(value: (String, String) => Unit): Self = this.set("colorize", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFormat(value: (String, js.Any) => Unit): Self = this.set("format", js.Any.fromFunction2(value))
  }
}
