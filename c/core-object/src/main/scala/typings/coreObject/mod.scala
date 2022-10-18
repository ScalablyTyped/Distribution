package typings.coreObject

import typings.coreObject.anon.Super
import typings.coreObject.privateUtilsMod.Constructor
import typings.coreObject.privateUtilsMod.Mix
import typings.std.InstanceType
import typings.std.Record
import typings.std.ThisType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("core-object", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with CoreObject
  @JSImport("core-object", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend[BaseClass /* <: Constructor[Any] */, Ext /* <: ExtendOptions[InstanceType[BaseClass]] */](options: Ext & (ExtendThisType[InstanceType[BaseClass], Ext])): BaseClass & (Constructor[Mix[InstanceType[BaseClass], Ext]]) = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(options.asInstanceOf[js.Any]).asInstanceOf[BaseClass & (Constructor[Mix[InstanceType[BaseClass], Ext]])]
  
  @js.native
  trait CoreObject extends StObject {
    
    // TODO restrict to `Record<string, unknown>` once we can restrict to 3.0+ on DT
    def init(): Unit = js.native
    def init(options: Record[String, Any]): Unit = js.native
  }
  
  /** The type of options allowed to be passed to `Base.extend()` */
  type ExtendOptions[Base] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof Base ]:? Base[K]} */ js.Any) & (Record[String, Any])
  
  /** The `this` type for any methods on the options passed to `Base.extend()` */
  type ExtendThisType[Base, Ext] = ThisType[(Mix[Base, Ext]) & Super[Base]]
}
