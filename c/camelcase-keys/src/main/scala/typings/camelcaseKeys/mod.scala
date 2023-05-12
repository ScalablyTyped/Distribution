package typings.camelcaseKeys

import typings.camelcaseKeys.camelcaseKeysBooleans.`false`
import typings.camelcaseKeys.camelcaseKeysStrings._empty
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("camelcase-keys", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T /* <: (Record[String, Any]) | js.Array[Any] */, OptionsType /* <: Options */](input: T): CamelCaseKeys[
    T, 
    WithDefault[
      /* import warning: importer.ImportType#apply Failed type conversion: OptionsType['deep'] */ js.Any, 
      `false`
    ], 
    WithDefault[
      /* import warning: importer.ImportType#apply Failed type conversion: OptionsType['pascalCase'] */ js.Any, 
      `false`
    ], 
    WithDefault[
      /* import warning: importer.ImportType#apply Failed type conversion: OptionsType['exclude'] */ js.Any, 
      EmptyTuple
    ], 
    WithDefault[
      /* import warning: importer.ImportType#apply Failed type conversion: OptionsType['stopPaths'] */ js.Any, 
      EmptyTuple
    ], 
    _empty
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any]).asInstanceOf[CamelCaseKeys[
    T, 
    WithDefault[
      /* import warning: importer.ImportType#apply Failed type conversion: OptionsType['deep'] */ js.Any, 
      `false`
    ], 
    WithDefault[
      /* import warning: importer.ImportType#apply Failed type conversion: OptionsType['pascalCase'] */ js.Any, 
      `false`
    ], 
    WithDefault[
      /* import warning: importer.ImportType#apply Failed type conversion: OptionsType['exclude'] */ js.Any, 
      EmptyTuple
    ], 
    WithDefault[
      /* import warning: importer.ImportType#apply Failed type conversion: OptionsType['stopPaths'] */ js.Any, 
      EmptyTuple
    ], 
    _empty
  ]]
  inline def default[T /* <: (Record[String, Any]) | js.Array[Any] */, OptionsType /* <: Options */](input: T, options: OptionsType): CamelCaseKeys[
    T, 
    WithDefault[
      /* import warning: importer.ImportType#apply Failed type conversion: OptionsType['deep'] */ js.Any, 
      `false`
    ], 
    WithDefault[
      /* import warning: importer.ImportType#apply Failed type conversion: OptionsType['pascalCase'] */ js.Any, 
      `false`
    ], 
    WithDefault[
      /* import warning: importer.ImportType#apply Failed type conversion: OptionsType['exclude'] */ js.Any, 
      EmptyTuple
    ], 
    WithDefault[
      /* import warning: importer.ImportType#apply Failed type conversion: OptionsType['stopPaths'] */ js.Any, 
      EmptyTuple
    ], 
    _empty
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CamelCaseKeys[
    T, 
    WithDefault[
      /* import warning: importer.ImportType#apply Failed type conversion: OptionsType['deep'] */ js.Any, 
      `false`
    ], 
    WithDefault[
      /* import warning: importer.ImportType#apply Failed type conversion: OptionsType['pascalCase'] */ js.Any, 
      `false`
    ], 
    WithDefault[
      /* import warning: importer.ImportType#apply Failed type conversion: OptionsType['exclude'] */ js.Any, 
      EmptyTuple
    ], 
    WithDefault[
      /* import warning: importer.ImportType#apply Failed type conversion: OptionsType['stopPaths'] */ js.Any, 
      EmptyTuple
    ], 
    _empty
  ]]
  
  /**
  Append a segment to dot-notation path.
  */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    S extends '' ? Last : / * template literal string: ${S}.${Last} * / string
    }}}
    */
  type AppendPath[S /* <: String */, Last /* <: String */] = Last
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends std.Array<any> ? {[ P in keyof T ]: T[P] extends std.Record<string, any> | std.Array<any>? {} extends camelcase-keys.camelcase-keys.CamelCaseKeys<T[P], false, false, camelcase-keys.camelcase-keys.EmptyTuple, camelcase-keys.camelcase-keys.EmptyTuple, ''>? T[P] : camelcase-keys.camelcase-keys.CamelCaseKeys<T[P], Deep, IsPascalCase, Exclude, StopPaths, ''> : T[P]} : T extends std.Record<string, any> ? {[ P in keyof T as [camelcase-keys.camelcase-keys.IsInclude<Exclude, P>] extends [true]? P : [IsPascalCase] extends [true]? type-fest.type-fest/source/pascal-case.PascalCase<P> : type-fest.type-fest/source/camel-case.CamelCase<P, type-fest.anon.PreserveConsecutiveUppercase> ]: [camelcase-keys.camelcase-keys.IsInclude<StopPaths, camelcase-keys.camelcase-keys.AppendPath<Path, P & string>>] extends [true]? T[P] : {} extends camelcase-keys.camelcase-keys.CamelCaseKeys<T[P], false, false, camelcase-keys.camelcase-keys.EmptyTuple, camelcase-keys.camelcase-keys.EmptyTuple, ''>? T[P] : [Deep] extends [true]? camelcase-keys.camelcase-keys.CamelCaseKeys<T[P], Deep, IsPascalCase, Exclude, StopPaths, camelcase-keys.camelcase-keys.AppendPath<Path, P & string>> : T[P]} : T
    }}}
    */
  type CamelCaseKeys[T /* <: (Record[String, Any]) | js.Array[Any] */, Deep /* <: Boolean */, IsPascalCase /* <: Boolean */, Exclude /* <: js.Array[Any] */, StopPaths /* <: js.Array[String] */, Path /* <: String */] = T
  
  // eslint-disable-next-line @typescript-eslint/ban-types
  type EmptyTuple = js.Array[Any]
  
  // eslint-disable-line @typescript-eslint/ban-types
  // TODO: Replace this with https://github.com/sindresorhus/type-fest/blob/main/source/includes.d.ts
  /**
  Check if an element is included in a tuple.
  */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    List extends undefined ? false : List extends std.Readonly<camelcase-keys.camelcase-keys.EmptyTuple> ? false : List extends [infer First, ...infer Rest] ? First extends Target ? true : camelcase-keys.camelcase-keys.IsInclude<Rest, Target> : boolean
    }}}
    */
  type IsInclude[List /* <: js.Array[Any] */, Target] = `false`
  
  trait Options extends StObject {
    
    /**
    	Recurse nested objects and objects in arrays.
    	@default false
    	*/
    val deep: js.UndefOr[Boolean] = js.undefined
    
    /**
    	Exclude keys from being camel-cased.
    	If this option can be statically determined, it's recommended to add `as const` to it.
    	@default []
    	*/
    val exclude: js.UndefOr[js.Array[String | js.RegExp]] = js.undefined
    
    /**
    	Uppercase the first character as in `bye-bye` → `ByeBye`.
    	@default false
    	*/
    val pascalCase: js.UndefOr[Boolean] = js.undefined
    
    /**
    	Exclude children at the given object paths in dot-notation from being camel-cased. For example, with an object like `{a: {b: '🦄'}}`, the object path to reach the unicorn is `'a.b'`.
    	If this option can be statically determined, it's recommended to add `as const` to it.
    	@default []
    	@example
    	```
    	import camelcaseKeys from 'camelcase-keys';
    	camelcaseKeys({
    		a_b: 1,
    		a_c: {
    			c_d: 1,
    			c_e: {
    				e_f: 1
    			}
    		}
    	}, {
    		deep: true,
    		stopPaths: [
    			'a_c.c_e'
    		]
    	}),
    	// {
    	// 	aB: 1,
    	// 	aC: {
    	// 		cD: 1,
    	// 		cE: {
    	// 			e_f: 1
    	// 		}
    	// 	}
    	// }
    	```
    	*/
    val stopPaths: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setDeep(value: Boolean): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
      
      inline def setDeepUndefined: Self = StObject.set(x, "deep", js.undefined)
      
      inline def setExclude(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "exclude", js.Array(value*))
      
      inline def setPascalCase(value: Boolean): Self = StObject.set(x, "pascalCase", value.asInstanceOf[js.Any])
      
      inline def setPascalCaseUndefined: Self = StObject.set(x, "pascalCase", js.undefined)
      
      inline def setStopPaths(value: js.Array[String]): Self = StObject.set(x, "stopPaths", value.asInstanceOf[js.Any])
      
      inline def setStopPathsUndefined: Self = StObject.set(x, "stopPaths", js.undefined)
      
      inline def setStopPathsVarargs(value: String*): Self = StObject.set(x, "stopPaths", js.Array(value*))
    }
  }
  
  /**
  Return a default type if input type is nil.
  @template T - Input type.
  @template U - Default type.
  */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends undefined | void | null ? U : T
    }}}
    */
  type WithDefault[T, U /* <: T */] = U
}
