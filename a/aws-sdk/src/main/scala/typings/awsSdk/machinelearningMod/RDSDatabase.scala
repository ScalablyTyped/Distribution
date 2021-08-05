package typings.awsSdk.machinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RDSDatabase extends StObject {
  
  var DatabaseName: RDSDatabaseName
  
  /**
    * The ID of an RDS DB instance.
    */
  var InstanceIdentifier: RDSInstanceIdentifier
}
object RDSDatabase {
  
  inline def apply(DatabaseName: RDSDatabaseName, InstanceIdentifier: RDSInstanceIdentifier): RDSDatabase = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], InstanceIdentifier = InstanceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[RDSDatabase]
  }
  
  extension [Self <: RDSDatabase](x: Self) {
    
    inline def setDatabaseName(value: RDSDatabaseName): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdentifier(value: RDSInstanceIdentifier): Self = StObject.set(x, "InstanceIdentifier", value.asInstanceOf[js.Any])
  }
}
