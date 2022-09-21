package typings.coViews

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Pass views `dir` and `opts` to return a render function.
    */
  inline def apply(): js.Function2[/* view */ String, /* locals */ js.UndefOr[js.Object], Any] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Function2[/* view */ String, /* locals */ js.UndefOr[js.Object], Any]]
  inline def apply(dir: String): js.Function2[/* view */ String, /* locals */ js.UndefOr[js.Object], Any] = ^.asInstanceOf[js.Dynamic].apply(dir.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* view */ String, /* locals */ js.UndefOr[js.Object], Any]]
  inline def apply(dir: String, opts: Options): js.Function2[/* view */ String, /* locals */ js.UndefOr[js.Object], Any] = (^.asInstanceOf[js.Dynamic].apply(dir.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* view */ String, /* locals */ js.UndefOr[js.Object], Any]]
  inline def apply(dir: Unit, opts: Options): js.Function2[/* view */ String, /* locals */ js.UndefOr[js.Object], Any] = (^.asInstanceOf[js.Dynamic].apply(dir.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* view */ String, /* locals */ js.UndefOr[js.Object], Any]]
  
  @JSImport("co-views", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /**
      * default extname
      */
    var default: js.UndefOr[String] = js.undefined
    
    /**
      * cache compiled templates
      */
    var cache: js.UndefOr[Boolean] = js.undefined
    
    /**
      * default extname
      */
    var ext: js.UndefOr[String] = js.undefined
    
    /**
      * common locals data
      */
    var locals: js.UndefOr[js.Object] = js.undefined
    
    /**
      * engine map
      */
    var map: js.UndefOr[js.Object] = js.undefined
    
    /**
      * proxy partials
      */
    var partials: js.UndefOr[js.Object] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setExt(value: String): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      inline def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
      
      inline def setLocals(value: js.Object): Self = StObject.set(x, "locals", value.asInstanceOf[js.Any])
      
      inline def setLocalsUndefined: Self = StObject.set(x, "locals", js.undefined)
      
      inline def setMap(value: js.Object): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setPartials(value: js.Object): Self = StObject.set(x, "partials", value.asInstanceOf[js.Any])
      
      inline def setPartialsUndefined: Self = StObject.set(x, "partials", js.undefined)
    }
  }
}
