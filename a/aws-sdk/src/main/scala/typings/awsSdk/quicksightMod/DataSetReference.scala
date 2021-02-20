package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSetReference extends StObject {
  
  /**
    * Dataset Amazon Resource Name (ARN).
    */
  var DataSetArn: Arn = js.native
  
  /**
    * Dataset placeholder.
    */
  var DataSetPlaceholder: NonEmptyString = js.native
}
object DataSetReference {
  
  @scala.inline
  def apply(DataSetArn: Arn, DataSetPlaceholder: NonEmptyString): DataSetReference = {
    val __obj = js.Dynamic.literal(DataSetArn = DataSetArn.asInstanceOf[js.Any], DataSetPlaceholder = DataSetPlaceholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSetReference]
  }
  
  @scala.inline
  implicit class DataSetReferenceMutableBuilder[Self <: DataSetReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSetArn(value: Arn): Self = StObject.set(x, "DataSetArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSetPlaceholder(value: NonEmptyString): Self = StObject.set(x, "DataSetPlaceholder", value.asInstanceOf[js.Any])
  }
}
