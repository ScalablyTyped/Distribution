package typings.chardet

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("chardet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def detect(buf: Buffer): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("detect")(buf.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  @scala.inline
  def detect(buf: Buffer, opts: Options): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("detect")(buf.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  @scala.inline
  def detectAll(buf: Buffer): js.Array[Confidence] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("detectAll")(buf.asInstanceOf[js.Any]).asInstanceOf[js.Array[Confidence] | Null]
  @scala.inline
  def detectAll(buf: Buffer, opts: Options): js.Array[Confidence] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("detectAll")(buf.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Array[Confidence] | Null]
  
  @scala.inline
  def detectFile(path: String, cb: js.Function2[/* err */ js.Any, /* result */ String | Null, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("detectFile")(path.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def detectFile(path: String, opts: Options, cb: js.Function2[/* err */ js.Any, /* result */ String | Null, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("detectFile")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def detectFileAll(path: String, cb: js.Function2[/* err */ js.Any, /* result */ js.Array[Confidence] | Null, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("detectFileAll")(path.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def detectFileAll(
    path: String,
    opts: Options,
    cb: js.Function2[/* err */ js.Any, /* result */ js.Array[Confidence] | Null, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("detectFileAll")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def detectFileAllSync(path: String): js.Array[Confidence] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("detectFileAllSync")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[Confidence] | Null]
  @scala.inline
  def detectFileAllSync(path: String, opts: Options): js.Array[Confidence] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("detectFileAllSync")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Array[Confidence] | Null]
  
  @scala.inline
  def detectFileSync(path: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("detectFileSync")(path.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  @scala.inline
  def detectFileSync(path: String, opts: Options): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("detectFileSync")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  trait Confidence extends StObject {
    
    var confidence: Double
    
    var lang: js.UndefOr[String] = js.undefined
    
    var name: String
  }
  object Confidence {
    
    @scala.inline
    def apply(confidence: Double, name: String): Confidence = {
      val __obj = js.Dynamic.literal(confidence = confidence.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Confidence]
    }
    
    @scala.inline
    implicit class ConfidenceMutableBuilder[Self <: Confidence] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var returnAllMatches: js.UndefOr[Boolean] = js.undefined
    
    var sampleSize: js.UndefOr[Double] = js.undefined
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
      def setReturnAllMatches(value: Boolean): Self = StObject.set(x, "returnAllMatches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnAllMatchesUndefined: Self = StObject.set(x, "returnAllMatches", js.undefined)
      
      @scala.inline
      def setSampleSize(value: Double): Self = StObject.set(x, "sampleSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSampleSizeUndefined: Self = StObject.set(x, "sampleSize", js.undefined)
    }
  }
}
