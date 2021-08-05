package typings.copyfiles

import typings.copyfiles.copyfilesBooleans.`true`
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(paths: js.Array[String], callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].apply(paths.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(paths: js.Array[String], options: Double, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].apply(paths.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(paths: js.Array[String], options: Options, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].apply(paths.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("copyfiles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Callback = js.Function1[/* error */ js.UndefOr[Error], Unit]
  
  trait Options extends StObject {
    
    /** include files & directories beginning with a dot (.) */
    var all: js.UndefOr[Boolean] = js.undefined
    
    /** throw error if nothing is copied */
    var error: js.UndefOr[Boolean] = js.undefined
    
    /** pattern or glob to exclude */
    var exclude: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /** flatten the output */
    var flat: js.UndefOr[Boolean] = js.undefined
    
    /**
      * follow symbolink links
      * @default false
      */
    var follow: js.UndefOr[Boolean] = js.undefined
    
    /** do not overwrite destination files if they exist */
    var soft: js.UndefOr[Boolean] = js.undefined
    
    /**
      * slice a path off the bottom of the paths
      * @default 0
      */
    var up: js.UndefOr[Double | `true`] = js.undefined
    
    /** print more information to console */
    var verbose: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAll(value: Boolean): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setExclude(value: String | js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      inline def setFlat(value: Boolean): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
      
      inline def setFlatUndefined: Self = StObject.set(x, "flat", js.undefined)
      
      inline def setFollow(value: Boolean): Self = StObject.set(x, "follow", value.asInstanceOf[js.Any])
      
      inline def setFollowUndefined: Self = StObject.set(x, "follow", js.undefined)
      
      inline def setSoft(value: Boolean): Self = StObject.set(x, "soft", value.asInstanceOf[js.Any])
      
      inline def setSoftUndefined: Self = StObject.set(x, "soft", js.undefined)
      
      inline def setUp(value: Double | `true`): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
      
      inline def setUpUndefined: Self = StObject.set(x, "up", js.undefined)
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
}
