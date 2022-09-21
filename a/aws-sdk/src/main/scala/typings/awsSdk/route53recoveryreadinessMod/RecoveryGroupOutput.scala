package typings.awsSdk.route53recoveryreadinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecoveryGroupOutput extends StObject {
  
  /**
    * A list of a cell's Amazon Resource Names (ARNs).
    */
  var Cells: listOfString
  
  /**
    * The Amazon Resource Name (ARN) for the recovery group.
    */
  var RecoveryGroupArn: stringMax256
  
  /**
    * The name of the recovery group.
    */
  var RecoveryGroupName: stringMax64PatternAAZAZ09Z
  
  /**
    * The tags associated with the recovery group.
    */
  var Tags: js.UndefOr[typings.awsSdk.route53recoveryreadinessMod.Tags] = js.undefined
}
object RecoveryGroupOutput {
  
  inline def apply(Cells: listOfString, RecoveryGroupArn: stringMax256, RecoveryGroupName: stringMax64PatternAAZAZ09Z): RecoveryGroupOutput = {
    val __obj = js.Dynamic.literal(Cells = Cells.asInstanceOf[js.Any], RecoveryGroupArn = RecoveryGroupArn.asInstanceOf[js.Any], RecoveryGroupName = RecoveryGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecoveryGroupOutput]
  }
  
  extension [Self <: RecoveryGroupOutput](x: Self) {
    
    inline def setCells(value: listOfString): Self = StObject.set(x, "Cells", value.asInstanceOf[js.Any])
    
    inline def setCellsVarargs(value: string*): Self = StObject.set(x, "Cells", js.Array(value*))
    
    inline def setRecoveryGroupArn(value: stringMax256): Self = StObject.set(x, "RecoveryGroupArn", value.asInstanceOf[js.Any])
    
    inline def setRecoveryGroupName(value: stringMax64PatternAAZAZ09Z): Self = StObject.set(x, "RecoveryGroupName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
