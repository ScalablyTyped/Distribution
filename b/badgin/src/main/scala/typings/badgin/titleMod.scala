package typings.badgin

import typings.badgin.anon.PartialOptionsIndicator
import typings.badgin.mod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object titleMod {
  
  @JSImport("badgin/build/title", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def changeTitle(title: Title, value: Value, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("changeTitle")(title.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[Unit]
  
  @JSImport("badgin/build/title", "defaultOptions")
  @js.native
  val defaultOptions: Options = js.native
  
  inline def set(value: Value): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def set(value: Value, options: PartialOptionsIndicator): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait Options extends StObject {
    
    var indicator: String
  }
  object Options {
    
    inline def apply(indicator: String): Options = {
      val __obj = js.Dynamic.literal(indicator = indicator.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setIndicator(value: String): Self = StObject.set(x, "indicator", value.asInstanceOf[js.Any])
    }
  }
  
  type Title = String | Null
}
