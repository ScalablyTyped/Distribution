package typings.webpackCdYQfbEx.webpackOptionsDTsMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebpackPluginInstance
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
  	 * The run point of the plugin, required method.
  	 */
  @JSName("apply")
  def apply(
    compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_Compiler */ Any
  ): Unit
}
object WebpackPluginInstance {
  
  inline def apply(
    apply: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_Compiler */ Any => Unit
  ): WebpackPluginInstance = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply))
    __obj.asInstanceOf[WebpackPluginInstance]
  }
  
  extension [Self <: WebpackPluginInstance](x: Self) {
    
    inline def setApply(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_Compiler */ Any => Unit
    ): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
  }
}
