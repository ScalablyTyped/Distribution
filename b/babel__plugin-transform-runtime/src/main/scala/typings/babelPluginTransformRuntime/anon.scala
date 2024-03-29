package typings.babelPluginTransformRuntime

import typings.babelPluginTransformRuntime.mod.CorejsOption
import typings.babelPluginTransformRuntime.mod.CorejsVersion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Proposals
    extends StObject
       with CorejsOption {
    
    var proposals: Boolean
    
    var version: CorejsVersion
  }
  object Proposals {
    
    inline def apply(proposals: Boolean, version: CorejsVersion): Proposals = {
      val __obj = js.Dynamic.literal(proposals = proposals.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Proposals]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Proposals] (val x: Self) extends AnyVal {
      
      inline def setProposals(value: Boolean): Self = StObject.set(x, "proposals", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: CorejsVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
