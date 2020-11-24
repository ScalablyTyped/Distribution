package typings.babelPluginTransformRuntime.anon

import typings.babelPluginTransformRuntime.mod.CorejsOption
import typings.babelPluginTransformRuntime.mod.CorejsVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class ProposalsOps[Self <: Proposals] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setProposals(value: Boolean): Self = this.set("proposals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: CorejsVersion): Self = this.set("version", value.asInstanceOf[js.Any])
  }
}
