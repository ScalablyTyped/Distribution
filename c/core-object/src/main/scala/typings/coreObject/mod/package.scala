package typings.coreObject

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /** The type of options allowed to be passed to `Base.extend()` */
  type ExtendOptions[Base] = typings.coreObject.coreObjectStrings.ExtendOptions with org.scalablytyped.runtime.TopLevel[Base] with (typings.std.Record[java.lang.String, _])
  /** The `this` type for any methods on the options passed to `Base.extend()` */
  type ExtendThisType[Base, Ext] = typings.std.ThisType[
    (typings.coreObject.utilsMod.Mix[Base, Ext]) with typings.coreObject.anon.Super[Base]
  ]
}
