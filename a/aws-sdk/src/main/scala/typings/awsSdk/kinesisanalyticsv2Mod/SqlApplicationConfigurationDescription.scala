package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SqlApplicationConfigurationDescription extends StObject {
  
  /**
    * The array of InputDescription objects describing the input streams used by the application.
    */
  var InputDescriptions: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.InputDescriptions] = js.native
  
  /**
    * The array of OutputDescription objects describing the destination streams used by the application.
    */
  var OutputDescriptions: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.OutputDescriptions] = js.native
  
  /**
    * The array of ReferenceDataSourceDescription objects describing the reference data sources used by the application.
    */
  var ReferenceDataSourceDescriptions: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.ReferenceDataSourceDescriptions] = js.native
}
object SqlApplicationConfigurationDescription {
  
  @scala.inline
  def apply(): SqlApplicationConfigurationDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SqlApplicationConfigurationDescription]
  }
  
  @scala.inline
  implicit class SqlApplicationConfigurationDescriptionMutableBuilder[Self <: SqlApplicationConfigurationDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputDescriptions(value: InputDescriptions): Self = StObject.set(x, "InputDescriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputDescriptionsUndefined: Self = StObject.set(x, "InputDescriptions", js.undefined)
    
    @scala.inline
    def setInputDescriptionsVarargs(value: InputDescription*): Self = StObject.set(x, "InputDescriptions", js.Array(value :_*))
    
    @scala.inline
    def setOutputDescriptions(value: OutputDescriptions): Self = StObject.set(x, "OutputDescriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputDescriptionsUndefined: Self = StObject.set(x, "OutputDescriptions", js.undefined)
    
    @scala.inline
    def setOutputDescriptionsVarargs(value: OutputDescription*): Self = StObject.set(x, "OutputDescriptions", js.Array(value :_*))
    
    @scala.inline
    def setReferenceDataSourceDescriptions(value: ReferenceDataSourceDescriptions): Self = StObject.set(x, "ReferenceDataSourceDescriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceDataSourceDescriptionsUndefined: Self = StObject.set(x, "ReferenceDataSourceDescriptions", js.undefined)
    
    @scala.inline
    def setReferenceDataSourceDescriptionsVarargs(value: ReferenceDataSourceDescription*): Self = StObject.set(x, "ReferenceDataSourceDescriptions", js.Array(value :_*))
  }
}
