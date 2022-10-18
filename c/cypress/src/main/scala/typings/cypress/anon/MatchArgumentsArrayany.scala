package typings.cypress.anon

import typings.cypress.typesSinonMod.SinonMatcher
import typings.std.FlatArray
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined cypress.cypress/types/sinon.MatchArguments<std.Array<any>> */
trait MatchArgumentsArrayany extends StObject {
  
  var at: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (index : number): any | undefined extends object ? cypress.cypress/types/sinon.MatchArguments<(index : number): any | undefined> : never */ js.Any) | (js.Function1[/* index */ Double, js.UndefOr[Any]])
  
  var concat: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (items : ...std.ConcatArray<any>): std.Array<any> extends object ? cypress.cypress/types/sinon.MatchArguments<(items : ...std.ConcatArray<any>): std.Array<any>> : never */ js.Any) | (js.Function1[/* repeated */ js.Array[Any], js.Array[Any]])
  
  var copyWithin: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (target : number, start : number): this extends object ? cypress.cypress/types/sinon.MatchArguments<(target : number, start : number): this> : never */ js.Any) | (js.Function2[/* target */ Double, /* start */ Double, this.type])
  
  var entries: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): std.IterableIterator<[number, any]> extends object ? cypress.cypress/types/sinon.MatchArguments<(): std.IterableIterator<[number, any]>> : never */ js.Any) | (js.Function0[IterableIterator[js.Tuple2[Double, Any]]])
  
  var every: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: <S extends any>(predicate : (value : any, index : number, array : std.Array<any>): value is S): this is std.Array<S> extends object ? cypress.cypress/types/sinon.MatchArguments<<S extends any>(predicate : (value : any, index : number, array : std.Array<any>): value is S): this is std.Array<S>> : never */ js.Any) | (js.Function1[
    /* predicate */ js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], /* is any */ Boolean], 
    /* is std.Array<any> */ Boolean
  ])
  
  var fill: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (value : any): this extends object ? cypress.cypress/types/sinon.MatchArguments<(value : any): this> : never */ js.Any) | (js.Function1[/* value */ Any, this.type])
  
  var filter: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: <S extends any>(predicate : (value : any, index : number, array : std.Array<any>): value is S): std.Array<S> extends object ? cypress.cypress/types/sinon.MatchArguments<<S extends any>(predicate : (value : any, index : number, array : std.Array<any>): value is S): std.Array<S>> : never */ js.Any) | (js.Function1[
    /* predicate */ js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], /* is any */ Boolean], 
    js.Array[Any]
  ])
  
  var find: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: <S extends any>(predicate : (this : void, value : any, index : number, obj : std.Array<any>): value is S): S | undefined extends object ? cypress.cypress/types/sinon.MatchArguments<<S extends any>(predicate : (this : void, value : any, index : number, obj : std.Array<any>): value is S): S | undefined> : never */ js.Any) | (js.Function1[
    /* predicate */ js.ThisFunction3[
      /* this */ Unit, 
      /* value */ Any, 
      /* index */ Double, 
      /* obj */ js.Array[Any], 
      /* is any */ Boolean
    ], 
    js.UndefOr[Any]
  ])
  
  var findIndex: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (predicate : (value : any, index : number, obj : std.Array<any>): unknown): number extends object ? cypress.cypress/types/sinon.MatchArguments<(predicate : (value : any, index : number, obj : std.Array<any>): unknown): number> : never */ js.Any) | (js.Function1[
    /* predicate */ js.Function3[/* value */ Any, /* index */ Double, /* obj */ js.Array[Any], Any], 
    Double
  ])
  
  var flat: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: <A, D extends number = 1>(this : A): std.Array<std.FlatArray<A, D>> extends object ? cypress.cypress/types/sinon.MatchArguments<<A, D extends number = 1>(this : A): std.Array<std.FlatArray<A, D>>> : never */ js.Any) | (js.ThisFunction0[/* this */ Any, js.Array[FlatArray[Any, typings.cypress.cypressInts.`1`]]])
  
  var flatMap: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: <U, This = undefined>(callback : (this : This, value : any, index : number, array : std.Array<any>): U | std.ReadonlyArray<U>): std.Array<U> extends object ? cypress.cypress/types/sinon.MatchArguments<<U, This = undefined>(callback : (this : This, value : any, index : number, array : std.Array<any>): U | std.ReadonlyArray<U>): std.Array<U>> : never */ js.Any) | (js.Function1[
    /* callback */ js.ThisFunction3[
      /* this */ Unit, 
      /* value */ Any, 
      /* index */ Double, 
      /* array */ js.Array[Any], 
      Any | js.Array[Any]
    ], 
    js.Array[Any]
  ])
  
  var forEach: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (callbackfn : (value : any, index : number, array : std.Array<any>): void): void extends object ? cypress.cypress/types/sinon.MatchArguments<(callbackfn : (value : any, index : number, array : std.Array<any>): void): void> : never */ js.Any) | (js.Function1[
    /* callbackfn */ js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], Unit], 
    Unit
  ])
  
  var includes: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (searchElement : any): boolean extends object ? cypress.cypress/types/sinon.MatchArguments<(searchElement : any): boolean> : never */ js.Any) | (js.Function1[/* searchElement */ Any, Boolean])
  
  var indexOf: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (searchElement : any): number extends object ? cypress.cypress/types/sinon.MatchArguments<(searchElement : any): number> : never */ js.Any) | (js.Function1[/* searchElement */ Any, Double])
  
  var join: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): string extends object ? cypress.cypress/types/sinon.MatchArguments<(): string> : never */ js.Any) | js.Function0[String]
  
  var keys: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): std.IterableIterator<number> extends object ? cypress.cypress/types/sinon.MatchArguments<(): std.IterableIterator<number>> : never */ js.Any) | js.Function0[IterableIterator[Double]]
  
  var lastIndexOf: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (searchElement : any): number extends object ? cypress.cypress/types/sinon.MatchArguments<(searchElement : any): number> : never */ js.Any) | (js.Function1[/* searchElement */ Any, Double])
  
  var length: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: number extends object ? cypress.cypress/types/sinon.MatchArguments<number> : never */ js.Any) | Double
  
  var map: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: <U>(callbackfn : (value : any, index : number, array : std.Array<any>): U): std.Array<U> extends object ? cypress.cypress/types/sinon.MatchArguments<<U>(callbackfn : (value : any, index : number, array : std.Array<any>): U): std.Array<U>> : never */ js.Any) | (js.Function1[
    /* callbackfn */ js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], Any], 
    js.Array[Any]
  ])
  
  var pop: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): any | undefined extends object ? cypress.cypress/types/sinon.MatchArguments<(): any | undefined> : never */ js.Any) | js.Function0[js.UndefOr[Any]]
  
  var push: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (items : ...any): number extends object ? cypress.cypress/types/sinon.MatchArguments<(items : ...any): number> : never */ js.Any) | (js.Function1[/* repeated */ Any, Double])
  
  var reduce: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (callbackfn : (previousValue : any, currentValue : any, currentIndex : number, array : std.Array<any>): any): any extends object ? cypress.cypress/types/sinon.MatchArguments<(callbackfn : (previousValue : any, currentValue : any, currentIndex : number, array : std.Array<any>): any): any> : never */ js.Any) | (js.Function1[
    /* callbackfn */ js.Function4[
      /* previousValue */ Any, 
      /* currentValue */ Any, 
      /* currentIndex */ Double, 
      /* array */ js.Array[Any], 
      Any
    ], 
    Any
  ])
  
  var reduceRight: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (callbackfn : (previousValue : any, currentValue : any, currentIndex : number, array : std.Array<any>): any): any extends object ? cypress.cypress/types/sinon.MatchArguments<(callbackfn : (previousValue : any, currentValue : any, currentIndex : number, array : std.Array<any>): any): any> : never */ js.Any) | (js.Function1[
    /* callbackfn */ js.Function4[
      /* previousValue */ Any, 
      /* currentValue */ Any, 
      /* currentIndex */ Double, 
      /* array */ js.Array[Any], 
      Any
    ], 
    Any
  ])
  
  var reverse: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): std.Array<any> extends object ? cypress.cypress/types/sinon.MatchArguments<(): std.Array<any>> : never */ js.Any) | js.Function0[js.Array[Any]]
  
  var shift: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): any | undefined extends object ? cypress.cypress/types/sinon.MatchArguments<(): any | undefined> : never */ js.Any) | js.Function0[js.UndefOr[Any]]
  
  var slice: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): std.Array<any> extends object ? cypress.cypress/types/sinon.MatchArguments<(): std.Array<any>> : never */ js.Any) | js.Function0[js.Array[Any]]
  
  var some: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (predicate : (value : any, index : number, array : std.Array<any>): unknown): boolean extends object ? cypress.cypress/types/sinon.MatchArguments<(predicate : (value : any, index : number, array : std.Array<any>): unknown): boolean> : never */ js.Any) | (js.Function1[
    /* predicate */ js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], Any], 
    Boolean
  ])
  
  var sort: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): this extends object ? cypress.cypress/types/sinon.MatchArguments<(): this> : never */ js.Any) | js.Function0[this.type]
  
  var splice: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (start : number): std.Array<any> extends object ? cypress.cypress/types/sinon.MatchArguments<(start : number): std.Array<any>> : never */ js.Any) | (js.Function1[/* start */ Double, js.Array[Any]])
  
  @JSName("toLocaleString")
  var toLocaleString_FMatchArgumentsArrayany: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): string extends object ? cypress.cypress/types/sinon.MatchArguments<(): string> : never */ js.Any) | js.Function0[String]
  
  @JSName("toString")
  var toString_FMatchArgumentsArrayany: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): string extends object ? cypress.cypress/types/sinon.MatchArguments<(): string> : never */ js.Any) | js.Function0[String]
  
  var unshift: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (items : ...any): number extends object ? cypress.cypress/types/sinon.MatchArguments<(items : ...any): number> : never */ js.Any) | (js.Function1[/* repeated */ Any, Double])
  
  var values: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): std.IterableIterator<any> extends object ? cypress.cypress/types/sinon.MatchArguments<(): std.IterableIterator<any>> : never */ js.Any) | js.Function0[IterableIterator[Any]]
}
object MatchArgumentsArrayany {
  
