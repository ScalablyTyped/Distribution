package typings.awsSdk.databrewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Input extends js.Object {
  
  /**
    * The AWS Glue Data Catalog parameters for the data.
    */
  var DataCatalogInputDefinition: js.UndefOr[typings.awsSdk.databrewMod.DataCatalogInputDefinition] = js.native
  
  /**
    * The Amazon S3 location where the data is stored.
    */
  var S3InputDefinition: js.UndefOr[S3Location] = js.native
}
object Input {
  
  @scala.inline
  def apply(): Input = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Input]
  }
  
  @scala.inline
  implicit class InputOps[Self <: Input] (val x: Self) extends AnyVal {
    
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
    def setDataCatalogInputDefinition(value: DataCatalogInputDefinition): Self = this.set("DataCatalogInputDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataCatalogInputDefinition: Self = this.set("DataCatalogInputDefinition", js.undefined)
    
    @scala.inline
    def setS3InputDefinition(value: S3Location): Self = this.set("S3InputDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3InputDefinition: Self = this.set("S3InputDefinition", js.undefined)
  }
}
