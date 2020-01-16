package typings.cassandraDashDriver

import typings.cassandraDashDriver.cassandraDashDriverMod.Host
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Filter extends js.Object {
  var filter: js.UndefOr[js.Function1[/* host */ Host, Boolean]] = js.undefined
  var localDc: js.UndefOr[String] = js.undefined
}

object Anon_Filter {
  @scala.inline
  def apply(filter: /* host */ Host => Boolean = null, localDc: String = null): Anon_Filter = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (localDc != null) __obj.updateDynamic("localDc")(localDc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Filter]
  }
}

