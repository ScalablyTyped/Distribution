package typings.chardet

import typings.chardet.anon.PartialFullOptions
import typings.chardet.libMatchMod.Match
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("chardet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("chardet", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def analyse(buffer: js.typedarray.Uint8Array): js.Array[Match] = ^.asInstanceOf[js.Dynamic].applyDynamic("analyse")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.Array[Match]]
    
    inline def detect(buffer: js.typedarray.Uint8Array): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("detect")(buffer.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    
    inline def detectFile(filepath: String): js.Promise[DetectResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("detectFile")(filepath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DetectResult]]
    inline def detectFile(filepath: String, opts: PartialFullOptions): js.Promise[DetectResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("detectFile")(filepath.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DetectResult]]
    
    inline def detectFileSync(filepath: String): DetectResult = ^.asInstanceOf[js.Dynamic].applyDynamic("detectFileSync")(filepath.asInstanceOf[js.Any]).asInstanceOf[DetectResult]
    inline def detectFileSync(filepath: String, opts: PartialFullOptions): DetectResult = (^.asInstanceOf[js.Dynamic].applyDynamic("detectFileSync")(filepath.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[DetectResult]
  }
  
  inline def analyse(buffer: js.typedarray.Uint8Array): js.Array[Match] = ^.asInstanceOf[js.Dynamic].applyDynamic("analyse")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.Array[Match]]
  
  inline def detect(buffer: js.typedarray.Uint8Array): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("detect")(buffer.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def detectFile(filepath: String): js.Promise[DetectResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("detectFile")(filepath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DetectResult]]
  inline def detectFile(filepath: String, opts: Options): js.Promise[DetectResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("detectFile")(filepath.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DetectResult]]
  
  inline def detectFileSync(filepath: String): DetectResult = ^.asInstanceOf[js.Dynamic].applyDynamic("detectFileSync")(filepath.asInstanceOf[js.Any]).asInstanceOf[DetectResult]
  inline def detectFileSync(filepath: String, opts: Options): DetectResult = (^.asInstanceOf[js.Dynamic].applyDynamic("detectFileSync")(filepath.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[DetectResult]
  
  type DetectResult = js.Array[Match] | String | Null
  
  trait FullOptions extends StObject {
    
    var sampleSize: Double
  }
  object FullOptions {
    
    inline def apply(sampleSize: Double): FullOptions = {
      val __obj = js.Dynamic.literal(sampleSize = sampleSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[FullOptions]
    }
    
    extension [Self <: FullOptions](x: Self) {
      
      inline def setSampleSize(value: Double): Self = StObject.set(x, "sampleSize", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<chardet.chardet.FullOptions> */
  trait Options extends StObject {
    
    var sampleSize: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setSampleSize(value: Double): Self = StObject.set(x, "sampleSize", value.asInstanceOf[js.Any])
      
      inline def setSampleSizeUndefined: Self = StObject.set(x, "sampleSize", js.undefined)
    }
  }
}
