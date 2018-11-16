package typings
package coreDashObjectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object coreDashObjectMod {
  type ExtendOptions[Base] = coreDashObjectLib.coreDashObjectLibStrings.ExtendOptions with Base with (stdLib.Record[java.lang.String, _])
  type ExtendThisType[Base, Ext] = stdLib.ThisType[
    (coreDashObjectLib.dashPrivateUtilsMod.Mix[Base, Ext]) with coreDashObjectLib.Anon_Super[Base]
  ]
}
