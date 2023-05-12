package typings.cypress.anon

import typings.cypress.typesSinonMod.SinonMatcher
import typings.std.FlatArray
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<cypress.cypress/types/sinon.MatchArguments<std.Array<any>>> */
trait PartialMatchArgumentsArra extends StObject {
  
  var at: js.UndefOr[
    SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (index : number): any | undefined extends object ? cypress.cypress/types/sinon.MatchArguments<(index : number): any | undefined> : never */ js.Any) | (js.Function1[/* index */ Double, js.UndefOr[Any]])
  ] = js.undefined
  
  var concat: js.UndefOr[
    SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (items : ...std.ConcatArray<any>): std.Array<any> extends object ? cypress.cypress/types/sinon.MatchArguments<(items : ...std.ConcatArray<any>): std.Array<any>> : never */ js.Any) | (js.Function1[/* repeated */ js.Array[Any], js.Array[Any]])
  ] = js.undefined
  
  var copyWithin: js.UndefOr[
    SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (target : number, start : number): this extends object ? cypress.cypress/types/sinon.MatchArguments<(target : number, start : number): this> : never */ js.Any) | (js.Function2[/* target */ Double, /* start */ Double, this.type])
  ] = js.undefined
  
  var entries: js.UndefOr[
    SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): std.IterableIterator<[number, any]> extends object ? cypress.cypress/types/sinon.MatchArguments<(): std.IterableIterator<[number, any]>> : never */ js.Any) | (js.Function0[IterableIterator[js.Tuple2[Double, Any]]])
  ] = js.undefined
  
  var every: js.UndefOr[
    SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: <S extends any>(predicate : (value : any, index : number, array : std.Array<any>): value is S): this is std.Array<S> extends object ? cypress.cypress/types/sinon.MatchArguments<<S extends any>(predicate : (value : any, index : number, array : std.Array<any>): value is S): this is std.Array<S>> : never */ js.Any) | (js.Function1[
      /* predicate */ js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], /* is any */ Boolean], 
      /* is std.Array<any> */ Boolean
    ])
  ] = js.undefined
  
  var fill: js.UndefOr[
    SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (value : any): this extends object ? cypress.cypress/types/sinon.MatchArguments<(value : any): this> : never */ js.Any) | (js.Function1[/* value */ Any, this.type])
  ] = js.undefined
  
  var filter: js.UndefOr[
    SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: <S extends any>(predicate : (value : any, index : number, array : std.Array<any>): value is S): std.Array<S> extends object ? cypress.cypress/types/sinon.MatchArguments<<S extends any>(predicate : (value : any, index : number, array : std.Array<any>): value is S): std.Array<S>> : never */ js.Any) | (js.Function1[
      /* predicate */ js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], /* is any */ Boolean], 
      js.Array[Any]
    ])
  ] = js.undefined
  
  var find: js.UndefOr[
    SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: <S extends any>(predicate : (value : any, index : number, obj : std.Array<any>): value is S): S | undefined extends object ? cypress.cypress/types/sinon.MatchArguments<<S extends any>(predicate : (value : any, index : number, obj : std.Array<any>): value is S): S | undefined> : never */ js.Any) | (js.Function1[
      /* predicate */ js.Function3[/* value */ Any, /* index */ Double, /* obj */ js.Array[Any], /* is any */ Boolean], 
      js.UndefOr[Any]
    ])
  ] = js.undefined
  
  var findIndex: js.UndefOr[
    SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (predicate : (value : any, index : number, obj : std.Array<any>): unknown): number extends object ? cypress.cypress/types/sinon.MatchArguments<(predicate : (value : any, index : number, obj : std.Array<any>): unknown): number> : never */ js.Any) | (js.Function1[
      /* predicate */ js.Function3[/* value */ Any, /* index */ Double, /* obj */ js.Array[Any], Any], 
      Double
    ])
  ] = js.undefined
  
  var findLast: js.UndefOr[
    SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: <S extends any>(predicate : (value : any, index : number, array : std.Array<any>): value is S): S | undefined extends object ? cypress.cypress/types/sinon.MatchArguments<<S extends any>(predicate : (value : any, index : number, array : std.Array<any>): value is S): S | undefined> : never */ js.Any) | (js.Function1[
      /* predicate */ js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], /* is any */ Boolean], 
      js.UndefOr[Any]
    ])
  ] = js.undefined
  
  var findLastIndex: js.UndefOr[
    SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (predicate : (value : any, index : number, array : std.Array<any>): unknown): number extends object ? cypress.cypress/types/sinon.MatchArguments<(predicate : (value : any, index : number, array : std.Array<any>): unknown): number> : never */ js.Any) | (js.Function1[
      /* predicate */ js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], Any], 
      Double
    ])
  ] = js.undefined
  
  var flat: js.UndefOr[
    SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: <A, D extends number = 1>(this : A): std.Array<std.FlatArray<A, D>> extends object ? cypress.cypress/types/sinon.MatchArguments<<A, D extends number = 1>(this : A): std.Array<std.FlatArray<A, D>>> : never */ js.Any) | (js.ThisFunction0[/* this */ Any, js.Array[FlatArray[Any, typings.cypress.cypressInts.`1`]]])
  ] = js.undefined
  
  var flatMap: js.UndefOr[
    SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: <U, This = undefined>(callback : (this : This, value : any, index : number, array : std.Array<any>): U | std.ReadonlyArray<U>): std.Array<U> extends object ? cypress.cypress/types/sinon.MatchArguments<<U, This = undefined>(callback : (this : This, value : any, index : number, array : std.Array<any>): U | std.ReadonlyArray<U>): std.Array<U>> : never */ js.Any) | (js.Function1[
      /* callback */ js.ThisFunction3[
        /* this */ Unit, 
        /* value */ Any, 
        /* index */ Double, 
        /* array */ js.Array[Any], 
        Any | js.Array[Any]
      ], 
      js.Array[Any]
    ])
  ] = js.undefined
  
  var forEach: js.UndefOr[
    SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (callbackfn : (value : any, index : number, array : std.Array<any>): void): void extends object ? cypress.cypress/types/sinon.MatchArguments<(callbackfn : (value : any, index : number, array : std.Array<any>): void): void> : never */ js.Any) | (js.Function1[
      /* callbackfn */ js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], Unit], 
      Unit
    ])
  ] = js.undefined
  
  var includes: js.UndefOr[
    SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (searchElement : any): boolean extends object ? cypress.cypress/types/sinon.MatchArguments<(searchElement : any): boolean> : never */ js.Any) | (js.Function1[/* searchElement */ Any, Boolean])
  ] = js.undefined
  
  var indexOf: js.UndefOr[
    SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (searchElement : any): number extends object ? cypress.cypress/types/sinon.MatchArguments<(searchElement : any): number> : never */ js.Any) | (js.Function1[/* searchElement */ Any, Double])
  ] = js.undefined
  
  var join: js.UndefOr[
    SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): string extends object ? cypress.cypress/types/sinon.MatchArguments<(): string> : never */ js.Any) | js.Function0[String]
  ] = js.undefined
  
  var keys: js.UndefOr[
    SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): std.IterableIterator<number> extends object ? cypress.cypress/types/sinon.MatchArguments<(): std.IterableIterator<number>> : never */ js.Any) | js.Function0[IterableIterator[Double]]
  ] = js.undefined
  
  var lastIndexOf: js.UndefOr[
    SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (searchElement : any): number extends object ? cypress.cypress/types/sinon.MatchArguments<(searchElement : any): number> : never */ js.Any) | (js.Function1[/* searchElement */ Any, Double])
  ] = js.undefined
  
  var length: js.UndefOr[
    SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: number extends object ? cypress.cypress/types/sinon.MatchArguments<number> : never */ js.Any) | Double
  ] = js.undefined
  
  var map: js.UndefOr[
    SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: <U>(callbackfn : (value : any, index : number, array : std.Array<any>): U): std.Array<U> extends object ? cypress.cypress/types/sinon.MatchArguments<<U>(callbackfn : (value : any, index : number, array : std.Array<any>): U): std.Array<U>> : never */ js.Any) | (js.Function1[
      /* callbackfn */ js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], Any], 
      js.Array[Any]
    ])
  ] = js.undefined
  
  var pop: js.UndefOr[
    SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): any | undefined extends object ? cypress.cypress/types/sinon.MatchArguments<(): any | undefined> : never */ js.Any) | js.Function0[js.UndefOr[Any]]
  ] = js.undefined
  
  var push: js.UndefOr[
    SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (items : ...any): number extends object ? cypress.cypress/types/sinon.MatchArguments<(items : ...any): number> : never */ js.Any) | (js.Function1[/* repeated */ Any, Double])
  ] = js.undefined
  
  var reduce: js.UndefOr[
    SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (callbackfn : (previousValue : any, currentValue : any, currentIndex : number, array : std.Array<any>): any): any extends object ? cypress.cypress/types/sinon.MatchArguments<(callbackfn : (previousValue : any, currentValue : any, currentIndex : number, array : std.Array<any>): any): any> : never */ js.Any) | (js.Function1[
      /* callbackfn */ js.Function4[
        /* previousValue */ Any, 
        /* currentValue */ Any, 
        /* currentIndex */ Double, 
        /* array */ js.Array[Any], 
        Any
      ], 
      Any
    ])
  ] = js.undefined
  
  var reduceRight: js.UndefOr[
    SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (callbackfn : (previousValue : any, currentValue : any, currentIndex : number, array : std.Array<any>): any): any extends object ? cypress.cypress/types/sinon.MatchArguments<(callbackfn : (previousValue : any, currentValue : any, currentIndex : number, array : std.Array<any>): any): any> : never */ js.Any) | (js.Function1[
      /* callbackfn */ js.Function4[
        /* previousValue */ Any, 
        /* currentValue */ Any, 
        /* currentIndex */ Double, 
        /* array */ js.Array[Any], 
        Any
      ], 
      Any
    ])
  ] = js.undefined
  
  var reverse: js.UndefOr[
    SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): std.Array<any> extends object ? cypress.cypress/types/sinon.MatchArguments<(): std.Array<any>> : never */ js.Any) | js.Function0[js.Array[Any]]
  ] = js.undefined
  
  var shift: js.UndefOr[
    SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): any | undefined extends object ? cypress.cypress/types/sinon.MatchArguments<(): any | undefined> : never */ js.Any) | js.Function0[js.UndefOr[Any]]
  ] = js.undefined
  
  var slice: js.UndefOr[
    SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): std.Array<any> extends object ? cypress.cypress/types/sinon.MatchArguments<(): std.Array<any>> : never */ js.Any) | js.Function0[js.Array[Any]]
  ] = js.undefined
  
  var some: js.UndefOr[
    SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (predicate : (value : any, index : number, array : std.Array<any>): unknown): boolean extends object ? cypress.cypress/types/sinon.MatchArguments<(predicate : (value : any, index : number, array : std.Array<any>): unknown): boolean> : never */ js.Any) | (js.Function1[
      /* predicate */ js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], Any], 
      Boolean
    ])
  ] = js.undefined
  
  var sort: js.UndefOr[
    SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): this extends object ? cypress.cypress/types/sinon.MatchArguments<(): this> : never */ js.Any) | js.Function0[this.type]
  ] = js.undefined
  
  var splice: js.UndefOr[
    SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (start : number): std.Array<any> extends object ? cypress.cypress/types/sinon.MatchArguments<(start : number): std.Array<any>> : never */ js.Any) | (js.Function1[/* start */ Double, js.Array[Any]])
  ] = js.undefined
  
  @JSName("toLocaleString")
  var toLocaleString_FPartialMatchArgumentsArra: js.UndefOr[
    SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): string extends object ? cypress.cypress/types/sinon.MatchArguments<(): string> : never */ js.Any) | js.Function0[String]
  ] = js.undefined
  
  @JSName("toString")
  var toString_FPartialMatchArgumentsArra: js.UndefOr[
    SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): string extends object ? cypress.cypress/types/sinon.MatchArguments<(): string> : never */ js.Any) | js.Function0[String]
  ] = js.undefined
  
  var unshift: js.UndefOr[
    SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (items : ...any): number extends object ? cypress.cypress/types/sinon.MatchArguments<(items : ...any): number> : never */ js.Any) | (js.Function1[/* repeated */ Any, Double])
  ] = js.undefined
  
  var values: js.UndefOr[
    SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): std.IterableIterator<any> extends object ? cypress.cypress/types/sinon.MatchArguments<(): std.IterableIterator<any>> : never */ js.Any) | js.Function0[IterableIterator[Any]]
  ] = js.undefined
}
object PartialMatchArgumentsArra {
  
