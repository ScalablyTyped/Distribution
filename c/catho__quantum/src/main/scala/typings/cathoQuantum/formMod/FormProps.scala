package typings.cathoQuantum.formMod

import org.scalablytyped.runtime.StringDictionary
import typings.cathoQuantum.AnonValid
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormProps extends js.Object {
  var children: js.Array[ReactNode] | ReactNode
  var noValidate: js.UndefOr[Boolean] = js.undefined
  var onSubmit: js.UndefOr[js.Function1[/* hasValid */ js.UndefOr[AnonValid], Unit]] = js.undefined
  var onValidSubmit: js.UndefOr[
    js.Function1[/* values */ js.UndefOr[StringDictionary[js.UndefOr[String]]], Unit]
  ] = js.undefined
}

object FormProps {
  @scala.inline
  def apply(
    children: js.Array[ReactNode] | ReactNode = null,
    noValidate: js.UndefOr[Boolean] = js.undefined,
    onSubmit: /* hasValid */ js.UndefOr[AnonValid] => Unit = null,
    onValidSubmit: /* values */ js.UndefOr[StringDictionary[js.UndefOr[String]]] => Unit = null
  ): FormProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(noValidate)) __obj.updateDynamic("noValidate")(noValidate.asInstanceOf[js.Any])
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1(onSubmit))
    if (onValidSubmit != null) __obj.updateDynamic("onValidSubmit")(js.Any.fromFunction1(onValidSubmit))
    __obj.asInstanceOf[FormProps]
  }
}

