package typings.decamelize

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("decamelize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(string.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def default(string: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(string.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait Options extends StObject {
    
    /**
    	Preserve sequences of uppercase characters.
    	@default false
    	@example
    	```
    	import decamelize from 'decamelize';
    	decamelize('testGUILabel');
    	//=> 'test_gui_label'
    	decamelize('testGUILabel', {preserveConsecutiveUppercase: true});
    	//=> 'test_GUI_label'
    	```
    	*/
    val preserveConsecutiveUppercase: js.UndefOr[Boolean] = js.undefined
    
    /**
    	Character or string inserted to separate words in `string`.
    	@default '_'
    	@example
    	```
    	import decamelize from 'decamelize';
    	decamelize('unicornRainbow');
    	//=> 'unicorn_rainbow'
    	decamelize('unicornRainbow', {separator: '-'});
    	//=> 'unicorn-rainbow'
    	```
    	*/
    val separator: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setPreserveConsecutiveUppercase(value: Boolean): Self = StObject.set(x, "preserveConsecutiveUppercase", value.asInstanceOf[js.Any])
      
      inline def setPreserveConsecutiveUppercaseUndefined: Self = StObject.set(x, "preserveConsecutiveUppercase", js.undefined)
      
      inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    }
  }
}
