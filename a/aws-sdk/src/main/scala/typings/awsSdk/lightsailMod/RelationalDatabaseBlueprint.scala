package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelationalDatabaseBlueprint extends StObject {
  
  /**
    * The ID for the database blueprint.
    */
  var blueprintId: js.UndefOr[String] = js.native
  
  /**
    * The database software of the database blueprint (for example, MySQL).
    */
  var engine: js.UndefOr[RelationalDatabaseEngine] = js.native
  
  /**
    * The description of the database engine for the database blueprint.
    */
  var engineDescription: js.UndefOr[String] = js.native
  
  /**
    * The database engine version for the database blueprint (for example, 5.7.23).
    */
  var engineVersion: js.UndefOr[String] = js.native
  
  /**
    * The description of the database engine version for the database blueprint.
    */
  var engineVersionDescription: js.UndefOr[String] = js.native
  
  /**
    * A Boolean value indicating whether the engine version is the default for the database blueprint.
    */
  var isEngineDefault: js.UndefOr[Boolean] = js.native
}
object RelationalDatabaseBlueprint {
  
  @scala.inline
  def apply(): RelationalDatabaseBlueprint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelationalDatabaseBlueprint]
  }
  
  @scala.inline
  implicit class RelationalDatabaseBlueprintMutableBuilder[Self <: RelationalDatabaseBlueprint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlueprintId(value: String): Self = StObject.set(x, "blueprintId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlueprintIdUndefined: Self = StObject.set(x, "blueprintId", js.undefined)
    
    @scala.inline
    def setEngine(value: RelationalDatabaseEngine): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineDescription(value: String): Self = StObject.set(x, "engineDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineDescriptionUndefined: Self = StObject.set(x, "engineDescription", js.undefined)
    
    @scala.inline
    def setEngineUndefined: Self = StObject.set(x, "engine", js.undefined)
    
    @scala.inline
    def setEngineVersion(value: String): Self = StObject.set(x, "engineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineVersionDescription(value: String): Self = StObject.set(x, "engineVersionDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineVersionDescriptionUndefined: Self = StObject.set(x, "engineVersionDescription", js.undefined)
    
    @scala.inline
    def setEngineVersionUndefined: Self = StObject.set(x, "engineVersion", js.undefined)
    
    @scala.inline
    def setIsEngineDefault(value: Boolean): Self = StObject.set(x, "isEngineDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEngineDefaultUndefined: Self = StObject.set(x, "isEngineDefault", js.undefined)
  }
}
