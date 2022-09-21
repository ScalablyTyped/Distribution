package typings.clipboardy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("clipboardy", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
    	Read (paste) from the clipboard asynchronously.
    	@example
    	```
    	import clipboard from 'clipboardy';
    	await clipboard.write('🦄');
    	await clipboard.read();
    	//=> '🦄'
    	```
    	*/
    inline def read(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("read")().asInstanceOf[js.Promise[String]]
    
    /**
    	Read (paste) from the clipboard synchronously.
    	__Doesn't work in browsers.__
    	@example
    	```
    	import clipboard from 'clipboardy';
    	clipboard.writeSync('🦄');
    	clipboard.readSync();
    	//=> '🦄'
    	```
    	*/
    inline def readSync(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("readSync")().asInstanceOf[String]
    
    /**
    	Write (copy) to the clipboard asynchronously.
    	@param text - The text to write to the clipboard.
    	@example
    	```
    	import clipboard from 'clipboardy';
    	await clipboard.write('🦄');
    	await clipboard.read();
    	//=> '🦄'
    	```
    	*/
    inline def write(text: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("write")(text.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    /**
    	Write (copy) to the clipboard synchronously.
    	__Doesn't work in browsers.__
    	@param text - The text to write to the clipboard.
    	@example
    	```
    	import clipboard from 'clipboardy';
    	clipboard.writeSync('🦄');
    	clipboard.readSync();
    	//=> '🦄'
    	```
    	*/
    inline def writeSync(text: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(text.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
