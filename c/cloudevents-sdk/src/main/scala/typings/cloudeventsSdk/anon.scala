package typings.cloudeventsSdk

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.cloudeventsSdk.libBindingsHttpHttpEmitterMod.HTTPEmitter
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dictkey
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var binary: Any
    
    var structured: Any
  }
  object Dictkey {
    
    inline def apply(binary: Any, structured: Any): Dictkey = {
      val __obj = js.Dynamic.literal(binary = binary.asInstanceOf[js.Any], structured = structured.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictkey]
    }
    
    extension [Self <: Dictkey](x: Self) {
      
      inline def setBinary(value: Any): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
      
      inline def setStructured(value: Any): Self = StObject.set(x, "structured", value.asInstanceOf[js.Any])
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
  
  @js.native
  trait TypeofHTTPEmitter
    extends StObject
       with Instantiable1[/* param0 */ Url, HTTPEmitter] {
    
    var headers: js.Function = js.native
  }
  
  trait Url extends StObject {
    
    var url: js.UndefOr[String] = js.undefined
    
    var version: js.UndefOr[Any] = js.undefined
  }
  object Url {
    
    inline def apply(): Url = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Url]
    }
    
    extension [Self <: Url](x: Self) {
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setVersion(value: Any): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
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
