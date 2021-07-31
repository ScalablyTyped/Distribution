package typings.awsSdk.neptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDBInstanceResult extends StObject {
  
  var DBInstance: js.UndefOr[typings.awsSdk.neptuneMod.DBInstance] = js.undefined
}
object DeleteDBInstanceResult {
  
  @scala.inline
  def apply(): DeleteDBInstanceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDBInstanceResult]
  }
  
  @scala.inline
  implicit class DeleteDBInstanceResultMutableBuilder[Self <: DeleteDBInstanceResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBInstance(value: DBInstance): Self = StObject.set(x, "DBInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBInstanceUndefined: Self = StObject.set(x, "DBInstance", js.undefined)
  }
}
