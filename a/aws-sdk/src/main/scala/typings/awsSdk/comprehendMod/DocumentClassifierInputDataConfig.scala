package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentClassifierInputDataConfig extends StObject {
  
  /**
    * A list of augmented manifest files that provide training data for your custom model. An augmented manifest file is a labeled dataset that is produced by Amazon SageMaker Ground Truth. This parameter is required if you set DataFormat to AUGMENTED_MANIFEST.
    */
  var AugmentedManifests: js.UndefOr[DocumentClassifierAugmentedManifestsList] = js.native
  
  /**
    * The format of your training data:    COMPREHEND_CSV: A two-column CSV file, where labels are provided in the first column, and documents are provided in the second. If you use this value, you must provide the S3Uri parameter in your request.    AUGMENTED_MANIFEST: A labeled dataset that is produced by Amazon SageMaker Ground Truth. This file is in JSON lines format. Each line is a complete JSON object that contains a training document and its associated labels.  If you use this value, you must provide the AugmentedManifests parameter in your request.   If you don't specify a value, Amazon Comprehend uses COMPREHEND_CSV as the default.
    */
  var DataFormat: js.UndefOr[DocumentClassifierDataFormat] = js.native
  
  /**
    * Indicates the delimiter used to separate each label for training a multi-label classifier. The default delimiter between labels is a pipe (|). You can use a different character as a delimiter (if it's an allowed character) by specifying it under Delimiter for labels. If the training documents use a delimiter other than the default or the delimiter you specify, the labels on that line will be combined to make a single unique label, such as LABELLABELLABEL.
    */
  var LabelDelimiter: js.UndefOr[typings.awsSdk.comprehendMod.LabelDelimiter] = js.native
  
  /**
    * The Amazon S3 URI for the input data. The S3 bucket must be in the same region as the API endpoint that you are calling. The URI can point to a single input file or it can provide the prefix for a collection of input files. For example, if you use the URI S3://bucketName/prefix, if the prefix is a single file, Amazon Comprehend uses that file as input. If more than one file begins with the prefix, Amazon Comprehend uses all of them as input. This parameter is required if you set DataFormat to COMPREHEND_CSV.
    */
  var S3Uri: js.UndefOr[typings.awsSdk.comprehendMod.S3Uri] = js.native
}
object DocumentClassifierInputDataConfig {
  
  @scala.inline
  def apply(): DocumentClassifierInputDataConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentClassifierInputDataConfig]
  }
  
  @scala.inline
  implicit class DocumentClassifierInputDataConfigMutableBuilder[Self <: DocumentClassifierInputDataConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAugmentedManifests(value: DocumentClassifierAugmentedManifestsList): Self = StObject.set(x, "AugmentedManifests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAugmentedManifestsUndefined: Self = StObject.set(x, "AugmentedManifests", js.undefined)
    
    @scala.inline
    def setAugmentedManifestsVarargs(value: AugmentedManifestsListItem*): Self = StObject.set(x, "AugmentedManifests", js.Array(value :_*))
    
    @scala.inline
    def setDataFormat(value: DocumentClassifierDataFormat): Self = StObject.set(x, "DataFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataFormatUndefined: Self = StObject.set(x, "DataFormat", js.undefined)
    
    @scala.inline
    def setLabelDelimiter(value: LabelDelimiter): Self = StObject.set(x, "LabelDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelDelimiterUndefined: Self = StObject.set(x, "LabelDelimiter", js.undefined)
    
    @scala.inline
    def setS3Uri(value: S3Uri): Self = StObject.set(x, "S3Uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3UriUndefined: Self = StObject.set(x, "S3Uri", js.undefined)
  }
}
