package typings.awsSdk.route53recoveryreadinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRecoveryGroupResponse extends StObject {
  
  /**
    * A list of a cell's Amazon Resource Names (ARNs).
    */
  var Cells: js.UndefOr[listOfString] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for the recovery group.
    */
  var RecoveryGroupArn: js.UndefOr[stringMax256] = js.undefined
  
  /**
    * The name of the recovery group.
    */
  var RecoveryGroupName: js.UndefOr[stringMax64PatternAAZAZ09Z] = js.undefined
  
  /**
    * The tags associated with the recovery group.
    */
  var Tags: js.UndefOr[typings.awsSdk.route53recoveryreadinessMod.Tags] = js.undefined
}
object GetRecoveryGroupResponse {
  
  inline def apply(): GetRecoveryGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRecoveryGroupResponse]
  }
  
  extension [Self <: GetRecoveryGroupResponse](x: Self) {
    
    inline def setCells(value: listOfString): Self = StObject.set(x, "Cells", value.asInstanceOf[js.Any])
    
    inline def setCellsUndefined: Self = StObject.set(x, "Cells", js.undefined)
    
    inline def setCellsVarargs(value: string*): Self = StObject.set(x, "Cells", js.Array(value*))
    
    inline def setRecoveryGroupArn(value: stringMax256): Self = StObject.set(x, "RecoveryGroupArn", value.asInstanceOf[js.Any])
    
    inline def setRecoveryGroupArnUndefined: Self = StObject.set(x, "RecoveryGroupArn", js.undefined)
    
    inline def setRecoveryGroupName(value: stringMax64PatternAAZAZ09Z): Self = StObject.set(x, "RecoveryGroupName", value.asInstanceOf[js.Any])
    
    inline def setRecoveryGroupNameUndefined: Self = StObject.set(x, "RecoveryGroupName", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
