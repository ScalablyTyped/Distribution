package typings.deleteEmpty

import typings.std.Error
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("delete-empty", JSImport.Namespace)
  @js.native
  def apply(dir: String): js.Promise[js.Array[String]] = js.native
  @JSImport("delete-empty", JSImport.Namespace)
  @js.native
  def apply(dir: String, cb: DeleteEmptyCallback): Unit = js.native
  @JSImport("delete-empty", JSImport.Namespace)
  @js.native
  def apply(dir: String, options: Options, cb: DeleteEmptyCallback): Unit = js.native
  
  @JSImport("delete-empty", "sync")
  @js.native
  def sync(dir: String): js.Array[String] = js.native
  @JSImport("delete-empty", "sync")
  @js.native
  def sync(dir: String, options: Options): js.Array[String] = js.native
  
  type DeleteEmptyCallback = js.Function2[/* err */ js.UndefOr[Error | Null], /* deleted */ js.Array[String], Unit]
  
  type FilterFunction = js.Function2[/* file */ String, /* regex */ RegExp, String]
  
  @js.native
  trait Options extends StObject {
    
    /**
      * Do a dry run without deleting any files
      * @default false
      */
    var dryRun: js.UndefOr[Boolean] = js.native
    
    var filter: js.UndefOr[FilterFunction] = js.native
    
    var junkRegex: js.UndefOr[RegExp] = js.native
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
