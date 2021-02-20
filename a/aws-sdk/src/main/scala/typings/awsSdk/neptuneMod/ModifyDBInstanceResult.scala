package typings.awsSdk.neptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyDBInstanceResult extends StObject {
  
  var DBInstance: js.UndefOr[typings.awsSdk.neptuneMod.DBInstance] = js.native
}
object ModifyDBInstanceResult {
  
  @scala.inline
  def apply(): ModifyDBInstanceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyDBInstanceResult]
  }
  
  @scala.inline
  implicit class ModifyDBInstanceResultMutableBuilder[Self <: ModifyDBInstanceResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBInstance(value: DBInstance): Self = StObject.set(x, "DBInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBInstanceUndefined: Self = StObject.set(x, "DBInstance", js.undefined)
  }
}
