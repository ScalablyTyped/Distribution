package typings.cordovaPluginInsomnia

import typings.cordovaPluginInsomnia.InsomniaPlugin.Insomnia
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Plugins extends StObject {
  
  var insomnia: Insomnia
}
object Plugins {
  
  @scala.inline
  def apply(insomnia: Insomnia): Plugins = {
    val __obj = js.Dynamic.literal(insomnia = insomnia.asInstanceOf[js.Any])
    __obj.asInstanceOf[Plugins]
  }
  
  @scala.inline
  implicit class PluginsMutableBuilder[Self <: Plugins] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInsomnia(value: Insomnia): Self = StObject.set(x, "insomnia", value.asInstanceOf[js.Any])
  }
}
