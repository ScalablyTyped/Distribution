package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Input extends StObject {
  
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
  implicit class InputMutableBuilder[Self <: Input] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataCatalogInputDefinition(value: DataCatalogInputDefinition): Self = StObject.set(x, "DataCatalogInputDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataCatalogInputDefinitionUndefined: Self = StObject.set(x, "DataCatalogInputDefinition", js.undefined)
    
    @scala.inline
    def setS3InputDefinition(value: S3Location): Self = StObject.set(x, "S3InputDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3InputDefinitionUndefined: Self = StObject.set(x, "S3InputDefinition", js.undefined)
  }
}
