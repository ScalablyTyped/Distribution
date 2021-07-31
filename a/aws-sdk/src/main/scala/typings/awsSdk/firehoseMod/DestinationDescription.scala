package typings.awsSdk.firehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DestinationDescription extends StObject {
  
  /**
    * The ID of the destination.
    */
  var DestinationId: typings.awsSdk.firehoseMod.DestinationId
  
  /**
    * The destination in Amazon ES.
    */
  var ElasticsearchDestinationDescription: js.UndefOr[typings.awsSdk.firehoseMod.ElasticsearchDestinationDescription] = js.undefined
  
  /**
    * The destination in Amazon S3.
    */
  var ExtendedS3DestinationDescription: js.UndefOr[typings.awsSdk.firehoseMod.ExtendedS3DestinationDescription] = js.undefined
  
  /**
    * Describes the specified HTTP endpoint destination.
    */
  var HttpEndpointDestinationDescription: js.UndefOr[typings.awsSdk.firehoseMod.HttpEndpointDestinationDescription] = js.undefined
  
  /**
    * The destination in Amazon Redshift.
    */
  var RedshiftDestinationDescription: js.UndefOr[typings.awsSdk.firehoseMod.RedshiftDestinationDescription] = js.undefined
  
  /**
    * [Deprecated] The destination in Amazon S3.
    */
  var S3DestinationDescription: js.UndefOr[typings.awsSdk.firehoseMod.S3DestinationDescription] = js.undefined
  
  /**
    * The destination in Splunk.
    */
  var SplunkDestinationDescription: js.UndefOr[typings.awsSdk.firehoseMod.SplunkDestinationDescription] = js.undefined
}
object DestinationDescription {
  
  @scala.inline
  def apply(DestinationId: DestinationId): DestinationDescription = {
    val __obj = js.Dynamic.literal(DestinationId = DestinationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DestinationDescription]
  }
  
  @scala.inline
  implicit class DestinationDescriptionMutableBuilder[Self <: DestinationDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestinationId(value: DestinationId): Self = StObject.set(x, "DestinationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElasticsearchDestinationDescription(value: ElasticsearchDestinationDescription): Self = StObject.set(x, "ElasticsearchDestinationDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElasticsearchDestinationDescriptionUndefined: Self = StObject.set(x, "ElasticsearchDestinationDescription", js.undefined)
    
    @scala.inline
    def setExtendedS3DestinationDescription(value: ExtendedS3DestinationDescription): Self = StObject.set(x, "ExtendedS3DestinationDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendedS3DestinationDescriptionUndefined: Self = StObject.set(x, "ExtendedS3DestinationDescription", js.undefined)
    
    @scala.inline
    def setHttpEndpointDestinationDescription(value: HttpEndpointDestinationDescription): Self = StObject.set(x, "HttpEndpointDestinationDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpEndpointDestinationDescriptionUndefined: Self = StObject.set(x, "HttpEndpointDestinationDescription", js.undefined)
    
    @scala.inline
    def setRedshiftDestinationDescription(value: RedshiftDestinationDescription): Self = StObject.set(x, "RedshiftDestinationDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedshiftDestinationDescriptionUndefined: Self = StObject.set(x, "RedshiftDestinationDescription", js.undefined)
    
    @scala.inline
    def setS3DestinationDescription(value: S3DestinationDescription): Self = StObject.set(x, "S3DestinationDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3DestinationDescriptionUndefined: Self = StObject.set(x, "S3DestinationDescription", js.undefined)
    
    @scala.inline
    def setSplunkDestinationDescription(value: SplunkDestinationDescription): Self = StObject.set(x, "SplunkDestinationDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplunkDestinationDescriptionUndefined: Self = StObject.set(x, "SplunkDestinationDescription", js.undefined)
  }
}
