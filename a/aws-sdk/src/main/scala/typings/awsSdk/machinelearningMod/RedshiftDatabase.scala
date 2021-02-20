package typings.awsSdk.machinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RedshiftDatabase extends StObject {
  
  var ClusterIdentifier: RedshiftClusterIdentifier = js.native
  
  var DatabaseName: RedshiftDatabaseName = js.native
}
object RedshiftDatabase {
  
  @scala.inline
  def apply(ClusterIdentifier: RedshiftClusterIdentifier, DatabaseName: RedshiftDatabaseName): RedshiftDatabase = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any], DatabaseName = DatabaseName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedshiftDatabase]
  }
  
  @scala.inline
  implicit class RedshiftDatabaseMutableBuilder[Self <: RedshiftDatabase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterIdentifier(value: RedshiftClusterIdentifier): Self = StObject.set(x, "ClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseName(value: RedshiftDatabaseName): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
  }
}
