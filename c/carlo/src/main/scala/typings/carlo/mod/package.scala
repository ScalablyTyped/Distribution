package typings.carlo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Channel = java.lang.String
  type EvaluateFunction = js.Function2[
    /* pageFunction */ (js.Function1[/* repeated */ js.Any, js.Any]) | java.lang.String, 
    /* repeated */ typings.puppeteer.mod.Serializable, 
    js.Promise[typings.puppeteer.mod.Serializable]
  ]
  type WindowEvent = typings.carlo.carloStrings.close
}
