package typings.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RDSDatabase extends js.Object {
  
  var DatabaseName: RDSDatabaseName = js.native
  
  /**
    * The ID of an RDS DB instance.
    */
  var InstanceIdentifier: RDSInstanceIdentifier = js.native
}
object RDSDatabase {
  
  @scala.inline
  def apply(DatabaseName: RDSDatabaseName, InstanceIdentifier: RDSInstanceIdentifier): RDSDatabase = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], InstanceIdentifier = InstanceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[RDSDatabase]
  }
  
  @scala.inline
  implicit class RDSDatabaseOps[Self <: RDSDatabase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDatabaseName(value: RDSDatabaseName): Self = this.set("DatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdentifier(value: RDSInstanceIdentifier): Self = this.set("InstanceIdentifier", value.asInstanceOf[js.Any])
  }
}
