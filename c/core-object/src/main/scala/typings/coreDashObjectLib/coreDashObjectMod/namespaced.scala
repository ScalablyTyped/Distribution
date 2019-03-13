package typings
package coreDashObjectLib.coreDashObjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("core-object", JSImport.Namespace)
@js.native
class namespaced () extends CoreObject

/* static members */
@JSImport("core-object", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  def extend[BaseClass /* <: coreDashObjectLib.dashPrivateUtilsMod.Constructor[_] */, Ext /* <: coreDashObjectLib.coreDashObjectMod.CoreObjectNs.ExtendOptions[stdLib.InstanceType[BaseClass]] */](
    `this`: BaseClass,
    options: Ext with (coreDashObjectLib.coreDashObjectMod.CoreObjectNs.ExtendThisType[stdLib.InstanceType[BaseClass], Ext])
  ): BaseClass with (coreDashObjectLib.dashPrivateUtilsMod.Constructor[coreDashObjectLib.dashPrivateUtilsMod.Mix[stdLib.InstanceType[BaseClass], Ext]]) = js.native
}

