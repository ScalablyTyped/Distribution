package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TriggeringDataset extends js.Object {
  
  /**
    * The name of the dataset whose content generation triggers the new dataset content generation.
    */
  var name: DatasetName = js.native
}
object TriggeringDataset {
  
  @scala.inline
  def apply(name: DatasetName): TriggeringDataset = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggeringDataset]
  }
  
  @scala.inline
  implicit class TriggeringDatasetOps[Self <: TriggeringDataset] (val x: Self) extends AnyVal {
    
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
    def setName(value: DatasetName): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
