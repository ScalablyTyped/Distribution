package typings
package coreDashObjectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object coreDashObjectMod {
  /** The type of options allowed to be passed to `Base.extend()` */
  type ExtendOptions[Base] = coreDashObjectLib.coreDashObjectLibStrings.ExtendOptions with Base with (stdLib.Record[java.lang.String, _])
  /** The `this` type for any methods on the options passed to `Base.extend()` */
  type ExtendThisType[Base, Ext] = stdLib.ThisType[
    (coreDashObjectLib.dashPrivateUtilsMod.Mix[Base, Ext]) with coreDashObjectLib.Anon_Super[Base]
  ]
}
