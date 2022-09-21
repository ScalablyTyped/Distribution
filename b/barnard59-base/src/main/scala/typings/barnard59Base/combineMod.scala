package typings.barnard59Base

import typings.node.streamMod.Duplex
import typings.node.streamMod.DuplexOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object combineMod {
  
  @JSImport("barnard59-base/combine", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T /* <: typings.node.streamMod.^ */](streams: js.Array[T | typings.node.streamMod.^]): FirstOrDuplex[
    T, 
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof streams */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(streams.asInstanceOf[js.Any]).asInstanceOf[FirstOrDuplex[
    T, 
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof streams */ Any
  ]]
  inline def default[T /* <: typings.node.streamMod.^ */](streams: js.Array[T | typings.node.streamMod.^], options: DuplexOptions): FirstOrDuplex[
    T, 
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof streams */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(streams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FirstOrDuplex[
    T, 
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof streams */ Any
  ]]
  
  type FirstOrDuplex[First, T /* <: js.Array[typings.node.streamMod.^] */] = First | Duplex
}
