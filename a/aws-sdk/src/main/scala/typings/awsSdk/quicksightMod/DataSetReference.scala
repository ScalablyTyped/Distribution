package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSetReference extends js.Object {
  
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
  implicit class DataSetReferenceOps[Self <: DataSetReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDataSetArn(value: Arn): Self = this.set("DataSetArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSetPlaceholder(value: NonEmptyString): Self = this.set("DataSetPlaceholder", value.asInstanceOf[js.Any])
  }
}
