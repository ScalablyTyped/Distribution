package typings.baseui.anon

import typings.baseui.baseuiStrings.`inline`
import typings.baseui.baseuiStrings.info
import typings.baseui.baseuiStrings.negative
import typings.baseui.baseuiStrings.positive
import typings.baseui.baseuiStrings.toast
import typings.baseui.baseuiStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<baseui.baseui/toast.SharedStylePropsArg> */
@js.native
trait ReadonlySharedStylePropsA extends StObject {
  
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
  implicit class ReadonlySharedStylePropsAMutableBuilder[Self <: ReadonlySharedStylePropsA] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$closeable(value: Boolean): Self = StObject.set(x, "$closeable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$closeableUndefined: Self = StObject.set(x, "$closeable", js.undefined)
    
    @scala.inline
    def set$isRendered(value: Boolean): Self = StObject.set(x, "$isRendered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$isRenderedUndefined: Self = StObject.set(x, "$isRendered", js.undefined)
    
    @scala.inline
    def set$isVisible(value: Boolean): Self = StObject.set(x, "$isVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$isVisibleUndefined: Self = StObject.set(x, "$isVisible", js.undefined)
    
    @scala.inline
    def set$kind(value: info | positive | warning | negative): Self = StObject.set(x, "$kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$kindUndefined: Self = StObject.set(x, "$kind", js.undefined)
    
    @scala.inline
    def set$type(value: `inline` | toast): Self = StObject.set(x, "$type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$typeUndefined: Self = StObject.set(x, "$type", js.undefined)
  }
}
