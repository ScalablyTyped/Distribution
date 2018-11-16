package typings
package coreDashObjectLib.coreDashObjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("core-object", JSImport.Default)
@js.native
class default () extends CoreObject

@JSImport("core-object", JSImport.Default)
@js.native
object default extends js.Object {
  def extend[BaseClass /* <: coreDashObjectLib.dashPrivateUtilsMod.Constructor[_] */, Ext /* <: coreDashObjectLib.coreDashObjectMod.ExtendOptions[stdLib.InstanceType[BaseClass]] */](
    `this`: BaseClass,
    options: Ext with (coreDashObjectLib.coreDashObjectMod.ExtendThisType[stdLib.InstanceType[BaseClass], Ext])
  ): BaseClass with (coreDashObjectLib.dashPrivateUtilsMod.Constructor[coreDashObjectLib.dashPrivateUtilsMod.Mix[stdLib.InstanceType[BaseClass], Ext]]) = js.native
}

