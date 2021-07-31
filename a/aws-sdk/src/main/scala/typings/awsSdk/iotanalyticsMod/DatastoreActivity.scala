package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatastoreActivity extends StObject {
  
  /**
    * The name of the data store where processed messages are stored.
    */
  var datastoreName: DatastoreName
  
  /**
    * The name of the datastore activity.
    */
  var name: ActivityName
}
object DatastoreActivity {
  
  @scala.inline
  def apply(datastoreName: DatastoreName, name: ActivityName): DatastoreActivity = {
    val __obj = js.Dynamic.literal(datastoreName = datastoreName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatastoreActivity]
  }
  
  @scala.inline
  implicit class DatastoreActivityMutableBuilder[Self <: DatastoreActivity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatastoreName(value: DatastoreName): Self = StObject.set(x, "datastoreName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: ActivityName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
