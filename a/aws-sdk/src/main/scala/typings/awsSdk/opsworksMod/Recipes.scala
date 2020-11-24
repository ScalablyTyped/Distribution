package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Recipes extends js.Object {
  
  /**
    * An array of custom recipe names to be run following a configure event.
    */
  var Configure: js.UndefOr[Strings] = js.native
  
  /**
    * An array of custom recipe names to be run following a deploy event.
    */
  var Deploy: js.UndefOr[Strings] = js.native
  
  /**
    * An array of custom recipe names to be run following a setup event.
    */
  var Setup: js.UndefOr[Strings] = js.native
  
  /**
    * An array of custom recipe names to be run following a shutdown event.
    */
  var Shutdown: js.UndefOr[Strings] = js.native
  
  /**
    * An array of custom recipe names to be run following a undeploy event.
    */
  var Undeploy: js.UndefOr[Strings] = js.native
}
object Recipes {
  
  @scala.inline
  def apply(): Recipes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Recipes]
  }
  
  @scala.inline
  implicit class RecipesOps[Self <: Recipes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConfigureVarargs(value: String*): Self = this.set("Configure", js.Array(value :_*))
    
    @scala.inline
    def setConfigure(value: Strings): Self = this.set("Configure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigure: Self = this.set("Configure", js.undefined)
    
    @scala.inline
    def setDeployVarargs(value: String*): Self = this.set("Deploy", js.Array(value :_*))
    
    @scala.inline
    def setDeploy(value: Strings): Self = this.set("Deploy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeploy: Self = this.set("Deploy", js.undefined)
    
    @scala.inline
    def setSetupVarargs(value: String*): Self = this.set("Setup", js.Array(value :_*))
    
    @scala.inline
    def setSetup(value: Strings): Self = this.set("Setup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetup: Self = this.set("Setup", js.undefined)
    
    @scala.inline
    def setShutdownVarargs(value: String*): Self = this.set("Shutdown", js.Array(value :_*))
    
    @scala.inline
    def setShutdown(value: Strings): Self = this.set("Shutdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShutdown: Self = this.set("Shutdown", js.undefined)
    
    @scala.inline
    def setUndeployVarargs(value: String*): Self = this.set("Undeploy", js.Array(value :_*))
    
    @scala.inline
    def setUndeploy(value: Strings): Self = this.set("Undeploy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUndeploy: Self = this.set("Undeploy", js.undefined)
  }
}
