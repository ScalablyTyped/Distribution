package typings.bashGlob

import typings.bashGlob.bashGlobStrings.`match`
import typings.bashGlob.bashGlobStrings.end
import typings.bashGlob.bashGlobStrings.files
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bash-glob", JSImport.Namespace)
  @js.native
  def apply(pattern: Patterns, callback: Callback): Unit = js.native
  @JSImport("bash-glob", JSImport.Namespace)
  @js.native
  def apply(pattern: Patterns, options: Options, callback: Callback): Unit = js.native
  
  @JSImport("bash-glob", "each")
  @js.native
  def each(patterns: Patterns, callback: Callback): Unit = js.native
  @JSImport("bash-glob", "each")
  @js.native
  def each(patterns: Patterns, options: Options, callback: Callback): Unit = js.native
  
  @JSImport("bash-glob", "on")
  @js.native
  def on_end(event: end, callback: js.Function1[/* files */ String, Unit]): Unit = js.native
  @JSImport("bash-glob", "on")
  @js.native
  def on_files(event: files, callback: js.Function2[/* files */ String, /* cwd */ String, Unit]): Unit = js.native
  @JSImport("bash-glob", "on")
  @js.native
  def on_match(event: `match`, callback: js.Function2[/* files */ String, /* cwd */ String, Unit]): Unit = js.native
  
  @JSImport("bash-glob", "promise")
  @js.native
  def promise(patterns: Patterns): js.Promise[js.Array[String]] = js.native
  @JSImport("bash-glob", "promise")
  @js.native
  def promise(patterns: Patterns, options: Options): js.Promise[js.Array[String]] = js.native
  
  @JSImport("bash-glob", "sync")
  @js.native
  def sync(patterns: Patterns): js.Array[String] = js.native
  @JSImport("bash-glob", "sync")
  @js.native
  def sync(patterns: Patterns, options: Options): js.Array[String] = js.native
  
  type Callback = js.Function2[/* err */ Error, /* files */ js.Array[String], Unit]
  
  @js.native
  trait Options extends StObject {
    
    var cwd: js.UndefOr[String] = js.native
    
    var dot: js.UndefOr[Boolean] = js.native
    
    var dotglob: js.UndefOr[Boolean] = js.native
    
    var extglob: js.UndefOr[Boolean] = js.native
    
    var failglob: js.UndefOr[Boolean] = js.native
    
    var globstar: js.UndefOr[Boolean] = js.native
    
    var nocase: js.UndefOr[Boolean] = js.native
    
    var nocaseglob: js.UndefOr[Boolean] = js.native
    
    var nullglob: js.UndefOr[Boolean] = js.native
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
