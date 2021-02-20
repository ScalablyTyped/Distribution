package typings.badgin

import typings.badgin.anon.PartialOptionsIndicator
import typings.badgin.mod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object titleMod {
  
  @JSImport("badgin/build/title", "changeTitle")
  @js.native
  def changeTitle(title: Title, value: Value, options: Options): Unit = js.native
  
  @JSImport("badgin/build/title", "clear")
  @js.native
  def clear(): Unit = js.native
  
  @JSImport("badgin/build/title", "defaultOptions")
  @js.native
  val defaultOptions: Options = js.native
  
  @JSImport("badgin/build/title", "set")
  @js.native
  def set(value: Value): Boolean = js.native
  @JSImport("badgin/build/title", "set")
  @js.native
  def set(value: Value, options: PartialOptionsIndicator): Boolean = js.native
  
  @js.native
  trait Options extends StObject {
    
    var indicator: String = js.native
  }
  object Options {
    
    @scala.inline
    def apply(indicator: String): Options = {
      val __obj = js.Dynamic.literal(indicator = indicator.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndicator(value: String): Self = StObject.set(x, "indicator", value.asInstanceOf[js.Any])
    }
  }
  
  type Title = String | Null
}