  inline def apply(): PartialMatchArgumentsArra = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMatchArgumentsArra]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialMatchArgumentsArra] (val x: Self) extends AnyVal {
    
    inline def setAt(
      value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (index : number): any | undefined extends object ? cypress.cypress/types/sinon.MatchArguments<(index : number): any | undefined> : never */ js.Any) | (js.Function1[/* index */ Double, js.UndefOr[Any]])
    ): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
    
    inline def setAtFunction1(value: /* index */ Double => js.UndefOr[Any]): Self = StObject.set(x, "at", js.Any.fromFunction1(value))
    
    inline def setAtUndefined: Self = StObject.set(x, "at", js.undefined)
    
    inline def setConcat(
      value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (items : ...std.ConcatArray<any>): std.Array<any> extends object ? cypress.cypress/types/sinon.MatchArguments<(items : ...std.ConcatArray<any>): std.Array<any>> : never */ js.Any) | (js.Function1[/* repeated */ js.Array[Any], js.Array[Any]])
    ): Self = StObject.set(x, "concat", value.asInstanceOf[js.Any])
    
    inline def setConcatFunction1(value: /* repeated */ js.Array[Any] => js.Array[Any]): Self = StObject.set(x, "concat", js.Any.fromFunction1(value))
    
    inline def setConcatUndefined: Self = StObject.set(x, "concat", js.undefined)
    
    inline def setCopyWithin(
      value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (target : number, start : number): this extends object ? cypress.cypress/types/sinon.MatchArguments<(target : number, start : number): this> : never */ js.Any) | (js.Function2[/* target */ Double, /* start */ Double, PartialMatchArgumentsArra])
    ): Self = StObject.set(x, "copyWithin", value.asInstanceOf[js.Any])
    
    inline def setCopyWithinFunction2(value: (/* target */ Double, /* start */ Double) => PartialMatchArgumentsArra): Self = StObject.set(x, "copyWithin", js.Any.fromFunction2(value))
    
    inline def setCopyWithinUndefined: Self = StObject.set(x, "copyWithin", js.undefined)
    
    inline def setEntries(
      value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): std.IterableIterator<[number, any]> extends object ? cypress.cypress/types/sinon.MatchArguments<(): std.IterableIterator<[number, any]>> : never */ js.Any) | (js.Function0[IterableIterator[js.Tuple2[Double, Any]]])
    ): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesFunction0(value: () => IterableIterator[js.Tuple2[Double, Any]]): Self = StObject.set(x, "entries", js.Any.fromFunction0(value))
    
    inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    inline def setEvery(
      value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: <S extends any>(predicate : (value : any, index : number, array : std.Array<any>): value is S): this is std.Array<S> extends object ? cypress.cypress/types/sinon.MatchArguments<<S extends any>(predicate : (value : any, index : number, array : std.Array<any>): value is S): this is std.Array<S>> : never */ js.Any) | (js.Function1[
          /* predicate */ js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], /* is any */ Boolean], 
          /* is std.Array<any> */ Boolean
        ])
    ): Self = StObject.set(x, "every", value.asInstanceOf[js.Any])
    
    inline def setEveryFunction1(
      value: /* predicate */ js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], /* is any */ Boolean] => /* is std.Array<any> */ Boolean
    ): Self = StObject.set(x, "every", js.Any.fromFunction1(value))
    
    inline def setEveryUndefined: Self = StObject.set(x, "every", js.undefined)
    
    inline def setFill(
      value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (value : any): this extends object ? cypress.cypress/types/sinon.MatchArguments<(value : any): this> : never */ js.Any) | (js.Function1[/* value */ Any, PartialMatchArgumentsArra])
    ): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillFunction1(value: /* value */ Any => PartialMatchArgumentsArra): Self = StObject.set(x, "fill", js.Any.fromFunction1(value))
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setFilter(
      value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: <S extends any>(predicate : (value : any, index : number, array : std.Array<any>): value is S): std.Array<S> extends object ? cypress.cypress/types/sinon.MatchArguments<<S extends any>(predicate : (value : any, index : number, array : std.Array<any>): value is S): std.Array<S>> : never */ js.Any) | (js.Function1[
          /* predicate */ js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], /* is any */ Boolean], 
          js.Array[Any]
        ])
    ): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterFunction1(
      value: /* predicate */ js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], /* is any */ Boolean] => js.Array[Any]
    ): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFind(
      value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: <S extends any>(predicate : (value : any, index : number, obj : std.Array<any>): value is S): S | undefined extends object ? cypress.cypress/types/sinon.MatchArguments<<S extends any>(predicate : (value : any, index : number, obj : std.Array<any>): value is S): S | undefined> : never */ js.Any) | (js.Function1[
          /* predicate */ js.Function3[/* value */ Any, /* index */ Double, /* obj */ js.Array[Any], /* is any */ Boolean], 
          js.UndefOr[Any]
        ])
    ): Self = StObject.set(x, "find", value.asInstanceOf[js.Any])
    
    inline def setFindFunction1(
      value: /* predicate */ js.Function3[/* value */ Any, /* index */ Double, /* obj */ js.Array[Any], /* is any */ Boolean] => js.UndefOr[Any]
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
    
    inline def setFindIndexUndefined: Self = StObject.set(x, "findIndex", js.undefined)
    
    inline def setFindLast(
      value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: <S extends any>(predicate : (value : any, index : number, array : std.Array<any>): value is S): S | undefined extends object ? cypress.cypress/types/sinon.MatchArguments<<S extends any>(predicate : (value : any, index : number, array : std.Array<any>): value is S): S | undefined> : never */ js.Any) | (js.Function1[
          /* predicate */ js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], /* is any */ Boolean], 
          js.UndefOr[Any]
        ])
    ): Self = StObject.set(x, "findLast", value.asInstanceOf[js.Any])
    
    inline def setFindLastFunction1(
      value: /* predicate */ js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], /* is any */ Boolean] => js.UndefOr[Any]
    ): Self = StObject.set(x, "findLast", js.Any.fromFunction1(value))
    
    inline def setFindLastIndex(
      value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (predicate : (value : any, index : number, array : std.Array<any>): unknown): number extends object ? cypress.cypress/types/sinon.MatchArguments<(predicate : (value : any, index : number, array : std.Array<any>): unknown): number> : never */ js.Any) | (js.Function1[
          /* predicate */ js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], Any], 
          Double
        ])
    ): Self = StObject.set(x, "findLastIndex", value.asInstanceOf[js.Any])
    
    inline def setFindLastIndexFunction1(
      value: /* predicate */ js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], Any] => Double
    ): Self = StObject.set(x, "findLastIndex", js.Any.fromFunction1(value))
    
    inline def setFindLastIndexUndefined: Self = StObject.set(x, "findLastIndex", js.undefined)
    
    inline def setFindLastUndefined: Self = StObject.set(x, "findLast", js.undefined)
    
    inline def setFindUndefined: Self = StObject.set(x, "find", js.undefined)
    
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
    
    inline def setFlatMapUndefined: Self = StObject.set(x, "flatMap", js.undefined)
    
    inline def setFlatUndefined: Self = StObject.set(x, "flat", js.undefined)
    
    inline def setForEach(
      value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (callbackfn : (value : any, index : number, array : std.Array<any>): void): void extends object ? cypress.cypress/types/sinon.MatchArguments<(callbackfn : (value : any, index : number, array : std.Array<any>): void): void> : never */ js.Any) | (js.Function1[
          /* callbackfn */ js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], Unit], 
          Unit
        ])
    ): Self = StObject.set(x, "forEach", value.asInstanceOf[js.Any])
    
    inline def setForEachFunction1(
      value: /* callbackfn */ js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], Unit] => Unit
    ): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
    
    inline def setForEachUndefined: Self = StObject.set(x, "forEach", js.undefined)
    
    inline def setIncludes(
      value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (searchElement : any): boolean extends object ? cypress.cypress/types/sinon.MatchArguments<(searchElement : any): boolean> : never */ js.Any) | (js.Function1[/* searchElement */ Any, Boolean])
    ): Self = StObject.set(x, "includes", value.asInstanceOf[js.Any])
    
    inline def setIncludesFunction1(value: /* searchElement */ Any => Boolean): Self = StObject.set(x, "includes", js.Any.fromFunction1(value))
    
    inline def setIncludesUndefined: Self = StObject.set(x, "includes", js.undefined)
    
    inline def setIndexOf(
      value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (searchElement : any): number extends object ? cypress.cypress/types/sinon.MatchArguments<(searchElement : any): number> : never */ js.Any) | (js.Function1[/* searchElement */ Any, Double])
    ): Self = StObject.set(x, "indexOf", value.asInstanceOf[js.Any])
    
    inline def setIndexOfFunction1(value: /* searchElement */ Any => Double): Self = StObject.set(x, "indexOf", js.Any.fromFunction1(value))
    
    inline def setIndexOfUndefined: Self = StObject.set(x, "indexOf", js.undefined)
    
    inline def setJoin(
      value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): string extends object ? cypress.cypress/types/sinon.MatchArguments<(): string> : never */ js.Any) | js.Function0[String]
    ): Self = StObject.set(x, "join", value.asInstanceOf[js.Any])
    
    inline def setJoinFunction0(value: () => String): Self = StObject.set(x, "join", js.Any.fromFunction0(value))
    
    inline def setJoinUndefined: Self = StObject.set(x, "join", js.undefined)
    
    inline def setKeys(
      value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): std.IterableIterator<number> extends object ? cypress.cypress/types/sinon.MatchArguments<(): std.IterableIterator<number>> : never */ js.Any) | js.Function0[IterableIterator[Double]]
    ): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysFunction0(value: () => IterableIterator[Double]): Self = StObject.set(x, "keys", js.Any.fromFunction0(value))
    
    inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    inline def setLastIndexOf(
      value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (searchElement : any): number extends object ? cypress.cypress/types/sinon.MatchArguments<(searchElement : any): number> : never */ js.Any) | (js.Function1[/* searchElement */ Any, Double])
    ): Self = StObject.set(x, "lastIndexOf", value.asInstanceOf[js.Any])
    
    inline def setLastIndexOfFunction1(value: /* searchElement */ Any => Double): Self = StObject.set(x, "lastIndexOf", js.Any.fromFunction1(value))
    
    inline def setLastIndexOfUndefined: Self = StObject.set(x, "lastIndexOf", js.undefined)
    
    inline def setLength(
      value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: number extends object ? cypress.cypress/types/sinon.MatchArguments<number> : never */ js.Any) | Double
    ): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setMap(
      value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: <U>(callbackfn : (value : any, index : number, array : std.Array<any>): U): std.Array<U> extends object ? cypress.cypress/types/sinon.MatchArguments<<U>(callbackfn : (value : any, index : number, array : std.Array<any>): U): std.Array<U>> : never */ js.Any) | (js.Function1[
          /* callbackfn */ js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], Any], 
          js.Array[Any]
        ])
    ): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapFunction1(
      value: /* callbackfn */ js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], Any] => js.Array[Any]
    ): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    inline def setPop(
      value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): any | undefined extends object ? cypress.cypress/types/sinon.MatchArguments<(): any | undefined> : never */ js.Any) | js.Function0[js.UndefOr[Any]]
    ): Self = StObject.set(x, "pop", value.asInstanceOf[js.Any])
    
    inline def setPopFunction0(value: () => js.UndefOr[Any]): Self = StObject.set(x, "pop", js.Any.fromFunction0(value))
    
    inline def setPopUndefined: Self = StObject.set(x, "pop", js.undefined)
    
    inline def setPush(
      value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (items : ...any): number extends object ? cypress.cypress/types/sinon.MatchArguments<(items : ...any): number> : never */ js.Any) | (js.Function1[/* repeated */ Any, Double])
    ): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
    
    inline def setPushFunction1(value: /* repeated */ Any => Double): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
    
    inline def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
    
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
    
    inline def setReduceRightUndefined: Self = StObject.set(x, "reduceRight", js.undefined)
    
    inline def setReduceUndefined: Self = StObject.set(x, "reduce", js.undefined)
    
    inline def setReverse(
      value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): std.Array<any> extends object ? cypress.cypress/types/sinon.MatchArguments<(): std.Array<any>> : never */ js.Any) | js.Function0[js.Array[Any]]
    ): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    inline def setReverseFunction0(value: () => js.Array[Any]): Self = StObject.set(x, "reverse", js.Any.fromFunction0(value))
    
    inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    
    inline def setShift(
      value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): any | undefined extends object ? cypress.cypress/types/sinon.MatchArguments<(): any | undefined> : never */ js.Any) | js.Function0[js.UndefOr[Any]]
    ): Self = StObject.set(x, "shift", value.asInstanceOf[js.Any])
    
    inline def setShiftFunction0(value: () => js.UndefOr[Any]): Self = StObject.set(x, "shift", js.Any.fromFunction0(value))
    
    inline def setShiftUndefined: Self = StObject.set(x, "shift", js.undefined)
    
    inline def setSlice(
      value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): std.Array<any> extends object ? cypress.cypress/types/sinon.MatchArguments<(): std.Array<any>> : never */ js.Any) | js.Function0[js.Array[Any]]
    ): Self = StObject.set(x, "slice", value.asInstanceOf[js.Any])
    
    inline def setSliceFunction0(value: () => js.Array[Any]): Self = StObject.set(x, "slice", js.Any.fromFunction0(value))
    
    inline def setSliceUndefined: Self = StObject.set(x, "slice", js.undefined)
    
    inline def setSome(
      value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (predicate : (value : any, index : number, array : std.Array<any>): unknown): boolean extends object ? cypress.cypress/types/sinon.MatchArguments<(predicate : (value : any, index : number, array : std.Array<any>): unknown): boolean> : never */ js.Any) | (js.Function1[
          /* predicate */ js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], Any], 
          Boolean
        ])
    ): Self = StObject.set(x, "some", value.asInstanceOf[js.Any])
    
    inline def setSomeFunction1(
      value: /* predicate */ js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], Any] => Boolean
    ): Self = StObject.set(x, "some", js.Any.fromFunction1(value))
    
    inline def setSomeUndefined: Self = StObject.set(x, "some", js.undefined)
    
    inline def setSort(
      value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): this extends object ? cypress.cypress/types/sinon.MatchArguments<(): this> : never */ js.Any) | js.Function0[PartialMatchArgumentsArra]
    ): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortFunction0(value: () => PartialMatchArgumentsArra): Self = StObject.set(x, "sort", js.Any.fromFunction0(value))
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setSplice(
      value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (start : number): std.Array<any> extends object ? cypress.cypress/types/sinon.MatchArguments<(start : number): std.Array<any>> : never */ js.Any) | (js.Function1[/* start */ Double, js.Array[Any]])
    ): Self = StObject.set(x, "splice", value.asInstanceOf[js.Any])
    
    inline def setSpliceFunction1(value: /* start */ Double => js.Array[Any]): Self = StObject.set(x, "splice", js.Any.fromFunction1(value))
    
    inline def setSpliceUndefined: Self = StObject.set(x, "splice", js.undefined)
    
    inline def setToLocaleString(
      value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): string extends object ? cypress.cypress/types/sinon.MatchArguments<(): string> : never */ js.Any) | js.Function0[String]
    ): Self = StObject.set(x, "toLocaleString", value.asInstanceOf[js.Any])
    
    inline def setToLocaleStringFunction0(value: () => String): Self = StObject.set(x, "toLocaleString", js.Any.fromFunction0(value))
    
    inline def setToLocaleStringUndefined: Self = StObject.set(x, "toLocaleString", js.undefined)
    
    inline def setToString_(
      value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): string extends object ? cypress.cypress/types/sinon.MatchArguments<(): string> : never */ js.Any) | js.Function0[String]
    ): Self = StObject.set(x, "toString", value.asInstanceOf[js.Any])
    
    inline def setToString_Function0(value: () => String): Self = StObject.set(x, "toString", js.Any.fromFunction0(value))
    
    inline def setToString_Undefined: Self = StObject.set(x, "toString", js.undefined)
    
    inline def setUnshift(
      value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (items : ...any): number extends object ? cypress.cypress/types/sinon.MatchArguments<(items : ...any): number> : never */ js.Any) | (js.Function1[/* repeated */ Any, Double])
    ): Self = StObject.set(x, "unshift", value.asInstanceOf[js.Any])
    
    inline def setUnshiftFunction1(value: /* repeated */ Any => Double): Self = StObject.set(x, "unshift", js.Any.fromFunction1(value))
    
    inline def setUnshiftUndefined: Self = StObject.set(x, "unshift", js.undefined)
    
    inline def setValues(
      value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): std.IterableIterator<any> extends object ? cypress.cypress/types/sinon.MatchArguments<(): std.IterableIterator<any>> : never */ js.Any) | js.Function0[IterableIterator[Any]]
    ): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesFunction0(value: () => IterableIterator[Any]): Self = StObject.set(x, "values", js.Any.fromFunction0(value))
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
  }
}
