package typings.cloneRegexp

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  Clone and modify a [RegExp](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/RegExp) instance.
  @param regexp - Regex to clone.
  @example
  ```
  import cloneRegexp = require('clone-regexp');
  const regex = /[a-z]/gi;
  cloneRegexp(regex);
  //=> /[a-z]/gi
  cloneRegexp(regex) === regex;
  //=> false
  cloneRegexp(regex, {global: false});
  //=> /[a-z]/i
  cloneRegexp(regex, {multiline: true});
  //=> /[a-z]/gim
  cloneRegexp(regex, {source: 'unicorn'});
  //=> /unicorn/gi
  ```
  */
  inline def apply(regexp: RegExp): RegExp = ^.asInstanceOf[js.Dynamic].apply(regexp.asInstanceOf[js.Any]).asInstanceOf[RegExp]
  inline def apply(regexp: RegExp, options: Options): RegExp = (^.asInstanceOf[js.Dynamic].apply(regexp.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RegExp]
  
  @JSImport("clone-regexp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /**
    		Modifies the [`dotAll`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/RegExp/dotAll) property of the cloned `RegExp` instance.
    		*/
    var dotAll: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Modifies the [`global`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/RegExp/global) property of the cloned `RegExp` instance.
    		*/
    var global: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Modifies the [`ignoreCase`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/RegExp/ignoreCase) property of the cloned `RegExp` instance.
    		*/
    var ignoreCase: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Modifies the [`lastIndex`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/RegExp/lastIndex) property of the cloned `RegExp` instance.
    		*/
    var lastIndex: js.UndefOr[Double] = js.undefined
    
    /**
    		Modifies the [`multiline`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/RegExp/multiline) property of the cloned `RegExp` instance.
    		*/
    var multiline: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Modifies the [`source`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/RegExp/source) property of the cloned `RegExp` instance.
    		*/
    var source: js.UndefOr[String] = js.undefined
    
    /**
    		Modifies the [`sticky`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/RegExp/sticky) property of the cloned `RegExp` instance.
    		*/
    var sticky: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Modifies the [`unicode`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/RegExp/unicode) property of the cloned `RegExp` instance.
    		*/
    var unicode: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDotAll(value: Boolean): Self = StObject.set(x, "dotAll", value.asInstanceOf[js.Any])
      
      inline def setDotAllUndefined: Self = StObject.set(x, "dotAll", js.undefined)
      
      inline def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      inline def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
      
      inline def setIgnoreCase(value: Boolean): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
      
      inline def setIgnoreCaseUndefined: Self = StObject.set(x, "ignoreCase", js.undefined)
      
      inline def setLastIndex(value: Double): Self = StObject.set(x, "lastIndex", value.asInstanceOf[js.Any])
      
      inline def setLastIndexUndefined: Self = StObject.set(x, "lastIndex", js.undefined)
      
      inline def setMultiline(value: Boolean): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
      
      inline def setMultilineUndefined: Self = StObject.set(x, "multiline", js.undefined)
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setSticky(value: Boolean): Self = StObject.set(x, "sticky", value.asInstanceOf[js.Any])
      
      inline def setStickyUndefined: Self = StObject.set(x, "sticky", js.undefined)
      
      inline def setUnicode(value: Boolean): Self = StObject.set(x, "unicode", value.asInstanceOf[js.Any])
      
      inline def setUnicodeUndefined: Self = StObject.set(x, "unicode", js.undefined)
    }
  }
}
