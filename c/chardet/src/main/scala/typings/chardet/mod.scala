package typings.chardet

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("chardet", "detect")
  @js.native
  def detect(buf: Buffer): String | Null = js.native
  @JSImport("chardet", "detect")
  @js.native
  def detect(buf: Buffer, opts: Options): String | Null = js.native
  
  @JSImport("chardet", "detectAll")
  @js.native
  def detectAll(buf: Buffer): js.Array[Confidence] | Null = js.native
  @JSImport("chardet", "detectAll")
  @js.native
  def detectAll(buf: Buffer, opts: Options): js.Array[Confidence] | Null = js.native
  
  @JSImport("chardet", "detectFile")
  @js.native
  def detectFile(path: String, cb: js.Function2[/* err */ js.Any, /* result */ String | Null, Unit]): Unit = js.native
  @JSImport("chardet", "detectFile")
  @js.native
  def detectFile(path: String, opts: Options, cb: js.Function2[/* err */ js.Any, /* result */ String | Null, Unit]): Unit = js.native
  
  @JSImport("chardet", "detectFileAll")
  @js.native
  def detectFileAll(path: String, cb: js.Function2[/* err */ js.Any, /* result */ js.Array[Confidence] | Null, Unit]): Unit = js.native
  @JSImport("chardet", "detectFileAll")
  @js.native
  def detectFileAll(
    path: String,
    opts: Options,
    cb: js.Function2[/* err */ js.Any, /* result */ js.Array[Confidence] | Null, Unit]
  ): Unit = js.native
  
  @JSImport("chardet", "detectFileAllSync")
  @js.native
  def detectFileAllSync(path: String): js.Array[Confidence] | Null = js.native
  @JSImport("chardet", "detectFileAllSync")
  @js.native
  def detectFileAllSync(path: String, opts: Options): js.Array[Confidence] | Null = js.native
  
  @JSImport("chardet", "detectFileSync")
  @js.native
  def detectFileSync(path: String): String | Null = js.native
  @JSImport("chardet", "detectFileSync")
  @js.native
  def detectFileSync(path: String, opts: Options): String | Null = js.native
  
  @js.native
  trait Confidence extends StObject {
    
    var confidence: Double = js.native
    
    var lang: js.UndefOr[String] = js.native
    
    var name: String = js.native
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
  
  @js.native
  trait Options extends StObject {
    
    var returnAllMatches: js.UndefOr[Boolean] = js.native
    
    var sampleSize: js.UndefOr[Double] = js.native
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
