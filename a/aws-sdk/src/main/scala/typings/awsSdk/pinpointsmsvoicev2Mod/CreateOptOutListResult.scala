package typings.awsSdk.pinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateOptOutListResult extends StObject {
  
  /**
    * The time when the pool was created, in UNIX epoch time format.
    */
  var CreatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for the OptOutList.
    */
  var OptOutListArn: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the new OptOutList.
    */
  var OptOutListName: js.UndefOr[typings.awsSdk.pinpointsmsvoicev2Mod.OptOutListName] = js.undefined
  
  /**
    * An array of tags (key and value pairs) associated with the new OptOutList.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateOptOutListResult {
  
  inline def apply(): CreateOptOutListResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateOptOutListResult]
  }
  
  extension [Self <: CreateOptOutListResult](x: Self) {
    
    inline def setCreatedTimestamp(value: js.Date): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    inline def setOptOutListArn(value: String): Self = StObject.set(x, "OptOutListArn", value.asInstanceOf[js.Any])
    
    inline def setOptOutListArnUndefined: Self = StObject.set(x, "OptOutListArn", js.undefined)
    
    inline def setOptOutListName(value: OptOutListName): Self = StObject.set(x, "OptOutListName", value.asInstanceOf[js.Any])
    
    inline def setOptOutListNameUndefined: Self = StObject.set(x, "OptOutListName", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
