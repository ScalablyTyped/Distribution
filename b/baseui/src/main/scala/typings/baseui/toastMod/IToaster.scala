package typings.baseui.toastMod

import org.scalablytyped.runtime.Instantiable0
import typings.react.reactMod.Key
import typings.react.reactMod.ReactNode
import typings.react.reactMod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToaster extends js.Object {
  def clear(key: Key): Unit
  def getRef(): Ref[Instantiable0[ToasterContainer]]
  def info(children: ReactNode, props: ToastProps): Key
  def negative(children: ReactNode, props: ToastProps): Key
  def positive(children: ReactNode, props: ToastProps): Key
  def show(children: ReactNode, props: ToastProps): Key
  def update(key: Key, props: ToastProps): Unit
  def warning(children: ReactNode, props: ToastProps): Key
}

object IToaster {
  @scala.inline
  def apply(
    clear: Key => Unit,
    getRef: () => Ref[Instantiable0[ToasterContainer]],
    info: (ReactNode, ToastProps) => Key,
    negative: (ReactNode, ToastProps) => Key,
    positive: (ReactNode, ToastProps) => Key,
    show: (ReactNode, ToastProps) => Key,
    update: (Key, ToastProps) => Unit,
    warning: (ReactNode, ToastProps) => Key
  ): IToaster = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction1(clear), getRef = js.Any.fromFunction0(getRef), info = js.Any.fromFunction2(info), negative = js.Any.fromFunction2(negative), positive = js.Any.fromFunction2(positive), show = js.Any.fromFunction2(show), update = js.Any.fromFunction2(update), warning = js.Any.fromFunction2(warning))
  
    __obj.asInstanceOf[IToaster]
  }
}

