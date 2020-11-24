package typings.coreObject.mod

import typings.coreObject.utilsMod.Constructor
import typings.coreObject.utilsMod.Mix
import typings.std.InstanceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("core-object", JSImport.Namespace)
@js.native
class ^ () extends CoreObject
@JSImport("core-object", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def extend[BaseClass /* <: Constructor[_] */, Ext /* <: ExtendOptions[InstanceType[BaseClass]] */](options: Ext with (ExtendThisType[InstanceType[BaseClass], Ext])): BaseClass with (Constructor[Mix[InstanceType[BaseClass], Ext]]) = js.native
}
