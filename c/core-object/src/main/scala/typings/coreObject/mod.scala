package typings.coreObject

import org.scalablytyped.runtime.TopLevel
import typings.coreObject.anon.Super
import typings.coreObject.utilsMod.Constructor
import typings.coreObject.utilsMod.Mix
import typings.std.InstanceType
import typings.std.Record
import typings.std.ThisType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("core-object", JSImport.Namespace)
  @js.native
  class ^ () extends CoreObject
  
  /* static member */
  @JSImport("core-object", "extend")
  @js.native
  def extend[BaseClass /* <: Constructor[_] */, Ext /* <: ExtendOptions[InstanceType[BaseClass]] */](options: Ext with (ExtendThisType[InstanceType[BaseClass], Ext])): BaseClass with (Constructor[Mix[InstanceType[BaseClass], Ext]]) = js.native
  
  @js.native
  trait CoreObject extends StObject {
    
    // TODO restrict to `Record<string, unknown>` once we can restrict to 3.0+ on DT
    def init(): Unit = js.native
    def init(options: Record[String, _]): Unit = js.native
  }
  
  /** The type of options allowed to be passed to `Base.extend()` */
  type ExtendOptions[Base] = typings.coreObject.coreObjectStrings.ExtendOptions with TopLevel[Base] with (Record[String, _])
  
  /** The `this` type for any methods on the options passed to `Base.extend()` */
  type ExtendThisType[Base, Ext] = ThisType[(Mix[Base, Ext]) with Super[Base]]
}
