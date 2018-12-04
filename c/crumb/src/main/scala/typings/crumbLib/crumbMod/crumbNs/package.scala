package typings
package crumbLib.crumbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object crumbNs {
  type SkipFunction = js.Function2[
    /* request */ js.UndefOr[hapiLib.hapiMod.Request], 
    /* h */ js.UndefOr[hapiLib.hapiMod.ResponseToolkit], 
    scala.Boolean
  ]
}
