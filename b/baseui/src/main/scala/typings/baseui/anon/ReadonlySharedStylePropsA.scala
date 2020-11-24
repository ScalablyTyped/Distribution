package typings.baseui.anon

import typings.baseui.baseuiStrings.`inline`
import typings.baseui.baseuiStrings.info
import typings.baseui.baseuiStrings.negative
import typings.baseui.baseuiStrings.positive
import typings.baseui.baseuiStrings.toast
import typings.baseui.baseuiStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<baseui.baseui/toast.SharedStylePropsArg> */
@js.native
trait ReadonlySharedStylePropsA extends js.Object {
  
  @JSName("$closeable")
  val $closeable: js.UndefOr[Boolean] = js.native
  
  @JSName("$isRendered")
  val $isRendered: js.UndefOr[Boolean] = js.native
  
  @JSName("$isVisible")
  val $isVisible: js.UndefOr[Boolean] = js.native
  
  @JSName("$kind")
  val $kind: js.UndefOr[info | positive | warning | negative] = js.native
  
  @JSName("$type")
  val $type: js.UndefOr[`inline` | toast] = js.native
}
object ReadonlySharedStylePropsA {
  
  @scala.inline
  def apply(): ReadonlySharedStylePropsA = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlySharedStylePropsA]
  }
  
  @scala.inline
  implicit class ReadonlySharedStylePropsAOps[Self <: ReadonlySharedStylePropsA] (val x: Self) extends AnyVal {
    
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
    def set$closeable(value: Boolean): Self = this.set("$closeable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$closeable: Self = this.set("$closeable", js.undefined)
    
    @scala.inline
    def set$isRendered(value: Boolean): Self = this.set("$isRendered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$isRendered: Self = this.set("$isRendered", js.undefined)
    
    @scala.inline
    def set$isVisible(value: Boolean): Self = this.set("$isVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$isVisible: Self = this.set("$isVisible", js.undefined)
    
    @scala.inline
    def set$kind(value: info | positive | warning | negative): Self = this.set("$kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$kind: Self = this.set("$kind", js.undefined)
    
    @scala.inline
    def set$type(value: `inline` | toast): Self = this.set("$type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$type: Self = this.set("$type", js.undefined)
  }
}
