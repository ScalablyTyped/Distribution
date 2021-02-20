package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatastoreStatistics extends StObject {
  
  /**
    * The estimated size of the data store.
    */
  var size: js.UndefOr[EstimatedResourceSize] = js.native
}
object DatastoreStatistics {
  
  @scala.inline
  def apply(): DatastoreStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatastoreStatistics]
  }
  
  @scala.inline
  implicit class DatastoreStatisticsMutableBuilder[Self <: DatastoreStatistics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSize(value: EstimatedResourceSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
