package typings.babelPluginReactHtmlAttrs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `1` extends js.Object {
  var defaultProps: /* import warning: importer.ImportType#apply Failed type conversion: infer D */ js.Any = js.native
}

object `1` {
  @scala.inline
  def apply(
    defaultProps: /* import warning: importer.ImportType#apply Failed type conversion: infer D */ js.Any
  ): `1` = {
    val __obj = js.Dynamic.literal(defaultProps = defaultProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
  @scala.inline
  implicit class `1Ops`[Self <: `1`] (val x: Self) extends AnyVal {
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
    def setDefaultProps(value: /* import warning: importer.ImportType#apply Failed type conversion: infer D */ js.Any): Self = this.set("defaultProps", value.asInstanceOf[js.Any])
  }
  
}

