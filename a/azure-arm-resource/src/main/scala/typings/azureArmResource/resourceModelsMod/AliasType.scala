package typings.azureArmResource.resourceModelsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AliasType extends StObject {
  
  /**
    * The alias name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The paths for an alias.
    */
  var paths: js.UndefOr[js.Array[AliasPathType]] = js.undefined
}
object AliasType {
  
  @scala.inline
  def apply(): AliasType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AliasType]
  }
  
  @scala.inline
  implicit class AliasTypeMutableBuilder[Self <: AliasType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPaths(value: js.Array[AliasPathType]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
    
    @scala.inline
    def setPathsVarargs(value: AliasPathType*): Self = StObject.set(x, "paths", js.Array(value :_*))
  }
}
