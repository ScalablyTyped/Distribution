package typings.coViews

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Pass views `dir` and `opts` to return a render function.
    */
  @scala.inline
  def apply(): js.Function2[/* view */ String, /* locals */ js.UndefOr[js.Object], js.Any] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Function2[/* view */ String, /* locals */ js.UndefOr[js.Object], js.Any]]
  @scala.inline
  def apply(dir: String): js.Function2[/* view */ String, /* locals */ js.UndefOr[js.Object], js.Any] = ^.asInstanceOf[js.Dynamic].apply(dir.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* view */ String, /* locals */ js.UndefOr[js.Object], js.Any]]
  @scala.inline
  def apply(dir: String, opts: Options): js.Function2[/* view */ String, /* locals */ js.UndefOr[js.Object], js.Any] = (^.asInstanceOf[js.Dynamic].apply(dir.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* view */ String, /* locals */ js.UndefOr[js.Object], js.Any]]
  @scala.inline
  def apply(dir: Unit, opts: Options): js.Function2[/* view */ String, /* locals */ js.UndefOr[js.Object], js.Any] = (^.asInstanceOf[js.Dynamic].apply(dir.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* view */ String, /* locals */ js.UndefOr[js.Object], js.Any]]
  
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
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      @scala.inline
      def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setExt(value: String): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
      
      @scala.inline
      def setLocals(value: js.Object): Self = StObject.set(x, "locals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalsUndefined: Self = StObject.set(x, "locals", js.undefined)
      
      @scala.inline
      def setMap(value: js.Object): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      @scala.inline
      def setPartials(value: js.Object): Self = StObject.set(x, "partials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartialsUndefined: Self = StObject.set(x, "partials", js.undefined)
    }
  }
}
