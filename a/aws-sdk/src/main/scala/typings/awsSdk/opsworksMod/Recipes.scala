package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Recipes extends StObject {
  
  /**
    * An array of custom recipe names to be run following a configure event.
    */
  var Configure: js.UndefOr[Strings] = js.undefined
  
  /**
    * An array of custom recipe names to be run following a deploy event.
    */
  var Deploy: js.UndefOr[Strings] = js.undefined
  
  /**
    * An array of custom recipe names to be run following a setup event.
    */
  var Setup: js.UndefOr[Strings] = js.undefined
  
  /**
    * An array of custom recipe names to be run following a shutdown event.
    */
  var Shutdown: js.UndefOr[Strings] = js.undefined
  
  /**
    * An array of custom recipe names to be run following a undeploy event.
    */
  var Undeploy: js.UndefOr[Strings] = js.undefined
}
object Recipes {
  
  @scala.inline
  def apply(): Recipes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Recipes]
  }
  
  @scala.inline
  implicit class RecipesMutableBuilder[Self <: Recipes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigure(value: Strings): Self = StObject.set(x, "Configure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigureUndefined: Self = StObject.set(x, "Configure", js.undefined)
    
    @scala.inline
    def setConfigureVarargs(value: String*): Self = StObject.set(x, "Configure", js.Array(value :_*))
    
    @scala.inline
    def setDeploy(value: Strings): Self = StObject.set(x, "Deploy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeployUndefined: Self = StObject.set(x, "Deploy", js.undefined)
    
    @scala.inline
    def setDeployVarargs(value: String*): Self = StObject.set(x, "Deploy", js.Array(value :_*))
    
    @scala.inline
    def setSetup(value: Strings): Self = StObject.set(x, "Setup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetupUndefined: Self = StObject.set(x, "Setup", js.undefined)
    
    @scala.inline
    def setSetupVarargs(value: String*): Self = StObject.set(x, "Setup", js.Array(value :_*))
    
    @scala.inline
    def setShutdown(value: Strings): Self = StObject.set(x, "Shutdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShutdownUndefined: Self = StObject.set(x, "Shutdown", js.undefined)
    
    @scala.inline
    def setShutdownVarargs(value: String*): Self = StObject.set(x, "Shutdown", js.Array(value :_*))
    
    @scala.inline
    def setUndeploy(value: Strings): Self = StObject.set(x, "Undeploy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUndeployUndefined: Self = StObject.set(x, "Undeploy", js.undefined)
    
    @scala.inline
    def setUndeployVarargs(value: String*): Self = StObject.set(x, "Undeploy", js.Array(value :_*))
  }
}
