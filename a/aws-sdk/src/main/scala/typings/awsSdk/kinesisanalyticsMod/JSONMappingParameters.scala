package typings.awsSdk.kinesisanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSONMappingParameters extends StObject {
  
  /**
    * Path to the top-level parent that contains the records.
    */
  var RecordRowPath: typings.awsSdk.kinesisanalyticsMod.RecordRowPath = js.native
}
object JSONMappingParameters {
  
  @scala.inline
  def apply(RecordRowPath: RecordRowPath): JSONMappingParameters = {
    val __obj = js.Dynamic.literal(RecordRowPath = RecordRowPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONMappingParameters]
  }
  
  @scala.inline
  implicit class JSONMappingParametersMutableBuilder[Self <: JSONMappingParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecordRowPath(value: RecordRowPath): Self = StObject.set(x, "RecordRowPath", value.asInstanceOf[js.Any])
  }
}
