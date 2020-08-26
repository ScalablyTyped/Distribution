package typings.cathoQuantum.formMod

import org.scalablytyped.runtime.StringDictionary
import typings.cathoQuantum.anon.Valid
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormProps extends js.Object {
  var children: js.Array[ReactNode] | ReactNode = js.native
  var noValidate: js.UndefOr[Boolean] = js.native
  var onSubmit: js.UndefOr[js.Function1[/* hasValid */ js.UndefOr[Valid], Unit]] = js.native
  var onValidSubmit: js.UndefOr[
    js.Function1[/* values */ js.UndefOr[StringDictionary[js.UndefOr[String]]], Unit]
  ] = js.native
}

object FormProps {
  @scala.inline
  def apply(): FormProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormProps]
  }
  @scala.inline
  implicit class FormPropsOps[Self <: FormProps] (val x: Self) extends AnyVal {
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
    def setChildrenVarargs(value: ReactNode*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[ReactNode] | ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setNoValidate(value: Boolean): Self = this.set("noValidate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoValidate: Self = this.set("noValidate", js.undefined)
    @scala.inline
    def setOnSubmit(value: /* hasValid */ js.UndefOr[Valid] => Unit): Self = this.set("onSubmit", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSubmit: Self = this.set("onSubmit", js.undefined)
    @scala.inline
    def setOnValidSubmit(value: /* values */ js.UndefOr[StringDictionary[js.UndefOr[String]]] => Unit): Self = this.set("onValidSubmit", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnValidSubmit: Self = this.set("onValidSubmit", js.undefined)
  }
  
}

