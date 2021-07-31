package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelSpecification extends StObject {
  
  /**
    * A brief description of the channel.
    */
  var Description: js.UndefOr[EntityDescription] = js.undefined
  
  /**
    * Indicates whether the channel is required by the algorithm.
    */
  var IsRequired: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the channel.
    */
  var Name: ChannelName
  
  /**
    * The allowed compression types, if data compression is used.
    */
  var SupportedCompressionTypes: js.UndefOr[CompressionTypes] = js.undefined
  
  /**
    * The supported MIME types for the data.
    */
  var SupportedContentTypes: ContentTypes
  
  /**
    * The allowed input mode, either FILE or PIPE. In FILE mode, Amazon SageMaker copies the data from the input source onto the local Amazon Elastic Block Store (Amazon EBS) volumes before starting your training algorithm. This is the most commonly used input mode. In PIPE mode, Amazon SageMaker streams input data from the source directly to your algorithm without using the EBS volume.
    */
  var SupportedInputModes: InputModes
}
object ChannelSpecification {
  
  @scala.inline
  def apply(Name: ChannelName, SupportedContentTypes: ContentTypes, SupportedInputModes: InputModes): ChannelSpecification = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], SupportedContentTypes = SupportedContentTypes.asInstanceOf[js.Any], SupportedInputModes = SupportedInputModes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelSpecification]
  }
  
  @scala.inline
  implicit class ChannelSpecificationMutableBuilder[Self <: ChannelSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: EntityDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setIsRequired(value: Boolean): Self = StObject.set(x, "IsRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRequiredUndefined: Self = StObject.set(x, "IsRequired", js.undefined)
    
    @scala.inline
    def setName(value: ChannelName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedCompressionTypes(value: CompressionTypes): Self = StObject.set(x, "SupportedCompressionTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedCompressionTypesUndefined: Self = StObject.set(x, "SupportedCompressionTypes", js.undefined)
    
    @scala.inline
    def setSupportedCompressionTypesVarargs(value: CompressionType*): Self = StObject.set(x, "SupportedCompressionTypes", js.Array(value :_*))
    
    @scala.inline
    def setSupportedContentTypes(value: ContentTypes): Self = StObject.set(x, "SupportedContentTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedContentTypesVarargs(value: ContentType*): Self = StObject.set(x, "SupportedContentTypes", js.Array(value :_*))
    
    @scala.inline
    def setSupportedInputModes(value: InputModes): Self = StObject.set(x, "SupportedInputModes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedInputModesVarargs(value: TrainingInputMode*): Self = StObject.set(x, "SupportedInputModes", js.Array(value :_*))
  }
}
