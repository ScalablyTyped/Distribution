package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRelationalDatabaseResult extends StObject {
  
  /**
    * An object describing the specified database.
    */
  var relationalDatabase: js.UndefOr[RelationalDatabase] = js.native
}
object GetRelationalDatabaseResult {
  
  @scala.inline
  def apply(): GetRelationalDatabaseResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRelationalDatabaseResult]
  }
  
  @scala.inline
  implicit class GetRelationalDatabaseResultMutableBuilder[Self <: GetRelationalDatabaseResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRelationalDatabase(value: RelationalDatabase): Self = StObject.set(x, "relationalDatabase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationalDatabaseUndefined: Self = StObject.set(x, "relationalDatabase", js.undefined)
  }
}
