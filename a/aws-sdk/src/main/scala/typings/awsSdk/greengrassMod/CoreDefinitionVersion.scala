package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoreDefinitionVersion extends StObject {
  
  /**
    * A list of cores in the core definition version.
    */
  var Cores: js.UndefOr[listOfCore] = js.undefined
}
object CoreDefinitionVersion {
  
  @scala.inline
  def apply(): CoreDefinitionVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoreDefinitionVersion]
  }
  
  @scala.inline
  implicit class CoreDefinitionVersionMutableBuilder[Self <: CoreDefinitionVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCores(value: listOfCore): Self = StObject.set(x, "Cores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoresUndefined: Self = StObject.set(x, "Cores", js.undefined)
    
    @scala.inline
    def setCoresVarargs(value: Core*): Self = StObject.set(x, "Cores", js.Array(value :_*))
  }
}
