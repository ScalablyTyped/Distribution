package typings.ckeditor.CKEDITOR

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait pluginDefinition extends js.Object {
  var afterInit: js.UndefOr[js.Function1[/* editor */ editor, _]] = js.native
  var beforeInit: js.UndefOr[js.Function1[/* editor */ editor, _]] = js.native
  var hidpi: js.UndefOr[Boolean] = js.native
  var init: js.UndefOr[js.Function1[/* editor */ editor, Unit]] = js.native
  var lang: js.UndefOr[String | js.Array[String]] = js.native
  var onLoad: js.UndefOr[js.Function0[_]] = js.native
  var requires: js.UndefOr[String | js.Array[String]] = js.native
}

object pluginDefinition {
  @scala.inline
  def apply(): pluginDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[pluginDefinition]
  }
  @scala.inline
  implicit class pluginDefinitionOps[Self <: pluginDefinition] (val x: Self) extends AnyVal {
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
    def setAfterInit(value: /* editor */ editor => _): Self = this.set("afterInit", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAfterInit: Self = this.set("afterInit", js.undefined)
    @scala.inline
    def setBeforeInit(value: /* editor */ editor => _): Self = this.set("beforeInit", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeInit: Self = this.set("beforeInit", js.undefined)
    @scala.inline
    def setHidpi(value: Boolean): Self = this.set("hidpi", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidpi: Self = this.set("hidpi", js.undefined)
    @scala.inline
    def setInit(value: /* editor */ editor => Unit): Self = this.set("init", js.Any.fromFunction1(value))
    @scala.inline
    def deleteInit: Self = this.set("init", js.undefined)
    @scala.inline
    def setLangVarargs(value: String*): Self = this.set("lang", js.Array(value :_*))
    @scala.inline
    def setLang(value: String | js.Array[String]): Self = this.set("lang", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    @scala.inline
    def setOnLoad(value: () => _): Self = this.set("onLoad", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnLoad: Self = this.set("onLoad", js.undefined)
    @scala.inline
    def setRequiresVarargs(value: String*): Self = this.set("requires", js.Array(value :_*))
    @scala.inline
    def setRequires(value: String | js.Array[String]): Self = this.set("requires", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequires: Self = this.set("requires", js.undefined)
  }
  
}

