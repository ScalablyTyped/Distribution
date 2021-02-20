package typings.decompress

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("decompress", JSImport.Namespace)
  @js.native
  def apply(input: String): js.Promise[js.Array[File]] = js.native
  @JSImport("decompress", JSImport.Namespace)
  @js.native
  def apply(input: String, output: js.UndefOr[scala.Nothing], opts: DecompressOptions): js.Promise[js.Array[File]] = js.native
  @JSImport("decompress", JSImport.Namespace)
  @js.native
  def apply(input: String, output: String): js.Promise[js.Array[File]] = js.native
  @JSImport("decompress", JSImport.Namespace)
  @js.native
  def apply(input: String, output: String, opts: DecompressOptions): js.Promise[js.Array[File]] = js.native
  @JSImport("decompress", JSImport.Namespace)
  @js.native
  def apply(input: String, output: DecompressOptions): js.Promise[js.Array[File]] = js.native
  @JSImport("decompress", JSImport.Namespace)
  @js.native
  def apply(input: String, output: DecompressOptions, opts: DecompressOptions): js.Promise[js.Array[File]] = js.native
  @JSImport("decompress", JSImport.Namespace)
  @js.native
  def apply(input: Buffer): js.Promise[js.Array[File]] = js.native
  @JSImport("decompress", JSImport.Namespace)
  @js.native
  def apply(input: Buffer, output: js.UndefOr[scala.Nothing], opts: DecompressOptions): js.Promise[js.Array[File]] = js.native
  @JSImport("decompress", JSImport.Namespace)
  @js.native
  def apply(input: Buffer, output: String): js.Promise[js.Array[File]] = js.native
  @JSImport("decompress", JSImport.Namespace)
  @js.native
  def apply(input: Buffer, output: String, opts: DecompressOptions): js.Promise[js.Array[File]] = js.native
  @JSImport("decompress", JSImport.Namespace)
  @js.native
  def apply(input: Buffer, output: DecompressOptions): js.Promise[js.Array[File]] = js.native
  @JSImport("decompress", JSImport.Namespace)
  @js.native
  def apply(input: Buffer, output: DecompressOptions, opts: DecompressOptions): js.Promise[js.Array[File]] = js.native
  
  @js.native
  trait DecompressOptions extends StObject {
    
    /**
      * Filter out files before extracting
      */
    var filter: js.UndefOr[js.Function1[/* file */ File, Boolean]] = js.native
    
    /**
      * Map files before extracting
      */
    var map: js.UndefOr[js.Function1[/* file */ File, File]] = js.native
    
    /**
      * Array of plugins to use.
      * Default: [decompressTar(), decompressTarbz2(), decompressTargz(), decompressUnzip()]
      */
    var plugins: js.UndefOr[js.Array[_]] = js.native
    
    /**
      * Remove leading directory components from extracted files.
      * Default: 0
      */
    var strip: js.UndefOr[Double] = js.native
  }
  object DecompressOptions {
    
    @scala.inline
    def apply(): DecompressOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DecompressOptions]
    }
    
    @scala.inline
    implicit class DecompressOptionsMutableBuilder[Self <: DecompressOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilter(value: /* file */ File => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setMap(value: /* file */ File => File): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      @scala.inline
      def setPlugins(value: js.Array[_]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      @scala.inline
      def setPluginsVarargs(value: js.Any*): Self = StObject.set(x, "plugins", js.Array(value :_*))
      
      @scala.inline
      def setStrip(value: Double): Self = StObject.set(x, "strip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStripUndefined: Self = StObject.set(x, "strip", js.undefined)
    }
  }
  
  @js.native
  trait File extends StObject {
    
    var data: Buffer = js.native
    
    var mode: Double = js.native
    
    var mtime: String = js.native
    
    var path: String = js.native
    
    var `type`: String = js.native
  }
  object File {
    
    @scala.inline
    def apply(data: Buffer, mode: Double, mtime: String, path: String, `type`: String): File = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[File]
    }
    
    @scala.inline
    implicit class FileMutableBuilder[Self <: File] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMtime(value: String): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
