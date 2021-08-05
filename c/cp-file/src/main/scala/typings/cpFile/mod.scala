package typings.cpFile

import typings.cpFile.cpFileStrings.progress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Copy a file.
  	@param source - The file you want to copy.
  	@param destination - Where you want the file copied.
  	@returns A `Promise` that resolves when the file is copied.
  	@example
  	```
  	import cpFile = require('cp-file');
  	(async () => {
  		await cpFile('source/unicorn.png', 'destination/unicorn.png');
  		console.log('File copied');
  	})();
  	```
  	*/
  inline def apply(source: String, destination: String): js.Promise[Unit] & ProgressEmitter = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit] & ProgressEmitter]
  inline def apply(source: String, destination: String, options: Options): js.Promise[Unit] & ProgressEmitter = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit] & ProgressEmitter]
  
  @JSImport("cp-file", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  	Copy a file synchronously.
  	@param source - The file you want to copy.
  	@param destination - Where you want the file copied.
  	@example
  	```
  	import cpFile = require('cp-file');
  	cpFile.sync('source/unicorn.png', 'destination/unicorn.png');
  	```
  	*/
  inline def sync(source: String, destination: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def sync(source: String, destination: String, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Options extends StObject {
    
    /**
    		Overwrite existing destination file.
    		@default true
    		*/
    val overwrite: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
      
      inline def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
    }
  }
  
  trait ProgressData extends StObject {
    
    /**
    		Absolute path to destination.
    		*/
    var destinationPath: String
    
    /**
    		Copied percentage, a value between `0` and `1`.
    		*/
    var percent: Double
    
    /**
    		File size in bytes.
    		*/
    var size: Double
    
    /**
    		Absolute path to source.
    		*/
    var sourcePath: String
    
    /**
    		Copied size in bytes.
    		*/
    var writtenBytes: Double
  }
  object ProgressData {
    
    inline def apply(destinationPath: String, percent: Double, size: Double, sourcePath: String, writtenBytes: Double): ProgressData = {
      val __obj = js.Dynamic.literal(destinationPath = destinationPath.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], sourcePath = sourcePath.asInstanceOf[js.Any], writtenBytes = writtenBytes.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProgressData]
    }
    
    extension [Self <: ProgressData](x: Self) {
      
      inline def setDestinationPath(value: String): Self = StObject.set(x, "destinationPath", value.asInstanceOf[js.Any])
      
      inline def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSourcePath(value: String): Self = StObject.set(x, "sourcePath", value.asInstanceOf[js.Any])
      
      inline def setWrittenBytes(value: Double): Self = StObject.set(x, "writtenBytes", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProgressEmitter extends StObject {
    
    /**
    		Note: For empty files, the `progress` event is emitted only once.
    		*/
    @JSName("on")
    def on_progress(event: progress, handler: js.Function1[/* data */ ProgressData, Unit]): js.Promise[Unit]
  }
  object ProgressEmitter {
    
    inline def apply(on: (progress, js.Function1[/* data */ ProgressData, Unit]) => js.Promise[Unit]): ProgressEmitter = {
      val __obj = js.Dynamic.literal(on = js.Any.fromFunction2(on))
      __obj.asInstanceOf[ProgressEmitter]
    }
    
    extension [Self <: ProgressEmitter](x: Self) {
      
      inline def setOn(value: (progress, js.Function1[/* data */ ProgressData, Unit]) => js.Promise[Unit]): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    }
  }
}
