package typings.baseui.toastMod

import org.scalablytyped.runtime.Instantiable0
import typings.baseui.anon.ReadonlyToastProps
import typings.react.mod.Key
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IToaster extends js.Object {
  def clear(key: Key): Unit = js.native
  def getRef(): Ref[Instantiable0[ToasterContainer]] = js.native
  def info(children: ReactNode, props: ReadonlyToastProps): Key = js.native
  def negative(children: ReactNode, props: ReadonlyToastProps): Key = js.native
  def positive(children: ReactNode, props: ReadonlyToastProps): Key = js.native
  def show(children: ReactNode, props: ReadonlyToastProps): Key = js.native
  def update(key: Key, props: ReadonlyToastProps): Unit = js.native
  def warning(children: ReactNode, props: ReadonlyToastProps): Key = js.native
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
  @scala.inline
  implicit class IToasterOps[Self <: IToaster] (val x: Self) extends AnyVal {
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
    def setClear(value: Key => Unit): Self = this.set("clear", js.Any.fromFunction1(value))
    @scala.inline
    def setGetRef(value: () => Ref[Instantiable0[ToasterContainer]]): Self = this.set("getRef", js.Any.fromFunction0(value))
    @scala.inline
    def setInfo(value: (ReactNode, ReadonlyToastProps) => Key): Self = this.set("info", js.Any.fromFunction2(value))
    @scala.inline
    def setNegative(value: (ReactNode, ReadonlyToastProps) => Key): Self = this.set("negative", js.Any.fromFunction2(value))
    @scala.inline
    def setPositive(value: (ReactNode, ReadonlyToastProps) => Key): Self = this.set("positive", js.Any.fromFunction2(value))
    @scala.inline
    def setShow(value: (ReactNode, ReadonlyToastProps) => Key): Self = this.set("show", js.Any.fromFunction2(value))
    @scala.inline
    def setUpdate(value: (Key, ReadonlyToastProps) => Unit): Self = this.set("update", js.Any.fromFunction2(value))
    @scala.inline
    def setWarning(value: (ReactNode, ReadonlyToastProps) => Key): Self = this.set("warning", js.Any.fromFunction2(value))
  }
  
}

