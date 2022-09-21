package typings.deleteEmpty

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(dir: String): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].apply(dir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  inline def apply(dir: String, cb: DeleteEmptyCallback): Unit = (^.asInstanceOf[js.Dynamic].apply(dir.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(dir: String, options: Options): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].apply(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  inline def apply(dir: String, options: Options, cb: DeleteEmptyCallback): Unit = (^.asInstanceOf[js.Dynamic].apply(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("delete-empty", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sync(dir: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(dir.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def sync(dir: String, options: Options): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  type DeleteEmptyCallback = js.Function2[/* err */ js.UndefOr[js.Error | Null], /* deleted */ js.Array[String], Unit]
  
  type FilterFunction = js.Function2[/* file */ String, /* regex */ js.RegExp, String]
  
  trait Options extends StObject {
    
    /**
      * Do a dry run without deleting any files
      * @default false
      */
    var dryRun: js.UndefOr[Boolean] = js.undefined
    
    var filter: js.UndefOr[FilterFunction] = js.undefined
    
    var junkRegex: js.UndefOr[js.RegExp] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDryRun(value: Boolean): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
      
      inline def setDryRunUndefined: Self = StObject.set(x, "dryRun", js.undefined)
      
      inline def setFilter(value: (/* file */ String, /* regex */ js.RegExp) => String): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setJunkRegex(value: js.RegExp): Self = StObject.set(x, "junkRegex", value.asInstanceOf[js.Any])
      
      inline def setJunkRegexUndefined: Self = StObject.set(x, "junkRegex", js.undefined)
    }
  }
}
