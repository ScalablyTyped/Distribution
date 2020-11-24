package typings.baseui.toastMod

import typings.baseui.anon.Placement
import typings.baseui.anon.ReadonlyToastPropskeyKey
import typings.baseui.anon.ReadonlyToasterProps
import typings.baseui.anon.ToastPropskeyKey
import typings.react.mod.Component
import typings.react.mod.Key
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baseui/toast", "ToasterContainer")
@js.native
class ToasterContainer ()
  extends Component[ReadonlyToasterProps, ToasterContainerState, js.Any] {
  
  def clear(key: Key): Unit = js.native
  
  def clearAll(): Unit = js.native
  
  def dismiss(key: Key): Unit = js.native
  
  def getOnCloseHandler(key: Key): js.Function0[_] = js.native
  def getOnCloseHandler(key: Key, onClose: js.Function0[_]): js.Function0[_] = js.native
  
  def getSharedProps(): Placement = js.native
  
  def getToastProps(props: ToastProps): ReadonlyToastPropskeyKey = js.native
  
  def internalOnClose(key: Key): Unit = js.native
  
  def renderToast(toastProps: ToastPropskeyKey): ReactNode = js.native
  
  def show(props: ToastProps): Key = js.native
  
  def update(key: Key, props: ToastProps): Unit = js.native
}
