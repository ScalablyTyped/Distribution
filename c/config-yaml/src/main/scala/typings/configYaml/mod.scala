package typings.configYaml

import typings.configYaml.anon.PartialOptions
import typings.node.fsMod.PathLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("config-yaml", JSImport.Namespace)
  @js.native
  def apply(path: PathLike): js.Any = js.native
  @JSImport("config-yaml", JSImport.Namespace)
  @js.native
  def apply(path: PathLike, options: PartialOptions): js.Any = js.native
  
  @js.native
  trait Options extends StObject {
    
    var encoding: String = js.native
  }
  object Options {
    
    @scala.inline
    def apply(encoding: String): Options = {
      val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    }
  }
}
