package typings.braces

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("braces", JSImport.Namespace)
  @js.native
  val ^ : Braces = js.native
  
  @js.native
  trait Braces extends StObject {
    
    def apply(pattern: String): js.Array[String] = js.native
    def apply(pattern: String, options: Options): js.Array[String] = js.native
    
    def expand(pattern: String): js.Array[String] = js.native
  }
  
  trait Options extends StObject {
    
    /**
      * Generate an "expanded" brace pattern (alternatively you can use the `braces.expand()` method).
      *
      * @default undefined
      * @example
      * console.log(braces('a/{b,c}/d', { expand: true }));
      * //=> [ 'a/b/d', 'a/c/d' ]
      */
    var expand: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Limit the length of the input string. Useful when the input string is generated or your application allows
      * users to pass a string, et cetera.
      *
      * @default 65536
      * @example
      * console.log(braces('a/{b,c}/d', { maxLength: 3 }));
      * //=> throws an error
      */
    var maxLength: js.UndefOr[Double] = js.undefined
    
    /**
      * Remove duplicates from the returned array.
      *
      * @default undefined
      */
    var nodupes: js.UndefOr[Boolean] = js.undefined
    
    /**
      * In regular expressions, quanitifiers can be used to specify how many times a token can be repeated.
      * For example, `a{1,3}` will match the letter `a` one to three times.
      *
      * Unfortunately, regex quantifiers happen to share the same syntax as [Bash lists](#lists)
      *
      * The `quantifiers` option tells braces to detect when [regex quantifiers](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/RegExp#quantifiers)
      * are defined in the given pattern, and not to try to expand them as lists.
      *
      * @default undefined
      * @example
      * const braces = require('braces');
      * console.log(braces('a/b{1,3}/{x,y,z}'));
      * //=> [ 'a/b(1|3)/(x|y|z)' ]
      * console.log(braces('a/b{1,3}/{x,y,z}', {quantifiers: true}));
      * //=> [ 'a/b{1,3}/(x|y|z)' ]
      * console.log(braces('a/b{1,3}/{x,y,z}', {quantifiers: true, expand: true}));
      * //=> [ 'a/b{1,3}/x', 'a/b{1,3}/y', 'a/b{1,3}/z' ]
      */
    var quantifiers: js.UndefOr[Boolean] = js.undefined
    
    /**
      * To prevent malicious patterns from being passed by users, an error is thrown when `braces.expand()`
      * is used or `options.expand` is true and the generated range will exceed the `rangeLimit`.
      *
      * You can customize `options.rangeLimit` or set it to `Infinity` to disable this altogether.
      *
      * @default 1000
      * @example
      * // pattern exceeds the "rangeLimit", so it's optimized automatically
      * console.log(braces.expand('{1..1000}'));
      * //=> ['([1-9]|[1-9][0-9]{1,2}|1000)']
      *
      * // pattern does not exceed "rangeLimit", so it's NOT optimized
      * console.log(braces.expand('{1..100}'));
      * //=> ['1', '2', '3', '4', '5', …, '100']
      */
    var rangeLimit: js.UndefOr[Double] = js.undefined
    
    /**
      * Customize range expansion.
      *
      * @default undefined
      * @example
      * const range = braces.expand('x{a..e}y', {
      *   transform: (str) => `foo/${str}`
      * });
      *
      * console.log(range);
      * //=> [ 'xfooay', 'xfooby', 'xfoocy', 'xfoody', 'xfooey' ]
      */
    var transform: js.UndefOr[Transform] = js.undefined
    
    /**
      * Strip backslashes that were used for escaping from the result.
      *
      * @default undefined
      */
    var unescape: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setExpand(value: Boolean): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
      
      inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setNodupes(value: Boolean): Self = StObject.set(x, "nodupes", value.asInstanceOf[js.Any])
      
      inline def setNodupesUndefined: Self = StObject.set(x, "nodupes", js.undefined)
      
      inline def setQuantifiers(value: Boolean): Self = StObject.set(x, "quantifiers", value.asInstanceOf[js.Any])
      
      inline def setQuantifiersUndefined: Self = StObject.set(x, "quantifiers", js.undefined)
      
      inline def setRangeLimit(value: Double): Self = StObject.set(x, "rangeLimit", value.asInstanceOf[js.Any])
      
      inline def setRangeLimitUndefined: Self = StObject.set(x, "rangeLimit", js.undefined)
      
      inline def setTransform(value: /* str */ String => String): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      inline def setUnescape(value: Boolean): Self = StObject.set(x, "unescape", value.asInstanceOf[js.Any])
      
      inline def setUnescapeUndefined: Self = StObject.set(x, "unescape", js.undefined)
    }
  }
  
  type Transform = js.Function1[/* str */ String, String]
  
  type _To = Braces
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Braces = ^
}
