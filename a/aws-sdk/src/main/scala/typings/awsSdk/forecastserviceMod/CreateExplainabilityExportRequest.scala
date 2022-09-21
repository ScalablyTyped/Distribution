package typings.awsSdk.forecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateExplainabilityExportRequest extends StObject {
  
  var Destination: DataDestination
  
  /**
    * The Amazon Resource Name (ARN) of the Explainability to export.
    */
  var ExplainabilityArn: Arn
  
  /**
    * A unique name for the Explainability export.
    */
  var ExplainabilityExportName: Name
  
  /**
    * The format of the exported data, CSV or PARQUET.
    */
  var Format: js.UndefOr[typings.awsSdk.forecastserviceMod.Format] = js.undefined
  
  /**
    * Optional metadata to help you categorize and organize your resources. Each tag consists of a key and an optional value, both of which you define. Tag keys and values are case sensitive. The following restrictions apply to tags:   For each resource, each tag key must be unique and each tag key must have one value.   Maximum number of tags per resource: 50.   Maximum key length: 128 Unicode characters in UTF-8.   Maximum value length: 256 Unicode characters in UTF-8.   Accepted characters: all letters and numbers, spaces representable in UTF-8, and + - = . _ : / @. If your tagging schema is used across other services and resources, the character restrictions of those services also apply.    Key prefixes cannot include any upper or lowercase combination of aws: or AWS:. Values can have this prefix. If a tag value has aws as its prefix but the key does not, Forecast considers it to be a user tag and will count against the limit of 50 tags. Tags with only the key prefix of aws do not count against your tags per resource limit. You cannot edit or delete tag keys with this prefix.  
    */
  var Tags: js.UndefOr[typings.awsSdk.forecastserviceMod.Tags] = js.undefined
}
object CreateExplainabilityExportRequest {
  
  inline def apply(Destination: DataDestination, ExplainabilityArn: Arn, ExplainabilityExportName: Name): CreateExplainabilityExportRequest = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any], ExplainabilityArn = ExplainabilityArn.asInstanceOf[js.Any], ExplainabilityExportName = ExplainabilityExportName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateExplainabilityExportRequest]
  }
  
  extension [Self <: CreateExplainabilityExportRequest](x: Self) {
    
    inline def setDestination(value: DataDestination): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    inline def setExplainabilityArn(value: Arn): Self = StObject.set(x, "ExplainabilityArn", value.asInstanceOf[js.Any])
    
    inline def setExplainabilityExportName(value: Name): Self = StObject.set(x, "ExplainabilityExportName", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: Format): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "Format", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
