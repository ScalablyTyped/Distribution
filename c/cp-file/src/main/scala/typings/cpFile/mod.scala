package typings.cpFile

import typings.cpFile.cpFileStrings.progress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  @JSImport("cp-file", JSImport.Namespace)
  @js.native
  def apply(source: String, destination: String): js.Promise[Unit] with ProgressEmitter = js.native
  @JSImport("cp-file", JSImport.Namespace)
  @js.native
  def apply(source: String, destination: String, options: Options): js.Promise[Unit] with ProgressEmitter = js.native
  
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
  @JSImport("cp-file", "sync")
  @js.native
  def sync(source: String, destination: String): Unit = js.native
  @JSImport("cp-file", "sync")
  @js.native
  def sync(source: String, destination: String, options: Options): Unit = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
    		Overwrite existing destination file.
    		@default true
    		*/
    val overwrite: js.UndefOr[Boolean] = js.native
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
      def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
    }
  }
  
  @js.native
  trait ProgressData extends StObject {
    
    /**
    		Absolute path to destination.
    		*/
    var destinationPath: String = js.native
    
    /**
    		Copied percentage, a value between `0` and `1`.
    		*/
    var percent: Double = js.native
    
    /**
    		File size in bytes.
    		*/
    var size: Double = js.native
    
    /**
    		Absolute path to source.
    		*/
    var sourcePath: String = js.native
    
    /**
    		Copied size in bytes.
    		*/
    var writtenBytes: Double = js.native
  }
  object ProgressData {
    
    @scala.inline
    def apply(destinationPath: String, percent: Double, size: Double, sourcePath: String, writtenBytes: Double): ProgressData = {
      val __obj = js.Dynamic.literal(destinationPath = destinationPath.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], sourcePath = sourcePath.asInstanceOf[js.Any], writtenBytes = writtenBytes.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProgressData]
    }
    
    @scala.inline
    implicit class ProgressDataMutableBuilder[Self <: ProgressData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestinationPath(value: String): Self = StObject.set(x, "destinationPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourcePath(value: String): Self = StObject.set(x, "sourcePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrittenBytes(value: Double): Self = StObject.set(x, "writtenBytes", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ProgressEmitter extends StObject {
    
    /**
    		Note: For empty files, the `progress` event is emitted only once.
    		*/
    @JSName("on")
    def on_progress(event: progress, handler: js.Function1[/* data */ ProgressData, Unit]): js.Promise[Unit] = js.native
  }
  object ProgressEmitter {
    
    @scala.inline
    def apply(on: (progress, js.Function1[/* data */ ProgressData, Unit]) => js.Promise[Unit]): ProgressEmitter = {
      val __obj = js.Dynamic.literal(on = js.Any.fromFunction2(on))
      __obj.asInstanceOf[ProgressEmitter]
    }
    
    @scala.inline
    implicit class ProgressEmitterMutableBuilder[Self <: ProgressEmitter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOn(value: (progress, js.Function1[/* data */ ProgressData, Unit]) => js.Promise[Unit]): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    }
  }
}
