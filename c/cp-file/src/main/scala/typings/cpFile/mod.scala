package typings.cpFile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cp-file", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def copyFile(source: String, destination: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFile")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def copyFile(source: String, destination: String, options: Options & AsyncOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFile")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def copyFileSync(source: String, destination: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFileSync")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def copyFileSync(source: String, destination: String, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFileSync")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait AsyncOptions extends StObject {
    
    /**
    	The given function is called whenever there is measurable progress.
    	Note: For empty files, the `onProgress` event is emitted only once.
    	@example
    	```
    	import {copyFile} from 'cp-file';
    	await copyFile('source/unicorn.png', 'destination/unicorn.png', {
    		onProgress: progress => {
    			// …
    		}
    	});
    	```
    	*/
    val onProgress: js.UndefOr[js.Function1[/* progress */ ProgressData, Unit]] = js.undefined
  }
  object AsyncOptions {
    
    inline def apply(): AsyncOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AsyncOptions]
    }
    
    extension [Self <: AsyncOptions](x: Self) {
      
      inline def setOnProgress(value: /* progress */ ProgressData => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
      
      inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    /**
    	The working directory to find source files.
    	The source and destination path are relative to this.
    	@default process.cwd()
    	*/
    val cwd: js.UndefOr[String] = js.undefined
    
    /**
    	[Permissions](https://en.wikipedia.org/wiki/File-system_permissions#Numeric_notation) for created directories.
    	It has no effect on Windows.
    	@default 0o777
    	*/
    val directoryMode: js.UndefOr[Double] = js.undefined
    
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
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setDirectoryMode(value: Double): Self = StObject.set(x, "directoryMode", value.asInstanceOf[js.Any])
      
      inline def setDirectoryModeUndefined: Self = StObject.set(x, "directoryMode", js.undefined)
      
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
}
