package typings
package baseuiLib.toastMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait toaster extends js.Object {
  def clear(key: reactLib.reactMod.Key): scala.Unit
  def getRef(): reactLib.reactMod.Ref[org.scalablytyped.runtime.Instantiable0[ToasterContainer]]
  def info(children: reactLib.reactMod.ReactNode, props: ToastProps): reactLib.reactMod.Key
  def negative(children: reactLib.reactMod.ReactNode, props: ToastProps): reactLib.reactMod.Key
  def positive(children: reactLib.reactMod.ReactNode, props: ToastProps): reactLib.reactMod.Key
  def show(children: reactLib.reactMod.ReactNode, props: ToastProps): reactLib.reactMod.Key
  def update(key: reactLib.reactMod.Key, props: ToastProps): scala.Unit
  def warning(children: reactLib.reactMod.ReactNode, props: ToastProps): reactLib.reactMod.Key
}

object toaster {
  @scala.inline
  def apply(
    clear: reactLib.reactMod.Key => scala.Unit,
    getRef: () => reactLib.reactMod.Ref[org.scalablytyped.runtime.Instantiable0[ToasterContainer]],
    info: (reactLib.reactMod.ReactNode, ToastProps) => reactLib.reactMod.Key,
    negative: (reactLib.reactMod.ReactNode, ToastProps) => reactLib.reactMod.Key,
    positive: (reactLib.reactMod.ReactNode, ToastProps) => reactLib.reactMod.Key,
    show: (reactLib.reactMod.ReactNode, ToastProps) => reactLib.reactMod.Key,
    update: (reactLib.reactMod.Key, ToastProps) => scala.Unit,
    warning: (reactLib.reactMod.ReactNode, ToastProps) => reactLib.reactMod.Key
  ): toaster = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction1(clear), getRef = js.Any.fromFunction0(getRef), info = js.Any.fromFunction2(info), negative = js.Any.fromFunction2(negative), positive = js.Any.fromFunction2(positive), show = js.Any.fromFunction2(show), update = js.Any.fromFunction2(update), warning = js.Any.fromFunction2(warning))
  
    __obj.asInstanceOf[toaster]
  }
}

