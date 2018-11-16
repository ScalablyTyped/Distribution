package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object csrfLib {
  type SecretCallback = js.Function2[/* err */ stdLib.Error | scala.Null, /* secret */ java.lang.String, scala.Unit]
}
