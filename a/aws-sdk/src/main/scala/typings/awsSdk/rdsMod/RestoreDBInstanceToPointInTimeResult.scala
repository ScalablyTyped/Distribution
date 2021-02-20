package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestoreDBInstanceToPointInTimeResult extends StObject {
  
  var DBInstance: js.UndefOr[typings.awsSdk.rdsMod.DBInstance] = js.native
}
object RestoreDBInstanceToPointInTimeResult {
  
  @scala.inline
  def apply(): RestoreDBInstanceToPointInTimeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreDBInstanceToPointInTimeResult]
  }
  
  @scala.inline
  implicit class RestoreDBInstanceToPointInTimeResultMutableBuilder[Self <: RestoreDBInstanceToPointInTimeResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBInstance(value: DBInstance): Self = StObject.set(x, "DBInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBInstanceUndefined: Self = StObject.set(x, "DBInstance", js.undefined)
  }
}
