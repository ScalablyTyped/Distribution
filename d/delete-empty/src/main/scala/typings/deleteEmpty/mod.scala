package typings.deleteEmpty

import typings.std.Error
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(dir: String): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].apply(dir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  @scala.inline
  def apply(dir: String, cb: DeleteEmptyCallback): Unit = (^.asInstanceOf[js.Dynamic].apply(dir.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(dir: String, options: Options, cb: DeleteEmptyCallback): Unit = (^.asInstanceOf[js.Dynamic].apply(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("delete-empty", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def sync(dir: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(dir.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  @scala.inline
  def sync(dir: String, options: Options): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  type DeleteEmptyCallback = js.Function2[/* err */ js.UndefOr[Error | Null], /* deleted */ js.Array[String], Unit]
  
  type FilterFunction = js.Function2[/* file */ String, /* regex */ RegExp, String]
  
  trait Options extends StObject {
    
    /**
      * Do a dry run without deleting any files
      * @default false
      */
    var dryRun: js.UndefOr[Boolean] = js.undefined
    
    var filter: js.UndefOr[FilterFunction] = js.undefined
    
    var junkRegex: js.UndefOr[RegExp] = js.undefined
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
      def setDryRun(value: Boolean): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDryRunUndefined: Self = StObject.set(x, "dryRun", js.undefined)
      
      @scala.inline
      def setFilter(value: (/* file */ String, /* regex */ RegExp) => String): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setJunkRegex(value: RegExp): Self = StObject.set(x, "junkRegex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJunkRegexUndefined: Self = StObject.set(x, "junkRegex", js.undefined)
    }
  }
}
