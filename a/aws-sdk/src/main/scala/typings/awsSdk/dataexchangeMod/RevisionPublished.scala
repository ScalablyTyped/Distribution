package typings.awsSdk.dataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RevisionPublished extends StObject {
  
  /**
    * The data set ID of the published revision.
    */
  var DataSetId: Id
}
object RevisionPublished {
  
  inline def apply(DataSetId: Id): RevisionPublished = {
    val __obj = js.Dynamic.literal(DataSetId = DataSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevisionPublished]
  }
  
  extension [Self <: RevisionPublished](x: Self) {
    
    inline def setDataSetId(value: Id): Self = StObject.set(x, "DataSetId", value.asInstanceOf[js.Any])
  }
}
