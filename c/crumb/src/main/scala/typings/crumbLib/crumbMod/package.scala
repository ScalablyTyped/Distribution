package typings
package crumbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object crumbMod {
  type SkipFunction = js.Function2[
    /* request */ js.UndefOr[hapiLib.hapiMod.Request], 
    /* h */ js.UndefOr[hapiLib.hapiMod.ResponseToolkit], 
    scala.Boolean
  ]
}
