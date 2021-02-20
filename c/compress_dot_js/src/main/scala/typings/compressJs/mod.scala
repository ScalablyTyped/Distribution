package typings.compressJs

import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("compress.js", JSImport.Namespace)
  @js.native
  class ^ () extends Compress
  
  /* static member */
  @JSImport("compress.js", "convertBase64ToFile")
  @js.native
  def convertBase64ToFile(base64: String): File = js.native
  @JSImport("compress.js", "convertBase64ToFile")
  @js.native
  def convertBase64ToFile(base64: String, mime: String): File = js.native
  
  @js.native
  trait Compress extends StObject {
    
    def attach(el: String, options: CompressOptions): js.Promise[js.Array[CompressResult]] = js.native
    
    def compress(files: js.Array[File], options: CompressOptions): js.Promise[js.Array[CompressResult]] = js.native
  }
  object Compress {
    
    @scala.inline
    def apply(
      attach: (String, CompressOptions) => js.Promise[js.Array[CompressResult]],
      compress: (js.Array[File], CompressOptions) => js.Promise[js.Array[CompressResult]]
    ): Compress = {
      val __obj = js.Dynamic.literal(attach = js.Any.fromFunction2(attach), compress = js.Any.fromFunction2(compress))
      __obj.asInstanceOf[Compress]
    }
    
    @scala.inline
    implicit class CompressMutableBuilder[Self <: Compress] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttach(value: (String, CompressOptions) => js.Promise[js.Array[CompressResult]]): Self = StObject.set(x, "attach", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCompress(value: (js.Array[File], CompressOptions) => js.Promise[js.Array[CompressResult]]): Self = StObject.set(x, "compress", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait CompressOptions extends StObject {
    
    var maxHeight: js.UndefOr[Double] = js.native
    
    var maxWidth: js.UndefOr[Double] = js.native
    
    var quality: js.UndefOr[Double] = js.native
    
    var resize: js.UndefOr[Boolean] = js.native
    
    var size: js.UndefOr[Double] = js.native
  }
  object CompressOptions {
    
    @scala.inline
    def apply(): CompressOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CompressOptions]
    }
    
    @scala.inline
    implicit class CompressOptionsMutableBuilder[Self <: CompressOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      @scala.inline
      def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      @scala.inline
      def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      @scala.inline
      def setResize(value: Boolean): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait CompressResult extends StObject {
    
    var alt: String = js.native
    
    var data: String = js.native
    
    var elapsedTimeInSeconds: Double = js.native
    
    var endHeightInPx: Double = js.native
    
    var endSizeInMb: Double = js.native
    
    var endWidthInPx: Double = js.native
    
    var ext: String = js.native
    
    var initialHeightInPx: Double = js.native
    
    var initialSizeInMb: Double = js.native
    
    var initialWidthInPx: Double = js.native
    
    var iterations: Double = js.native
    
    var prefix: String = js.native
    
    var quality: Double = js.native
    
    var sizeReducedInPercent: Double = js.native
  }
  object CompressResult {
    
    @scala.inline
    def apply(
      alt: String,
      data: String,
      elapsedTimeInSeconds: Double,
      endHeightInPx: Double,
      endSizeInMb: Double,
      endWidthInPx: Double,
      ext: String,
      initialHeightInPx: Double,
      initialSizeInMb: Double,
      initialWidthInPx: Double,
      iterations: Double,
      prefix: String,
      quality: Double,
      sizeReducedInPercent: Double
    ): CompressResult = {
      val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], elapsedTimeInSeconds = elapsedTimeInSeconds.asInstanceOf[js.Any], endHeightInPx = endHeightInPx.asInstanceOf[js.Any], endSizeInMb = endSizeInMb.asInstanceOf[js.Any], endWidthInPx = endWidthInPx.asInstanceOf[js.Any], ext = ext.asInstanceOf[js.Any], initialHeightInPx = initialHeightInPx.asInstanceOf[js.Any], initialSizeInMb = initialSizeInMb.asInstanceOf[js.Any], initialWidthInPx = initialWidthInPx.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any], sizeReducedInPercent = sizeReducedInPercent.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompressResult]
    }
    
    @scala.inline
    implicit class CompressResultMutableBuilder[Self <: CompressResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElapsedTimeInSeconds(value: Double): Self = StObject.set(x, "elapsedTimeInSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndHeightInPx(value: Double): Self = StObject.set(x, "endHeightInPx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndSizeInMb(value: Double): Self = StObject.set(x, "endSizeInMb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndWidthInPx(value: Double): Self = StObject.set(x, "endWidthInPx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExt(value: String): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialHeightInPx(value: Double): Self = StObject.set(x, "initialHeightInPx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialSizeInMb(value: Double): Self = StObject.set(x, "initialSizeInMb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialWidthInPx(value: Double): Self = StObject.set(x, "initialWidthInPx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeReducedInPercent(value: Double): Self = StObject.set(x, "sizeReducedInPercent", value.asInstanceOf[js.Any])
    }
  }
}
