package typings.createEmotion.mod

import typings.createEmotion.createEmotionNumbers.`1`
import typings.createEmotion.createEmotionNumbers.`2`
import typings.createEmotion.createEmotionNumbers.`3`
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmotionOptions extends js.Object {
  var container: js.UndefOr[HTMLElement] = js.native
  var key: js.UndefOr[String] = js.native
  var nonce: js.UndefOr[String] = js.native
  var prefix: js.UndefOr[
    Boolean | (js.Function3[/* key */ String, /* value */ String, /* context */ `1` | `2` | `3`, Boolean])
  ] = js.native
  var stylisPlugins: js.UndefOr[StylisPlugins] = js.native
}

object EmotionOptions {
  @scala.inline
  def apply(): EmotionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmotionOptions]
  }
  @scala.inline
  implicit class EmotionOptionsOps[Self <: EmotionOptions] (val x: Self) extends AnyVal {
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
    def setContainer(value: HTMLElement): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setNonce(value: String): Self = this.set("nonce", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonce: Self = this.set("nonce", js.undefined)
    @scala.inline
    def setPrefixFunction3(value: (/* key */ String, /* value */ String, /* context */ `1` | `2` | `3`) => Boolean): Self = this.set("prefix", js.Any.fromFunction3(value))
    @scala.inline
    def setPrefix(
      value: Boolean | (js.Function3[/* key */ String, /* value */ String, /* context */ `1` | `2` | `3`, Boolean])
    ): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    @scala.inline
    def setStylisPluginsVarargs(value: (js.Function1[/* repeated */ js.Any, js.Any])*): Self = this.set("stylisPlugins", js.Array(value :_*))
    @scala.inline
    def setStylisPluginsFunction1(value: /* repeated */ js.Any => js.Any): Self = this.set("stylisPlugins", js.Any.fromFunction1(value))
    @scala.inline
    def setStylisPlugins(value: StylisPlugins): Self = this.set("stylisPlugins", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStylisPlugins: Self = this.set("stylisPlugins", js.undefined)
    @scala.inline
    def setStylisPluginsNull: Self = this.set("stylisPlugins", null)
  }
  
}

