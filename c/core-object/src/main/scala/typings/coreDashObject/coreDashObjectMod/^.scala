package typings.coreDashObject.coreDashObjectMod

import typings.coreDashObject.dashPrivateUtilsMod.Constructor
import typings.coreDashObject.dashPrivateUtilsMod.Mix
import typings.std.InstanceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("core-object", JSImport.Namespace)
@js.native
class ^ () extends CoreObject

@JSImport("core-object", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def extend[BaseClass /* <: Constructor[_] */, Ext /* <: ExtendOptions[InstanceType[BaseClass]] */](options: Ext with (ExtendThisType[InstanceType[BaseClass], Ext])): BaseClass with (Constructor[Mix[InstanceType[BaseClass], Ext]]) = js.native
}

