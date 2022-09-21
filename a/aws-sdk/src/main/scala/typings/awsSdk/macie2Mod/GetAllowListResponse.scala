package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAllowListResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the allow list.
    */
  var arn: js.UndefOr[stringMin71Max89PatternArnAwsAwsCnAwsUsGovMacie2AZ19920D12AllowListAZ0922] = js.undefined
  
  /**
    * The date and time, in UTC and extended ISO 8601 format, when the allow list was created in Amazon Macie.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The criteria that specify the text or text pattern to ignore. The criteria can be the location and name of an S3 object that lists specific text to ignore (s3WordsList), or a regular expression (regex) that defines a text pattern to ignore.
    */
  var criteria: js.UndefOr[AllowListCriteria] = js.undefined
  
  /**
    * The custom description of the allow list.
    */
  var description: js.UndefOr[stringMin1Max512PatternSS] = js.undefined
  
  /**
    * The unique identifier for the allow list.
    */
  var id: js.UndefOr[stringMin22Max22PatternAZ0922] = js.undefined
  
  /**
    * The custom name of the allow list.
    */
  var name: js.UndefOr[stringMin1Max128Pattern] = js.undefined
  
  /**
    * The current status of the allow list, which indicates whether Amazon Macie can access and use the list's criteria.
    */
  var status: js.UndefOr[AllowListStatus] = js.undefined
  
  /**
    * A map of key-value pairs that specifies which tags (keys and values) are associated with the allow list.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The date and time, in UTC and extended ISO 8601 format, when the allow list's settings were most recently changed in Amazon Macie.
    */
  var updatedAt: js.UndefOr[js.Date] = js.undefined
}
object GetAllowListResponse {
  
  inline def apply(): GetAllowListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAllowListResponse]
  }
  
  extension [Self <: GetAllowListResponse](x: Self) {
    
    inline def setArn(value: stringMin71Max89PatternArnAwsAwsCnAwsUsGovMacie2AZ19920D12AllowListAZ0922): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setCriteria(value: AllowListCriteria): Self = StObject.set(x, "criteria", value.asInstanceOf[js.Any])
    
    inline def setCriteriaUndefined: Self = StObject.set(x, "criteria", js.undefined)
    
    inline def setDescription(value: stringMin1Max512PatternSS): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: stringMin22Max22PatternAZ0922): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: stringMin1Max128Pattern): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStatus(value: AllowListStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "updatedAt", js.undefined)
  }
}
