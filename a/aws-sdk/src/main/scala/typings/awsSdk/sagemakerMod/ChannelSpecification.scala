package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelSpecification extends js.Object {
  
  /**
    * A brief description of the channel.
    */
  var Description: js.UndefOr[EntityDescription] = js.native
  
  /**
    * Indicates whether the channel is required by the algorithm.
    */
  var IsRequired: js.UndefOr[Boolean] = js.native
  
  /**
    * The name of the channel.
    */
  var Name: ChannelName = js.native
  
  /**
    * The allowed compression types, if data compression is used.
    */
  var SupportedCompressionTypes: js.UndefOr[CompressionTypes] = js.native
  
  /**
    * The supported MIME types for the data.
    */
  var SupportedContentTypes: ContentTypes = js.native
  
  /**
    * The allowed input mode, either FILE or PIPE. In FILE mode, Amazon SageMaker copies the data from the input source onto the local Amazon Elastic Block Store (Amazon EBS) volumes before starting your training algorithm. This is the most commonly used input mode. In PIPE mode, Amazon SageMaker streams input data from the source directly to your algorithm without using the EBS volume.
    */
  var SupportedInputModes: InputModes = js.native
}
object ChannelSpecification {
  
  @scala.inline
  def apply(Name: ChannelName, SupportedContentTypes: ContentTypes, SupportedInputModes: InputModes): ChannelSpecification = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], SupportedContentTypes = SupportedContentTypes.asInstanceOf[js.Any], SupportedInputModes = SupportedInputModes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelSpecification]
  }
  
  @scala.inline
  implicit class ChannelSpecificationOps[Self <: ChannelSpecification] (val x: Self) extends AnyVal {
    
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
    def setName(value: ChannelName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedContentTypesVarargs(value: ContentType*): Self = this.set("SupportedContentTypes", js.Array(value :_*))
    
    @scala.inline
    def setSupportedContentTypes(value: ContentTypes): Self = this.set("SupportedContentTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedInputModesVarargs(value: TrainingInputMode*): Self = this.set("SupportedInputModes", js.Array(value :_*))
    
    @scala.inline
    def setSupportedInputModes(value: InputModes): Self = this.set("SupportedInputModes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: EntityDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setIsRequired(value: Boolean): Self = this.set("IsRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsRequired: Self = this.set("IsRequired", js.undefined)
    
    @scala.inline
    def setSupportedCompressionTypesVarargs(value: CompressionType*): Self = this.set("SupportedCompressionTypes", js.Array(value :_*))
    
    @scala.inline
    def setSupportedCompressionTypes(value: CompressionTypes): Self = this.set("SupportedCompressionTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportedCompressionTypes: Self = this.set("SupportedCompressionTypes", js.undefined)
  }
}
