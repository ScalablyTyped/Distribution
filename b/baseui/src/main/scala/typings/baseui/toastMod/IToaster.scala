package typings.baseui.toastMod

import org.scalablytyped.runtime.Instantiable0
import typings.baseui.ReadonlyToastProps
import typings.react.mod.Key
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToaster extends js.Object {
  def clear(key: Key): Unit
  def getRef(): Ref[Instantiable0[ToasterContainer]]
  def info(children: ReactNode, props: ReadonlyToastProps): Key
  def negative(children: ReactNode, props: ReadonlyToastProps): Key
  def positive(children: ReactNode, props: ReadonlyToastProps): Key
  def show(children: ReactNode, props: ReadonlyToastProps): Key
  def update(key: Key, props: ReadonlyToastProps): Unit
  def warning(children: ReactNode, props: ReadonlyToastProps): Key
}

object IToaster {
  @scala.inline
  def apply(
    clear: Key => Unit,
    getRef: () => Ref[Instantiable0[ToasterContainer]],
    info: (ReactNode, ReadonlyToastProps) => Key,
    negative: (ReactNode, ReadonlyToastProps) => Key,
    positive: (ReactNode, ReadonlyToastProps) => Key,
    show: (ReactNode, ReadonlyToastProps) => Key,
    update: (Key, ReadonlyToastProps) => Unit,
    warning: (ReactNode, ReadonlyToastProps) => Key
  ): IToaster = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction1(clear), getRef = js.Any.fromFunction0(getRef), info = js.Any.fromFunction2(info), negative = js.Any.fromFunction2(negative), positive = js.Any.fromFunction2(positive), show = js.Any.fromFunction2(show), update = js.Any.fromFunction2(update), warning = js.Any.fromFunction2(warning))
    __obj.asInstanceOf[IToaster]
  }
}

