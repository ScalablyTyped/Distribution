package typings.cassandraDriver.anon

import typings.cassandraDriver.mod.Host
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter extends js.Object {
  var filter: js.UndefOr[js.Function1[/* host */ Host, Boolean]] = js.undefined
  var localDc: js.UndefOr[String] = js.undefined
}

object Filter {
  @scala.inline
  def apply(filter: /* host */ Host => Boolean = null, localDc: String = null): Filter = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (localDc != null) __obj.updateDynamic("localDc")(localDc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
}

