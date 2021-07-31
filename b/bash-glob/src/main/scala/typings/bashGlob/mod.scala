package typings.bashGlob

import typings.bashGlob.bashGlobStrings.`match`
import typings.bashGlob.bashGlobStrings.end
import typings.bashGlob.bashGlobStrings.files
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(pattern: Patterns, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(pattern: Patterns, options: Options, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("bash-glob", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def each(patterns: Patterns, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(patterns.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def each(patterns: Patterns, options: Options, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(patterns.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_end(event: end, callback: js.Function1[/* files */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_files(event: files, callback: js.Function2[/* files */ String, /* cwd */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def on_match(event: `match`, callback: js.Function2[/* files */ String, /* cwd */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def promise(patterns: Patterns): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("promise")(patterns.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  @scala.inline
  def promise(patterns: Patterns, options: Options): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("promise")(patterns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  
  @scala.inline
  def sync(patterns: Patterns): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(patterns.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  @scala.inline
  def sync(patterns: Patterns, options: Options): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(patterns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  type Callback = js.Function2[/* err */ Error, /* files */ js.Array[String], Unit]
  
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
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setDot(value: Boolean): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotUndefined: Self = StObject.set(x, "dot", js.undefined)
      
      @scala.inline
      def setDotglob(value: Boolean): Self = StObject.set(x, "dotglob", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotglobUndefined: Self = StObject.set(x, "dotglob", js.undefined)
      
      @scala.inline
      def setExtglob(value: Boolean): Self = StObject.set(x, "extglob", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtglobUndefined: Self = StObject.set(x, "extglob", js.undefined)
      
      @scala.inline
      def setFailglob(value: Boolean): Self = StObject.set(x, "failglob", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailglobUndefined: Self = StObject.set(x, "failglob", js.undefined)
      
      @scala.inline
      def setGlobstar(value: Boolean): Self = StObject.set(x, "globstar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobstarUndefined: Self = StObject.set(x, "globstar", js.undefined)
      
      @scala.inline
      def setNocase(value: Boolean): Self = StObject.set(x, "nocase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNocaseUndefined: Self = StObject.set(x, "nocase", js.undefined)
      
      @scala.inline
      def setNocaseglob(value: Boolean): Self = StObject.set(x, "nocaseglob", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNocaseglobUndefined: Self = StObject.set(x, "nocaseglob", js.undefined)
      
      @scala.inline
      def setNullglob(value: Boolean): Self = StObject.set(x, "nullglob", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNullglobUndefined: Self = StObject.set(x, "nullglob", js.undefined)
    }
  }
  
  type Patterns = String | js.Array[String]
}