  inline def apply(
    at: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (index : number): any | undefined extends object ? cypress.cypress/types/sinon.MatchArguments<(index : number): any | undefined> : never */ js.Any) | (js.Function1[/* index */ Double, js.UndefOr[Any]]),
    concat: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (items : ...std.ConcatArray<any>): std.Array<any> extends object ? cypress.cypress/types/sinon.MatchArguments<(items : ...std.ConcatArray<any>): std.Array<any>> : never */ js.Any) | (js.Function1[/* repeated */ js.Array[Any], js.Array[Any]]),
    copyWithin: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (target : number, start : number): this extends object ? cypress.cypress/types/sinon.MatchArguments<(target : number, start : number): this> : never */ js.Any) | (js.Function2[/* target */ Double, /* start */ Double, MatchArgumentsArrayany]),
    entries: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): std.IterableIterator<[number, any]> extends object ? cypress.cypress/types/sinon.MatchArguments<(): std.IterableIterator<[number, any]>> : never */ js.Any) | (js.Function0[IterableIterator[js.Tuple2[Double, Any]]]),
    every: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: <S extends any>(predicate : (value : any, index : number, array : std.Array<any>): value is S): this is std.Array<S> extends object ? cypress.cypress/types/sinon.MatchArguments<<S extends any>(predicate : (value : any, index : number, array : std.Array<any>): value is S): this is std.Array<S>> : never */ js.Any) | (js.Function1[
      /* predicate */ js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], /* is any */ Boolean], 
      /* is std.Array<any> */ Boolean
    ]),
    fill: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (value : any): this extends object ? cypress.cypress/types/sinon.MatchArguments<(value : any): this> : never */ js.Any) | (js.Function1[/* value */ Any, MatchArgumentsArrayany]),
    filter: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: <S extends any>(predicate : (value : any, index : number, array : std.Array<any>): value is S): std.Array<S> extends object ? cypress.cypress/types/sinon.MatchArguments<<S extends any>(predicate : (value : any, index : number, array : std.Array<any>): value is S): std.Array<S>> : never */ js.Any) | (js.Function1[
      /* predicate */ js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], /* is any */ Boolean], 
      js.Array[Any]
    ]),
    find: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: <S extends any>(predicate : (this : void, value : any, index : number, obj : std.Array<any>): value is S): S | undefined extends object ? cypress.cypress/types/sinon.MatchArguments<<S extends any>(predicate : (this : void, value : any, index : number, obj : std.Array<any>): value is S): S | undefined> : never */ js.Any) | (js.Function1[
      /* predicate */ js.ThisFunction3[
        /* this */ Unit, 
        /* value */ Any, 
        /* index */ Double, 
        /* obj */ js.Array[Any], 
        /* is any */ Boolean
      ], 
      js.UndefOr[Any]
    ]),
    findIndex: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (predicate : (value : any, index : number, obj : std.Array<any>): unknown): number extends object ? cypress.cypress/types/sinon.MatchArguments<(predicate : (value : any, index : number, obj : std.Array<any>): unknown): number> : never */ js.Any) | (js.Function1[
      /* predicate */ js.Function3[/* value */ Any, /* index */ Double, /* obj */ js.Array[Any], Any], 
      Double
    ]),
    flat: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: <A, D extends number = 1>(this : A): std.Array<std.FlatArray<A, D>> extends object ? cypress.cypress/types/sinon.MatchArguments<<A, D extends number = 1>(this : A): std.Array<std.FlatArray<A, D>>> : never */ js.Any) | (js.ThisFunction0[/* this */ Any, js.Array[FlatArray[Any, typings.cypress.cypressInts.`1`]]]),
    flatMap: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: <U, This = undefined>(callback : (this : This, value : any, index : number, array : std.Array<any>): U | std.ReadonlyArray<U>): std.Array<U> extends object ? cypress.cypress/types/sinon.MatchArguments<<U, This = undefined>(callback : (this : This, value : any, index : number, array : std.Array<any>): U | std.ReadonlyArray<U>): std.Array<U>> : never */ js.Any) | (js.Function1[
      /* callback */ js.ThisFunction3[
        /* this */ Unit, 
        /* value */ Any, 
        /* index */ Double, 
        /* array */ js.Array[Any], 
        Any | js.Array[Any]
      ], 
      js.Array[Any]
    ]),
    forEach: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (callbackfn : (value : any, index : number, array : std.Array<any>): void): void extends object ? cypress.cypress/types/sinon.MatchArguments<(callbackfn : (value : any, index : number, array : std.Array<any>): void): void> : never */ js.Any) | (js.Function1[
      /* callbackfn */ js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], Unit], 
      Unit
    ]),
    includes: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (searchElement : any): boolean extends object ? cypress.cypress/types/sinon.MatchArguments<(searchElement : any): boolean> : never */ js.Any) | (js.Function1[/* searchElement */ Any, Boolean]),
    indexOf: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (searchElement : any): number extends object ? cypress.cypress/types/sinon.MatchArguments<(searchElement : any): number> : never */ js.Any) | (js.Function1[/* searchElement */ Any, Double]),
    join: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): string extends object ? cypress.cypress/types/sinon.MatchArguments<(): string> : never */ js.Any) | js.Function0[String],
    keys: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): std.IterableIterator<number> extends object ? cypress.cypress/types/sinon.MatchArguments<(): std.IterableIterator<number>> : never */ js.Any) | js.Function0[IterableIterator[Double]],
    lastIndexOf: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (searchElement : any): number extends object ? cypress.cypress/types/sinon.MatchArguments<(searchElement : any): number> : never */ js.Any) | (js.Function1[/* searchElement */ Any, Double]),
    length: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: number extends object ? cypress.cypress/types/sinon.MatchArguments<number> : never */ js.Any) | Double,
    map: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: <U>(callbackfn : (value : any, index : number, array : std.Array<any>): U): std.Array<U> extends object ? cypress.cypress/types/sinon.MatchArguments<<U>(callbackfn : (value : any, index : number, array : std.Array<any>): U): std.Array<U>> : never */ js.Any) | (js.Function1[
      /* callbackfn */ js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], Any], 
      js.Array[Any]
    ]),
    pop: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): any | undefined extends object ? cypress.cypress/types/sinon.MatchArguments<(): any | undefined> : never */ js.Any) | js.Function0[js.UndefOr[Any]],
    push: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (items : ...any): number extends object ? cypress.cypress/types/sinon.MatchArguments<(items : ...any): number> : never */ js.Any) | (js.Function1[/* repeated */ Any, Double]),
    reduce: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (callbackfn : (previousValue : any, currentValue : any, currentIndex : number, array : std.Array<any>): any): any extends object ? cypress.cypress/types/sinon.MatchArguments<(callbackfn : (previousValue : any, currentValue : any, currentIndex : number, array : std.Array<any>): any): any> : never */ js.Any) | (js.Function1[
      /* callbackfn */ js.Function4[
        /* previousValue */ Any, 
        /* currentValue */ Any, 
        /* currentIndex */ Double, 
        /* array */ js.Array[Any], 
        Any
      ], 
      Any
    ]),
    reduceRight: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (callbackfn : (previousValue : any, currentValue : any, currentIndex : number, array : std.Array<any>): any): any extends object ? cypress.cypress/types/sinon.MatchArguments<(callbackfn : (previousValue : any, currentValue : any, currentIndex : number, array : std.Array<any>): any): any> : never */ js.Any) | (js.Function1[
      /* callbackfn */ js.Function4[
        /* previousValue */ Any, 
        /* currentValue */ Any, 
        /* currentIndex */ Double, 
        /* array */ js.Array[Any], 
        Any
      ], 
      Any
    ]),
    reverse: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): std.Array<any> extends object ? cypress.cypress/types/sinon.MatchArguments<(): std.Array<any>> : never */ js.Any) | js.Function0[js.Array[Any]],
    shift: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): any | undefined extends object ? cypress.cypress/types/sinon.MatchArguments<(): any | undefined> : never */ js.Any) | js.Function0[js.UndefOr[Any]],
    slice: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): std.Array<any> extends object ? cypress.cypress/types/sinon.MatchArguments<(): std.Array<any>> : never */ js.Any) | js.Function0[js.Array[Any]],
    some: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (predicate : (value : any, index : number, array : std.Array<any>): unknown): boolean extends object ? cypress.cypress/types/sinon.MatchArguments<(predicate : (value : any, index : number, array : std.Array<any>): unknown): boolean> : never */ js.Any) | (js.Function1[
      /* predicate */ js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], Any], 
      Boolean
    ]),
    sort: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): this extends object ? cypress.cypress/types/sinon.MatchArguments<(): this> : never */ js.Any) | js.Function0[MatchArgumentsArrayany],
    splice: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (start : number): std.Array<any> extends object ? cypress.cypress/types/sinon.MatchArguments<(start : number): std.Array<any>> : never */ js.Any) | (js.Function1[/* start */ Double, js.Array[Any]]),
    toLocaleString: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): string extends object ? cypress.cypress/types/sinon.MatchArguments<(): string> : never */ js.Any) | js.Function0[String],
    toString_ : SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): string extends object ? cypress.cypress/types/sinon.MatchArguments<(): string> : never */ js.Any) | js.Function0[String],
    unshift: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (items : ...any): number extends object ? cypress.cypress/types/sinon.MatchArguments<(items : ...any): number> : never */ js.Any) | (js.Function1[/* repeated */ Any, Double]),
    values: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): std.IterableIterator<any> extends object ? cypress.cypress/types/sinon.MatchArguments<(): std.IterableIterator<any>> : never */ js.Any) | js.Function0[IterableIterator[Any]]
  ): MatchArgumentsArrayany = {
    val __obj = js.Dynamic.literal(at = at.asInstanceOf[js.Any], concat = concat.asInstanceOf[js.Any], copyWithin = copyWithin.asInstanceOf[js.Any], entries = entries.asInstanceOf[js.Any], every = every.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], find = find.asInstanceOf[js.Any], findIndex = findIndex.asInstanceOf[js.Any], flat = flat.asInstanceOf[js.Any], flatMap = flatMap.asInstanceOf[js.Any], forEach = forEach.asInstanceOf[js.Any], includes = includes.asInstanceOf[js.Any], indexOf = indexOf.asInstanceOf[js.Any], join = join.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], lastIndexOf = lastIndexOf.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], pop = pop.asInstanceOf[js.Any], push = push.asInstanceOf[js.Any], reduce = reduce.asInstanceOf[js.Any], reduceRight = reduceRight.asInstanceOf[js.Any], reverse = reverse.asInstanceOf[js.Any], shift = shift.asInstanceOf[js.Any], slice = slice.asInstanceOf[js.Any], some = some.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any], splice = splice.asInstanceOf[js.Any], toLocaleString = toLocaleString.asInstanceOf[js.Any], unshift = unshift.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("toString")(toString_.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchArgumentsArrayany]
  }
  
  extension [Self <: MatchArgumentsArrayany](x: Self) {
    
    inline def setAt(
      value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (index : number): any | undefined extends object ? cypress.cypress/types/sinon.MatchArguments<(index : number): any | undefined> : never */ js.Any) | (js.Function1[/* index */ Double, js.UndefOr[Any]])
    ): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
    
    inline def setAtFunction1(value: /* index */ Double => js.UndefOr[Any]): Self = StObject.set(x, "at", js.Any.fromFunction1(value))
    
    inline def setConcat(
      value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (items : ...std.ConcatArray<any>): std.Array<any> extends object ? cypress.cypress/types/sinon.MatchArguments<(items : ...std.ConcatArray<any>): std.Array<any>> : never */ js.Any) | (js.Function1[/* repeated */ js.Array[Any], js.Array[Any]])
    ): Self = StObject.set(x, "concat", value.asInstanceOf[js.Any])
    
    inline def setConcatFunction1(value: /* repeated */ js.Array[Any] => js.Array[Any]): Self = StObject.set(x, "concat", js.Any.fromFunction1(value))
    
    inline def setCopyWithin(
      value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (target : number, start : number): this extends object ? cypress.cypress/types/sinon.MatchArguments<(target : number, start : number): this> : never */ js.Any) | (js.Function2[/* target */ Double, /* start */ Double, MatchArgumentsArrayany])
    ): Self = StObject.set(x, "copyWithin", value.asInstanceOf[js.Any])
    
    inline def setCopyWithinFunction2(value: (/* target */ Double, /* start */ Double) => MatchArgumentsArrayany): Self = StObject.set(x, "copyWithin", js.Any.fromFunction2(value))
    
    inline def setEntries(
      value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): std.IterableIterator<[number, any]> extends object ? cypress.cypress/types/sinon.MatchArguments<(): std.IterableIterator<[number, any]>> : never */ js.Any) | (js.Function0[IterableIterator[js.Tuple2[Double, Any]]])
    ): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesFunction0(value: () => IterableIterator[js.Tuple2[Double, Any]]): Self = StObject.set(x, "entries", js.Any.fromFunction0(value))
    
    inline def setEvery(
      value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: <S extends any>(predicate : (value : any, index : number, array : std.Array<any>): value is S): this is std.Array<S> extends object ? cypress.cypress/types/sinon.MatchArguments<<S extends any>(predicate : (value : any, index : number, array : std.Array<any>): value is S): this is std.Array<S>> : never */ js.Any) | (js.Function1[
          /* predicate */ js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], /* is any */ Boolean], 
          /* is std.Array<any> */ Boolean
        ])
    ): Self = StObject.set(x, "every", value.asInstanceOf[js.Any])
    
    inline def setEveryFunction1(
      value: /* predicate */ js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], /* is any */ Boolean] => /* is std.Array<any> */ Boolean
    ): Self = StObject.set(x, "every", js.Any.fromFunction1(value))
    
    inline def setFill(
      value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (value : any): this extends object ? cypress.cypress/types/sinon.MatchArguments<(value : any): this> : never */ js.Any) | (js.Function1[/* value */ Any, MatchArgumentsArrayany])
    ): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillFunction1(value: /* value */ Any => MatchArgumentsArrayany): Self = StObject.set(x, "fill", js.Any.fromFunction1(value))
    
    inline def setFilter(
      value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: <S extends any>(predicate : (value : any, index : number, array : std.Array<any>): value is S): std.Array<S> extends object ? cypress.cypress/types/sinon.MatchArguments<<S extends any>(predicate : (value : any, index : number, array : std.Array<any>): value is S): std.Array<S>> : never */ js.Any) | (js.Function1[
          /* predicate */ js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], /* is any */ Boolean], 
          js.Array[Any]
        ])
    ): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterFunction1(
      value: /* predicate */ js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], /* is any */ Boolean] => js.Array[Any]
    ): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
    
    inline def setFind(
      value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: <S extends any>(predicate : (this : void, value : any, index : number, obj : std.Array<any>): value is S): S | undefined extends object ? cypress.cypress/types/sinon.MatchArguments<<S extends any>(predicate : (this : void, value : any, index : number, obj : std.Array<any>): value is S): S | undefined> : never */ js.Any) | (js.Function1[
          /* predicate */ js.ThisFunction3[
            /* this */ Unit, 
            /* value */ Any, 
            /* index */ Double, 
            /* obj */ js.Array[Any], 
            /* is any */ Boolean
          ], 
          js.UndefOr[Any]
        ])
    ): Self = StObject.set(x, "find", value.asInstanceOf[js.Any])
    
    inline def setFindFunction1(
      value: /* predicate */ js.ThisFunction3[
          /* this */ Unit, 
          /* value */ Any, 
          /* index */ Double, 
          /* obj */ js.Array[Any], 
          /* is any */ Boolean
        ] => js.UndefOr[Any]
    ): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
    
    inline def setFindIndex(
      value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (predicate : (value : any, index : number, obj : std.Array<any>): unknown): number extends object ? cypress.cypress/types/sinon.MatchArguments<(predicate : (value : any, index : number, obj : std.Array<any>): unknown): number> : never */ js.Any) | (js.Function1[
          /* predicate */ js.Function3[/* value */ Any, /* index */ Double, /* obj */ js.Array[Any], Any], 
          Double
        ])
    ): Self = StObject.set(x, "findIndex", value.asInstanceOf[js.Any])
    
    inline def setFindIndexFunction1(
      value: /* predicate */ js.Function3[/* value */ Any, /* index */ Double, /* obj */ js.Array[Any], Any] => Double
    ): Self = StObject.set(x, "findIndex", js.Any.fromFunction1(value))
    
    inline def setFlat(
      value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: <A, D extends number = 1>(this : A): std.Array<std.FlatArray<A, D>> extends object ? cypress.cypress/types/sinon.MatchArguments<<A, D extends number = 1>(this : A): std.Array<std.FlatArray<A, D>>> : never */ js.Any) | (js.ThisFunction0[/* this */ Any, js.Array[FlatArray[Any, typings.cypress.cypressInts.`1`]]])
    ): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
    
    inline def setFlatMap(
      value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: <U, This = undefined>(callback : (this : This, value : any, index : number, array : std.Array<any>): U | std.ReadonlyArray<U>): std.Array<U> extends object ? cypress.cypress/types/sinon.MatchArguments<<U, This = undefined>(callback : (this : This, value : any, index : number, array : std.Array<any>): U | std.ReadonlyArray<U>): std.Array<U>> : never */ js.Any) | (js.Function1[
          /* callback */ js.ThisFunction3[
            /* this */ Unit, 
            /* value */ Any, 
            /* index */ Double, 
            /* array */ js.Array[Any], 
            Any | js.Array[Any]
          ], 
          js.Array[Any]
        ])
    ): Self = StObject.set(x, "flatMap", value.asInstanceOf[js.Any])
    
    inline def setFlatMapFunction1(
      value: /* callback */ js.ThisFunction3[
          /* this */ Unit, 
          /* value */ Any, 
          /* index */ Double, 
          /* array */ js.Array[Any], 
          Any | js.Array[Any]
        ] => js.Array[Any]
    ): Self = StObject.set(x, "flatMap", js.Any.fromFunction1(value))
    
    inline def setForEach(
      value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (callbackfn : (value : any, index : number, array : std.Array<any>): void): void extends object ? cypress.cypress/types/sinon.MatchArguments<(callbackfn : (value : any, index : number, array : std.Array<any>): void): void> : never */ js.Any) | (js.Function1[
          /* callbackfn */ js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], Unit], 
          Unit
        ])
    ): Self = StObject.set(x, "forEach", value.asInstanceOf[js.Any])
    
    inline def setForEachFunction1(
      value: /* callbackfn */ js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], Unit] => Unit
    ): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
    
    inline def setIncludes(
      value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (searchElement : any): boolean extends object ? cypress.cypress/types/sinon.MatchArguments<(searchElement : any): boolean> : never */ js.Any) | (js.Function1[/* searchElement */ Any, Boolean])
    ): Self = StObject.set(x, "includes", value.asInstanceOf[js.Any])
    
    inline def setIncludesFunction1(value: /* searchElement */ Any => Boolean): Self = StObject.set(x, "includes", js.Any.fromFunction1(value))
    
    inline def setIndexOf(
      value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (searchElement : any): number extends object ? cypress.cypress/types/sinon.MatchArguments<(searchElement : any): number> : never */ js.Any) | (js.Function1[/* searchElement */ Any, Double])
    ): Self = StObject.set(x, "indexOf", value.asInstanceOf[js.Any])
    
    inline def setIndexOfFunction1(value: /* searchElement */ Any => Double): Self = StObject.set(x, "indexOf", js.Any.fromFunction1(value))
    
    inline def setJoin(
      value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): string extends object ? cypress.cypress/types/sinon.MatchArguments<(): string> : never */ js.Any) | js.Function0[String]
    ): Self = StObject.set(x, "join", value.asInstanceOf[js.Any])
    
    inline def setJoinFunction0(value: () => String): Self = StObject.set(x, "join", js.Any.fromFunction0(value))
    
    inline def setKeys(
      value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): std.IterableIterator<number> extends object ? cypress.cypress/types/sinon.MatchArguments<(): std.IterableIterator<number>> : never */ js.Any) | js.Function0[IterableIterator[Double]]
    ): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysFunction0(value: () => IterableIterator[Double]): Self = StObject.set(x, "keys", js.Any.fromFunction0(value))
    
    inline def setLastIndexOf(
      value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (searchElement : any): number extends object ? cypress.cypress/types/sinon.MatchArguments<(searchElement : any): number> : never */ js.Any) | (js.Function1[/* searchElement */ Any, Double])
    ): Self = StObject.set(x, "lastIndexOf", value.asInstanceOf[js.Any])
    
    inline def setLastIndexOfFunction1(value: /* searchElement */ Any => Double): Self = StObject.set(x, "lastIndexOf", js.Any.fromFunction1(value))
    
    inline def setLength(
      value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: number extends object ? cypress.cypress/types/sinon.MatchArguments<number> : never */ js.Any) | Double
    ): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setMap(
      value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: <U>(callbackfn : (value : any, index : number, array : std.Array<any>): U): std.Array<U> extends object ? cypress.cypress/types/sinon.MatchArguments<<U>(callbackfn : (value : any, index : number, array : std.Array<any>): U): std.Array<U>> : never */ js.Any) | (js.Function1[
          /* callbackfn */ js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], Any], 
          js.Array[Any]
        ])
    ): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapFunction1(
      value: /* callbackfn */ js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], Any] => js.Array[Any]
    ): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
    
    inline def setPop(
      value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): any | undefined extends object ? cypress.cypress/types/sinon.MatchArguments<(): any | undefined> : never */ js.Any) | js.Function0[js.UndefOr[Any]]
    ): Self = StObject.set(x, "pop", value.asInstanceOf[js.Any])
    
    inline def setPopFunction0(value: () => js.UndefOr[Any]): Self = StObject.set(x, "pop", js.Any.fromFunction0(value))
    
    inline def setPush(
      value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (items : ...any): number extends object ? cypress.cypress/types/sinon.MatchArguments<(items : ...any): number> : never */ js.Any) | (js.Function1[/* repeated */ Any, Double])
    ): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
    
    inline def setPushFunction1(value: /* repeated */ Any => Double): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
    
    inline def setReduce(
      value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (callbackfn : (previousValue : any, currentValue : any, currentIndex : number, array : std.Array<any>): any): any extends object ? cypress.cypress/types/sinon.MatchArguments<(callbackfn : (previousValue : any, currentValue : any, currentIndex : number, array : std.Array<any>): any): any> : never */ js.Any) | (js.Function1[
          /* callbackfn */ js.Function4[
            /* previousValue */ Any, 
            /* currentValue */ Any, 
            /* currentIndex */ Double, 
            /* array */ js.Array[Any], 
            Any
          ], 
          Any
        ])
    ): Self = StObject.set(x, "reduce", value.asInstanceOf[js.Any])
    
    inline def setReduceFunction1(
      value: /* callbackfn */ js.Function4[
          /* previousValue */ Any, 
          /* currentValue */ Any, 
          /* currentIndex */ Double, 
          /* array */ js.Array[Any], 
          Any
        ] => Any
    ): Self = StObject.set(x, "reduce", js.Any.fromFunction1(value))
    
    inline def setReduceRight(
      value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (callbackfn : (previousValue : any, currentValue : any, currentIndex : number, array : std.Array<any>): any): any extends object ? cypress.cypress/types/sinon.MatchArguments<(callbackfn : (previousValue : any, currentValue : any, currentIndex : number, array : std.Array<any>): any): any> : never */ js.Any) | (js.Function1[
          /* callbackfn */ js.Function4[
            /* previousValue */ Any, 
            /* currentValue */ Any, 
            /* currentIndex */ Double, 
            /* array */ js.Array[Any], 
            Any
          ], 
          Any
        ])
    ): Self = StObject.set(x, "reduceRight", value.asInstanceOf[js.Any])
    
    inline def setReduceRightFunction1(
      value: /* callbackfn */ js.Function4[
          /* previousValue */ Any, 
          /* currentValue */ Any, 
          /* currentIndex */ Double, 
          /* array */ js.Array[Any], 
          Any
        ] => Any
    ): Self = StObject.set(x, "reduceRight", js.Any.fromFunction1(value))
    
    inline def setReverse(
      value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): std.Array<any> extends object ? cypress.cypress/types/sinon.MatchArguments<(): std.Array<any>> : never */ js.Any) | js.Function0[js.Array[Any]]
    ): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    inline def setReverseFunction0(value: () => js.Array[Any]): Self = StObject.set(x, "reverse", js.Any.fromFunction0(value))
    
    inline def setShift(
      value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): any | undefined extends object ? cypress.cypress/types/sinon.MatchArguments<(): any | undefined> : never */ js.Any) | js.Function0[js.UndefOr[Any]]
    ): Self = StObject.set(x, "shift", value.asInstanceOf[js.Any])
    
    inline def setShiftFunction0(value: () => js.UndefOr[Any]): Self = StObject.set(x, "shift", js.Any.fromFunction0(value))
    
    inline def setSlice(
      value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): std.Array<any> extends object ? cypress.cypress/types/sinon.MatchArguments<(): std.Array<any>> : never */ js.Any) | js.Function0[js.Array[Any]]
    ): Self = StObject.set(x, "slice", value.asInstanceOf[js.Any])
    
    inline def setSliceFunction0(value: () => js.Array[Any]): Self = StObject.set(x, "slice", js.Any.fromFunction0(value))
    
    inline def setSome(
      value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (predicate : (value : any, index : number, array : std.Array<any>): unknown): boolean extends object ? cypress.cypress/types/sinon.MatchArguments<(predicate : (value : any, index : number, array : std.Array<any>): unknown): boolean> : never */ js.Any) | (js.Function1[
          /* predicate */ js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], Any], 
          Boolean
        ])
    ): Self = StObject.set(x, "some", value.asInstanceOf[js.Any])
    
    inline def setSomeFunction1(
      value: /* predicate */ js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], Any] => Boolean
    ): Self = StObject.set(x, "some", js.Any.fromFunction1(value))
    
    inline def setSort(
      value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): this extends object ? cypress.cypress/types/sinon.MatchArguments<(): this> : never */ js.Any) | js.Function0[MatchArgumentsArrayany]
    ): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortFunction0(value: () => MatchArgumentsArrayany): Self = StObject.set(x, "sort", js.Any.fromFunction0(value))
    
    inline def setSplice(
      value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (start : number): std.Array<any> extends object ? cypress.cypress/types/sinon.MatchArguments<(start : number): std.Array<any>> : never */ js.Any) | (js.Function1[/* start */ Double, js.Array[Any]])
    ): Self = StObject.set(x, "splice", value.asInstanceOf[js.Any])
    
    inline def setSpliceFunction1(value: /* start */ Double => js.Array[Any]): Self = StObject.set(x, "splice", js.Any.fromFunction1(value))
    
    inline def setToLocaleString(
      value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): string extends object ? cypress.cypress/types/sinon.MatchArguments<(): string> : never */ js.Any) | js.Function0[String]
    ): Self = StObject.set(x, "toLocaleString", value.asInstanceOf[js.Any])
    
    inline def setToLocaleStringFunction0(value: () => String): Self = StObject.set(x, "toLocaleString", js.Any.fromFunction0(value))
    
    inline def setToString_(
      value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): string extends object ? cypress.cypress/types/sinon.MatchArguments<(): string> : never */ js.Any) | js.Function0[String]
    ): Self = StObject.set(x, "toString", value.asInstanceOf[js.Any])
    
    inline def setToString_Function0(value: () => String): Self = StObject.set(x, "toString", js.Any.fromFunction0(value))
    
    inline def setUnshift(
      value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (items : ...any): number extends object ? cypress.cypress/types/sinon.MatchArguments<(items : ...any): number> : never */ js.Any) | (js.Function1[/* repeated */ Any, Double])
    ): Self = StObject.set(x, "unshift", value.asInstanceOf[js.Any])
    
    inline def setUnshiftFunction1(value: /* repeated */ Any => Double): Self = StObject.set(x, "unshift", js.Any.fromFunction1(value))
    
    inline def setValues(
      value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): std.IterableIterator<any> extends object ? cypress.cypress/types/sinon.MatchArguments<(): std.IterableIterator<any>> : never */ js.Any) | js.Function0[IterableIterator[Any]]
    ): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesFunction0(value: () => IterableIterator[Any]): Self = StObject.set(x, "values", js.Any.fromFunction0(value))
  }
}
