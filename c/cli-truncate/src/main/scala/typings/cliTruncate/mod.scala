package typings.cliTruncate

import typings.cliTruncate.cliTruncateStrings.end
import typings.cliTruncate.cliTruncateStrings.middle
import typings.cliTruncate.cliTruncateStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cli-truncate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(text: String, columns: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(text.asInstanceOf[js.Any], columns.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def default(text: String, columns: Double, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(text.asInstanceOf[js.Any], columns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait Options extends StObject {
    
    /**
    	The position to truncate the string.
    	@default 'end'
    	*/
    val position: js.UndefOr[start | middle | end] = js.undefined
    
    /**
    	Truncate the string from a whitespace if it is within 3 characters from the actual breaking point.
    	@default false
    	@example
    	```
    	import cliTruncate from 'cli-truncate';
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
    	import cliTruncate from 'cli-truncate';
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
    
    /**
    	The character to use at the breaking point.
    	@default '…'
    	@example
    	```
    	import cliTruncate from 'cli-truncate';
    	cliTruncate('unicorns', 5, {position: 'end'});
    	//=> 'unic…'
    	cliTruncate('unicorns', 5, {position: 'end', truncationCharacter: '.'});
    	//=> 'unic.'
    	cliTruncate('unicorns', 5, {position: 'end', truncationCharacter: ''});
    	//=> 'unico'
    	*/
    val truncationCharacter: js.UndefOr[String] = js.undefined
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
      
      inline def setTruncationCharacter(value: String): Self = StObject.set(x, "truncationCharacter", value.asInstanceOf[js.Any])
      
      inline def setTruncationCharacterUndefined: Self = StObject.set(x, "truncationCharacter", js.undefined)
    }
  }
}
