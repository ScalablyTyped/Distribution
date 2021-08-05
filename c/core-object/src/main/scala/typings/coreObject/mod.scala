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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("core-object", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with CoreObject
  @JSImport("core-object", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend[BaseClass /* <: Constructor[js.Any] */, Ext /* <: ExtendOptions[InstanceType[BaseClass]] */](options: Ext & (ExtendThisType[InstanceType[BaseClass], Ext])): BaseClass & (Constructor[Mix[InstanceType[BaseClass], Ext]]) = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(options.asInstanceOf[js.Any]).asInstanceOf[BaseClass & (Constructor[Mix[InstanceType[BaseClass], Ext]])]
  
  @js.native
  trait CoreObject extends StObject {
    
    // TODO restrict to `Record<string, unknown>` once we can restrict to 3.0+ on DT
    def init(): Unit = js.native
    def init(options: Record[String, js.Any]): Unit = js.native
  }
  
  /** The type of options allowed to be passed to `Base.extend()` */
  type ExtendOptions[Base] = typings.coreObject.coreObjectStrings.ExtendOptions & TopLevel[Base] & (Record[String, js.Any])
  
  /** The `this` type for any methods on the options passed to `Base.extend()` */
  type ExtendThisType[Base, Ext] = ThisType[(Mix[Base, Ext]) & Super[Base]]
}
