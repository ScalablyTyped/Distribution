package typings.counterpart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object counterpartMod {
  type LocaleChangeHandler = js.Function2[/* newLocale */ String, /* oldLocale */ String, Unit]
  type NotFoundHandler = js.Function4[/* locale */ String, /* key */ String, /* fallback */ String, /* scope */ String, Unit]
}
