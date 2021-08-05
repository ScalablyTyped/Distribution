package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFaqRequest extends StObject {
  
  /**
    * A token that you provide to identify the request to create a FAQ. Multiple calls to the CreateFaqRequest operation with the same client token will create only one FAQ. 
    */
  var ClientToken: js.UndefOr[ClientTokenName] = js.undefined
  
  /**
    * A description of the FAQ.
    */
  var Description: js.UndefOr[typings.awsSdk.kendraMod.Description] = js.undefined
  
  /**
    * The format of the input file. You can choose between a basic CSV format, a CSV format that includes customs attributes in a header, and a JSON format that includes custom attributes. The format must match the format of the file stored in the S3 bucket identified in the S3Path parameter. For more information, see Adding questions and answers.
    */
  var FileFormat: js.UndefOr[FaqFileFormat] = js.undefined
  
  /**
    * The identifier of the index that contains the FAQ.
    */
  var IndexId: typings.awsSdk.kendraMod.IndexId
  
  /**
    * The name that should be associated with the FAQ.
    */
  var Name: FaqName
  
  /**
    * The Amazon Resource Name (ARN) of a role with permission to access the S3 bucket that contains the FAQs. For more information, see IAM Roles for Amazon Kendra.
    */
  var RoleArn: typings.awsSdk.kendraMod.RoleArn
  
  /**
    * The S3 location of the FAQ input data.
    */
  var S3Path: typings.awsSdk.kendraMod.S3Path
  
  /**
    * A list of key-value pairs that identify the FAQ. You can use the tags to identify and organize your resources and to control access to resources.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateFaqRequest {
  
  inline def apply(IndexId: IndexId, Name: FaqName, RoleArn: RoleArn, S3Path: S3Path): CreateFaqRequest = {
    val __obj = js.Dynamic.literal(IndexId = IndexId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any], S3Path = S3Path.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFaqRequest]
  }
  
  extension [Self <: CreateFaqRequest](x: Self) {
    
    inline def setClientToken(value: ClientTokenName): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setFileFormat(value: FaqFileFormat): Self = StObject.set(x, "FileFormat", value.asInstanceOf[js.Any])
    
    inline def setFileFormatUndefined: Self = StObject.set(x, "FileFormat", js.undefined)
    
    inline def setIndexId(value: IndexId): Self = StObject.set(x, "IndexId", value.asInstanceOf[js.Any])
    
    inline def setName(value: FaqName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setS3Path(value: S3Path): Self = StObject.set(x, "S3Path", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
