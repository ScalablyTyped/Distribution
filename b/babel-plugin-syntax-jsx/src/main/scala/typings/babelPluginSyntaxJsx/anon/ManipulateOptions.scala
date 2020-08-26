package typings.babelPluginSyntaxJsx.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManipulateOptions extends js.Object {
  def manipulateOptions(opts: js.Any, parserOpts: Plugins): Unit = js.native
}

object ManipulateOptions {
  @scala.inline
  def apply(manipulateOptions: (js.Any, Plugins) => Unit): ManipulateOptions = {
    val __obj = js.Dynamic.literal(manipulateOptions = js.Any.fromFunction2(manipulateOptions))
    __obj.asInstanceOf[ManipulateOptions]
  }
  @scala.inline
  implicit class ManipulateOptionsOps[Self <: ManipulateOptions] (val x: Self) extends AnyVal {
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
    def setManipulateOptions(value: (js.Any, Plugins) => Unit): Self = this.set("manipulateOptions", js.Any.fromFunction2(value))
  }
  
}

