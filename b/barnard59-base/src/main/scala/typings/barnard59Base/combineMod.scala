package typings.barnard59Base

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
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T[1] extends never ? node.stream.Duplex : First
    }}}
    */
  @js.native
  trait FirstOrDuplex[First, T /* <: js.Array[typings.node.streamMod.^] */] extends StObject
}
