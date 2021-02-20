package typings.awsSdk.timestreamwriteMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateDatabaseResponse extends StObject {
  
  var Database: js.UndefOr[typings.awsSdk.timestreamwriteMod.Database] = js.native
}
object UpdateDatabaseResponse {
  
  @scala.inline
  def apply(): UpdateDatabaseResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDatabaseResponse]
  }
  
  @scala.inline
  implicit class UpdateDatabaseResponseMutableBuilder[Self <: UpdateDatabaseResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatabase(value: Database): Self = StObject.set(x, "Database", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseUndefined: Self = StObject.set(x, "Database", js.undefined)
  }
}
