package typings.camelcaseKeys

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply[T /* <: StringDictionary[js.Any] */](input: T): T = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def apply[T /* <: StringDictionary[js.Any] */](input: T, options: Options): T = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @JSImport("camelcase-keys", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /**
    		Recurse nested objects and objects in arrays.
    		@default false
    		*/
    val deep: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Exclude keys from being camel-cased.
    		@default []
    		*/
    val exclude: js.UndefOr[js.Array[String | RegExp]] = js.undefined
    
    /**
    		Uppercase the first character as in `bye-bye` → `ByeBye`.
    		@default false
    		*/
    val pascalCase: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Exclude children at the given object paths in dot-notation from being camel-cased. For example, with an object like `{a: {b: '🦄'}}`, the object path to reach the unicorn is `'a.b'`.
    		@default []
    		@example
    		```
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
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeep(value: Boolean): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeepUndefined: Self = StObject.set(x, "deep", js.undefined)
      
      @scala.inline
      def setExclude(value: js.Array[String | RegExp]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      @scala.inline
      def setExcludeVarargs(value: (String | RegExp)*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      @scala.inline
      def setPascalCase(value: Boolean): Self = StObject.set(x, "pascalCase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPascalCaseUndefined: Self = StObject.set(x, "pascalCase", js.undefined)
      
      @scala.inline
      def setStopPaths(value: js.Array[String]): Self = StObject.set(x, "stopPaths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopPathsUndefined: Self = StObject.set(x, "stopPaths", js.undefined)
      
      @scala.inline
      def setStopPathsVarargs(value: String*): Self = StObject.set(x, "stopPaths", js.Array(value :_*))
    }
  }
}
