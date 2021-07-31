package typings.awsSdk.docdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyDBInstanceResult extends StObject {
  
  var DBInstance: js.UndefOr[typings.awsSdk.docdbMod.DBInstance] = js.undefined
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
