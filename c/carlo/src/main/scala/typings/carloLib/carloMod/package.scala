package typings
package carloLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object carloMod {
  type Channel = java.lang.String
  type EvaluateFunction = js.Function2[
    /* pageFunction */ (js.Function1[/* repeated */ js.Any, js.Any]) | java.lang.String, 
    /* repeated */ puppeteerLib.puppeteerMod.Serializable, 
    js.Promise[puppeteerLib.puppeteerMod.Serializable]
  ]
  type WindowEvent = carloLib.carloLibStrings.close
}
