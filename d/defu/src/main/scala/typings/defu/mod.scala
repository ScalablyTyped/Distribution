package typings.defu

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("defu", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("defu", JSImport.Default)
  @js.native
  val default: DefuInstance = js.native
  
  inline def createDefu(): DefuFn_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createDefu")().asInstanceOf[DefuFn_]
  inline def createDefu(merger: Merger): DefuFn_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createDefu")(merger.asInstanceOf[js.Any]).asInstanceOf[DefuFn_]
  
  @JSImport("defu", "defu")
  @js.native
  val defu: DefuInstance = js.native
  
  @JSImport("defu", "defuArrayFn")
  @js.native
  val defuArrayFn: DefuFn_ = js.native
  
  @JSImport("defu", "defuFn")
  @js.native
  val defuFn: DefuFn_ = js.native
  
  type DefuFn_ = js.Function2[
    /* source */ Input, 
    /* defaults */ js.Array[Input | IgnoredInput], 
    Defu_[Input, js.Array[Input | IgnoredInput]]
  ]
  
  @js.native
  trait DefuInstance extends StObject {
    
    def apply[Source /* <: Input */, Defaults /* <: js.Array[Input | IgnoredInput] */](
      source: IgnoredInput | Source,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param defaults because its type Defaults is not an array type */ defaults: Defaults
    ): Defu_[Source, Defaults] = js.native
    
    def arrayFn[Source /* <: Input */, Defaults /* <: js.Array[Input | IgnoredInput] */](
      source: Source,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param defaults because its type Defaults is not an array type */ defaults: Defaults
    ): Defu_[Source, Defaults] = js.native
    @JSName("arrayFn")
    var arrayFn_Original: DefuFn_ = js.native
    
    def extend(): DefuFn_ = js.native
    def extend(merger: Merger): DefuFn_ = js.native
    
    def fn[Source /* <: Input */, Defaults /* <: js.Array[Input | IgnoredInput] */](
      source: Source,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param defaults because its type Defaults is not an array type */ defaults: Defaults
    ): Defu_[Source, Defaults] = js.native
    @JSName("fn")
    var fn_Original: DefuFn_ = js.native
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    D extends [infer F, ...infer Rest] ? F extends defu.defu.Input ? Rest extends std.Array<defu.defu.Input | defu.defu.IgnoredInput> ? defu.defu.Defu<defu.defu.MergeObjects<S, F>, Rest> : defu.defu.MergeObjects<S, F> : F extends defu.defu.IgnoredInput ? Rest extends std.Array<defu.defu.Input | defu.defu.IgnoredInput> ? defu.defu.Defu<S, Rest> : S : S : S
    }}}
    */
  type Defu_[S /* <: Input */, D /* <: js.Array[Input | IgnoredInput] */] = S
  
  type IgnoredInput = js.UndefOr[Boolean | Double | Null | js.Array[Any] | (Record[scala.Nothing, Any])]
  
  type Input = Record[String | Double | js.Symbol, Any]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Destination extends defu.defu.nullish ? Defaults extends defu.defu.nullish ? defu.defu.nullish : Defaults : Defaults extends defu.defu.nullish ? Destination : Destination extends std.Array<any> ? Defaults extends std.Array<any> ? defu.defu.MergeArrays<Destination, Defaults> : Destination | Defaults : Destination extends std.Function ? Destination | Defaults : Destination extends std.RegExp ? Destination | Defaults : Destination extends std.Promise<any> ? Destination | Defaults : Defaults extends std.Function ? Destination | Defaults : Defaults extends std.RegExp ? Destination | Defaults : Defaults extends std.Promise<any> ? Destination | Defaults : Destination extends defu.defu.Input ? Defaults extends defu.defu.Input ? defu.defu.MergeObjects<Destination, Defaults> : Destination | Defaults : Destination | Defaults
    }}}
    */
  type Merge[Destination /* <: Input */, Defaults /* <: Input */] = Defaults
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Destination extends std.Array<infer DestinationType> ? Source extends std.Array<infer SourceType> ? std.Array<DestinationType | SourceType> : Source | std.Array<DestinationType> : Source | Destination
    }}}
    */
  type MergeArrays[Destination, Source] = Source | Destination
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Destination extends Defaults ? Destination : std.Omit<Destination, keyof Destination & keyof Defaults> & std.Omit<Defaults, keyof Destination & keyof Defaults> & {-readonly [ Key in keyof Destination & keyof Defaults ]: Destination[Key] extends defu.defu.nullish? Defaults[Key] extends defu.defu.nullish? defu.defu.nullish : Defaults[Key] : Defaults[Key] extends defu.defu.nullish? Destination[Key] : defu.defu.Merge<Destination[Key], Defaults[Key]>}
    }}}
    */
  type MergeObjects[Destination /* <: Input */, Defaults /* <: Input */] = Destination
  
  type Merger = js.Function4[
    /* object */ Input, 
    /* keyof defu.defu.Input */ /* key */ String, 
    /* import warning: importer.ImportType#apply Failed type conversion: defu.defu.Input[keyof defu.defu.Input] */ /* value */ js.Any, 
    /* namespace */ String, 
    Any
  ]
  
  type nullish = js.UndefOr[Null | Unit]
}
