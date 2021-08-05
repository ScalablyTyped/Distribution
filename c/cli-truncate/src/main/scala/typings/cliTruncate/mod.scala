package typings.cliTruncate

import typings.cliTruncate.cliTruncateStrings.end
import typings.cliTruncate.cliTruncateStrings.middle
import typings.cliTruncate.cliTruncateStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  Truncate a string to a specific width in the terminal.
  @param text - Text to truncate.
  @param columns - Columns to occupy in the terminal.
  @example
  ```
  import cliTruncate = require('cli-truncate');
  cliTruncate('unicorn', 4);
  //=> 'uni…'
  // Truncate at different positions
  cliTruncate('unicorn', 4, {position: 'start'});
  //=> '…orn'
  cliTruncate('unicorn', 4, {position: 'middle'});
  //=> 'un…n'
  cliTruncate('\\u001B[31municorn\\u001B[39m', 4);
  //=> '\\u001B[31muni\\u001B[39m…'
  // Truncate Unicode surrogate pairs
  cliTruncate('uni\\uD83C\\uDE00corn', 5);
  //=> 'uni\\uD83C\\uDE00…'
  // Truncate fullwidth characters
  cliTruncate('안녕하세요', 3);
  //=> '안…'
  // Truncate the paragraph to the terminal width
  const paragraph = 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa.';
  cliTruncate(paragraph, process.stdout.columns));
  //=> 'Lorem ipsum dolor sit amet, consectetuer adipiscing…'
  ```
  */
  inline def apply(text: String, columns: Double): String = (^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any], columns.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(text: String, columns: Double, options: Options): String = (^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any], columns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("cli-truncate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /**
    		Position to truncate the string.
    		@default 'end'
    		*/
    val position: js.UndefOr[start | middle | end] = js.undefined
    
    /**
    		Truncate the string from a whitespace if it is within 3 characters from the actual breaking point.
    		@default false
    		@example
    		```
    		cliTruncate('unicorns rainbow dragons', 20, {position: 'start', preferTruncationOnSpace: true});
    		//=> '…rainbow dragons'
    		cliTruncate('unicorns rainbow dragons', 20, {position: 'middle', preferTruncationOnSpace: true});
    		//=> 'unicorns…dragons'
    		cliTruncate('unicorns rainbow dragons', 6, {position: 'end', preferTruncationOnSpace: true});
    		//=> 'unico…'
    		````
    		*/
    val preferTruncationOnSpace: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Add a space between the text and the ellipsis.
    		@default false
    		@example
    		```
    		cliTruncate('unicorns', 5, {position: 'end', space: true});
    		//=> 'uni …'
    		cliTruncate('unicorns', 5, {position: 'end', space: false});
    		//=> 'unic…'
    		cliTruncate('unicorns', 6, {position: 'start', space: true});
    		//=> '… orns'
    		cliTruncate('unicorns', 7, {position: 'middle', space: true});
    		//=> 'uni … s'
    		```
    		*/
    val space: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setPosition(value: start | middle | end): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setPreferTruncationOnSpace(value: Boolean): Self = StObject.set(x, "preferTruncationOnSpace", value.asInstanceOf[js.Any])
      
      inline def setPreferTruncationOnSpaceUndefined: Self = StObject.set(x, "preferTruncationOnSpace", js.undefined)
      
      inline def setSpace(value: Boolean): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
      
      inline def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
    }
  }
}
