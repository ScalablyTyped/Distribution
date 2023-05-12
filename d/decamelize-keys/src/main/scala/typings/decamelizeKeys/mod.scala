package typings.decamelizeKeys

import typings.decamelizeKeys.decamelizeKeysBooleans.`false`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("decamelize-keys", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T /* <: (Record[String, Any]) | js.Array[Any] */, Separator /* <: String */, OptionsType /* <: Options[Separator] */](input: T): DecamelizeKeys[
    T, 
    Separator, 
    WithDefault[
      /* import warning: importer.ImportType#apply Failed type conversion: OptionsType['exclude'] */ js.Any, 
      EmptyTuple
    ], 
    WithDefault[
      /* import warning: importer.ImportType#apply Failed type conversion: OptionsType['deep'] */ js.Any, 
      `false`
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any]).asInstanceOf[DecamelizeKeys[
    T, 
    Separator, 
    WithDefault[
      /* import warning: importer.ImportType#apply Failed type conversion: OptionsType['exclude'] */ js.Any, 
      EmptyTuple
    ], 
    WithDefault[
      /* import warning: importer.ImportType#apply Failed type conversion: OptionsType['deep'] */ js.Any, 
      `false`
    ]
  ]]
  inline def default[T /* <: (Record[String, Any]) | js.Array[Any] */, Separator /* <: String */, OptionsType /* <: Options[Separator] */](input: T, options: Options[Separator]): DecamelizeKeys[
    T, 
    Separator, 
    WithDefault[
      /* import warning: importer.ImportType#apply Failed type conversion: OptionsType['exclude'] */ js.Any, 
      EmptyTuple
    ], 
    WithDefault[
      /* import warning: importer.ImportType#apply Failed type conversion: OptionsType['deep'] */ js.Any, 
      `false`
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DecamelizeKeys[
    T, 
    Separator, 
    WithDefault[
      /* import warning: importer.ImportType#apply Failed type conversion: OptionsType['exclude'] */ js.Any, 
      EmptyTuple
    ], 
    WithDefault[
      /* import warning: importer.ImportType#apply Failed type conversion: OptionsType['deep'] */ js.Any, 
      `false`
    ]
  ]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends std.Array<any> ? {[ P in keyof T ]: T[P] extends std.Record<string, any> | std.Array<any>? {} extends decamelize-keys.decamelize-keys.DecamelizeKeys<T[P], Separator, decamelize-keys.decamelize-keys.EmptyTuple, false>? T[P] : decamelize-keys.decamelize-keys.DecamelizeKeys<T[P], Separator, Exclude, Deep> : T[P]} : T extends std.Record<string, any> ? {[ P in keyof T as [decamelize-keys.decamelize-keys.IsInclude<Exclude, P>] extends [true]? P : type-fest.type-fest/source/delimiter-case.DelimiterCase<P, Separator> ]: std.Record<string, unknown> extends decamelize-keys.decamelize-keys.DecamelizeKeys<T[P], '_', decamelize-keys.decamelize-keys.EmptyTuple, false>? T[P] : [Deep] extends [true]? decamelize-keys.decamelize-keys.DecamelizeKeys<T[P], Separator, Exclude, Deep> : T[P]} : T
    }}}
    */
  type DecamelizeKeys[T /* <: (Record[String, Any]) | js.Array[Any] */, Separator /* <: String */, Exclude /* <: js.Array[Any] */, Deep /* <: Boolean */] = T
  
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
    List extends undefined ? false : List extends std.Readonly<decamelize-keys.decamelize-keys.EmptyTuple> ? false : List extends [infer First, ...infer Rest] ? First extends Target ? true : decamelize-keys.decamelize-keys.IsInclude<Rest, Target> : boolean
    }}}
    */
  type IsInclude[List /* <: js.Array[Any] */, Target] = `false`
  
  trait Options[Separator] extends StObject {
    
    /**
    	Recurse nested objects and objects in arrays.
    	@default false
    	@example
    	```
    	import decamelizeKeys from 'decamelize-keys';
    	decamelizeKeys({fooBar: true, nested: {unicornRainbow: true}}, {deep: true});
    	//=> {foo_bar: true, nested: {unicorn_rainbow: true}}
    	```
    	*/
    val deep: js.UndefOr[Boolean] = js.undefined
    
    /**
    	Exclude keys from being camel-cased.
    	If this option can be statically determined, it's recommended to add `as const` to it.
    	@default []
    	*/
    val exclude: js.UndefOr[js.Array[String | js.RegExp]] = js.undefined
    
    /**
    	The character or string used to separate words.
    	Important: You must use `as const` on the value.
    	@default '_'
    	@example
    	```
    	import decamelizeKeys from 'decamelize-keys';
    	decamelizeKeys({fooBar: true});
    	//=> {foo_bar: true}
    	decamelizeKeys({fooBar: true}, {separator: '-' as const});
    	//=> {'foo-bar': true}
    	```
    	*/
    val separator: js.UndefOr[Separator] = js.undefined
  }
  object Options {
    
    inline def apply[Separator](): Options[Separator] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[Separator]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options[?], Separator] (val x: Self & Options[Separator]) extends AnyVal {
      
      inline def setDeep(value: Boolean): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
      
      inline def setDeepUndefined: Self = StObject.set(x, "deep", js.undefined)
      
      inline def setExclude(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "exclude", js.Array(value*))
      
      inline def setSeparator(value: Separator): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
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
