package typings.bashGlob

import typings.bashGlob.bashGlobStrings.`match`
import typings.bashGlob.bashGlobStrings.end
import typings.bashGlob.bashGlobStrings.files
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(pattern: Patterns, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(pattern: Patterns, options: Options, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("bash-glob", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def each(patterns: Patterns, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(patterns.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def each(patterns: Patterns, options: Options, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(patterns.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on(event: `match` | files, callback: js.Function2[/* files */ String, /* cwd */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_end(event: end, callback: js.Function1[/* files */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def promise(patterns: Patterns): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("promise")(patterns.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  inline def promise(patterns: Patterns, options: Options): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("promise")(patterns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  
  inline def sync(patterns: Patterns): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(patterns.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def sync(patterns: Patterns, options: Options): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(patterns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  type Callback = js.Function2[/* err */ js.Error, /* files */ js.Array[String], Unit]
  
  trait Options extends StObject {
    
    var cwd: js.UndefOr[String] = js.undefined
    
    var dot: js.UndefOr[Boolean] = js.undefined
    
    var dotglob: js.UndefOr[Boolean] = js.undefined
    
    var extglob: js.UndefOr[Boolean] = js.undefined
    
    var failglob: js.UndefOr[Boolean] = js.undefined
    
    var globstar: js.UndefOr[Boolean] = js.undefined
    
    var nocase: js.UndefOr[Boolean] = js.undefined
    
    var nocaseglob: js.UndefOr[Boolean] = js.undefined
    
    var nullglob: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setDot(value: Boolean): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
      
      inline def setDotUndefined: Self = StObject.set(x, "dot", js.undefined)
      
      inline def setDotglob(value: Boolean): Self = StObject.set(x, "dotglob", value.asInstanceOf[js.Any])
      
      inline def setDotglobUndefined: Self = StObject.set(x, "dotglob", js.undefined)
      
      inline def setExtglob(value: Boolean): Self = StObject.set(x, "extglob", value.asInstanceOf[js.Any])
      
      inline def setExtglobUndefined: Self = StObject.set(x, "extglob", js.undefined)
      
      inline def setFailglob(value: Boolean): Self = StObject.set(x, "failglob", value.asInstanceOf[js.Any])
      
      inline def setFailglobUndefined: Self = StObject.set(x, "failglob", js.undefined)
      
      inline def setGlobstar(value: Boolean): Self = StObject.set(x, "globstar", value.asInstanceOf[js.Any])
      
      inline def setGlobstarUndefined: Self = StObject.set(x, "globstar", js.undefined)
      
      inline def setNocase(value: Boolean): Self = StObject.set(x, "nocase", value.asInstanceOf[js.Any])
      
      inline def setNocaseUndefined: Self = StObject.set(x, "nocase", js.undefined)
      
      inline def setNocaseglob(value: Boolean): Self = StObject.set(x, "nocaseglob", value.asInstanceOf[js.Any])
      
      inline def setNocaseglobUndefined: Self = StObject.set(x, "nocaseglob", js.undefined)
      
      inline def setNullglob(value: Boolean): Self = StObject.set(x, "nullglob", value.asInstanceOf[js.Any])
      
      inline def setNullglobUndefined: Self = StObject.set(x, "nullglob", js.undefined)
    }
  }
  
  type Patterns = String | js.Array[String]
}
