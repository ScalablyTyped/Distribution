package typings.decompress

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(input: String): js.Promise[js.Array[File]] = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[File]]]
  inline def apply(input: String, output: String): js.Promise[js.Array[File]] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[File]]]
  inline def apply(input: String, output: String, opts: DecompressOptions): js.Promise[js.Array[File]] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[File]]]
  inline def apply(input: String, output: Unit, opts: DecompressOptions): js.Promise[js.Array[File]] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[File]]]
  inline def apply(input: String, output: DecompressOptions): js.Promise[js.Array[File]] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[File]]]
  inline def apply(input: String, output: DecompressOptions, opts: DecompressOptions): js.Promise[js.Array[File]] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[File]]]
  inline def apply(input: Buffer): js.Promise[js.Array[File]] = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[File]]]
  inline def apply(input: Buffer, output: String): js.Promise[js.Array[File]] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[File]]]
  inline def apply(input: Buffer, output: String, opts: DecompressOptions): js.Promise[js.Array[File]] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[File]]]
  inline def apply(input: Buffer, output: Unit, opts: DecompressOptions): js.Promise[js.Array[File]] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[File]]]
  inline def apply(input: Buffer, output: DecompressOptions): js.Promise[js.Array[File]] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[File]]]
  inline def apply(input: Buffer, output: DecompressOptions, opts: DecompressOptions): js.Promise[js.Array[File]] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[File]]]
  
  @JSImport("decompress", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait DecompressOptions extends StObject {
    
    /**
      * Filter out files before extracting
      */
    var filter: js.UndefOr[js.Function1[/* file */ File, Boolean]] = js.undefined
    
    /**
      * Map files before extracting
      */
    var map: js.UndefOr[js.Function1[/* file */ File, File]] = js.undefined
    
    /**
      * Array of plugins to use.
      * Default: [decompressTar(), decompressTarbz2(), decompressTargz(), decompressUnzip()]
      */
    var plugins: js.UndefOr[js.Array[Any]] = js.undefined
    
    /**
      * Remove leading directory components from extracted files.
      * Default: 0
      */
    var strip: js.UndefOr[Double] = js.undefined
  }
  object DecompressOptions {
    
    inline def apply(): DecompressOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DecompressOptions]
    }
    
    extension [Self <: DecompressOptions](x: Self) {
      
      inline def setFilter(value: /* file */ File => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setMap(value: /* file */ File => File): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setPlugins(value: js.Array[Any]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: Any*): Self = StObject.set(x, "plugins", js.Array(value*))
      
      inline def setStrip(value: Double): Self = StObject.set(x, "strip", value.asInstanceOf[js.Any])
      
      inline def setStripUndefined: Self = StObject.set(x, "strip", js.undefined)
    }
  }
  
  trait File extends StObject {
    
    var data: Buffer
    
    var mode: Double
    
    var mtime: String
    
    var path: String
    
    var `type`: String
  }
  object File {
    
    inline def apply(data: Buffer, mode: Double, mtime: String, path: String, `type`: String): File = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[File]
    }
    
    extension [Self <: File](x: Self) {
      
      inline def setData(value: Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setMtime(value: String): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
