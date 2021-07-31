package typings.badgin

import typings.badgin.anon.PartialOptions
import typings.badgin.anon.PartialOptionsFavicon
import typings.badgin.anon.PartialOptionsIndicator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("badgin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[Unit]
  
  @scala.inline
  def set(value: Value): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def set(value: Value, options: PartialOptionsFavicon): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Interface extends StObject {
    
    def clear(): Unit
    
    def set(value: Value): Unit
  }
  object Interface {
    
    @scala.inline
    def apply(clear: () => Unit, set: Value => Unit): Interface = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), set = js.Any.fromFunction1(set))
      __obj.asInstanceOf[Interface]
    }
    
    @scala.inline
    implicit class InterfaceMutableBuilder[Self <: Interface] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSet(value: Value => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.badgin.badginStrings.Badging
    - typings.badgin.badginStrings.Favicon
    - typings.badgin.badginStrings.Title
  */
  trait Method extends StObject
  object Method {
    
    @scala.inline
    def Badging: typings.badgin.badginStrings.Badging = "Badging".asInstanceOf[typings.badgin.badginStrings.Badging]
    
    @scala.inline
    def Favicon: typings.badgin.badginStrings.Favicon = "Favicon".asInstanceOf[typings.badgin.badginStrings.Favicon]
    
    @scala.inline
    def Title: typings.badgin.badginStrings.Title = "Title".asInstanceOf[typings.badgin.badginStrings.Title]
  }
  
  trait Options extends StObject {
    
    var favicon: PartialOptions
    
    var method: Method
    
    var title: PartialOptionsIndicator
  }
  object Options {
    
    @scala.inline
    def apply(favicon: PartialOptions, method: Method, title: PartialOptionsIndicator): Options = {
      val __obj = js.Dynamic.literal(favicon = favicon.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFavicon(value: PartialOptions): Self = StObject.set(x, "favicon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethod(value: Method): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: PartialOptionsIndicator): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  type Value = js.UndefOr[Double]
}
