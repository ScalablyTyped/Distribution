package typings.cloudeventsSdk

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.cloudeventsSdk.httpEmitterMod.HTTPEmitter
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dictkey
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var binary: js.Any
    
    var structured: js.Any
  }
  object Dictkey {
    
    inline def apply(binary: js.Any, structured: js.Any): Dictkey = {
      val __obj = js.Dynamic.literal(binary = binary.asInstanceOf[js.Any], structured = structured.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictkey]
    }
    
    extension [Self <: Dictkey](x: Self) {
      
      inline def setBinary(value: js.Any): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
      
      inline def setStructured(value: js.Any): Self = StObject.set(x, "structured", value.asInstanceOf[js.Any])
    }
  }
  
  trait Dictx
    extends StObject
       with /* x */ NumberDictionary[NumberDictionary[js.Any]] {
    
    var `null`: NumberDictionary[js.Any]
    
    var undefined: NumberDictionary[js.Any]
  }
  object Dictx {
    
    inline def apply(`null`: NumberDictionary[js.Any], undefined: NumberDictionary[js.Any]): Dictx = {
      val __obj = js.Dynamic.literal(undefined = undefined.asInstanceOf[js.Any])
      __obj.updateDynamic("null")(`null`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictx]
    }
    
    extension [Self <: Dictx](x: Self) {
      
      inline def setNull(value: NumberDictionary[js.Any]): Self = StObject.set(x, "null", value.asInstanceOf[js.Any])
      
      inline def setUndefined(value: NumberDictionary[js.Any]): Self = StObject.set(x, "undefined", value.asInstanceOf[js.Any])
    }
  }
  
  trait Id extends StObject {
    
    var id: js.Any
    
    var specversion: String
    
    var time: String
  }
  object Id {
    
    inline def apply(id: js.Any, specversion: String, time: String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], specversion = specversion.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    extension [Self <: Id](x: Self) {
      
      inline def setId(value: js.Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setSpecversion(value: String): Self = StObject.set(x, "specversion", value.asInstanceOf[js.Any])
      
      inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
  
  trait Mode extends StObject {
    
    var mode: js.UndefOr[String] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object Mode {
    
    inline def apply(): Mode = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Mode]
    }
    
    extension [Self <: Mode](x: Self) {
      
      inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait Name extends StObject {
    
    var name: String
    
    def parser(v: js.Any): js.Any
  }
  object Name {
    
    inline def apply(name: String, parser: js.Any => js.Any): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], parser = js.Any.fromFunction1(parser))
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setParser(value: js.Any => js.Any): Self = StObject.set(x, "parser", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait TypeofHTTPEmitter
    extends StObject
       with Instantiable1[/* hasUrlVersion */ Url, HTTPEmitter] {
    
    var headers: js.Function = js.native
  }
  
  trait Url extends StObject {
    
    var url: js.UndefOr[String] = js.undefined
    
    var version: js.UndefOr[js.Any] = js.undefined
  }
  object Url {
    
    inline def apply(): Url = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Url]
    }
    
    extension [Self <: Url](x: Self) {
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setVersion(value: js.Any): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait UrlURL extends StObject {
    
    var url: URL
  }
  object UrlURL {
    
    inline def apply(url: URL): UrlURL = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[UrlURL]
    }
    
    extension [Self <: UrlURL](x: Self) {
      
      inline def setUrl(value: URL): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait V03 extends StObject {
    
    var v03: Dictkey
    
    var v1: Dictkey
  }
  object V03 {
    
    inline def apply(v03: Dictkey, v1: Dictkey): V03 = {
      val __obj = js.Dynamic.literal(v03 = v03.asInstanceOf[js.Any], v1 = v1.asInstanceOf[js.Any])
      __obj.asInstanceOf[V03]
    }
    
    extension [Self <: V03](x: Self) {
      
      inline def setV03(value: Dictkey): Self = StObject.set(x, "v03", value.asInstanceOf[js.Any])
      
      inline def setV1(value: Dictkey): Self = StObject.set(x, "v1", value.asInstanceOf[js.Any])
    }
  }
}
