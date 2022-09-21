package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeExperienceRequest extends StObject {
  
  /**
    * The identifier of your Amazon Kendra experience you want to get information on.
    */
  var Id: ExperienceId
  
  /**
    * The identifier of the index for your Amazon Kendra experience.
    */
  var IndexId: typings.awsSdk.kendraMod.IndexId
}
object DescribeExperienceRequest {
  
  inline def apply(Id: ExperienceId, IndexId: IndexId): DescribeExperienceRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], IndexId = IndexId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeExperienceRequest]
  }
  
  extension [Self <: DescribeExperienceRequest](x: Self) {
    
    inline def setId(value: ExperienceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIndexId(value: IndexId): Self = StObject.set(x, "IndexId", value.asInstanceOf[js.Any])
  }
}
