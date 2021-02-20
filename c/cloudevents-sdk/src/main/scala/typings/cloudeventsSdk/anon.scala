package typings.cloudeventsSdk

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.cloudeventsSdk.httpEmitterMod.HTTPEmitter
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Dictkey
    extends /* key */ StringDictionary[js.Any] {
    
    var binary: js.Any = js.native
    
    var structured: js.Any = js.native
  }
  object Dictkey {
    
    @scala.inline
    def apply(binary: js.Any, structured: js.Any): Dictkey = {
      val __obj = js.Dynamic.literal(binary = binary.asInstanceOf[js.Any], structured = structured.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictkey]
    }
    
    @scala.inline
    implicit class DictkeyMutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBinary(value: js.Any): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStructured(value: js.Any): Self = StObject.set(x, "structured", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Dictx
    extends /* x */ NumberDictionary[NumberDictionary[js.Any]] {
    
    var `null`: NumberDictionary[js.Any] = js.native
    
    var undefined: NumberDictionary[js.Any] = js.native
  }
  object Dictx {
    
    @scala.inline
    def apply(`null`: NumberDictionary[js.Any], undefined: NumberDictionary[js.Any]): Dictx = {
      val __obj = js.Dynamic.literal(undefined = undefined.asInstanceOf[js.Any])
      __obj.updateDynamic("null")(`null`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictx]
    }
    
    @scala.inline
    implicit class DictxMutableBuilder[Self <: Dictx] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNull(value: NumberDictionary[js.Any]): Self = StObject.set(x, "null", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUndefined(value: NumberDictionary[js.Any]): Self = StObject.set(x, "undefined", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Id extends StObject {
    
    var id: js.Any = js.native
    
    var specversion: String = js.native
    
    var time: String = js.native
  }
  object Id {
    
    @scala.inline
    def apply(id: js.Any, specversion: String, time: String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], specversion = specversion.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit class IdMutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: js.Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpecversion(value: String): Self = StObject.set(x, "specversion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Mode extends StObject {
    
    var mode: js.UndefOr[String] = js.native
    
    var url: js.UndefOr[String] = js.native
  }
  object Mode {
    
    @scala.inline
    def apply(): Mode = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Mode]
    }
    
    @scala.inline
    implicit class ModeMutableBuilder[Self <: Mode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  @js.native
  trait Name extends StObject {
    
    var name: String = js.native
    
    def parser(v: js.Any): js.Any = js.native
  }
  object Name {
    
    @scala.inline
    def apply(name: String, parser: js.Any => js.Any): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], parser = js.Any.fromFunction1(parser))
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParser(value: js.Any => js.Any): Self = StObject.set(x, "parser", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait TypeofHTTPEmitter extends Instantiable1[/* hasUrlVersion */ Url, HTTPEmitter] {
    
    var headers: js.Function = js.native
  }
  
  @js.native
  trait Url extends StObject {
    
    var url: js.UndefOr[String] = js.native
    
    var version: js.UndefOr[js.Any] = js.native
  }
  object Url {
    
    @scala.inline
    def apply(): Url = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Url]
    }
    
    @scala.inline
    implicit class UrlMutableBuilder[Self <: Url] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setVersion(value: js.Any): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  @js.native
  trait UrlURL extends StObject {
    
    var url: URL = js.native
  }
  object UrlURL {
    
    @scala.inline
    def apply(url: URL): UrlURL = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[UrlURL]
    }
    
    @scala.inline
    implicit class UrlURLMutableBuilder[Self <: UrlURL] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUrl(value: URL): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait V03 extends StObject {
    
    var v03: Dictkey = js.native
    
    var v1: Dictkey = js.native
  }
  object V03 {
    
    @scala.inline
    def apply(v03: Dictkey, v1: Dictkey): V03 = {
      val __obj = js.Dynamic.literal(v03 = v03.asInstanceOf[js.Any], v1 = v1.asInstanceOf[js.Any])
      __obj.asInstanceOf[V03]
    }
    
    @scala.inline
    implicit class V03MutableBuilder[Self <: V03] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setV03(value: Dictkey): Self = StObject.set(x, "v03", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setV1(value: Dictkey): Self = StObject.set(x, "v1", value.asInstanceOf[js.Any])
    }
  }
}
