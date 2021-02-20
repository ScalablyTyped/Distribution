package typings.babelPluginTransformRuntime

import typings.babelPluginTransformRuntime.mod.CorejsOption
import typings.babelPluginTransformRuntime.mod.CorejsVersion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Proposals extends CorejsOption {
    
    var proposals: Boolean = js.native
    
    var version: CorejsVersion = js.native
  }
  object Proposals {
    
    @scala.inline
    def apply(proposals: Boolean, version: CorejsVersion): Proposals = {
      val __obj = js.Dynamic.literal(proposals = proposals.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Proposals]
    }
    
    @scala.inline
    implicit class ProposalsMutableBuilder[Self <: Proposals] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProposals(value: Boolean): Self = StObject.set(x, "proposals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: CorejsVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
