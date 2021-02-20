package typings.blockingProxy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configMod {
  
  @JSImport("blocking-proxy/built/lib/config", "printHelp")
  @js.native
  def printHelp(): Unit = js.native
  
  @JSImport("blocking-proxy/built/lib/config", "processArgs")
  @js.native
  def processArgs(argv: js.Array[String]): Config = js.native
  
  @js.native
  trait Config extends StObject {
    
    var fork: js.UndefOr[Boolean] = js.native
    
    var help: js.UndefOr[Boolean] = js.native
    
    var highlightDelay: js.UndefOr[String] = js.native
    
    var logDir: js.UndefOr[String] = js.native
    
    var port: js.UndefOr[Double] = js.native
    
    var seleniumAddress: js.UndefOr[String] = js.native
  }
  object Config {
    
    @scala.inline
    def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFork(value: Boolean): Self = StObject.set(x, "fork", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForkUndefined: Self = StObject.set(x, "fork", js.undefined)
      
      @scala.inline
      def setHelp(value: Boolean): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
      
      @scala.inline
      def setHighlightDelay(value: String): Self = StObject.set(x, "highlightDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightDelayUndefined: Self = StObject.set(x, "highlightDelay", js.undefined)
      
      @scala.inline
      def setLogDir(value: String): Self = StObject.set(x, "logDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogDirUndefined: Self = StObject.set(x, "logDir", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setSeleniumAddress(value: String): Self = StObject.set(x, "seleniumAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeleniumAddressUndefined: Self = StObject.set(x, "seleniumAddress", js.undefined)
    }
  }
}
