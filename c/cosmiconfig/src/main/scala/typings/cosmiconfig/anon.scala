package typings.cosmiconfig

import typings.cosmiconfig.typesMod.CosmiconfigResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ClearCaches extends StObject {
    
    def clearCaches(): Unit = js.native
    
    def clearLoadCache(): Unit = js.native
    
    def clearSearchCache(): Unit = js.native
    
    def load(filepath: String): js.Promise[CosmiconfigResult] = js.native
    
    def search(): js.Promise[CosmiconfigResult] = js.native
    def search(searchFrom: String): js.Promise[CosmiconfigResult] = js.native
  }
  
  @js.native
  trait ClearLoadCache extends StObject {
    
    def clearCaches(): Unit = js.native
    
    def clearLoadCache(): Unit = js.native
    
    def clearSearchCache(): Unit = js.native
    
    def load(filepath: String): CosmiconfigResult = js.native
    
    def search(): CosmiconfigResult = js.native
    def search(searchFrom: String): CosmiconfigResult = js.native
  }
  
  @js.native
  trait Config extends StObject {
    
    var config: typings.cosmiconfig.typesMod.Config = js.native
    
    var filepath: String = js.native
    
    var isEmpty: js.UndefOr[Boolean] = js.native
  }
  object Config {
    
    @scala.inline
    def apply(config: typings.cosmiconfig.typesMod.Config, filepath: String): Config = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], filepath = filepath.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfig(value: typings.cosmiconfig.typesMod.Config): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilepath(value: String): Self = StObject.set(x, "filepath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsEmpty(value: Boolean): Self = StObject.set(x, "isEmpty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsEmptyUndefined: Self = StObject.set(x, "isEmpty", js.undefined)
    }
  }
}
